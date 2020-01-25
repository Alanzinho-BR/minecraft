package br.alan.events;

        import org.bukkit.event.Listener;
        import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Tab implements Listener {

    public void tagTab(AsyncPlayerChatEvent e){
        e.setFormat("" + e.getPlayer() + "§f: " + e.getMessage());
    }
}
