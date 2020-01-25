package br.alan.commands;

import br.alan.utils.Itens;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;


public class Putas implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender s, Command c, String Label, String[] args) {
        if(!(s instanceof Player)){ return false;}
        Player p = (Player) s;

        if(c.getName().equalsIgnoreCase("puta")){
            if(args.length == 0){
                p.sendMessage("§a=-=-=§2Lista Das Putas§a=-=-=");
                p.sendMessage("§aUse: §2/puta MaeDoLecraft");
                p.sendMessage("§aUse: §2/puta MaeDoKingVilehan");
                p.sendMessage("§aUse: §2/puta MaeDoGabriel");
                p.sendMessage("§aUse: §2/puta MaeDoPedroLopes");
                return true;
            }
            if(args[0].equalsIgnoreCase("maedolecraft")){
                p.sendMessage("§2A Puta foi Setada!!!");
                p.performCommand("npc move");

            }
            if(args[0].equalsIgnoreCase("maedogabriel")){
                p.sendMessage("§2A Puta foi Setada!!!");
                p.performCommand("npc move");

            }
            if(args[0].equalsIgnoreCase("MaeDoKingVilehan")){
                p.sendMessage("§2A Puta foi Setada!!!");
                p.performCommand("npc move");

            }
            if(args[0].equalsIgnoreCase("MaeDoPedroDantas")){
                p.sendMessage("§2A Puta foi Setada!!!");
                p.performCommand("npc move");

            }
        }
        return false;
    }
}
