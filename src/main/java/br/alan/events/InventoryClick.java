package br.alan.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class InventoryClick implements Listener {

    @EventHandler
    public void quandoClicar(InventoryClickEvent e){
        if(!e.getInventory().getName().equalsIgnoreCase("Bem-Vindo")) return;
        e.setCancelled(true);
        ItemStack i = e.getCurrentItem();
        Player p = (Player) e.getWhoClicked();
       /* if(i.getType() == Material.DIAMOND){
            p.closeInventory();
            p.sendMessage("§3Foda-se Irmao");
        }
        if(i.getType() == Material.GOLD_AXE){
            p.closeInventory();
            p.sendMessage("§cFoda-se fdc" );
        }

        */
        // bloqueando usando o nome do itens
       if (!(i.hasItemMeta() && i.getItemMeta().hasDisplayName())) return;

       if(i.getItemMeta().getDisplayName().equalsIgnoreCase("§afoda-se")){
           p.closeInventory();
           p.sendMessage("§cFoda-se fdc" );
       }

        if(i.getItemMeta().getDisplayName().equalsIgnoreCase("§2foda-se")){
            p.closeInventory();
            p.sendMessage("§cFoda-se fdc" );
        }



    }

}
