package mage.sets;

import mage.cards.Card;
import mage.cards.ExpansionSet;
import mage.cards.repository.CardInfo;
import mage.constants.Rarity;
import mage.constants.SetType;
import mage.util.RandomUtil;
import mage.collation.BoosterCollator;
import mage.collation.BoosterStructure;
import mage.collation.CardRun;
import mage.collation.RarityConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Susucr
 */
public final class TheLostCavernsOfIxalan extends ExpansionSet {

    private static final TheLostCavernsOfIxalan instance = new TheLostCavernsOfIxalan();

    public static TheLostCavernsOfIxalan getInstance() {
        return instance;
    }

    private TheLostCavernsOfIxalan() {
        super("The Lost Caverns of Ixalan", "LCI", ExpansionSet.buildDate(2023, 11, 17), SetType.EXPANSION);
        this.blockName = "The Lost Caverns of Ixalan"; // for sorting in GUI
        this.hasBasicLands = true;
        this.hasBoosters = true;
        // reference: https://magic.wizards.com/en/news/feature/collecting-the-lost-caverns-of-ixalan
        this.numBoosterCommon = 9;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = (64.0 + 64.0 + 22.0) / 22.0; // 64 rares, 22 mythics
        this.numBoosterLands = 1; // 30% basic (full-art core), 70% common Cave
        this.ratioBoosterSpecialLand = 10;
        this.ratioBoosterSpecialLandNumerator = 7;
        this.numBoosterDoubleFaced = 1; // explicit slot for 5 common + 12 uncommon DFCs
        this.maxCardNumberInBooster = 291;

        cards.add(new SetCardInfo("Abrade", 131, Rarity.COMMON, mage.cards.a.Abrade.class));
        cards.add(new SetCardInfo("Abuelo's Awakening", 1, Rarity.RARE, mage.cards.a.AbuelosAwakening.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Abuelo's Awakening", 353, Rarity.RARE, mage.cards.a.AbuelosAwakening.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Abuelo, Ancestral Echo", 219, Rarity.RARE, mage.cards.a.AbueloAncestralEcho.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Abuelo, Ancestral Echo", 297, Rarity.RARE, mage.cards.a.AbueloAncestralEcho.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Abyssal Gorestalker", 87, Rarity.UNCOMMON, mage.cards.a.AbyssalGorestalker.class));
        cards.add(new SetCardInfo("Aclazotz, Deepest Betrayal", 316, Rarity.MYTHIC, mage.cards.a.AclazotzDeepestBetrayal.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Aclazotz, Deepest Betrayal", 88, Rarity.MYTHIC, mage.cards.a.AclazotzDeepestBetrayal.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Acolyte of Aclazotz", 89, Rarity.COMMON, mage.cards.a.AcolyteOfAclazotz.class));
        cards.add(new SetCardInfo("Acrobatic Leap", 2, Rarity.COMMON, mage.cards.a.AcrobaticLeap.class));
        cards.add(new SetCardInfo("Adaptive Gemguard", 3, Rarity.COMMON, mage.cards.a.AdaptiveGemguard.class));
        cards.add(new SetCardInfo("Akal Pakal, First Among Equals", 292, Rarity.RARE, mage.cards.a.AkalPakalFirstAmongEquals.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Akal Pakal, First Among Equals", 44, Rarity.RARE, mage.cards.a.AkalPakalFirstAmongEquals.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Akawalli, the Seething Tower", 220, Rarity.UNCOMMON, mage.cards.a.AkawalliTheSeethingTower.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Akawalli, the Seething Tower", 298, Rarity.UNCOMMON, mage.cards.a.AkawalliTheSeethingTower.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Amalia Benavides Aguirre", 221, Rarity.RARE, mage.cards.a.AmaliaBenavidesAguirre.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Amalia Benavides Aguirre", 299, Rarity.RARE, mage.cards.a.AmaliaBenavidesAguirre.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ancestors' Aid", 132, Rarity.COMMON, mage.cards.a.AncestorsAid.class));
        cards.add(new SetCardInfo("Ancestral Reminiscence", 45, Rarity.COMMON, mage.cards.a.AncestralReminiscence.class));
        cards.add(new SetCardInfo("Anim Pakal, Thousandth Moon", 223, Rarity.RARE, mage.cards.a.AnimPakalThousandthMoon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Anim Pakal, Thousandth Moon", 300, Rarity.RARE, mage.cards.a.AnimPakalThousandthMoon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Another Chance", 90, Rarity.COMMON, mage.cards.a.AnotherChance.class));
        cards.add(new SetCardInfo("Armored Kincaller", 174, Rarity.COMMON, mage.cards.a.ArmoredKincaller.class));
        cards.add(new SetCardInfo("Attentive Sunscribe", 4, Rarity.COMMON, mage.cards.a.AttentiveSunscribe.class));
        cards.add(new SetCardInfo("Barracks of the Thousand", 357, Rarity.RARE, mage.cards.b.BarracksOfTheThousand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Barracks of the Thousand", 39, Rarity.RARE, mage.cards.b.BarracksOfTheThousand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bartolome del Presidio", 224, Rarity.UNCOMMON, mage.cards.b.BartolomeDelPresidio.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bartolome del Presidio", 301, Rarity.UNCOMMON, mage.cards.b.BartolomeDelPresidio.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bartolome del Presidio", 409, Rarity.UNCOMMON, mage.cards.b.BartolomeDelPresidio.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Basking Capybara", 175, Rarity.COMMON, mage.cards.b.BaskingCapybara.class));
        cards.add(new SetCardInfo("Bat Colony", 5, Rarity.UNCOMMON, mage.cards.b.BatColony.class));
        cards.add(new SetCardInfo("Bedrock Tortoise", 176, Rarity.RARE, mage.cards.b.BedrockTortoise.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bedrock Tortoise", 378, Rarity.RARE, mage.cards.b.BedrockTortoise.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Belligerent Yearling", 133, Rarity.UNCOMMON, mage.cards.b.BelligerentYearling.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Belligerent Yearling", 320, Rarity.UNCOMMON, mage.cards.b.BelligerentYearling.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bitter Triumph", 91, Rarity.UNCOMMON, mage.cards.b.BitterTriumph.class));
        cards.add(new SetCardInfo("Bladewheel Chariot", 36, Rarity.UNCOMMON, mage.cards.b.BladewheelChariot.class));
        cards.add(new SetCardInfo("Bloodletter of Aclazotz", 336, Rarity.MYTHIC, mage.cards.b.BloodletterOfAclazotz.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bloodletter of Aclazotz", 92, Rarity.MYTHIC, mage.cards.b.BloodletterOfAclazotz.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bloodthorn Flail", 93, Rarity.UNCOMMON, mage.cards.b.BloodthornFlail.class));
        cards.add(new SetCardInfo("Bonehoard Dracosaur", 134, Rarity.MYTHIC, mage.cards.b.BonehoardDracosaur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bonehoard Dracosaur", 321, Rarity.MYTHIC, mage.cards.b.BonehoardDracosaur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brackish Blunder", 46, Rarity.COMMON, mage.cards.b.BrackishBlunder.class));
        cards.add(new SetCardInfo("Braided Net", 360, Rarity.RARE, mage.cards.b.BraidedNet.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Braided Net", 47, Rarity.RARE, mage.cards.b.BraidedNet.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Braided Quipu", 360, Rarity.RARE, mage.cards.b.BraidedQuipu.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Braided Quipu", 47, Rarity.RARE, mage.cards.b.BraidedQuipu.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brass's Tunnel-Grinder", 135, Rarity.RARE, mage.cards.b.BrasssTunnelGrinder.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brass's Tunnel-Grinder", 373, Rarity.RARE, mage.cards.b.BrasssTunnelGrinder.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Brazen Blademaster", 136, Rarity.COMMON, mage.cards.b.BrazenBlademaster.class));
        cards.add(new SetCardInfo("Breeches, Eager Pillager", 137, Rarity.RARE, mage.cards.b.BreechesEagerPillager.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Breeches, Eager Pillager", 294, Rarity.RARE, mage.cards.b.BreechesEagerPillager.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bringer of the Last Gift", 337, Rarity.RARE, mage.cards.b.BringerOfTheLastGift.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Bringer of the Last Gift", 94, Rarity.RARE, mage.cards.b.BringerOfTheLastGift.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Broodrage Mycoid", 95, Rarity.COMMON, mage.cards.b.BroodrageMycoid.class));
        cards.add(new SetCardInfo("Buried Treasure", 246, Rarity.COMMON, mage.cards.b.BuriedTreasure.class));
        cards.add(new SetCardInfo("Burning Sun Cavalry", 138, Rarity.COMMON, mage.cards.b.BurningSunCavalry.class));
        cards.add(new SetCardInfo("Calamitous Cave-In", 139, Rarity.UNCOMMON, mage.cards.c.CalamitousCaveIn.class));
        cards.add(new SetCardInfo("Canonized in Blood", 96, Rarity.UNCOMMON, mage.cards.c.CanonizedInBlood.class));
        cards.add(new SetCardInfo("Caparocti Sunborn", 226, Rarity.UNCOMMON, mage.cards.c.CaparoctiSunborn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Caparocti Sunborn", 302, Rarity.UNCOMMON, mage.cards.c.CaparoctiSunborn.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Captain Storm, Cosmium Raider", 227, Rarity.UNCOMMON, mage.cards.c.CaptainStormCosmiumRaider.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Captain Storm, Cosmium Raider", 303, Rarity.UNCOMMON, mage.cards.c.CaptainStormCosmiumRaider.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Captivating Cave", 268, Rarity.COMMON, mage.cards.c.CaptivatingCave.class));
        cards.add(new SetCardInfo("Careening Mine Cart", 247, Rarity.UNCOMMON, mage.cards.c.CareeningMineCart.class));
        cards.add(new SetCardInfo("Cartographer's Companion", 248, Rarity.COMMON, mage.cards.c.CartographersCompanion.class));
        cards.add(new SetCardInfo("Cavern Stomper", 177, Rarity.COMMON, mage.cards.c.CavernStomper.class));
        cards.add(new SetCardInfo("Cavern of Souls", "410a", Rarity.MYTHIC, mage.cards.c.CavernOfSouls.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cavern of Souls", "410b", Rarity.MYTHIC, mage.cards.c.CavernOfSouls.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cavern of Souls", "410c", Rarity.MYTHIC, mage.cards.c.CavernOfSouls.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cavern of Souls", "410d", Rarity.MYTHIC, mage.cards.c.CavernOfSouls.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cavern of Souls", "410e", Rarity.MYTHIC, mage.cards.c.CavernOfSouls.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cavern of Souls", "410f", Rarity.MYTHIC, mage.cards.c.CavernOfSouls.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cavern of Souls", 269, Rarity.MYTHIC, mage.cards.c.CavernOfSouls.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cavern of Souls", 345, Rarity.MYTHIC, mage.cards.c.CavernOfSouls.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cavernous Maw", 270, Rarity.UNCOMMON, mage.cards.c.CavernousMaw.class));
        cards.add(new SetCardInfo("Cenote Scout", 178, Rarity.UNCOMMON, mage.cards.c.CenoteScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cenote Scout", 408, Rarity.UNCOMMON, mage.cards.c.CenoteScout.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Chart a Course", 48, Rarity.UNCOMMON, mage.cards.c.ChartACourse.class));
        cards.add(new SetCardInfo("Child of the Volcano", 140, Rarity.COMMON, mage.cards.c.ChildOfTheVolcano.class));
        cards.add(new SetCardInfo("Chimil, the Inner Sun", 249, Rarity.MYTHIC, mage.cards.c.ChimilTheInnerSun.class));
        cards.add(new SetCardInfo("Chupacabra Echo", 97, Rarity.UNCOMMON, mage.cards.c.ChupacabraEcho.class));
        cards.add(new SetCardInfo("Clay-Fired Bricks", 6, Rarity.UNCOMMON, mage.cards.c.ClayFiredBricks.class));
        cards.add(new SetCardInfo("Coati Scavenger", 179, Rarity.UNCOMMON, mage.cards.c.CoatiScavenger.class));
        cards.add(new SetCardInfo("Cogwork Wrestler", 49, Rarity.COMMON, mage.cards.c.CogworkWrestler.class));
        cards.add(new SetCardInfo("Colossadactyl", 180, Rarity.UNCOMMON, mage.cards.c.Colossadactyl.class));
        cards.add(new SetCardInfo("Compass Gnome", 250, Rarity.COMMON, mage.cards.c.CompassGnome.class));
        cards.add(new SetCardInfo("Confounding Riddle", 50, Rarity.UNCOMMON, mage.cards.c.ConfoundingRiddle.class));
        cards.add(new SetCardInfo("Consuming Sepulcher", 128, Rarity.COMMON, mage.cards.c.ConsumingSepulcher.class));
        cards.add(new SetCardInfo("Contested Game Ball", 251, Rarity.UNCOMMON, mage.cards.c.ContestedGameBall.class));
        cards.add(new SetCardInfo("Corpses of the Lost", 366, Rarity.RARE, mage.cards.c.CorpsesOfTheLost.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Corpses of the Lost", 98, Rarity.RARE, mage.cards.c.CorpsesOfTheLost.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cosmium Blast", 7, Rarity.COMMON, mage.cards.c.CosmiumBlast.class));
        cards.add(new SetCardInfo("Cosmium Confluence", 181, Rarity.RARE, mage.cards.c.CosmiumConfluence.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cosmium Confluence", 379, Rarity.RARE, mage.cards.c.CosmiumConfluence.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Cosmium Kiln", 6, Rarity.UNCOMMON, mage.cards.c.CosmiumKiln.class));
        cards.add(new SetCardInfo("Council of Echoes", 51, Rarity.UNCOMMON, mage.cards.c.CouncilOfEchoes.class));
        cards.add(new SetCardInfo("Curator of Sun's Creation", 141, Rarity.UNCOMMON, mage.cards.c.CuratorOfSunsCreation.class));
        cards.add(new SetCardInfo("Daring Discovery", 142, Rarity.COMMON, mage.cards.d.DaringDiscovery.class));
        cards.add(new SetCardInfo("Dauntless Dismantler", 8, Rarity.UNCOMMON, mage.cards.d.DauntlessDismantler.class));
        cards.add(new SetCardInfo("Dead Weight", 99, Rarity.COMMON, mage.cards.d.DeadWeight.class));
        cards.add(new SetCardInfo("Deathcap Marionette", 100, Rarity.COMMON, mage.cards.d.DeathcapMarionette.class));
        cards.add(new SetCardInfo("Deconstruction Hammer", 9, Rarity.COMMON, mage.cards.d.DeconstructionHammer.class));
        cards.add(new SetCardInfo("Deep Goblin Skulltaker", 101, Rarity.COMMON, mage.cards.d.DeepGoblinSkulltaker.class));
        cards.add(new SetCardInfo("Deep-Cavern Bat", 102, Rarity.UNCOMMON, mage.cards.d.DeepCavernBat.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Deep-Cavern Bat", 406, Rarity.UNCOMMON, mage.cards.d.DeepCavernBat.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Deepfathom Echo", 228, Rarity.RARE, mage.cards.d.DeepfathomEcho.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Deepfathom Echo", 385, Rarity.RARE, mage.cards.d.DeepfathomEcho.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Deeproot Pilgrimage", 361, Rarity.RARE, mage.cards.d.DeeprootPilgrimage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Deeproot Pilgrimage", 52, Rarity.RARE, mage.cards.d.DeeprootPilgrimage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Defossilize", 103, Rarity.UNCOMMON, mage.cards.d.Defossilize.class));
        cards.add(new SetCardInfo("Diamond Pick-Axe", 143, Rarity.UNCOMMON, mage.cards.d.DiamondPickAxe.class));
        cards.add(new SetCardInfo("Didact Echo", 53, Rarity.COMMON, mage.cards.d.DidactEcho.class));
        cards.add(new SetCardInfo("Digsite Conservator", 252, Rarity.UNCOMMON, mage.cards.d.DigsiteConservator.class));
        cards.add(new SetCardInfo("Dinotomaton", 144, Rarity.COMMON, mage.cards.d.Dinotomaton.class));
        cards.add(new SetCardInfo("Dire Blunderbuss", 145, Rarity.RARE, mage.cards.d.DireBlunderbuss.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dire Blunderbuss", 374, Rarity.RARE, mage.cards.d.DireBlunderbuss.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dire Flail", 145, Rarity.RARE, mage.cards.d.DireFlail.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Dire Flail", 374, Rarity.RARE, mage.cards.d.DireFlail.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Disruptor Wanderglyph", 253, Rarity.COMMON, mage.cards.d.DisruptorWanderglyph.class));
        cards.add(new SetCardInfo("Disturbed Slumber", 182, Rarity.COMMON, mage.cards.d.DisturbedSlumber.class));
        cards.add(new SetCardInfo("Dowsing Device", 146, Rarity.UNCOMMON, mage.cards.d.DowsingDevice.class));
        cards.add(new SetCardInfo("Dread Osseosaur", 129, Rarity.UNCOMMON, mage.cards.d.DreadOsseosaur.class));
        cards.add(new SetCardInfo("Dreadmaw's Ire", 147, Rarity.UNCOMMON, mage.cards.d.DreadmawsIre.class));
        cards.add(new SetCardInfo("Dusk Rose Reliquary", 10, Rarity.UNCOMMON, mage.cards.d.DuskRoseReliquary.class));
        cards.add(new SetCardInfo("Earthshaker Dreadmaw", 183, Rarity.UNCOMMON, mage.cards.e.EarthshakerDreadmaw.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Earthshaker Dreadmaw", 325, Rarity.UNCOMMON, mage.cards.e.EarthshakerDreadmaw.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Eaten by Piranhas", 54, Rarity.UNCOMMON, mage.cards.e.EatenByPiranhas.class));
        cards.add(new SetCardInfo("Echo of Dusk", 104, Rarity.COMMON, mage.cards.e.EchoOfDusk.class));
        cards.add(new SetCardInfo("Echoing Deeps", 271, Rarity.RARE, mage.cards.e.EchoingDeeps.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Echoing Deeps", 346, Rarity.RARE, mage.cards.e.EchoingDeeps.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Enterprising Scallywag", 148, Rarity.UNCOMMON, mage.cards.e.EnterprisingScallywag.class));
        cards.add(new SetCardInfo("Envoy of Okinec Ahau", 11, Rarity.COMMON, mage.cards.e.EnvoyOfOkinecAhau.class));
        cards.add(new SetCardInfo("Etali's Favor", 149, Rarity.COMMON, mage.cards.e.EtalisFavor.class));
        cards.add(new SetCardInfo("Explorer's Cache", 184, Rarity.UNCOMMON, mage.cards.e.ExplorersCache.class));
        cards.add(new SetCardInfo("Fabrication Foundry", 12, Rarity.RARE, mage.cards.f.FabricationFoundry.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Fabrication Foundry", 354, Rarity.RARE, mage.cards.f.FabricationFoundry.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Family Reunion", 13, Rarity.COMMON, mage.cards.f.FamilyReunion.class));
        cards.add(new SetCardInfo("Fanatical Offering", 105, Rarity.COMMON, mage.cards.f.FanaticalOffering.class));
        cards.add(new SetCardInfo("Forest", 291, Rarity.LAND, mage.cards.basiclands.Forest.class, FULL_ART_UST_VARIOUS));
        cards.add(new SetCardInfo("Forest", 401, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 402, Rarity.LAND, mage.cards.basiclands.Forest.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Forgotten Monument", 272, Rarity.UNCOMMON, mage.cards.f.ForgottenMonument.class));
        cards.add(new SetCardInfo("Frilled Cave-Wurm", 57, Rarity.COMMON, mage.cards.f.FrilledCaveWurm.class));
        cards.add(new SetCardInfo("Fungal Fortitude", 106, Rarity.COMMON, mage.cards.f.FungalFortitude.class));
        cards.add(new SetCardInfo("Gargantuan Leech", 107, Rarity.UNCOMMON, mage.cards.g.GargantuanLeech.class));
        cards.add(new SetCardInfo("Geode Grotto", 146, Rarity.UNCOMMON, mage.cards.g.GeodeGrotto.class));
        cards.add(new SetCardInfo("Geological Appraiser", 150, Rarity.UNCOMMON, mage.cards.g.GeologicalAppraiser.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Geological Appraiser", 407, Rarity.UNCOMMON, mage.cards.g.GeologicalAppraiser.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Get Lost", 14, Rarity.RARE, mage.cards.g.GetLost.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Get Lost", 333, Rarity.RARE, mage.cards.g.GetLost.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ghalta, Stampede Tyrant", 185, Rarity.MYTHIC, mage.cards.g.GhaltaStampedeTyrant.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ghalta, Stampede Tyrant", 326, Rarity.MYTHIC, mage.cards.g.GhaltaStampedeTyrant.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gishath, Sun's Avatar", 229, Rarity.MYTHIC, mage.cards.g.GishathSunsAvatar.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Gishath, Sun's Avatar", 330, Rarity.MYTHIC, mage.cards.g.GishathSunsAvatar.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Glimpse the Core", 186, Rarity.UNCOMMON, mage.cards.g.GlimpseTheCore.class));
        cards.add(new SetCardInfo("Glorifier of Suffering", 15, Rarity.COMMON, mage.cards.g.GlorifierOfSuffering.class));
        cards.add(new SetCardInfo("Glowcap Lantern", 187, Rarity.UNCOMMON, mage.cards.g.GlowcapLantern.class));
        cards.add(new SetCardInfo("Goblin Tomb Raider", 151, Rarity.COMMON, mage.cards.g.GoblinTombRaider.class));
        cards.add(new SetCardInfo("Goldfury Strider", 152, Rarity.UNCOMMON, mage.cards.g.GoldfuryStrider.class));
        cards.add(new SetCardInfo("Grasping Shadows", 108, Rarity.UNCOMMON, mage.cards.g.GraspingShadows.class));
        cards.add(new SetCardInfo("Greedy Freebooter", 109, Rarity.COMMON, mage.cards.g.GreedyFreebooter.class));
        cards.add(new SetCardInfo("Growing Rites of Itlimoc", 188, Rarity.RARE, mage.cards.g.GrowingRitesOfItlimoc.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Growing Rites of Itlimoc", 380, Rarity.RARE, mage.cards.g.GrowingRitesOfItlimoc.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Guardian of the Great Door", 16, Rarity.UNCOMMON, mage.cards.g.GuardianOfTheGreatDoor.class));
        cards.add(new SetCardInfo("Guidestone Compass", 62, Rarity.UNCOMMON, mage.cards.g.GuidestoneCompass.class));
        cards.add(new SetCardInfo("Helping Hand", 17, Rarity.UNCOMMON, mage.cards.h.HelpingHand.class));
        cards.add(new SetCardInfo("Hermitic Nautilus", 58, Rarity.UNCOMMON, mage.cards.h.HermiticNautilus.class));
        cards.add(new SetCardInfo("Hidden Cataract", 273, Rarity.COMMON, mage.cards.h.HiddenCataract.class));
        cards.add(new SetCardInfo("Hidden Courtyard", 274, Rarity.COMMON, mage.cards.h.HiddenCourtyard.class));
        cards.add(new SetCardInfo("Hidden Necropolis", 275, Rarity.COMMON, mage.cards.h.HiddenNecropolis.class));
        cards.add(new SetCardInfo("Hidden Nursery", 276, Rarity.COMMON, mage.cards.h.HiddenNursery.class));
        cards.add(new SetCardInfo("Hidden Volcano", 277, Rarity.COMMON, mage.cards.h.HiddenVolcano.class));
        cards.add(new SetCardInfo("Hit the Mother Lode", 153, Rarity.RARE, mage.cards.h.HitTheMotherLode.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hit the Mother Lode", 375, Rarity.RARE, mage.cards.h.HitTheMotherLode.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hit the Mother Lode", 404, Rarity.RARE, mage.cards.h.HitTheMotherLode.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hotfoot Gnome", 154, Rarity.COMMON, mage.cards.h.HotfootGnome.class));
        cards.add(new SetCardInfo("Hoverstone Pilgrim", 254, Rarity.UNCOMMON, mage.cards.h.HoverstonePilgrim.class));
        cards.add(new SetCardInfo("Huatli's Final Strike", 190, Rarity.COMMON, mage.cards.h.HuatlisFinalStrike.class));
        cards.add(new SetCardInfo("Huatli, Poet of Unity", 189, Rarity.MYTHIC, mage.cards.h.HuatliPoetOfUnity.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Huatli, Poet of Unity", 296, Rarity.MYTHIC, mage.cards.h.HuatliPoetOfUnity.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Huatli, Poet of Unity", 339, Rarity.MYTHIC, mage.cards.h.HuatliPoetOfUnity.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hulking Raptor", 191, Rarity.RARE, mage.cards.h.HulkingRaptor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hulking Raptor", 327, Rarity.RARE, mage.cards.h.HulkingRaptor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Hunter's Blowgun", 255, Rarity.COMMON, mage.cards.h.HuntersBlowgun.class));
        cards.add(new SetCardInfo("Hurl into History", 59, Rarity.UNCOMMON, mage.cards.h.HurlIntoHistory.class));
        cards.add(new SetCardInfo("Iceberg Titan", 60, Rarity.COMMON, mage.cards.i.IcebergTitan.class));
        cards.add(new SetCardInfo("Idol of the Deep King", 155, Rarity.COMMON, mage.cards.i.IdolOfTheDeepKing.class));
        cards.add(new SetCardInfo("In the Presence of Ages", 192, Rarity.COMMON, mage.cards.i.InThePresenceOfAges.class));
        cards.add(new SetCardInfo("Inti, Seneschal of the Sun", 156, Rarity.RARE, mage.cards.i.IntiSeneschalOfTheSun.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Inti, Seneschal of the Sun", 295, Rarity.RARE, mage.cards.i.IntiSeneschalOfTheSun.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Intrepid Paleontologist", 193, Rarity.RARE, mage.cards.i.IntrepidPaleontologist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Intrepid Paleontologist", 381, Rarity.RARE, mage.cards.i.IntrepidPaleontologist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Inverted Iceberg", 60, Rarity.COMMON, mage.cards.i.InvertedIceberg.class));
        cards.add(new SetCardInfo("Ironpaw Aspirant", 18, Rarity.COMMON, mage.cards.i.IronpawAspirant.class));
        cards.add(new SetCardInfo("Island", 288, Rarity.LAND, mage.cards.basiclands.Island.class, FULL_ART_UST_VARIOUS));
        cards.add(new SetCardInfo("Island", 395, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 396, Rarity.LAND, mage.cards.basiclands.Island.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Itlimoc, Cradle of the Sun", 188, Rarity.RARE, mage.cards.i.ItlimocCradleOfTheSun.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Itlimoc, Cradle of the Sun", 380, Rarity.RARE, mage.cards.i.ItlimocCradleOfTheSun.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Itzquinth, Firstborn of Gishath", 230, Rarity.UNCOMMON, mage.cards.i.ItzquinthFirstbornOfGishath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Itzquinth, Firstborn of Gishath", 331, Rarity.UNCOMMON, mage.cards.i.ItzquinthFirstbornOfGishath.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ixalli's Lorekeeper", 194, Rarity.UNCOMMON, mage.cards.i.IxallisLorekeeper.class));
        cards.add(new SetCardInfo("Jade Seedstones", 195, Rarity.UNCOMMON, mage.cards.j.JadeSeedstones.class));
        cards.add(new SetCardInfo("Jadeheart Attendant", 195, Rarity.UNCOMMON, mage.cards.j.JadeheartAttendant.class));
        cards.add(new SetCardInfo("Jadelight Spelunker", 196, Rarity.RARE, mage.cards.j.JadelightSpelunker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jadelight Spelunker", 382, Rarity.RARE, mage.cards.j.JadelightSpelunker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Jadelight Spelunker", 403, Rarity.RARE, mage.cards.j.JadelightSpelunker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Join the Dead", 110, Rarity.COMMON, mage.cards.j.JoinTheDead.class));
        cards.add(new SetCardInfo("Kaslem's Stonetree", 197, Rarity.COMMON, mage.cards.k.KaslemsStonetree.class));
        cards.add(new SetCardInfo("Kaslem's Strider", 197, Rarity.COMMON, mage.cards.k.KaslemsStrider.class));
        cards.add(new SetCardInfo("Kellan, Daring Traveler", 231, Rarity.RARE, mage.cards.k.KellanDaringTraveler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kellan, Daring Traveler", 341, Rarity.RARE, mage.cards.k.KellanDaringTraveler.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kinjalli's Dawnrunner", 19, Rarity.UNCOMMON, mage.cards.k.KinjallisDawnrunner.class));
        cards.add(new SetCardInfo("Kitesail Larcenist", 364, Rarity.RARE, mage.cards.k.KitesailLarcenist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kitesail Larcenist", 61, Rarity.RARE, mage.cards.k.KitesailLarcenist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kutzil's Flanker", 20, Rarity.RARE, mage.cards.k.KutzilsFlanker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kutzil's Flanker", 355, Rarity.RARE, mage.cards.k.KutzilsFlanker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kutzil, Malamet Exemplar", 232, Rarity.UNCOMMON, mage.cards.k.KutzilMalametExemplar.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Kutzil, Malamet Exemplar", 304, Rarity.UNCOMMON, mage.cards.k.KutzilMalametExemplar.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Locus of Enlightenment", 362, Rarity.MYTHIC, mage.cards.l.LocusOfEnlightenment.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Locus of Enlightenment", 55, Rarity.MYTHIC, mage.cards.l.LocusOfEnlightenment.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Lodestone Needle", 62, Rarity.UNCOMMON, mage.cards.l.LodestoneNeedle.class));
        cards.add(new SetCardInfo("Magmatic Galleon", 157, Rarity.RARE, mage.cards.m.MagmaticGalleon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Magmatic Galleon", 376, Rarity.RARE, mage.cards.m.MagmaticGalleon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Malamet Battle Glyph", 198, Rarity.UNCOMMON, mage.cards.m.MalametBattleGlyph.class));
        cards.add(new SetCardInfo("Malamet Brawler", 199, Rarity.COMMON, mage.cards.m.MalametBrawler.class));
        cards.add(new SetCardInfo("Malamet Scythe", 200, Rarity.COMMON, mage.cards.m.MalametScythe.class));
        cards.add(new SetCardInfo("Malamet Veteran", 201, Rarity.COMMON, mage.cards.m.MalametVeteran.class));
        cards.add(new SetCardInfo("Malamet War Scribe", 21, Rarity.UNCOMMON, mage.cards.m.MalametWarScribe.class));
        cards.add(new SetCardInfo("Malcolm, Alluring Scoundrel", 293, Rarity.RARE, mage.cards.m.MalcolmAlluringScoundrel.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Malcolm, Alluring Scoundrel", 63, Rarity.RARE, mage.cards.m.MalcolmAlluringScoundrel.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Malicious Eclipse", 111, Rarity.UNCOMMON, mage.cards.m.MaliciousEclipse.class));
        cards.add(new SetCardInfo("Marauding Brinefang", 64, Rarity.COMMON, mage.cards.m.MaraudingBrinefang.class));
        cards.add(new SetCardInfo("Market Gnome", 22, Rarity.UNCOMMON, mage.cards.m.MarketGnome.class));
        cards.add(new SetCardInfo("Master's Guide-Mural", 233, Rarity.UNCOMMON, mage.cards.m.MastersGuideMural.class));
        cards.add(new SetCardInfo("Master's Manufactory", 233, Rarity.UNCOMMON, mage.cards.m.MastersManufactory.class));
        cards.add(new SetCardInfo("Mastercraft Raptor", 164, Rarity.UNCOMMON, mage.cards.m.MastercraftRaptor.class));
        cards.add(new SetCardInfo("Matzalantli, the Great Door", 256, Rarity.RARE, mage.cards.m.MatzalantliTheGreatDoor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Matzalantli, the Great Door", 387, Rarity.RARE, mage.cards.m.MatzalantliTheGreatDoor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mephitic Draught", 112, Rarity.COMMON, mage.cards.m.MephiticDraught.class));
        cards.add(new SetCardInfo("Merfolk Cave-Diver", 65, Rarity.UNCOMMON, mage.cards.m.MerfolkCaveDiver.class));
        cards.add(new SetCardInfo("Might of the Ancestors", 23, Rarity.UNCOMMON, mage.cards.m.MightOfTheAncestors.class));
        cards.add(new SetCardInfo("Miner's Guidewing", 24, Rarity.COMMON, mage.cards.m.MinersGuidewing.class));
        cards.add(new SetCardInfo("Mineshaft Spider", 202, Rarity.COMMON, mage.cards.m.MineshaftSpider.class));
        cards.add(new SetCardInfo("Mischievous Pup", 25, Rarity.UNCOMMON, mage.cards.m.MischievousPup.class));
        cards.add(new SetCardInfo("Molten Collapse", 234, Rarity.RARE, mage.cards.m.MoltenCollapse.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Molten Collapse", 342, Rarity.RARE, mage.cards.m.MoltenCollapse.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 290, Rarity.LAND, mage.cards.basiclands.Mountain.class, FULL_ART_UST_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 399, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 400, Rarity.LAND, mage.cards.basiclands.Mountain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Mycoid Maze", 217, Rarity.UNCOMMON, mage.cards.m.MycoidMaze.class));
        cards.add(new SetCardInfo("Nicanzil, Current Conductor", 236, Rarity.UNCOMMON, mage.cards.n.NicanzilCurrentConductor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nicanzil, Current Conductor", 306, Rarity.UNCOMMON, mage.cards.n.NicanzilCurrentConductor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Nurturing Bristleback", 203, Rarity.COMMON, mage.cards.n.NurturingBristleback.class));
        cards.add(new SetCardInfo("Oaken Siren", 66, Rarity.COMMON, mage.cards.o.OakenSiren.class));
        cards.add(new SetCardInfo("Ojer Axonil, Deepest Might", 158, Rarity.MYTHIC, mage.cards.o.OjerAxonilDeepestMight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ojer Axonil, Deepest Might", 317, Rarity.MYTHIC, mage.cards.o.OjerAxonilDeepestMight.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ojer Kaslem, Deepest Growth", 204, Rarity.MYTHIC, mage.cards.o.OjerKaslemDeepestGrowth.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ojer Kaslem, Deepest Growth", 318, Rarity.MYTHIC, mage.cards.o.OjerKaslemDeepestGrowth.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ojer Pakpatiq, Deepest Epoch", 315, Rarity.MYTHIC, mage.cards.o.OjerPakpatiqDeepestEpoch.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ojer Pakpatiq, Deepest Epoch", 67, Rarity.MYTHIC, mage.cards.o.OjerPakpatiqDeepestEpoch.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ojer Taq, Deepest Foundation", 26, Rarity.MYTHIC, mage.cards.o.OjerTaqDeepestFoundation.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ojer Taq, Deepest Foundation", 314, Rarity.MYTHIC, mage.cards.o.OjerTaqDeepestFoundation.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Oltec Archaeologists", 27, Rarity.COMMON, mage.cards.o.OltecArchaeologists.class));
        cards.add(new SetCardInfo("Oltec Cloud Guard", 28, Rarity.COMMON, mage.cards.o.OltecCloudGuard.class));
        cards.add(new SetCardInfo("Orazca Puzzle-Door", 68, Rarity.COMMON, mage.cards.o.OrazcaPuzzleDoor.class));
        cards.add(new SetCardInfo("Oteclan Landmark", 29, Rarity.COMMON, mage.cards.o.OteclanLandmark.class));
        cards.add(new SetCardInfo("Oteclan Levitator", 29, Rarity.COMMON, mage.cards.o.OteclanLevitator.class));
        cards.add(new SetCardInfo("Out of Air", 69, Rarity.COMMON, mage.cards.o.OutOfAir.class));
        cards.add(new SetCardInfo("Over the Edge", 205, Rarity.COMMON, mage.cards.o.OverTheEdge.class));
        cards.add(new SetCardInfo("Palani's Hatcher", 237, Rarity.RARE, mage.cards.p.PalanisHatcher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Palani's Hatcher", 332, Rarity.RARE, mage.cards.p.PalanisHatcher.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Panicked Altisaur", 159, Rarity.COMMON, mage.cards.p.PanickedAltisaur.class));
        cards.add(new SetCardInfo("Pathfinding Axejaw", 206, Rarity.COMMON, mage.cards.p.PathfindingAxejaw.class));
        cards.add(new SetCardInfo("Petrify", 30, Rarity.COMMON, mage.cards.p.Petrify.class));
        cards.add(new SetCardInfo("Pirate Hat", 70, Rarity.COMMON, mage.cards.p.PirateHat.class));
        cards.add(new SetCardInfo("Pit of Offerings", 278, Rarity.UNCOMMON, mage.cards.p.PitOfOfferings.class));
        cards.add(new SetCardInfo("Plains", 287, Rarity.LAND, mage.cards.basiclands.Plains.class, FULL_ART_UST_VARIOUS));
        cards.add(new SetCardInfo("Plains", 393, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 394, Rarity.LAND, mage.cards.basiclands.Plains.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Plundering Pirate", 160, Rarity.COMMON, mage.cards.p.PlunderingPirate.class));
        cards.add(new SetCardInfo("Poetic Ingenuity", 161, Rarity.RARE, mage.cards.p.PoeticIngenuity.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Poetic Ingenuity", 377, Rarity.RARE, mage.cards.p.PoeticIngenuity.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Poison Dart Frog", 207, Rarity.COMMON, mage.cards.p.PoisonDartFrog.class));
        cards.add(new SetCardInfo("Preacher of the Schism", 113, Rarity.RARE, mage.cards.p.PreacherOfTheSchism.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Preacher of the Schism", 367, Rarity.RARE, mage.cards.p.PreacherOfTheSchism.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Primordial Gnawer", 114, Rarity.COMMON, mage.cards.p.PrimordialGnawer.class));
        cards.add(new SetCardInfo("Promising Vein", 279, Rarity.COMMON, mage.cards.p.PromisingVein.class));
        cards.add(new SetCardInfo("Pugnacious Hammerskull", 208, Rarity.RARE, mage.cards.p.PugnaciousHammerskull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Pugnacious Hammerskull", 328, Rarity.RARE, mage.cards.p.PugnaciousHammerskull.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Queen's Bay Paladin", 115, Rarity.RARE, mage.cards.q.QueensBayPaladin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Queen's Bay Paladin", 368, Rarity.RARE, mage.cards.q.QueensBayPaladin.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Quicksand Whirlpool", 31, Rarity.COMMON, mage.cards.q.QuicksandWhirlpool.class));
        cards.add(new SetCardInfo("Quintorius Kand", 238, Rarity.MYTHIC, mage.cards.q.QuintoriusKand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Quintorius Kand", 307, Rarity.MYTHIC, mage.cards.q.QuintoriusKand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Quintorius Kand", 352, Rarity.MYTHIC, mage.cards.q.QuintoriusKand.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rampaging Ceratops", 162, Rarity.UNCOMMON, mage.cards.r.RampagingCeratops.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rampaging Ceratops", 322, Rarity.UNCOMMON, mage.cards.r.RampagingCeratops.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Rampaging Spiketail", 116, Rarity.COMMON, mage.cards.r.RampagingSpiketail.class));
        cards.add(new SetCardInfo("Ray of Ruin", 117, Rarity.COMMON, mage.cards.r.RayOfRuin.class));
        cards.add(new SetCardInfo("Relic's Roar", 71, Rarity.COMMON, mage.cards.r.RelicsRoar.class));
        cards.add(new SetCardInfo("Resplendent Angel", 32, Rarity.MYTHIC, mage.cards.r.ResplendentAngel.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Resplendent Angel", 334, Rarity.MYTHIC, mage.cards.r.ResplendentAngel.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Restless Anchorage", 280, Rarity.RARE, mage.cards.r.RestlessAnchorage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Restless Anchorage", 347, Rarity.RARE, mage.cards.r.RestlessAnchorage.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Restless Prairie", 281, Rarity.RARE, mage.cards.r.RestlessPrairie.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Restless Prairie", 348, Rarity.RARE, mage.cards.r.RestlessPrairie.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Restless Reef", 282, Rarity.RARE, mage.cards.r.RestlessReef.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Restless Reef", 349, Rarity.RARE, mage.cards.r.RestlessReef.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Restless Ridgeline", 283, Rarity.RARE, mage.cards.r.RestlessRidgeline.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Restless Ridgeline", 350, Rarity.RARE, mage.cards.r.RestlessRidgeline.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Restless Vents", 284, Rarity.RARE, mage.cards.r.RestlessVents.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Restless Vents", 351, Rarity.RARE, mage.cards.r.RestlessVents.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("River Herald Guide", 209, Rarity.COMMON, mage.cards.r.RiverHeraldGuide.class));
        cards.add(new SetCardInfo("River Herald Scout", 72, Rarity.COMMON, mage.cards.r.RiverHeraldScout.class));
        cards.add(new SetCardInfo("Roaming Throne", 258, Rarity.RARE, mage.cards.r.RoamingThrone.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Roaming Throne", 344, Rarity.RARE, mage.cards.r.RoamingThrone.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Roar of the Fifth People", 189, Rarity.MYTHIC, mage.cards.r.RoarOfTheFifthPeople.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Roar of the Fifth People", 296, Rarity.MYTHIC, mage.cards.r.RoarOfTheFifthPeople.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Roar of the Fifth People", 339, Rarity.MYTHIC, mage.cards.r.RoarOfTheFifthPeople.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Ruin-Lurker Bat", 33, Rarity.UNCOMMON, mage.cards.r.RuinLurkerBat.class));
        cards.add(new SetCardInfo("Rumbling Rockslide", 163, Rarity.COMMON, mage.cards.r.RumblingRockslide.class));
        cards.add(new SetCardInfo("Runaway Boulder", 259, Rarity.COMMON, mage.cards.r.RunawayBoulder.class));
        cards.add(new SetCardInfo("Sage of Days", 73, Rarity.COMMON, mage.cards.s.SageOfDays.class));
        cards.add(new SetCardInfo("Saheeli's Lattice", 164, Rarity.UNCOMMON, mage.cards.s.SaheelisLattice.class));
        cards.add(new SetCardInfo("Saheeli, the Sun's Brilliance", 239, Rarity.MYTHIC, mage.cards.s.SaheeliTheSunsBrilliance.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Saheeli, the Sun's Brilliance", 308, Rarity.MYTHIC, mage.cards.s.SaheeliTheSunsBrilliance.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sandswirl Wanderglyph", 358, Rarity.RARE, mage.cards.s.SandswirlWanderglyph.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sandswirl Wanderglyph", 41, Rarity.RARE, mage.cards.s.SandswirlWanderglyph.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sanguine Evangelist", 34, Rarity.RARE, mage.cards.s.SanguineEvangelist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sanguine Evangelist", 356, Rarity.RARE, mage.cards.s.SanguineEvangelist.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Scampering Surveyor", 260, Rarity.UNCOMMON, mage.cards.s.ScamperingSurveyor.class));
        cards.add(new SetCardInfo("Screaming Phantom", 118, Rarity.COMMON, mage.cards.s.ScreamingPhantom.class));
        cards.add(new SetCardInfo("Scytheclaw Raptor", 165, Rarity.UNCOMMON, mage.cards.s.ScytheclawRaptor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Scytheclaw Raptor", 323, Rarity.UNCOMMON, mage.cards.s.ScytheclawRaptor.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Seeker of Sunlight", 210, Rarity.COMMON, mage.cards.s.SeekerOfSunlight.class));
        cards.add(new SetCardInfo("Seismic Monstrosaur", 166, Rarity.COMMON, mage.cards.s.SeismicMonstrosaur.class));
        cards.add(new SetCardInfo("Self-Reflection", 74, Rarity.UNCOMMON, mage.cards.s.SelfReflection.class));
        cards.add(new SetCardInfo("Sentinel of the Nameless City", 211, Rarity.RARE, mage.cards.s.SentinelOfTheNamelessCity.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sentinel of the Nameless City", 383, Rarity.RARE, mage.cards.s.SentinelOfTheNamelessCity.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Shadows' Lair", 108, Rarity.UNCOMMON, mage.cards.s.ShadowsLair.class));
        cards.add(new SetCardInfo("Shipwreck Sentry", 75, Rarity.COMMON, mage.cards.s.ShipwreckSentry.class));
        cards.add(new SetCardInfo("Sinuous Benthisaur", 76, Rarity.UNCOMMON, mage.cards.s.SinuousBenthisaur.class));
        cards.add(new SetCardInfo("Skullcap Snail", 119, Rarity.COMMON, mage.cards.s.SkullcapSnail.class));
        cards.add(new SetCardInfo("Soaring Sandwing", 35, Rarity.COMMON, mage.cards.s.SoaringSandwing.class));
        cards.add(new SetCardInfo("Song of Stupefaction", 77, Rarity.COMMON, mage.cards.s.SongOfStupefaction.class));
        cards.add(new SetCardInfo("Sorcerous Spyglass", 261, Rarity.UNCOMMON, mage.cards.s.SorcerousSpyglass.class));
        cards.add(new SetCardInfo("Soulcoil Viper", 120, Rarity.UNCOMMON, mage.cards.s.SoulcoilViper.class));
        cards.add(new SetCardInfo("Souls of the Lost", 121, Rarity.RARE, mage.cards.s.SoulsOfTheLost.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Souls of the Lost", 369, Rarity.RARE, mage.cards.s.SoulsOfTheLost.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sovereign Okinec Ahau", 240, Rarity.MYTHIC, mage.cards.s.SovereignOkinecAhau.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sovereign Okinec Ahau", 309, Rarity.MYTHIC, mage.cards.s.SovereignOkinecAhau.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sovereign's Macuahuitl", 155, Rarity.COMMON, mage.cards.s.SovereignsMacuahuitl.class));
        cards.add(new SetCardInfo("Spelunking", 213, Rarity.UNCOMMON, mage.cards.s.Spelunking.class));
        cards.add(new SetCardInfo("Spring-Loaded Sawblades", 36, Rarity.UNCOMMON, mage.cards.s.SpringLoadedSawblades.class));
        cards.add(new SetCardInfo("Spyglass Siren", 405, Rarity.UNCOMMON, mage.cards.s.SpyglassSiren.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Spyglass Siren", 78, Rarity.UNCOMMON, mage.cards.s.SpyglassSiren.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Squirming Emergence", 241, Rarity.RARE, mage.cards.s.SquirmingEmergence.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Squirming Emergence", 386, Rarity.RARE, mage.cards.s.SquirmingEmergence.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Staggering Size", 214, Rarity.COMMON, mage.cards.s.StaggeringSize.class));
        cards.add(new SetCardInfo("Stalactite Stalker", 122, Rarity.RARE, mage.cards.s.StalactiteStalker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Stalactite Stalker", 370, Rarity.RARE, mage.cards.s.StalactiteStalker.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Starving Revenant", 123, Rarity.RARE, mage.cards.s.StarvingRevenant.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Starving Revenant", 338, Rarity.RARE, mage.cards.s.StarvingRevenant.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Staunch Crewmate", 79, Rarity.UNCOMMON, mage.cards.s.StaunchCrewmate.class));
        cards.add(new SetCardInfo("Stinging Cave Crawler", 124, Rarity.UNCOMMON, mage.cards.s.StingingCaveCrawler.class));
        cards.add(new SetCardInfo("Subterranean Schooner", 365, Rarity.RARE, mage.cards.s.SubterraneanSchooner.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Subterranean Schooner", 80, Rarity.RARE, mage.cards.s.SubterraneanSchooner.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sunbird Effigy", 262, Rarity.UNCOMMON, mage.cards.s.SunbirdEffigy.class));
        cards.add(new SetCardInfo("Sunbird Standard", 262, Rarity.UNCOMMON, mage.cards.s.SunbirdStandard.class));
        cards.add(new SetCardInfo("Sunfire Torch", 167, Rarity.COMMON, mage.cards.s.SunfireTorch.class));
        cards.add(new SetCardInfo("Sunken Citadel", 285, Rarity.RARE, mage.cards.s.SunkenCitadel.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sunken Citadel", 392, Rarity.RARE, mage.cards.s.SunkenCitadel.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Sunshot Militia", 168, Rarity.COMMON, mage.cards.s.SunshotMilitia.class));
        cards.add(new SetCardInfo("Swamp", 289, Rarity.LAND, mage.cards.basiclands.Swamp.class, FULL_ART_UST_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 397, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 398, Rarity.LAND, mage.cards.basiclands.Swamp.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Swashbuckler's Whip", 263, Rarity.UNCOMMON, mage.cards.s.SwashbucklersWhip.class));
        cards.add(new SetCardInfo("Synapse Necromage", 125, Rarity.UNCOMMON, mage.cards.s.SynapseNecromage.class));
        cards.add(new SetCardInfo("Tarrian's Journal", 126, Rarity.RARE, mage.cards.t.TarriansJournal.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tarrian's Journal", 371, Rarity.RARE, mage.cards.t.TarriansJournal.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tarrian's Soulcleaver", 264, Rarity.RARE, mage.cards.t.TarriansSoulcleaver.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tarrian's Soulcleaver", 389, Rarity.RARE, mage.cards.t.TarriansSoulcleaver.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tectonic Hazard", 169, Rarity.COMMON, mage.cards.t.TectonicHazard.class));
        cards.add(new SetCardInfo("Tecutlan, the Searing Rift", 135, Rarity.RARE, mage.cards.t.TecutlanTheSearingRift.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tecutlan, the Searing Rift", 373, Rarity.RARE, mage.cards.t.TecutlanTheSearingRift.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple of Civilization", 26, Rarity.MYTHIC, mage.cards.t.TempleOfCivilization.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple of Civilization", 314, Rarity.MYTHIC, mage.cards.t.TempleOfCivilization.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple of Cultivation", 204, Rarity.MYTHIC, mage.cards.t.TempleOfCultivation.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple of Cultivation", 318, Rarity.MYTHIC, mage.cards.t.TempleOfCultivation.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple of Cyclical Time", 315, Rarity.MYTHIC, mage.cards.t.TempleOfCyclicalTime.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple of Cyclical Time", 67, Rarity.MYTHIC, mage.cards.t.TempleOfCyclicalTime.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple of Power", 158, Rarity.MYTHIC, mage.cards.t.TempleOfPower.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple of Power", 317, Rarity.MYTHIC, mage.cards.t.TempleOfPower.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple of the Dead", 316, Rarity.MYTHIC, mage.cards.t.TempleOfTheDead.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Temple of the Dead", 88, Rarity.MYTHIC, mage.cards.t.TempleOfTheDead.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tendril of the Mycotyrant", 215, Rarity.UNCOMMON, mage.cards.t.TendrilOfTheMycotyrant.class));
        cards.add(new SetCardInfo("Terror Tide", 127, Rarity.RARE, mage.cards.t.TerrorTide.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Terror Tide", 372, Rarity.RARE, mage.cards.t.TerrorTide.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Ancient One", 222, Rarity.MYTHIC, mage.cards.t.TheAncientOne.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Ancient One", 319, Rarity.MYTHIC, mage.cards.t.TheAncientOne.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Belligerent", 225, Rarity.RARE, mage.cards.t.TheBelligerent.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Belligerent", 384, Rarity.RARE, mage.cards.t.TheBelligerent.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Core", 256, Rarity.RARE, mage.cards.t.TheCore.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Core", 387, Rarity.RARE, mage.cards.t.TheCore.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Enigma Jewel", 362, Rarity.MYTHIC, mage.cards.t.TheEnigmaJewel.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Enigma Jewel", 55, Rarity.MYTHIC, mage.cards.t.TheEnigmaJewel.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Everflowing Well", 363, Rarity.RARE, mage.cards.t.TheEverflowingWell.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Everflowing Well", 56, Rarity.RARE, mage.cards.t.TheEverflowingWell.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Grim Captain", 266, Rarity.RARE, mage.cards.t.TheGrimCaptain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Grim Captain", 313, Rarity.RARE, mage.cards.t.TheGrimCaptain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Millennium Calendar", 257, Rarity.MYTHIC, mage.cards.t.TheMillenniumCalendar.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Millennium Calendar", 388, Rarity.MYTHIC, mage.cards.t.TheMillenniumCalendar.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Mycotyrant", 235, Rarity.MYTHIC, mage.cards.t.TheMycotyrant.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Mycotyrant", 305, Rarity.MYTHIC, mage.cards.t.TheMycotyrant.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Myriad Pools", 363, Rarity.RARE, mage.cards.t.TheMyriadPools.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Myriad Pools", 56, Rarity.RARE, mage.cards.t.TheMyriadPools.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Skullspore Nexus", 212, Rarity.MYTHIC, mage.cards.t.TheSkullsporeNexus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Skullspore Nexus", 340, Rarity.MYTHIC, mage.cards.t.TheSkullsporeNexus.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Tomb of Aclazotz", 126, Rarity.RARE, mage.cards.t.TheTombOfAclazotz.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("The Tomb of Aclazotz", 371, Rarity.RARE, mage.cards.t.TheTombOfAclazotz.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thousand Moons Crackshot", 37, Rarity.COMMON, mage.cards.t.ThousandMoonsCrackshot.class));
        cards.add(new SetCardInfo("Thousand Moons Infantry", 38, Rarity.COMMON, mage.cards.t.ThousandMoonsInfantry.class));
        cards.add(new SetCardInfo("Thousand Moons Smithy", 357, Rarity.RARE, mage.cards.t.ThousandMoonsSmithy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thousand Moons Smithy", 39, Rarity.RARE, mage.cards.t.ThousandMoonsSmithy.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thrashing Brontodon", 216, Rarity.UNCOMMON, mage.cards.t.ThrashingBrontodon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Thrashing Brontodon", 329, Rarity.UNCOMMON, mage.cards.t.ThrashingBrontodon.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Threefold Thunderhulk", 265, Rarity.RARE, mage.cards.t.ThreefoldThunderhulk.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Threefold Thunderhulk", 390, Rarity.RARE, mage.cards.t.ThreefoldThunderhulk.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Throne of the Grim Captain", 266, Rarity.RARE, mage.cards.t.ThroneOfTheGrimCaptain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Throne of the Grim Captain", 313, Rarity.RARE, mage.cards.t.ThroneOfTheGrimCaptain.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tinker's Tote", 40, Rarity.COMMON, mage.cards.t.TinkersTote.class));
        cards.add(new SetCardInfo("Tishana's Tidebinder", 335, Rarity.RARE, mage.cards.t.TishanasTidebinder.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tishana's Tidebinder", 81, Rarity.RARE, mage.cards.t.TishanasTidebinder.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Tithing Blade", 128, Rarity.COMMON, mage.cards.t.TithingBlade.class));
        cards.add(new SetCardInfo("Treasure Cove", 267, Rarity.RARE, mage.cards.t.TreasureCove.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Treasure Cove", 391, Rarity.RARE, mage.cards.t.TreasureCove.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Treasure Map", 267, Rarity.RARE, mage.cards.t.TreasureMap.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Treasure Map", 391, Rarity.RARE, mage.cards.t.TreasureMap.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Triumphant Chomp", 170, Rarity.UNCOMMON, mage.cards.t.TriumphantChomp.class));
        cards.add(new SetCardInfo("Trumpeting Carnosaur", 171, Rarity.RARE, mage.cards.t.TrumpetingCarnosaur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Trumpeting Carnosaur", 324, Rarity.RARE, mage.cards.t.TrumpetingCarnosaur.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Twists and Turns", 217, Rarity.UNCOMMON, mage.cards.t.TwistsAndTurns.class));
        cards.add(new SetCardInfo("Uchbenbak, the Great Mistake", 242, Rarity.UNCOMMON, mage.cards.u.UchbenbakTheGreatMistake.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Uchbenbak, the Great Mistake", 310, Rarity.UNCOMMON, mage.cards.u.UchbenbakTheGreatMistake.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Unlucky Drop", 82, Rarity.COMMON, mage.cards.u.UnluckyDrop.class));
        cards.add(new SetCardInfo("Unstable Glyphbridge", 358, Rarity.RARE, mage.cards.u.UnstableGlyphbridge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Unstable Glyphbridge", 41, Rarity.RARE, mage.cards.u.UnstableGlyphbridge.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vanguard of the Rose", 42, Rarity.UNCOMMON, mage.cards.v.VanguardOfTheRose.class));
        cards.add(new SetCardInfo("Visage of Dread", 129, Rarity.UNCOMMON, mage.cards.v.VisageOfDread.class));
        cards.add(new SetCardInfo("Vito's Inquisitor", 130, Rarity.COMMON, mage.cards.v.VitosInquisitor.class));
        cards.add(new SetCardInfo("Vito, Fanatic of Aclazotz", 243, Rarity.MYTHIC, mage.cards.v.VitoFanaticOfAclazotz.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Vito, Fanatic of Aclazotz", 311, Rarity.MYTHIC, mage.cards.v.VitoFanaticOfAclazotz.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Volatile Fault", 286, Rarity.UNCOMMON, mage.cards.v.VolatileFault.class));
        cards.add(new SetCardInfo("Volatile Wanderglyph", 172, Rarity.COMMON, mage.cards.v.VolatileWanderglyph.class));
        cards.add(new SetCardInfo("Wail of the Forgotten", 244, Rarity.RARE, mage.cards.w.WailOfTheForgotten.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Wail of the Forgotten", 343, Rarity.RARE, mage.cards.w.WailOfTheForgotten.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Walk with the Ancestors", 218, Rarity.COMMON, mage.cards.w.WalkWithTheAncestors.class));
        cards.add(new SetCardInfo("Warden of the Inner Sky", 359, Rarity.RARE, mage.cards.w.WardenOfTheInnerSky.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Warden of the Inner Sky", 43, Rarity.RARE, mage.cards.w.WardenOfTheInnerSky.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Waterlogged Hulk", 83, Rarity.UNCOMMON, mage.cards.w.WaterloggedHulk.class));
        cards.add(new SetCardInfo("Watertight Gondola", 83, Rarity.UNCOMMON, mage.cards.w.WatertightGondola.class));
        cards.add(new SetCardInfo("Waterwind Scout", 84, Rarity.COMMON, mage.cards.w.WaterwindScout.class));
        cards.add(new SetCardInfo("Waylaying Pirates", 85, Rarity.COMMON, mage.cards.w.WaylayingPirates.class));
        cards.add(new SetCardInfo("Zoetic Glyph", 86, Rarity.UNCOMMON, mage.cards.z.ZoeticGlyph.class));
        cards.add(new SetCardInfo("Zoyowa Lava-Tongue", 245, Rarity.UNCOMMON, mage.cards.z.ZoyowaLavaTongue.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zoyowa Lava-Tongue", 312, Rarity.UNCOMMON, mage.cards.z.ZoyowaLavaTongue.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zoyowa's Justice", 173, Rarity.UNCOMMON, mage.cards.z.ZoyowasJustice.class));
    }

    @Override
    public BoosterCollator createCollator() {
        return new TheLostCavernsOfIxalanCollator();
    }
}

// Booster collation info from https://www.lethe.xyz/mtg/collation/lci.html
// Using Japanese collation
// Using 1:2 ratio for individual dfc uncommon:common - as per shown sheet - differs from text description
// Using 5:3 ratio for individual nonbasic:basic - matches both text desciption and shown sheet
class TheLostCavernsOfIxalanCollator implements BoosterCollator {
    private final CardRun commonA = new CardRun(true, "174", "248", "175", "166", "192", "206", "199", "205", "177", "138", "203", "210", "200", "192", "175", "206", "201", "250", "177", "174", "200", "205", "203", "210", "136", "202", "214", "182", "138", "218", "190", "248", "199", "166", "210", "192", "214", "174", "218", "182", "259", "190", "199", "248", "200", "203", "138", "177", "250", "202", "205", "166", "175", "259", "201", "136", "206", "250", "192", "203", "177", "248", "199", "174", "136", "205", "214", "166", "206", "201", "218", "202", "138", "200", "175", "182", "259", "190", "210", "192", "218", "166", "200", "174", "199", "250", "205", "190", "210", "201", "136", "206", "182", "138", "202", "175", "248", "177", "259", "214", "203", "201", "250", "190", "182", "218", "259", "202", "136", "214");
    private final CardRun commonB = new CardRun(true, "46", "140", "49", "131", "77", "149", "209", "75", "167", "84", "169", "66", "172", "71", "73", "163", "253", "68", "144", "57", "82", "131", "246", "45", "132", "64", "207", "151", "85", "154", "49", "140", "46", "168", "72", "70", "142", "53", "159", "69", "160", "85", "167", "207", "64", "151", "46", "132", "73", "163", "71", "75", "154", "253", "70", "160", "49", "82", "131", "246", "84", "142", "77", "209", "168", "68", "172", "69", "140", "53", "149", "72", "66", "169", "45", "159", "57", "144", "82", "168", "209", "66", "149", "84", "142", "85", "172", "69", "77", "160", "246", "68", "154", "57", "73", "144", "253", "45", "132", "75", "207", "169", "70", "163", "71", "159", "72", "151", "53", "64", "167");
    private final CardRun commonC = new CardRun(true, "116", "2", "99", "15", "90", "13", "118", "18", "101", "40", "130", "31", "106", "37", "110", "9", "117", "28", "89", "24", "100", "11", "95", "35", "114", "38", "104", "4", "109", "3", "90", "11", "255", "105", "15", "89", "31", "110", "40", "118", "30", "119", "13", "99", "28", "117", "2", "100", "7", "106", "3", "116", "38", "101", "18", "112", "24", "130", "27", "109", "4", "104", "9", "114", "35", "95", "37", "118", "31", "255", "104", "28", "106", "3", "130", "9", "90", "4", "99", "40", "119", "18", "105", "38", "116", "27", "109", "7", "100", "2", "114", "35", "95", "11", "110", "24", "112", "30", "117", "13", "101", "15", "89", "37", "119", "27", "255", "105", "30", "112", "7");
    private final CardRun dfc = new CardRun(false, "6", "146", "108", "155", "155", "60", "60", "195", "197", "197", "62", "233", "29", "29", "164", "36", "262", "128", "128", "217", "129", "83");
    private final CardRun uncommonA = new CardRun(false, "65", "65", "65", "74", "74", "74", "76", "76", "76", "78", "78", "405", "79", "79", "79", "86", "86", "86");
    private final CardRun uncommonB = new CardRun(true, "254", "33", "48", "23", "58", "286", "96", "251", "25", "111", "51", "5", "125", "8", "124", "186", "22", "102", "261", "87", "272", "107", "59", "120", "278", "19", "103", "42", "93", "21", "247", "33", "48", "111", "10", "50", "96", "23", "54", "286", "58", "17", "254", "213", "124", "8", "252", "59", "102", "25", "247", "51", "5", "125", "251", "107", "42", "93", "19", "103", "186", "22", "87", "278", "21", "261", "120", "272", "254", "17", "54", "252", "50", "10", "213", "48", "33", "58", "286", "96", "23", "51", "251", "124", "8", "125", "5", "102", "25", "59", "120", "247", "107", "186", "22", "272", "87", "261", "103", "278", "19", "93", "21", "111", "42", "252", "17", "54", "213", "10", "50");
    private final CardRun uncommonC = new CardRun(true, "245", "141", "301", "180", "230", "150", "220", "147", "194", "227", "148", "178", "139", "184", "260", "322", "263", "150", "187", "303", "198", "232", "183", "139", "270", "97", "173", "16", "187", "263", "198", "141", "298", "162", "232", "91", "173", "230", "143", "180", "170", "184", "242", "226", "147", "215", "320", "224", "187", "260", "236", "263", "143", "184", "242", "270", "245", "183", "147", "216", "236", "133", "224", "215", "310", "152", "302", "143", "331", "97", "178", "306", "323", "304", "198", "162", "329", "133", "312", "148", "215", "91", "170", "260", "179", "226", "194", "165", "16", "216", "97", "227", "152", "270", "150", "179", "139", "91", "170", "194", "165", "16", "141", "180", "152", "179", "220", "178", "173", "325", "148");
    private final CardRun rare = new CardRun(false, "219", "219", "1", "1", "88", "44", "44", "221", "221", "223", "223", "176", "176", "92", "134", "47", "47", "135", "135", "137", "137", "94", "94", "269", "249", "98", "98", "181", "181", "228", "228", "52", "52", "145", "145", "271", "271", "12", "12", "14", "14", "185", "229", "188", "188", "153", "153", "189", "191", "191", "156", "156", "193", "193", "196", "196", "231", "231", "61", "61", "20", "20", "157", "157", "63", "63", "256", "256", "234", "234", "158", "204", "67", "26", "237", "237", "161", "161", "113", "113", "208", "208", "115", "115", "238", "32", "280", "280", "281", "281", "282", "282", "283", "283", "284", "284", "258", "258", "239", "34", "34", "211", "211", "121", "121", "240", "241", "241", "122", "122", "123", "123", "80", "80", "285", "285", "126", "126", "264", "264", "127", "127", "222", "225", "225", "55", "56", "56", "257", "235", "212", "39", "39", "265", "265", "266", "266", "81", "81", "267", "267", "171", "171", "41", "41", "243", "244", "244", "43", "43");
    private final CardRun land = new CardRun(false, "268", "268", "268", "268", "268", "273", "273", "273", "273", "273", "274", "274", "274", "274", "274", "275", "275", "275", "275", "275", "276", "276", "276", "276", "276", "277", "277", "277", "277", "277", "279", "279", "279", "279", "279", "287", "287", "287", "288", "288", "288", "289", "289", "289", "290", "290", "290", "291", "291", "291");

    private final BoosterStructure AABBBCCCC = new BoosterStructure(
            commonA, commonA,
            commonB, commonB, commonB,
            commonC, commonC, commonC, commonC
    );
    private final BoosterStructure AABBBBCCC = new BoosterStructure(
            commonA, commonA,
            commonB, commonB, commonB, commonB,
            commonC, commonC, commonC
    );
    private final BoosterStructure AAABBBCCC = new BoosterStructure(
            commonA, commonA, commonA,
            commonB, commonB, commonB,
            commonC, commonC, commonC
    );
    private final BoosterStructure BCC = new BoosterStructure(uncommonB, uncommonC, uncommonC);
    private final BoosterStructure BBC = new BoosterStructure(uncommonB, uncommonB, uncommonC);
    private final BoosterStructure ABC = new BoosterStructure(uncommonA, uncommonB, uncommonC);

    private final BoosterStructure D1 = new BoosterStructure(dfc);
    private final BoosterStructure R1 = new BoosterStructure(rare);
    private final BoosterStructure L1 = new BoosterStructure(land);

    // In order for equal numbers of each common to exist, the average booster must contain:
    // 2.06250 A commons (66 / 32)  whilst paper 3A packs not observed, 6¼% 3A packs required where foils are ignored
    // 3.46875 B commons (111 / 32)
    // 3.46875 C commons (111 / 32)
    // Because xmage doesn't consider foils displacing commons, this requires the possibility of packs with 3 A commons
    // Taking into account foils changes the numbers to 1.986 A, 3.340 B, 3.340 C
    // which would mean 3x FABBBBCCC,3x FABBBCCCC,138x FAABBBCCC,144x AABBBBCCC,144x AABBBCCCC 
    private final RarityConfiguration commonRuns = new RarityConfiguration(
            AABBBCCCC, AABBBCCCC, AABBBCCCC, AABBBCCCC, AABBBCCCC,
            AABBBCCCC, AABBBCCCC, AABBBCCCC, AABBBCCCC, AABBBCCCC,
            AABBBCCCC, AABBBCCCC, AABBBCCCC, AABBBCCCC, AABBBCCCC,
            AABBBBCCC, AABBBBCCC, AABBBBCCC, AABBBBCCC, AABBBBCCC,
            AABBBBCCC, AABBBBCCC, AABBBBCCC, AABBBBCCC, AABBBBCCC,
            AABBBBCCC, AABBBBCCC, AABBBBCCC, AABBBBCCC, AABBBBCCC,
            AAABBBCCC, AAABBBCCC
    );

    // In order for equal numbers of each common to exist, the average booster must contain:
    // 0.2250 A uncommons (18 / 80)
    // 1.3875 B uncommons (111 / 80)
    // 1.3875 C uncommons (111 / 80)
    private final RarityConfiguration uncommonRuns = new RarityConfiguration(
            BCC, BCC, BCC, BCC, BCC, BCC, BCC, BCC, BCC, BCC, 
            BCC, BCC, BCC, BCC, BCC, BCC, BCC, BCC, BCC, BCC, 
            BCC, BCC, BCC, BCC, BCC, BCC, BCC, BCC, BCC, BCC, 
            BCC, 
            BBC, BBC, BBC, BBC, BBC, BBC, BBC, BBC, BBC, BBC, 
            BBC, BBC, BBC, BBC, BBC, BBC, BBC, BBC, BBC, BBC, 
            BBC, BBC, BBC, BBC, BBC, BBC, BBC, BBC, BBC, BBC, 
            BBC,
            ABC, ABC, ABC, ABC, ABC, ABC, ABC, ABC, ABC, ABC, 
            ABC, ABC, ABC, ABC, ABC, ABC, ABC, ABC
    );

    private final RarityConfiguration dfcRuns = new RarityConfiguration(D1);
    private final RarityConfiguration rareRuns = new RarityConfiguration(R1);
    private final RarityConfiguration landRuns = new RarityConfiguration(L1);

    @Override
    public List<String> makeBooster() {
        List<String> booster = new ArrayList<>();
        booster.addAll(commonRuns.getNext().makeRun());
        booster.addAll(dfcRuns.getNext().makeRun());
        booster.addAll(uncommonRuns.getNext().makeRun());
        booster.addAll(rareRuns.getNext().makeRun());
        booster.addAll(landRuns.getNext().makeRun());
        return booster;
    }
}