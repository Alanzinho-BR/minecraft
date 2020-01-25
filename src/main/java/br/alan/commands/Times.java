package br.alan.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Times implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command c, String Label, String[] args) {
        if(!(s instanceof Player)) return false;
        Player p = (Player) s;
        if(c.getName().equalsIgnoreCase("tag")){
            if(args.length == 0){
                p.sendMessage("foda-sse");
                return true;
            }
            if(args[0].equalsIgnoreCase("Azul")){
                p.setPlayerListName("§9[Azul] " + p.getDisplayName());
            }
            if(args[0].equalsIgnoreCase("Verde")){
                p.setPlayerListName("§2[Verde] " + p.getDisplayName());
            }
            if(args[0].equalsIgnoreCase("Laranja")){
                p.setPlayerListName("§6[Laranja] " + p.getDisplayName());
            }
            if(args[0].equalsIgnoreCase("Vermelho")){
                p.setPlayerListName("§c[Vermelho] " + p.getDisplayName());
            }
            if(args[0].equalsIgnoreCase("Rosa")){
                p.setPlayerListName("§d[Rosa] " + p.getDisplayName());
            }
        }
        return false;
    }
}
