package v3;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

	
	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		//CitizensAPI.registerEvents(new Bot());
		
		loadConfig();
		registerCommands();
		registerEvents();
		
		super.onEnable();
	}
	
	private void loadConfig() {

getConfig().options().copyDefaults(true);
saveConfig();

new Messages(getConfig().getConfigurationSection("messages"));
	}

	private void registerEvents() {
		getServer().getPluginManager().registerEvents(new events.Leave(), this);
	}

	private void registerCommands() {
		getCommand("spawnnpc").setExecutor(new commands.SpawnNPCCMD());
	}

	@Override
	public void onDisable() {
		// TODO Auto-generated method stub
		super.onDisable();
	}
	
}
