package v3;

import java.util.Random;

import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;

import org.bukkit.Location;
import org.bukkit.entity.EntityType;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerTeleportEvent.TeleportCause;

public class Bot implements Listener {

	public static void spawnNPC(Location loc, Location to, long duration) {

		NPC npc = CitizensAPI.getNPCRegistry().createNPC(EntityType.PLAYER,
				getName(8));
		npc.spawn(loc);
		if (to != null) {
			npc.faceLocation(to);
			npc.teleport(to, TeleportCause.PLUGIN);
		}
		if(duration > -1){
			try {
				npc.wait(duration);
				npc.despawn();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	static String allChars = "qwertzuioplkjhgfdsayxcvbnmYXCVBNMLKJHGFDSAQWERTZUIOP0987654321";
	static Random r = new Random();

	private static String getName(int i) {
		// TODO Auto-generated method stub
		String temp = "";

		while (temp.length() <= i) {
			temp = temp + allChars.charAt(r.nextInt(allChars.length()));
		}
		return temp;
	}
}
