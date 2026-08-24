package io.ncbpfluffybear.fluffymachines.utils;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import io.ncbpfluffybear.fluffymachines.items.FireproofRune;
import io.ncbpfluffybear.fluffymachines.items.MiniBarrel;
import io.ncbpfluffybear.fluffymachines.items.tools.FluffyWrench;
import io.ncbpfluffybear.fluffymachines.items.tools.PortableCharger;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedAutoDisenchanter;
import io.ncbpfluffybear.fluffymachines.machines.AdvancedChargingBench;
import io.ncbpfluffybear.fluffymachines.machines.AutoAncientAltar;
import io.ncbpfluffybear.fluffymachines.machines.AutoCraftingTable;
import io.ncbpfluffybear.fluffymachines.machines.AutoTableSaw;
import io.ncbpfluffybear.fluffymachines.machines.BackpackLoader;
import io.ncbpfluffybear.fluffymachines.machines.BackpackUnloader;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustFabricator;
import io.ncbpfluffybear.fluffymachines.machines.ElectricDustRecycler;
import io.ncbpfluffybear.fluffymachines.machines.SmartFactory;
import io.ncbpfluffybear.fluffymachines.machines.WaterSprinkler;
import io.ncbpfluffybear.fluffymachines.multiblocks.CrankGenerator;
import io.ncbpfluffybear.fluffymachines.objects.AutoCrafter;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 * Specifies all plugin items
 */
public class FluffyItems {

    private FluffyItems() {
    }

    // Barrels
    public static final SlimefunItemStack MINI_FLUFFY_BARREL = new SlimefunItemStack("MINI_FLUFFY_BARREL",
            Material.COMPOSTER,
            "&eMini Barile Fluffy",
            "",
            "&7Conserva una grande quantità di un oggetto",
            "&7Ha una capacità modificabile",
            "",
            "&bCapacità massima: &e" + MiniBarrel.getDisplayCapacity() + " oggetti"
    );

    // Caricatori portatili
    public static final SlimefunItemStack SMALL_PORTABLE_CHARGER = new SlimefunItemStack("SMALL_PORTABLE_CHARGER",
            Material.BRICK,
            "&eCaricatore portatile piccolo",
            "",
            "&7Un caricatore portatile con una grande riserva di energia",
            "",
            "&eVelocità di ricarica: &7" + PortableCharger.Type.SMALL.chargeSpeed + " J/s",
            LoreBuilder.powerCharged(0, PortableCharger.Type.SMALL.chargeCapacity)
    );

    public static final SlimefunItemStack MEDIUM_PORTABLE_CHARGER = new SlimefunItemStack("MEDIUM_PORTABLE_CHARGER",
            Material.IRON_INGOT,
            "&6Caricatore portatile medio",
            "",
            "&7Un caricatore portatile con una grande riserva di energia",
            "",
            "&eVelocità di ricarica: &7" + PortableCharger.Type.MEDIUM.chargeSpeed + " J/s",
            LoreBuilder.powerCharged(0, PortableCharger.Type.MEDIUM.chargeCapacity)
    );

    public static final SlimefunItemStack BIG_PORTABLE_CHARGER = new SlimefunItemStack("BIG_PORTABLE_CHARGER",
            Material.GOLD_INGOT,
            "&aCaricatore portatile grande",
            "",
            "&7Un caricatore portatile con una grande riserva di energia",
            "",
            "&eVelocità di ricarica: &7" + PortableCharger.Type.BIG.chargeSpeed + " J/s",
            LoreBuilder.powerCharged(0, PortableCharger.Type.BIG.chargeCapacity)
    );

    public static final SlimefunItemStack LARGE_PORTABLE_CHARGER = new SlimefunItemStack("LARGE_PORTABLE_CHARGER",
            Material.NETHER_BRICK,
            "&2Caricatore portatile capiente",
            "",
            "&7Un caricatore portatile con una grande riserva di energia",
            "",
            "&eVelocità di ricarica: &7" + PortableCharger.Type.LARGE.chargeSpeed + " J/s",
            LoreBuilder.powerCharged(0, PortableCharger.Type.LARGE.chargeCapacity)
    );

    public static final SlimefunItemStack CARBONADO_PORTABLE_CHARGER = new SlimefunItemStack(
            "CARBONADO_PORTABLE_CHARGER",
            Material.NETHERITE_INGOT,
            "&4Caricatore portatile in carbonado",
            "",
            "&7Un caricatore portatile con una grande riserva di energia",
            "",
            "&eVelocità di ricarica: &7" + PortableCharger.Type.CARBONADO.chargeSpeed + " J/s",
            LoreBuilder.powerCharged(0, PortableCharger.Type.CARBONADO.chargeCapacity)
    );

    // oggetti
    public static final SlimefunItemStack ANCIENT_BOOK = new SlimefunItemStack("ANCIENT_BOOK",
            Material.BOOK,
            "&6Libro antico",
            "",
            "&7Usato nel &cDisincantatore automatico avanzato",
            "",
            "&6&oContiene grandi quantità di energia concentrata"
    );
    public static final SlimefunItemStack HELICOPTER_HAT = new SlimefunItemStack("HELICOPTER_HAT",
            Material.LEATHER_HELMET, Color.AQUA,
            "&1Cappello elicottero",
            "",
            "&7brrrrrrrrRRRRRRRR",
            "",
            "&eAccovacciati &7per usarlo"
    );
    public static final SlimefunItemStack WATERING_CAN = new SlimefunItemStack("WATERING_CAN",
            "6484da45301625dee79ae29ff513efa583f1ed838033f20db80963cedf8aeb0e",
            "&bAnnaffiatoio",
            "",
            "&fAnnaffia le piante",
            "",
            "&7> &eClic destro &7sull acqua per riempire l annaffiatoio",
            "&7> &eClic destro &7su una pianta per accelerarne la crescita.",
            "&7> &eClic destro &7su un giocatore per rallentarlo",
            "",
            "&aUtilizzi rimasti: &e0"
    );
    public static final SlimefunItemStack ENDER_CHEST_EXTRACTION_NODE = new SlimefunItemStack(
            "ENDER_CHEST_EXTRACTION_NODE",
            "e707c7f6c3a056a377d4120028405fdd09acfcd5ae804bfde0f653be866afe39",
            "&6Nodo di estrazione dalla cassa dell End",
            "",
            "&7Posizionalo sul lato di una &5Ender Chest &7per collegarlo",
            "",
            "&7Sposta gli oggetti dalla &5Ender Chest",
            "&7to the &6contenitore &7collocato dietro"
    );
    public static final SlimefunItemStack ENDER_CHEST_INSERTION_NODE = new SlimefunItemStack(
            "ENDER_CHEST_INSERTION_NODE",
            "7e5dc50c0186d53381d9430a2eff4c38f816b8791890c7471ffdb65ba202bc5",
            "&bNodo di inserimento nella cassa dell End",
            "",
            "&7Posizionalo sul lato di una &5Ender Chest &7per collegarlo",
            "",
            "&7Sposta gli oggetti verso la &5Ender Chest",
            "&7from the &6contenitore &7collocato dietro"
    );
    // Macchinari
    public static final SlimefunItemStack AUTO_CRAFTING_TABLE = new SlimefunItemStack("AUTO_CRAFTING_TABLE",
            Material.CRAFTING_TABLE,
            "&6Banco da lavoro automatico",
            "",
            "&7Crea automaticamente le ricette del &fvanilla &7",
            "",
            LoreBuilderDynamic.powerBuffer(AutoCraftingTable.CAPACITY),
            LoreBuilderDynamic.powerPerTick(AutoCraftingTable.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_ANCIENT_ALTAR = new SlimefunItemStack("AUTO_ANCIENT_ALTAR",
            Material.ENCHANTING_TABLE,
            "&5Altare antico automatico",
            "",
            "&7Crea automaticamente le ricette del &5Ancient Altar &7",
            "",
            LoreBuilderDynamic.powerBuffer(AutoAncientAltar.CAPACITY),
            LoreBuilderDynamic.powerPerTick(AutoAncientAltar.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_TABLE_SAW = new SlimefunItemStack("AUTO_TABLE_SAW",
            Material.STONECUTTER,
            "&6Sega da banco automatica",
            "",
            "&7Crea automaticamente le ricette del &6Table Saw &7",
            "",
            LoreBuilderDynamic.powerBuffer(AutoTableSaw.CAPACITY),
            LoreBuilderDynamic.powerPerTick(AutoTableSaw.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack WATER_SPRINKER = new SlimefunItemStack("WATER_SPRINKLER",
            "d6b13d69d1929dcf8edf99f3901415217c6a567d3a6ead12f75a4de3ed835e85",
            "&bIrrigatore",
            "",
            "&7Sprinkly sprinkly",
            "",
            LoreBuilderDynamic.powerBuffer(WaterSprinkler.CAPACITY),
            LoreBuilderDynamic.powerPerTick(WaterSprinkler.ENERGY_CONSUMPTION) + " per crop"
    );
    public static final SlimefunItemStack GENERATOR_CORE = new SlimefunItemStack("GENERATOR_CORE",
            Material.BLAST_FURNACE,
            "&7Nucleo del generatore",
            "",
            "&7Componente multiblocco dei generatori"
    );
    public static final SlimefunItemStack CRANK_GENERATOR = new SlimefunItemStack("CRANK_GENERATOR",
            Material.BLAST_FURNACE,
            "&7Generatore a manovella",
            "",
            "&eRight click &7sulla leva per generare energia",
            "",
            LoreBuilderDynamic.power(CrankGenerator.RATE, "/Crank"),
            LoreBuilderDynamic.powerBuffer(CrankGenerator.CAPACITY),
            "",
            Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack FOUNDRY = new SlimefunItemStack("FOUNDRY",
            Material.BLAST_FURNACE,
            "&cFonderia",
            "",
            "&eFonde e conserva polveri e lingotti",
            "&7Stores 138,240 dust (40 Double Chests)",
            "",
            Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack BACKPACK_UNLOADER = new SlimefunItemStack("BACKPACK_UNLOADER",
            Material.BROWN_STAINED_GLASS,
            "&eScaricatore di zaini",
            "",
            "&7Svuota il contenuto degli zaini",
            "",
            LoreBuilderDynamic.powerBuffer(BackpackUnloader.CAPACITY),
            LoreBuilderDynamic.powerPerTick(BackpackUnloader.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack BACKPACK_LOADER = new SlimefunItemStack("BACKPACK_LOADER",
            Material.ORANGE_STAINED_GLASS,
            "&eCaricatore di zaini",
            "",
            "&7Sposta gli oggetti dall inventario allo zaino",
            "",
            LoreBuilderDynamic.powerBuffer(BackpackLoader.CAPACITY),
            LoreBuilderDynamic.powerPerTick(BackpackLoader.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_PICKAXE = new SlimefunItemStack(
            "UPGRADED_EXPLOSIVE_PICKAXE",
            Material.DIAMOND_PICKAXE,
            "&e&lPiccone esplosivo migliorato",
            "",
            "&7Rompe tutti i blocchi estraibili in un area 5x5"
    );
    public static final SlimefunItemStack UPGRADED_EXPLOSIVE_SHOVEL = new SlimefunItemStack("UPGRADED_EXPLOSIVE_SHOVEL",
            Material.DIAMOND_SHOVEL,
            "&e&lPala esplosiva migliorata",
            "",
            "&7Rompe tutti i blocchi scavabili in un area 5x5"
    );
    public static final SlimefunItemStack FIREPROOF_RUNE = new SlimefunItemStack(
            "FIREPROOF_RUNE",
            Material.FIREWORK_STAR,
            "&7Runa antica &8&l[&c&lIgnifuga&8&l]",
            "",
            "&eLascia cadere questa runa su un oggetto a terra per",
            "&erenderlo &cignifugo",
            ""
    );
    public static final SlimefunItemStack SUPERHEATED_FURNACE = new SlimefunItemStack("SUPERHEATED_FURNACE",
            Material.BLAST_FURNACE,
            "&cFornace surriscaldata",
            "",
            "&7Componente multiblocco della fonderia",
            "&cDeve essere usata nella fonderia"
    );
    public static final SlimefunItemStack AUTO_ENHANCED_CRAFTING_TABLE = new SlimefunItemStack("AUTO_ENHANCED_CRAFTING_TABLE",
            Material.CRAFTING_TABLE,
            "&eBanco da lavoro avanzato automatico",
            "",
            "&7Crea automaticamente le ricette del &eEnhanced Crafting Table &7",
            "",
            LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
            LoreBuilderDynamic.powerPerTick(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_MAGIC_WORKBENCH = new SlimefunItemStack("AUTO_MAGIC_WORKBENCH",
            Material.BOOKSHELF,
            "&6Banco magico automatico",
            "",
            "&7Crea automaticamente le ricette del &6Magic Workbench &7",
            "",
            LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
            LoreBuilderDynamic.powerPerTick(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack AUTO_ARMOR_FORGE = new SlimefunItemStack("AUTO_ARMOR_FORGE",
            Material.SMITHING_TABLE,
            "&7Forgia per armature automatica",
            "",
            "&7Crea automaticamente le ricette del Armor Forge ",
            "",
            LoreBuilderDynamic.powerBuffer(AutoCrafter.CAPACITY),
            LoreBuilderDynamic.powerPerTick(AutoCrafter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack ADVANCED_AUTO_DISENCHANTER = new SlimefunItemStack(
            "ADVANCED_AUTO_DISENCHANTER",
            Material.ENCHANTING_TABLE,
            "&cDisincantatore automatico avanzato",
            "",
            "&7Rimuove un incantesimo da un oggetto",
            "&7Richiede un &6Libro antico &7per funzionare",
            "",
            LoreBuilderDynamic.powerBuffer(AdvancedAutoDisenchanter.CAPACITY),
            LoreBuilderDynamic.powerPerTick(AdvancedAutoDisenchanter.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack SCYTHE = new SlimefunItemStack("SCYTHE",
            Material.IRON_HOE,
            "&eFalce",
            "",
            "&7Raccoglie 5 colture alla volta"
    );
    public static final SlimefunItemStack UPGRADED_LUMBER_AXE = new SlimefunItemStack("UPGRADED_LUMBER_AXE",
            Material.DIAMOND_AXE,
            "&6&lAscia da boscaiolo migliorata",
            "",
            "&7Abbatte un intero albero in una volta",
            "&72 block reach and works on diagonal blocks too"
    );
    public static final SlimefunItemStack DOLLY = new SlimefunItemStack("DOLLY",
            Material.MINECART,
            "&bCarrello da trasporto",
            "",
            "&7Clic destro su una cassa per raccoglierla",
            "",
            "&7ID: <ID>"
    );

    public static final SlimefunItemStack WARP_PAD = new SlimefunItemStack("WARP_PAD",
            Material.SMOKER,
            "&6Piattaforma di teletrasporto",
            "",
            "&eAccovacciati &7su questo blocco per teletrasportarti alla",
            "&7piattaforma di destinazione collegata",
            "",
            "&7Usa un configuratore per collegare le piattaforme"
    );

    public static final SlimefunItemStack WARP_PAD_CONFIGURATOR = new SlimefunItemStack("WARP_PAD_CONFIGURATOR",
            Material.BLAZE_ROD,
            "&6Configuratore piattaforme di teletrasporto",
            "",
            "&eAccovacciati and Clic destro &7on a Piattaforma di teletrasporto to set the destination",
            "&eClic destro &7on a Piattaforma di teletrasporto to set the origin",
            "",
            "&eLinked Coordinates: &7None"
    );

    public static final SlimefunItemStack ELECTRIC_DUST_FABRICATOR = new SlimefunItemStack("ELECTRIC_DUST_FABRICATOR",
            Material.BLAST_FURNACE,
            "&6Fabbricatore elettrico di polveri",
            "",
            "&7Una macchina completa che macina, setaccia e lava",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(10),
            LoreBuilderDynamic.powerBuffer(ElectricDustFabricator.CAPACITY),
            LoreBuilderDynamic.powerPerTick(ElectricDustFabricator.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack ELECTRIC_DUST_RECYCLER = new SlimefunItemStack("ELECTRIC_DUST_RECYCLER",
            Material.IRON_BLOCK,
            "&fRiciclatore elettrico di polveri",
            "",
            "&7Ricicla le polveri trasformandole in minerale setacciato",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerBuffer(ElectricDustRecycler.CAPACITY),
            LoreBuilderDynamic.powerPerTick(ElectricDustRecycler.ENERGY_CONSUMPTION)
    );

    public static final SlimefunItemStack ALTERNATE_ELEVATOR_PLATE = new SlimefunItemStack("ALTERNATE_ELEVATOR_PLATE",
            Material.POLISHED_BLACKSTONE_PRESSURE_PLATE,
            "&3Piastra alternativa per ascensore",
            "",
            "&fPlace an Elevator Plate on every floor",
            "&fand you will be able to teleport between them.",
            "",
            "&eClic destro this Block &7to name it",
            "&7Uses a Chest GUI instead of a Book GUI"
    );

    public static final SlimefunItemStack FLUFFY_WRENCH = new SlimefunItemStack("FLUFFY_WRENCH",
            FluffyWrench.Wrench.DEFAULT.getMaterial(),
            "&6Chiave Fluffy",
            "",
            "&7Permette di rimuovere rapidamente i nodi cargo Slimefun",
            "&7e i componenti elettrici",
            "",
            "&eLeft&7/&eClic destro &7a compatible block to break it"
    );

    public static final SlimefunItemStack REINFORCED_FLUFFY_WRENCH =
            new SlimefunItemStack("REINFORCED_FLUFFY_WRENCH", FluffyWrench.Wrench.REINFORCED.getMaterial(),
                    "&bChiave Fluffy rinforzata",
                    "",
                    "&7Permette di rimuovere rapidamente i nodi cargo Slimefun",
                    "&7e i componenti elettrici",
                    "",
                    "&eLeft&7/&eClic destro &7a compatible block to break it"
            );

    public static final SlimefunItemStack CARBONADO_FLUFFY_WRENCH =
            new SlimefunItemStack("CARBONADO_FLUFFY_WRENCH", FluffyWrench.Wrench.CARBONADO.getMaterial(),
                    "&7Chiave Fluffy in carbonado",
                    "",
                    "&7Permette di rimuovere rapidamente i nodi cargo Slimefun",
                    "&7e i componenti elettrici",
                    "",
                    "&eLeft&7/&eClic destro &7a compatible block to break it",
                    "",
                    LoreBuilder.powerCharged(0, FluffyWrench.Wrench.CARBONADO.getMaxCharge())
            );

    public static final SlimefunItemStack PAXEL = new SlimefunItemStack("PAXEL",
            Material.DIAMOND_PICKAXE,
            "&bMultiattrezzo",
            "",
            "&7Piccone, ascia e pala in un solo strumento!"
    );

    public static final SlimefunItemStack ADVANCED_CHARGING_BENCH = new SlimefunItemStack(
            "ADVANCED_CHARGING_BENCH",
            Material.SMITHING_TABLE,
            "&cBanco di ricarica avanzato",
            "",
            "&7Ricarica gli oggetti",
            "&7Può essere potenziato usando una &6Scheda di potenziamento ACB"
    );

    public static final SlimefunItemStack ACB_UPGRADE_CARD = new SlimefunItemStack(
            "ACB_UPGRADE_CARD",
            Material.PAPER,
            "&6Scheda di potenziamento ACB",
            "",
            "&eClic destro &7onto an &cBanco di ricarica avanzato",
            "",
            "&6Charge Speed &a+" + AdvancedChargingBench.CHARGE + "J",
            "&6Capacity &a+" + AdvancedChargingBench.CAPACITY + "J",
            "&6Energy Consumption &c+" + AdvancedChargingBench.ENERGY_CONSUMPTION + "J"
    );

    public static final SlimefunItemStack CARGO_MANIPULATOR = new SlimefunItemStack("CARGO_MANIPULATOR",
            Material.SEA_PICKLE,
            "&9Manipolatore cargo",
            "",
            "&eClic destro &7per copiare le impostazioni di un nodo cargo",
            "&eClic sinistro &7per incollare le impostazioni di un nodo cargo",
            "&eAccovacciati and Clic destro &7per azzerare un nodo cargo"
    );

    public static final SlimefunItemStack EXP_DISPENSER = new SlimefunItemStack("EXP_DISPENSER",
            Material.DISPENSER,
            "&aDistributore di esperienza",
            "",
            "&7Clic destro per ricevere tutta l esperienza",
            "&7from exp bottles in the dispenser",
            "&7and barrel the dispenser is facing",
            "",
            Utils.multiBlockWarning()
    );

    public static final SlimefunItemStack SMART_FACTORY = new SlimefunItemStack("SMART_FACTORY",
            Material.SMOKER,
            "&cFabbrica intelligente",
            "",
            "&7Una macchina completa che produce",
            "&7risorse a partire da materiali grezzi",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilderDynamic.powerBuffer(SmartFactory.getEnergyCapacity()),
            LoreBuilderDynamic.powerPerTick(SmartFactory.getEnergyConsumption())
    );

    static {
        FireproofRune.setFireproof(FIREPROOF_RUNE);
        addGlow(SMALL_PORTABLE_CHARGER);
        addGlow(MEDIUM_PORTABLE_CHARGER);
        addGlow(BIG_PORTABLE_CHARGER);
        addGlow(LARGE_PORTABLE_CHARGER);
        addGlow(CARBONADO_PORTABLE_CHARGER);
    }

    private static void addGlow(ItemStack item) {
        item.addUnsafeEnchantment(Enchantment.BINDING_CURSE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
    }
}


