package me.libraryaddict.Hungergames.Types;

import me.libraryaddict.Hungergames.Hungergames;
import me.libraryaddict.Hungergames.Managers.*;

public class HungergamesApi {
    private static Hungergames hg;
    private static PlayerManager pm;
    private static MySqlManager mysql;
    private static ChestManager cm;
    private static FeastManager fm;
    private static KitManager kits;
    private static KitSelectorManager icon;
    private static ConfigManager config;
    private static AbilityManager abilityManager;

    public static void init(Hungergames hunger) {
        hg = hunger;
    }

    public static Hungergames getHungergames() {
        return hg;
    }

    public static ConfigManager getConfigManager() {
        if (config == null)
            config = new ConfigManager();
        return config;
    }

    public static PlayerManager getPlayerManager() {
        if (pm == null)
            pm = new PlayerManager();
        return pm;
    }

    public static MySqlManager getMySqlManager() {
        if (mysql == null)
            mysql = new MySqlManager();
        return mysql;
    }

    public static KitManager getKitManager() {
        if (kits == null)
            kits = new KitManager();
        return kits;
    }

    public static ChestManager getChestManager() {
        if (cm == null)
            cm = new ChestManager();
        return cm;
    }

    public static FeastManager getFeastManager() {
        if (fm == null)
            fm = new FeastManager();
        return fm;
    }

    public static KitSelectorManager getKitSelector() {
        if (icon == null)
            icon = new KitSelectorManager();
        return icon;
    }

    public static AbilityManager getAbilityManager() {
        if(abilityManager == null)
            abilityManager = new AbilityManager(new AbilityConfigManager(getHungergames()));
        return abilityManager;
    }
}
