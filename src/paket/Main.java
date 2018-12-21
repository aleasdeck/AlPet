package paket;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    public void onEnable() {
        getCommand("pet").setExecutor(new Commands(this));
        Bukkit.getPluginManager().registerEvents(new Handlers(), this);
        CustomEntityRegistry.registerCustomEntity(54, "PetCaveSpider", PetCaveSpider.class);
    }

    public void onDisable() {

    }
}
