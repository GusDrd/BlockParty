package fr.azrock.blockparty.game;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class GamePlayer {

	private String name;
	private UUID uuid;
	
	private boolean spectator;
	
	public GamePlayer(Player player) {
		this.name = player.getName();
		this.uuid = player.getUniqueId();
		
		this.spectator = false;
	}
	
	
	/**
	 * @return Player name
	 * */
	public String getName() {
		return this.name;
	}
	
	/**
	 * @return Player UUID
	 * */
	public UUID getUniqueID() {
		return this.uuid;
	}
	
	/**
	 * @return Bukkit Player (if online)
	 * */
	public Player getOnlinePlayer() {
		return Bukkit.getPlayer(this.uuid);
	}
	
	/**
	 * @return true (if player is a spectator)
	 * */
	public boolean isSpectator() {
		return this.spectator;
	}
	
	
	
	/**
	 * @return true (if player is a spectator)
	 * */
	public void setSpectator() {
		this.spectator = true;
		
		// TODO : Give hotbar items - Hypixel style spectator mode ? Maybe do in Game class
	}
	
}
