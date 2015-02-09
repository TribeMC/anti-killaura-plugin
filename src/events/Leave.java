package events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Leave implements Listener {

	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Bukkit.getConsoleSender().sendMessage(
				"§eVerlassen: " + e.getPlayer().getName());
	}

	@EventHandler
	public void onkick(PlayerKickEvent e) {
		Bukkit.getConsoleSender().sendMessage(
				"§eGekickt: " + e.getPlayer().getName());
	}
}
