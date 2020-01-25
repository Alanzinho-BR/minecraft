package br.alan.events;

import br.alan.items.ItemBuilder;
import br.alan.items.SkullBuilder;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;

public class JoinLeft implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage("§f[§5+§f] §5" + p.getName());
        ItemStack item = new ItemBuilder(Material.DIAMOND_SWORD)
                .setLore(Arrays.asList("§aAnti-Dominante ", "§aRainha Do Tanke" , "§a#Siririca"))
                .setDisplayName("§2Anti-Machismo")
                .addEnchantment(Enchantment.DAMAGE_ALL, 2)
                .build();
        //ItemStack MaeDoLecraft = new SkullBuilder().setOwner("MaeDoLecraft").build();
        p.getInventory().addItem(item);
        //p.getInventory().addItem(MaeDoLecraft);

        //ActionBAr
        p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent("§2Seja bem-Vindo " + p.getName()));

    }
    @EventHandler
    public void onLeft(PlayerQuitEvent e){
        Player p = e.getPlayer();
        e.setQuitMessage("§f[§5-§f] §5" + p.getName());

    }


}
