package tk.skyhill2003.admintools.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class Inventory {

    public static org.bukkit.inventory.Inventory inventory(Player player) {
        Inventory inventory = (Inventory) Bukkit.createInventory(null, 54, "AdminTools");

        for (int i= 0; i <54 ;i++) {
           player.getInventory().setItem(i, new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).setName(" ").build());
        }
        return null;
    }

}
