package tk.skyhill2003.admintools.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemBuilder {

    private ItemStack item;
    private ItemMeta itemMeta;

    public ItemBuilder(Material material, short subID) {
        this.item = new ItemStack(material, 1, subID);
        this.itemMeta = this.item.getItemMeta();
    }

    public ItemBuilder(Material material) {
        this(material, (short) 0);
    }

    public ItemBuilder setName(String name) {
        this.itemMeta.setDisplayName(name);
        return this;
    }

    public ItemBuilder setAmount(int amount) {
        this.item.setAmount(amount);
        return this;
    }

    public ItemStack build() {
        this.item.setItemMeta(this.itemMeta);
        return this.item;
    }
}
