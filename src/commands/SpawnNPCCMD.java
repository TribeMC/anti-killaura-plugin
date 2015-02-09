package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import v3.Bot;
import v3.Messages;

public class SpawnNPCCMD implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command arg1, String arg2,
			String[] args) {
		// TODO Auto-generated method stub
		if (cs instanceof ConsoleCommandSender) {
			cs.sendMessage(Messages.getPrefix()
					+ "Dies können nur Spieler verwenden!");
			return true;
		}
		if (args.length == 1) {
			try {
				Bot.spawnNPC(((Player) cs).getLocation(), null,
						Long.valueOf(args[0]));
				cs.sendMessage(Messages.getPrefix() + "NPC erzeugt!");

			} catch (Exception e) {
				cs.sendMessage(Messages.getPrefix()
						+ "Konnte NPC nicht erzeugen");
			}
		}else{
			Bot.spawnNPC(((Player) cs).getLocation(), null,
					-1);
			cs.sendMessage(Messages.getPrefix() + "NPC erzeugt!");
		}
		return false;
	}

}
