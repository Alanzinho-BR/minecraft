package br.alan.commands;

import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command c, String Label, String[] args) {
        if(!(s instanceof Player)){return false;}
        Player p = (Player) s;

        if(c.getName().equalsIgnoreCase("gm")){
            if(args.length == 0){
                if(p.getGameMode() == GameMode.CREATIVE){
                    p.sendMessage("§aModo alterado para §2SOBREVIVENCIA");
                    p.setGameMode(GameMode.SURVIVAL);
                    p.getWorld().playSound(p.getLocation(), Sound.BLOCK_ANVIL_PLACE, 1,1 );
                } else {
                    p.getWorld().playSound(p.getLocation(), Sound.BLOCK_ANVIL_PLACE, 1,1 );
                    p.sendMessage("§aModo alterado para §2CRIATIVO");
                    p.setGameMode(GameMode.CREATIVE);
                }
                return true;
            }
        }
        return false;
    }
}
