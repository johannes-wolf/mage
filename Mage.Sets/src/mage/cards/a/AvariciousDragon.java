package mage.cards.a;

import mage.MageInt;
import mage.abilities.triggers.BeginningOfDrawTriggeredAbility;
import mage.abilities.triggers.BeginningOfEndStepTriggeredAbility;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.discard.DiscardHandControllerEffect;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;

import java.util.UUID;

/**
 * @author LevelX2
 */
public final class AvariciousDragon extends CardImpl {

    public AvariciousDragon(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}{R}");
        this.subtype.add(SubType.DRAGON);
        this.power = new MageInt(4);
        this.toughness = new MageInt(4);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // At the beginning of your draw step, draw an additional card.
        this.addAbility(new BeginningOfDrawTriggeredAbility(new DrawCardSourceControllerEffect(1)
                .setText("draw an additional card"), false));

        // At the beginning of your end step, discard your hand.
        this.addAbility(new BeginningOfEndStepTriggeredAbility(new DiscardHandControllerEffect()));
    }

    private AvariciousDragon(final AvariciousDragon card) {
        super(card);
    }

    @Override
    public AvariciousDragon copy() {
        return new AvariciousDragon(this);
    }
}
