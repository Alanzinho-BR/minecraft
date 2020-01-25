package br.alan.commands;

import br.alan.entities.WelcomeInventory;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuiCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
        if(!(s instanceof Player)) return false;
        Player p = (Player) s;
        if(c.getName().equalsIgnoreCase("gui")){
            if(args.length == 0){
                p.openInventory(new WelcomeInventory().getInventory());
            }
        }
        return false;
    }
}
