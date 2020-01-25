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

public class DinheiroDasPutas implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
        if(!(s instanceof Player)) return false;

        Player p = (Player) s;

        if(c.getName().equalsIgnoreCase("carteira")){
            if(args.length == 0){
                p.sendMessage("§2 Use /carteira DinheiroParaPutas");
                return true;
            }
            if(args[0].equalsIgnoreCase("DinheiroParaPutas")){
                ItemStack dinheiro = new Itens(Material.DIAMOND, 64, (short) 0)
                        .setName("§6Dinheiro")
                        .setLore(Arrays.asList("§eDinheiro" , "§eDas" , "§ePutas"))
                        .setEnc(Enchantment.DURABILITY, 3)
                        .removerEnc()
                        .getItemStack();
                p.getInventory().addItem(dinheiro);
                ItemStack tag = new Itens(Material.NAME_TAG, 4, (short) 0)
                        .setName("§6LojaBedWars")
                        .getItemStack();
                p.getInventory().addItem(tag);
            }
        }

        return false;
    }
}
