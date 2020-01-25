package br.alan.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class Itens {

    private ItemStack itemStack;
    private ItemMeta itemMeta;

    public Itens(Material m, int qtd, short d) {
        itemStack = new ItemStack(m, qtd, d);
        itemMeta = itemStack.getItemMeta();
    }

    public Itens setName(String nome){
        itemMeta.setDisplayName(nome.replace("&", "§"));
        itemStack.setItemMeta(itemMeta);
        return this;
    }

    public Itens setLore(List<String> lore){
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return this;
    }

    public Itens setEnc(Enchantment enc, int valor){
        itemMeta.addEnchant(enc, valor,false);
        itemStack.setItemMeta(itemMeta);
        return this;
    }

    public Itens removerEnc(){
        itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        itemStack.setItemMeta(itemMeta);
        return this;

    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
