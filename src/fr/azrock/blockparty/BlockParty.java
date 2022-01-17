package fr.azrock.blockparty;

import org.bukkit.plugin.java.JavaPlugin;

import fr.azrock.blockparty.commands.ACommand;

public class BlockParty extends JavaPlugin {
	
	private static BlockParty instance;
	
	
	
	public void onEnable() {
		instance = this;
		
		ACommand.registerCommands(this);
	}
	
	
	public void onDisable() {
		
		
	}
	
	
	/**
	 * @return plugin instance
	 * */
	public static BlockParty get() {
		return instance;
	}
	
}
