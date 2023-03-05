package tk.skyhill2003.admintools;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
<<<<<<< HEAD
import tk.skyhill2003.admintools.commands.AdminToolsCMD;
=======
import tk.skyhill2003.admintools.commands.AdminCMD;
>>>>>>> 1a792a9 (update)
import tk.skyhill2003.admintools.listener.InventoryClickListener;

public final class AdminTools extends JavaPlugin {

<<<<<<< HEAD
    public static AdminTools instance;
    public static String prefix = "§cAdminTools §8=> ";
    public static String noperm = "§cNo Permisssions!";
    public static String use = "§7Use: ";

    @Override
    public void onEnable() {
        instance = this;
        System.out.println(prefix + "§e" + getDescription().getName() + "§7 plugin is started! §eCoded by " + getDescription().getAuthors());
        init();
=======
    @Override
    public void onEnable() {
        Bukkit.getServer().getConsoleSender().sendMessage("AdminTools wird gestartet");

        // Commands
        this.getCommand("admintools").setExecutor(new AdminCMD());

        // Listener
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new InventoryClickListener(), this);
>>>>>>> 1a792a9 (update)
    }

    @Override
    public void onDisable() {
<<<<<<< HEAD
        System.out.println(prefix + "§e" + getDescription().getName() + "§7 plugin is stopped! §eCoded by " + getDescription().getAuthors());
    }

    public void init() {
        getCommand("admintools").setExecutor(new AdminToolsCMD());
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new InventoryClickListener(), instance);
    }

    public static AdminTools getInstance() {
        return instance;
=======
        Bukkit.getServer().getConsoleSender().sendMessage("AdminTools wird gestoppt");
>>>>>>> 1a792a9 (update)
    }
}
