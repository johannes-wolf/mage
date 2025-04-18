package mage.cards.s;

import mage.MageObject;
import mage.abilities.Ability;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.continuous.BecomesSubtypeAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.choices.Choice;
import mage.choices.ChoiceCreatureType;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.filter.StaticFilters;
import mage.game.Game;
import mage.players.Player;

import java.util.Arrays;
import java.util.UUID;

/**
 * @author EvilGeek
 */
public final class Standardize extends CardImpl {

    public Standardize(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{U}{U}");

        // Choose a creature type other than Wall. Each creature becomes that type until end of turn.
        this.getSpellAbility().addEffect(new StandardizeEffect());
    }

    private Standardize(final Standardize card) {
        super(card);
    }

    @Override
    public Standardize copy() {
        return new Standardize(this);
    }
}

class StandardizeEffect extends OneShotEffect {

    StandardizeEffect() {
        super(Outcome.BoostCreature);
        staticText = "choose a creature type other than Wall. Each creature becomes that type until end of turn";

    }

    private StandardizeEffect(final StandardizeEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player player = game.getPlayer(source.getControllerId());
        MageObject sourceObject = game.getObject(source);
        if (player != null && sourceObject != null) {
            Choice typeChoice = new ChoiceCreatureType(game, source);
            typeChoice.setMessage("Choose a creature type other than Wall");
            typeChoice.getKeyChoices().keySet().removeIf(c -> c.equals("Wall"));
            if (!player.choose(Outcome.BoostCreature, typeChoice, game)) {
                return false;
            }
            game.informPlayers(sourceObject.getLogName() + ": " + player.getLogName() + " has chosen " + typeChoice.getChoiceKey());
            // ADD TYPE TO TARGET
            game.addEffect(new BecomesSubtypeAllEffect(
                    Duration.EndOfTurn, Arrays.asList(SubType.byDescription(typeChoice.getChoiceKey())),
                    StaticFilters.FILTER_PERMANENT_CREATURE, true
            ), source);
            return true;
        }
        return false;
    }

    @Override
    public StandardizeEffect copy() {
        return new StandardizeEffect(this);
    }
}
