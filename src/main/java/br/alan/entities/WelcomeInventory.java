package br.alan.entities;

import br.alan.items.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class WelcomeInventory {

    private Inventory inventory;

    public WelcomeInventory() {
        inventory = Bukkit.createInventory(null, 9 * 2, "Bem-Vindo");
        insertItens();
    }

    private void insertItens() {
        ItemStack i = new ItemBuilder(Material.DIAMOND, 1, (short) 0).setDisplayName("§aFoda-se").build();
        ItemStack i1 = new ItemBuilder(Material.GOLD_AXE, 1, (short) 0).setDisplayName("§2Foda-se").build();
        inventory.setItem(0, i);
        inventory.setItem(1, i1);
    }

    public Inventory getInventory() {
        return inventory;
    }

}
