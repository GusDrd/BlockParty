package fr.azrock.blockparty;

import org.bukkit.plugin.java.JavaPlugin;

import fr.azrock.blockparty.commands.ACommand;
import fr.azrock.blockparty.game.Game;

public class BlockParty extends JavaPlugin {
	
	private static BlockParty instance;
	
	private Game game;
	
	
	
	public void onEnable() {
		instance = this;
		
		this.game = new Game(this);
		
		ACommand.registerCommands(this);
	}
	
	
	public void onDisable() {
		
		
	}
	
	
	
	/**
	 * @return Game's instance
	 * */
	public Game getGame() {
		return this.game;
	}
	
	
	/**
	 * @return plugin instance
	 * */
	public static BlockParty get() {
		return instance;
	}
	
}
