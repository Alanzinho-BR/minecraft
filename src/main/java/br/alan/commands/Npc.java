package br.alan.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class Npc implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
        if(!(s instanceof Player)) {return false;}

        Player p = (Player) s;

        if(c.getName().equalsIgnoreCase("npc")){
            if(args.length == 0){
                spawnNPC(p);
            }
        }
        return false;
    }

    private void spawnNPC(Player p ){

        Villager villager = (Villager) p.getWorld().spawnEntity(p.getLocation(), EntityType.VILLAGER);
        villager.setCustomName("§bVillager");
        villager.setCustomNameVisible(true);
        villager.setProfession(Villager.Profession.BLACKSMITH);
        villager.setCareer(Villager.Career.ARMORER);
        villager.setAI(false);

    }
}
