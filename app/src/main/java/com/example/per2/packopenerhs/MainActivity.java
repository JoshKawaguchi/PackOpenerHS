package com.example.per2.packopenerhs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int dustValue;
    private int craftCost;
    public ArrayList<Card> common;
    public ArrayList<Card> rare;
    public ArrayList<Card> epic;
    public ArrayList<Card> legendary;
    private Button card1;
    private Button card2;
    private Button card3;
    private Button card4;
    private Button card5;
    private Button next;
    private TextView craft;
    private TextView dust;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        Card abomination = new Card(R.drawable.abomination,"Rare");
        Card alarm_o_bot = new Card(R.drawable.alarm_o_bot,"Rare");
        Card aldor_peacekeeper = new Card(R.drawable.aldor_peacekeeper,"Rare");
        Card ancestral_spirit = new Card(R.drawable.ancestral_spirit,"Rare");
        Card ancient_mage = new Card(R.drawable.ancient_mage,"Rare");
        Card ancient_watcher = new Card(R.drawable.ancient_watcher,"Rare");
        Card angry_chicken = new Card(R.drawable.angry_chicken,"Rare");
        Card arcane_golem = new Card(R.drawable.arcane_golem,"Rare");
        Card argent_commander = new Card(R.drawable.argent_commander,"Rare");
        Card armorsmith = new Card(R.drawable.armorsmith,"Rare");
        Card auchenai_soulpriest = new Card(R.drawable.auchenai_soulpriest,"Rare");
        Card bite = new Card(R.drawable.bite,"Rare");
        Card blade_flurry = new Card(R.drawable.blade_flurry,"Rare");
        Card blessed_champion = new Card(R.drawable.blessed_champion,"Rare");
        Card blizzard = new Card(R.drawable.blizzard,"Rare");
        Card bloodsail_corsair = new Card(R.drawable.bloodsail_corsair,"Rare");
        Card coldlight_seer = new Card(R.drawable.coldlight_seer,"Rare");
        Card commanding_shout = new Card(R.drawable.commanding_shout,"Rare");
        Card counterspell = new Card(R.drawable.counterspell,"Rare");
        Card crazed_alchemist = new Card(R.drawable.crazed_alchemist,"Rare");
        Card defender_of_argus = new Card(R.drawable.defender_of_argus,"Rare");
        Card demolisher = new Card(R.drawable.demolisher,"Rare");
        Card divine_favor = new Card(R.drawable.divine_favor,"Rare");
        Card doomguard = new Card(R.drawable.doomguard,"Rare");
        Card eaglehorn_bow = new Card(R.drawable.eaglehorn_bow,"Rare");
        Card emperor_cobra = new Card(R.drawable.emperor_cobra,"Rare");
        Card equality = new Card(R.drawable.equality,"Rare");
        Card ethereal_arcanist = new Card(R.drawable.ethereal_arcanist,"Rare");
        Card explosive_shot = new Card(R.drawable.explosive_shot,"Rare");
        Card felguard = new Card(R.drawable.felguard,"Rare");
        Card feral_spirit = new Card(R.drawable.feral_spirit,"Rare");
        Card flare = new Card(R.drawable.flare,"Rare");
        Card frothing_berserker = new Card(R.drawable.frothing_berserker,"Rare");
        Card gadgetzan_auctioneer = new Card(R.drawable.gadgetzan_auctioneer,"Rare");
        Card headcrack = new Card(R.drawable.headcrack,"Rare");
        Card holy_fire = new Card(R.drawable.holy_fire,"Rare");
        Card holy_wrath = new Card(R.drawable.holy_wrath,"Rare");
        Card imp_master = new Card(R.drawable.imp_master,"Rare");
        Card injured_blademaster = new Card(R.drawable.injured_blademaster,"Rare");
        Card keeper_of_the_grove = new Card(R.drawable.keeper_of_the_grove,"Rare");
        Card kirin_tor_mage = new Card(R.drawable.kirin_tor_mage,"Rare");
        Card knife_juggler = new Card(R.drawable.knife_juggler,"Rare");
        Card lava_burst = new Card(R.drawable.lava_burst,"Rare");
        Card lightning_storm = new Card(R.drawable.lightning_storm,"Rare");
        Card lightwarden = new Card(R.drawable.lightwarden,"Rare");
        Card lightwell = new Card(R.drawable.lightwell,"Rare");
        Card man_wraith = new Card(R.drawable.man_wraith,"Rare");
        Card mana_addict = new Card(R.drawable.mana_addict,"Rare");
        Card mana_tide_totem = new Card(R.drawable.mana_tide_totem,"Rare");
        Card mass_dispel = new Card(R.drawable.mass_dispel,"Rare");
        Card master_of_disguise = new Card(R.drawable.master_of_disguise,"Rare");
        Card master_swordsmith = new Card(R.drawable.master_swordsmith,"Rare");
        Card mind_control_tech = new Card(R.drawable.mind_control_tech,"Rare");
        Card misdirection = new Card(R.drawable.misdirection,"Rare");
        Card mortal_strike = new Card(R.drawable.mortal_strike,"Rare");
        Card murloc_tidecaller = new Card(R.drawable.murloc_tidecaller,"Rare");
        Card nourish = new Card(R.drawable.nourish,"Rare");
        Card perditions_blade = new Card(R.drawable.perditions_blade,"Rare");
        Card pintsized_summoner = new Card(R.drawable.pintsized_summoner,"Rare");
        Card questing_adventurer = new Card(R.drawable.questing_adventurer,"Rare");
        Card ravenholdt_assassin = new Card(R.drawable.ravenholdt_assassin,"Rare");
        Card savagery = new Card(R.drawable.savagery,"Rare");
        Card savannah_highmane = new Card(R.drawable.savannah_highmane,"Rare");
        Card secretkeeper = new Card(R.drawable.secretkeeper,"Rare");
        Card shadow_madness = new Card(R.drawable.shadow_madness,"Rare");
        Card shadowflame = new Card(R.drawable.shadowflame,"Rare");
        Card si7_agent = new Card(R.drawable.si7_agent,"Rare");
        Card siphon_soul = new Card(R.drawable.siphon_soul,"Rare");
        Card stampeding_kodo = new Card(R.drawable.stampeding_kodo,"Rare");
        Card starfall = new Card(R.drawable.starfall,"Rare");
        Card sunfury_protector = new Card(R.drawable.sunfury_protector,"Rare");
        Card sunwalker = new Card(R.drawable.sunwalker,"Rare");
        Card twilight_drake = new Card(R.drawable.twilight_drake,"Rare");
        Card upgrade = new Card(R.drawable.upgrade,"Rare");
        Card vaporize = new Card(R.drawable.vaporize,"Rare");
        Card violet_teacher = new Card(R.drawable.violet_teacher,"Rare");
        Card void_terror = new Card(R.drawable.void_terror,"Rare");
        Card wild_pyromancer = new Card(R.drawable.wild_pyromancer,"Rare");
        Card young_priestess = new Card(R.drawable.young_priestess,"Rare");
        Card abusive_sergeant = new Card(R.drawable.abusive_sergreant,"Common");
        Card acolyte_of_pain = new Card(R.drawable.acolyte_of_pain,"Common");
        Card amani_berserker = new Card(R.drawable.amani_berserker,"Common");
        Card ancient_bremaster = new Card(R.drawable.ancient_brewmaster,"Common");
        Card arathi_weaponsmith = new Card(R.drawable.arathi_weaponsmith,"Common");
        Card argent_squire = new Card(R.drawable.argent_squire,"Common");
        Card battle_rage = new Card(R.drawable.battle_rage,"Common");
        Card betrayal = new Card(R.drawable.betrayal,"Common");
        Card blessing_of_wisdom = new Card(R.drawable.blessing_of_wisdom,"Common");
        Card blood_imp = new Card(R.drawable.blood_imp,"Common");
        Card bloodsaid_raider = new Card(R.drawable.bloodsaid_raider,"Common");
        Card call_of_the_void = new Card(R.drawable.call_of_the_void,"Common");
        Card circle_of_healing = new Card(R.drawable.cirlce_of_healing,"Common");
        Card cold_blood = new Card(R.drawable.cold_blood,"Common");
        Card cone_of_cold = new Card(R.drawable.cone_of_cold,"Common");
        Card cruel_taskmaster = new Card(R.drawable.cruel_taskmaster,"Common");
        Card cult_master = new Card(R.drawable.cult_master,"Common");
        Card dark_iron_dwarf = new Card(R.drawable.dark_iron_dwarf,"Common");
        Card deadly_shot = new Card(R.drawable.deadly_shot,"Common");
        Card defias_ringleader = new Card(R.drawable.defias_ringleader,"Common");
        Card demonfire = new Card(R.drawable.demonfire,"Common");
        Card dire_wolf_alpha = new Card(R.drawable.dire_wolf_alpha,"Common");
        Card dread_corsair = new Card(R.drawable.dread_corsair,"Common");
        Card druid_of_the_claw = new Card(R.drawable.druid_of_the_claw,"Common");
        Card dust_devil = new Card(R.drawable.dust_devil,"Common");
        Card earth_shock = new Card(R.drawable.earth_shock,"Common");
        Card earthen_ring_farseer = new Card(R.drawable.earthen_ring_farseer,"Common");
        Card eviscerate = new Card(R.drawable.eviscerate,"Common");
        Card explosivetrap = new Card(R.drawable.explosivetrap,"Common");
        Card eyeforan_eye = new Card(R.drawable.eyeforan_eye,"Common");
        Card faerie_dragon = new Card(R.drawable.faerie_dragon,"Common");
        Card fen_creeper = new Card(R.drawable.fen_creeper,"Common");
        Card flame_imp = new Card(R.drawable.flame_imp,"Common");
        Card flesheating_ghoul = new Card(R.drawable.flesheating_ghoul,"Common");
        Card forked_lightning = new Card(R.drawable.forked_lightning,"Common");
        Card freezing_trap = new Card(R.drawable.freezing_trap,"Common");
        Card frost_element = new Card(R.drawable.frost_elemental,"Common");
        Card harvest_golem = new Card(R.drawable.harvest_golem,"Common");
        Card ice_barrier = new Card(R.drawable.ice_barrier,"Common");
        Card inner_fire = new Card(R.drawable.inner_fire,"Common");
        Card inner_rage = new Card(R.drawable.inner_rage,"Common");
        Card iron_beak_owl = new Card(R.drawable.iron_beak_owl,"Common");
        Card jungle_panther = new Card(R.drawable.jungle_panther,"Common");
        Card leper_gnome = new Card(R.drawable.leper_gnome,"Common");
        Card lightning_bolt = new Card(R.drawable.lightning_bolt,"Common");
        Card lightspawn = new Card(R.drawable.lightspawn,"Common");
        Card loot_hoarder = new Card(R.drawable.loot_hoarder,"Common");
        Card mad_bomber = new Card(R.drawable.mad_bomber,"Common");
        Card mana_wyrm = new Card(R.drawable.mana_wyrm,"Common");
        Card mark_of_nature = new Card(R.drawable.mark_of_nature,"Common");
        Card mirror_entity = new Card(R.drawable.mirror_entity,"Common");
        Card mogu_shanwarden = new Card(R.drawable.mogu_shanwarden,"Common");
        Card naturalize = new Card(R.drawable.naturalize,"Common");
        Card noble_sacrifice = new Card(R.drawable.noble_sacrifice,"Common");
        Card pilfer = new Card(R.drawable.pilfer,"Common");
        Card power_of_the_wild = new Card(R.drawable.power_of_the_wild,"Common");
        Card priestess_of_elune = new Card(R.drawable.priestess_of_elune,"Common");
        Card raging_worgen = new Card(R.drawable.raging_worgen,"Common");
        Card rampage = new Card(R.drawable.rampage,"Common");
        Card redemption = new Card(R.drawable.redemption,"Common");
        Card repentance = new Card(R.drawable.repentance,"Common");
        Card scarlet_crusader = new Card(R.drawable.scarlet_crusader,"Common");
        Card scavenging_hyena = new Card(R.drawable.scavenging_hyena,"Common");
        Card sense_demons = new Card(R.drawable.sense_demons,"Common");
        Card shadowstep = new Card(R.drawable.shadowstep,"Common");
        Card shieldbearer = new Card(R.drawable.shieldbearer,"Common");
        Card silence = new Card(R.drawable.silence,"Common");
        Card silver_hand_knight = new Card(R.drawable.silver_hand_knight,"Common");
        Card silvermoon_guardian = new Card(R.drawable.silvermoon_guardian,"Common");
        Card slam = new Card(R.drawable.slam,"Common");
        Card snipe = new Card(R.drawable.snipe,"Common");
        Card sorcerer_s_apprentice = new Card(R.drawable.sorcerer_s_apprentice,"Common");
        Card soul_of_the_forest = new Card(R.drawable.soul_of_the_forest,"Common");
        Card southsea_deckhand = new Card(R.drawable.southsea_deckhand,"Common");
        Card spellbreaker = new Card(R.drawable.spellbreaker,"Common");
        Card spiteful_smith = new Card(R.drawable.spiteful_smith,"Common");
        Card stormforged_axe = new Card(R.drawable.stormforged_axe,"Common");
        Card tauren_warrier = new Card(R.drawable.tauren_warrior,"Common");
        Card temple_enforcer = new Card(R.drawable.temple_enforcer,"Common");
        Card thoughtsteal = new Card(R.drawable.thoughtsteal,"Common");
        Card thrallmar_farseer = new Card(R.drawable.thrallmar_farseer,"Common");
        Card tome_of_intellect = new Card(R.drawable.tome_of_intellect,"Common");
        Card unbound_elemental = new Card(R.drawable.unbound_elemental,"Common");
        Card unleash_the_hounds = new Card(R.drawable.unleash_the_hounds,"Common");
        Card venture_comercenary = new Card(R.drawable.venture_co,"Common");
        Card windfury_harpy = new Card(R.drawable.windfury_harpy,"Common");
        Card wisp = new Card(R.drawable.wisp,"Common");
        Card worgen_infiltrator = new Card(R.drawable.worgen_infiltrator,"Common");
        Card wrath = new Card(R.drawable.wrath,"Common");
        Card young_dragonhawk = new Card(R.drawable.young_dragonhawk,"Common");
        Card youthful_brewmaster = new Card(R.drawable.youthful_brewmaster,"Common");





        setter(abomination,2);
        setter(alarm_o_bot,2);
        setter(aldor_peacekeeper,2);
        setter(ancestral_spirit,2);
        setter(ancient_mage,2);
        setter(ancient_watcher,2);
        setter(angry_chicken,2);
        setter(arcane_golem,2);
        setter(argent_commander,2);
        setter(armorsmith,2);
        setter(auchenai_soulpriest,2);
        setter(bite,2);
        setter(blade_flurry,2);
        setter(blessed_champion,2);
        setter(blizzard,2);
        setter(bloodsail_corsair,2);
        setter(coldlight_seer,2);
        setter(commanding_shout,2);
        setter(counterspell,2);
        setter(crazed_alchemist,2);
        setter(defender_of_argus,2);
        setter(demolisher,2);
        setter(divine_favor,2);
        setter(doomguard,2);
        setter(eaglehorn_bow,2);
        setter(emperor_cobra,2);
        setter(equality,2);
        setter(ethereal_arcanist,2);
        setter(explosive_shot,2);
        setter(felguard,2);
        setter(feral_spirit,2);
        setter(flare,2);
        setter(frothing_berserker,2);
        setter(gadgetzan_auctioneer,2);
        setter(headcrack,2);
        setter(holy_fire,2);
        setter(holy_wrath,2);
        setter(imp_master,2);
        setter(injured_blademaster,2);
        setter(keeper_of_the_grove,2);
        setter(kirin_tor_mage,2);
        setter(knife_juggler,2);
        setter(lava_burst,2);
        setter(lightning_storm,2);
        setter(lightwarden,2);
        setter(lightwell,2);
        setter(man_wraith,2);
        setter(mana_addict,2);
        setter(mana_tide_totem, 2);
        setter(mass_dispel,2);
        setter(master_of_disguise,2);
        setter(master_swordsmith,2);
        setter(mind_control_tech,2);
        setter(misdirection,2);
        setter(mortal_strike,2);
        setter(murloc_tidecaller,2);
        setter(nourish,2);
        setter(perditions_blade,2);
        setter(pintsized_summoner,2);
        setter(questing_adventurer,2);
        setter(ravenholdt_assassin,2);
        setter(savagery,2);
        setter(savannah_highmane,2);
        setter(secretkeeper,2);
        setter(shadow_madness,2);
        setter(shadowflame,2);
        setter(si7_agent,2);
        setter(siphon_soul,2);
        setter(stampeding_kodo,2);
        setter(starfall,2);
        setter(sunfury_protector,2);
        setter(sunwalker,2);
        setter(twilight_drake,2);
        setter(upgrade,2);
        setter(vaporize,2);
        setter(violet_teacher,2);
        setter(void_terror,2);
        setter(wild_pyromancer,2);
        setter(young_priestess,2);



        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        card5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });
    }


    public void setter(Card set, int rarity) {
        if(rarity == 1)
        {
            common.add(set);
        }
        if(rarity == 2)
        {
            rare.add(set);
        }
        if(rarity == 3)
        {
            epic.add(set);
        }
        if(rarity == 4)
        {
            legendary.add(set);
        }
    }

    private void wireWidgets() {
        card1 = findViewById(R.id.button_card1);
        card2 = findViewById(R.id.button_card2);
        card3 = findViewById(R.id.button_card3);
        card4 = findViewById(R.id.button_card4);
        card5 = findViewById(R.id.button_card5);
        next = findViewById(R.id.nextPack);
        craft = findViewById(R.id.craftCost);
        dust = findViewById(R.id.dustValue);
    }

    private void revealCard() {
        //do an open pack for each of the cards you get per pack
    }

    private void openPack() {
        Double d = 100 * Math.random();
            if(d <= 1){
                //draw legendary
            }
            if (d > 1 && d <= 6)
            {
                //draw epic
            }
            if (d > 6 && d <=29)
            {
                //draw rare
            }
            if (d > 29)
            {
                //draw common
            }
            else{
                //draw common
            }
    }
}
