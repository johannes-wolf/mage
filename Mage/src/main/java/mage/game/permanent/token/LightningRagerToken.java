package mage.game.permanent.token;

import mage.MageInt;
import mage.abilities.triggers.BeginningOfEndStepTriggeredAbility;
import mage.abilities.effects.common.SacrificeSourceEffect;
import mage.abilities.keyword.HasteAbility;
import mage.abilities.keyword.TrampleAbility;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.TargetController;

/**
 * @author spjspj
 */
public final class LightningRagerToken extends TokenImpl {

    public LightningRagerToken() {
        super("Lightning Rager", "5/1 red Elemental creature token named Lightning Rager."
                + "It has trample, haste, and \"At the beginning of the end step, sacrifice this creature.\"");
        cardType.add(CardType.CREATURE);
        color.setRed(true);
        subtype.add(SubType.ELEMENTAL);
        power = new MageInt(5);
        toughness = new MageInt(1);

        this.addAbility(TrampleAbility.getInstance());
        this.addAbility(HasteAbility.getInstance());
        this.addAbility(new BeginningOfEndStepTriggeredAbility(TargetController.NEXT, new SacrificeSourceEffect(), false));
    }

    private LightningRagerToken(final LightningRagerToken token) {
        super(token);
    }

    public LightningRagerToken copy() {
        return new LightningRagerToken(this);
    }
}
