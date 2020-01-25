package br.alan.events;

import br.alan.entities.WelcomeInventory;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;

public class NpcEvent implements Listener {

    @EventHandler
    public void clickNpc(PlayerInteractEntityEvent e){
        Player p = e.getPlayer();
        if(!(e.getRightClicked() instanceof Villager)){return;}
        Villager v = (Villager) e.getRightClicked();
        if(v.getCustomName() == null || !v.getCustomName().equalsIgnoreCase("§bVillager")){ return;}
        e.setCancelled(true);
        //Inventory inv = new WelcomeInventory().getInventory();
        p.openInventory(new WelcomeInventory().getInventory());
    }
}
