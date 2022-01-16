package tk.skyhill2003.admintools.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import tk.skyhill2003.admintools.AdminTools;
import tk.skyhill2003.admintools.utils.AdminToolsInventory;

public class AdminToolsCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {
        Player player = (Player) cs;

        if (cs instanceof Player) {
            if (player.hasPermission("admintools.use")) {
                if (args.length == 0) {
                    player.openInventory(AdminToolsInventory.inv(player));
                } else {
                    player.sendMessage(String.valueOf(AdminTools.prefix) + AdminTools.use + "§7/admintools");
                }
            } else {
                player.sendMessage(String.valueOf(AdminTools.prefix) + AdminTools.noperm);
            }
        }

            return false;
    }
}
