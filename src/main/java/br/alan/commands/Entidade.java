package br.alan.commands;

import br.alan.items.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;

public class Entidade implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command c, String label, String[] args) {
        if(!(s instanceof Player)){return  false;}
        Player p = (Player) s;

        if(c.getName().equalsIgnoreCase("entidade")){
            if(args.length == 0){
                spawnSkeleton(p);
                p.sendMessage("§2Saldo: §2-1 R$");
            }
        }
        return false;
    }

    private void spawnSkeleton(Player p){
        Skeleton skeleton = (Skeleton) p.getWorld().spawnEntity(p.getLocation(), EntityType.SKELETON);
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        skeleton.getEquipment().setItemInMainHand(item);
        skeleton.getEquipment().setItemInMainHandDropChance(100);
        skeleton.setCustomName("Reboting");
        skeleton.setCustomNameVisible(true); //sempre exibir o nome
        skeleton.getAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE).setBaseValue(30);
        skeleton.setInvulnerable(true);
    }

//    private void spawnVaca (Player p){
//        Cow cow = (Cow) p.getWorld().spawnEntity(p.getLocation(), EntityType.COW);
//        cow.setCustomName("§5Mae Do King");
//        ItemStack vibrador = new ItemBuilder(Material.STICK, 1 , (short) 0).setDisplayName("§5Vibrador").build();
//        cow.getEquipment().setItemInMainHand(vibrador);
//        cow.getEquipment().setItemInMainHandDropChance(100);
//        cow.setAdult();
//
//
//    }
}
