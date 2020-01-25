package br.alan.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

public class ScoreBoard implements Listener {

    @EventHandler
    public void scoreBoard(PlayerMoveEvent e){
        Player p = e.getPlayer();
        Scoreboard score = Bukkit.getScoreboardManager().getNewScoreboard();
        Objective objectivo = score.registerNewObjective("Teste", "Dummy");
        objectivo.setDisplaySlot(DisplaySlot.SIDEBAR);
        objectivo.setDisplayName("§4§lPuteiro Do Alanzin");
        objectivo.getScore(Bukkit.getOfflinePlayer("§A§LPUTAS ABAIXO:")).setScore(15);
        objectivo.getScore(Bukkit.getOfflinePlayer("§2MaeDoKingVilehan: §a1R$")).setScore(4);
        objectivo.getScore(Bukkit.getOfflinePlayer("§2MaeDoVilehan: §a4R$")).setScore(13);
        objectivo.getScore(Bukkit.getOfflinePlayer("§2MaeDoPedroDantas: §aFREE")).setScore(12);
        objectivo.getScore(Bukkit.getOfflinePlayer("§2MaeDoShem: §a1000R$")).setScore(11);
        p.setScoreboard(score);

//        objectivo.setDisplayName("§b§L BedWars");
//        objectivo.getScore(Bukkit.getOfflinePlayer("§aEvoluir Esmeralda: §e10:51")).setScore(15);
//        objectivo.getScore(Bukkit.getOfflinePlayer("§bEvoluir Diamante: §e01:51")).setScore(14);
//        objectivo.getScore(Bukkit.getOfflinePlayer("§2Verde")).setScore(4);
//        objectivo.getScore(Bukkit.getOfflinePlayer("§6Laranja")).setScore(4);
//        objectivo.getScore(Bukkit.getOfflinePlayer("§cVermelho")).setScore(4);
//        objectivo.getScore(Bukkit.getOfflinePlayer("§9Azul")).setScore(3);
//        objectivo.getScore(Bukkit.getOfflinePlayer("§dRosa")).setScore(3);
//        objectivo.getScore(Bukkit.getOfflinePlayer("§eAmarelo")).setScore(3);
//
//        objectivo.getScore(Bukkit.getOfflinePlayer("§awww.craftlandia.com.br")).setScore(2);
//        p.setScoreboard(score);


    }
}

