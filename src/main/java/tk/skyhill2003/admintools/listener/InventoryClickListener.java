package tk.skyhill2003.admintools.listener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();

        if(event.getWhoClicked().getOpenInventory().getTitle().equalsIgnoreCase("AdminTools")) {
            event.setCancelled(true);
            if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("&aMain Control")) {
            player.sendMessage(ChatColor.RED + "Cooming soon!");
        }

        if (event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("ChatClear"))
            for (Player all : Bukkit.getOnlinePlayers()) {
                for(int i = 0; i < 100; i++) {
                    all.sendMessage(" ");
                }

                all.sendMessage(ChatColor.GRAY + "Chat wurde geelert");
            }
        }
    }
}

