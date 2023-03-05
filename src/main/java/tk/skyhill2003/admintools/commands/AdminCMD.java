package tk.skyhill2003.admintools.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import tk.skyhill2003.admintools.utils.ItemBuilder;

public class AdminCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(sender instanceof Player) {
            if(player.hasPermission("admintools.ussage")) {
                Inventory inventory = (Inventory) Bukkit.createInventory(null, 54, "AdminTools");

                for (int i= 0; i <54 ;i++) {
                    inventory.setItem(i, new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).setName(" ").build());
                }

                player.openInventory(inventory);
            } else {
                player.sendMessage("&cKeine Rechte");
            }
        }
        return false;
    }
}
