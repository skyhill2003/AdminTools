package tk.skyhill2003.admintools.listener;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        event.setCancelled(true);
        if(event.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("&aMain Control")) {
            player.sendMessage("§cCooming soon!");
        }

    }
}

