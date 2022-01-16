package tk.skyhill2003.admintools.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import java.awt.*;

public class AdminToolsInventory {

    private static String guiName = "§6AdminControlPanel";

    public static Inventory inv(Player player) {
        Inventory inv = (Inventory) Bukkit.getServer().createInventory(null, 54, guiName);

        for (int i = 0; i < 54; i++){
            inv.setItem(i, new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE).setName(" ").build());
        }

        return inv;
    }

}
