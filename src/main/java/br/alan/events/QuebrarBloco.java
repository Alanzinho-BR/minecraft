package br.alan.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class QuebrarBloco implements Listener {

    @EventHandler
    public void breakerBed(BlockBreakEvent e){
        Player p = e.getPlayer();
        Block b = e.getBlock();
        if(b.getType() == Material.BED_BLOCK ){
            p.sendMessage("§aCama do time  §9AZUL §afoi destruida");
            p.getWorld().playSound(p.getLocation(), Sound.BLOCK_ANVIL_PLACE, 10,10);
        }
        ItemStack item = p.getInventory().getItemInMainHand();

        if(item.getType() == Material.DIAMOND){
            p.sendMessage("§cVoce quebrou usando um item de diamante");
        }
        if(item.hasItemMeta() && item.getItemMeta().hasDisplayName() &&
                item.getItemMeta().getDisplayName().equalsIgnoreCase("Ouro")){
            p.sendMessage("§cVoce quebrou usando um item de ouro");

        }

    }
}
