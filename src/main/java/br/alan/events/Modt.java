package br.alan.events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import java.util.ArrayList;
import java.util.List;

public class Modt implements Listener {

    List<String> cores = new ArrayList<>();



    public void setCores(List<String> cores) {
        this.cores = cores;
    }

    public List<String> getCores() {
        return cores;
    }

    public List<String> addCores(List<String> cores){
        cores.add("§1");
        cores.add("§2");
        cores.add("§3");
        cores.add("§4");
        cores.add("§5");
        cores.add("§6");
        cores.add("§7");
        cores.add("§8");
        cores.add("§9");
        cores.add("§0");
        return cores;
    }
    @EventHandler
    public void modt(ServerListPingEvent e){
        e.setMotd("§6Servidor de Testes");
    }
}
