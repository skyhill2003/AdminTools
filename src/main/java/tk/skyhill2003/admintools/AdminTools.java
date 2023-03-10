package tk.skyhill2003.admintools;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import tk.skyhill2003.admintools.commands.AdminCMD;
import tk.skyhill2003.admintools.listener.InventoryClickListener;

public final class AdminTools extends JavaPlugin {

    public static AdminTools instance;

    @Override
    public void onEnable() {
        instance = this;
        System.out.println("§e" + getDescription().getName() + "§7 plugin is started! §eCoded by " + getDescription().getAuthors());

        // Commands
        this.getCommand("admintools").setExecutor(new AdminCMD());

        // Listener
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new InventoryClickListener(), this);

    }

    @Override
    public void onDisable() {
        System.out.println("§e" + getDescription().getName() + "§7 plugin is stopped! §eCoded by " + getDescription().getAuthors());

        instance = null;
    }

    public static AdminTools getInstance() {
        return instance;

    }
}
