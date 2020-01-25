package br.alan;

import br.alan.commands.*;
import br.alan.events.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {


    private static Main instance;

    @Override
    public void onEnable() {
    registrarComandos();
//    scheduler();
    instance = this;
    registrarEventos();
    }

    private void registrarEventos(){
        PluginManager alan = Bukkit.getPluginManager();
        alan.registerEvents(new ScoreBoard(), this);
        alan.registerEvents(new Tab(), this);
        alan.registerEvents(new JoinLeft(), this);
        alan.registerEvents(new QuebrarBloco(), this);
        alan.registerEvents(new InventoryClick(), this);
        alan.registerEvents(new Modt(), this);
        alan.registerEvents(new NpcEvent(), this);
    }
    private void registrarComandos(){
        getCommand("gm").setExecutor(new Gamemode());
        getCommand("puta").setExecutor(new Putas());
        getCommand("carteira").setExecutor(new DinheiroDasPutas());
        getCommand("tag").setExecutor(new Times());
        getCommand("gui").setExecutor(new GuiCommand());
        getCommand("entidade").setExecutor(new Entidade());
        getCommand("npc").setExecutor(new Npc());
    }

//    public void scheduler(){
//        Bukkit.getScheduler().scheduleSyncRepeatingTask(this, () ->{
//
//            Bukkit.getConsoleSender().sendMessage("§4Foda-se");
//            for (Player p : Bukkit.getOnlinePlayers()){
//                p.sendMessage("Vão todos tomar no cu");
//            }
//
//        }, 0, 20 * 1);
//    }


}
