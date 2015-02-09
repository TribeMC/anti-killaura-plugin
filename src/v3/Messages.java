package v3;

import java.util.HashMap;

import org.bukkit.ChatColor;
import org.bukkit.configuration.ConfigurationSection;

public class Messages {

	private static HashMap<String, String> msgs = new HashMap<>();

	public Messages(ConfigurationSection cs) {
		for (String temp : cs.getKeys(false)) {
			msgs.put(
					temp,
					ChatColor.translateAlternateColorCodes('&',
							cs.getString(temp)));
		}
	}

	public static String getPrefix() {
		if (msgs.containsKey("prefix")) {
			return msgs.get("prefix");
		} else {
			return "DefaultPrefix §e";
		}
	}

	public String getMessage(String s) {
		return msgs.get("prefix");

	}
}
