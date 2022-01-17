package fr.azrock.blockparty.game;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import fr.azrock.blockparty.BlockParty;

public class Game {

	private BlockParty plugin;
	
	// Game Variables
	private int minPlayers;
	private int maxPlayers;
	
	// Control Variables
	private int turns;
	
	// Player Maps
	private final HashMap<UUID, GamePlayer> gamePlayers;
	private final HashMap<UUID, GamePlayer> gameSpectators;
	
	// State
	private GameState state;
	
	
	
	public Game(BlockParty plugin) {
		this.plugin = plugin;
		
		this.gamePlayers = new HashMap<UUID, GamePlayer>();
		this.gameSpectators = new HashMap<UUID, GamePlayer>();
		
		this.state = GameState.WAITING_FOR_PLAYERS;
	}
	
	
	
	/*
	 * Handle the start of the game (Teleport players, start timers, etc...)
	 * */
	public void startGame() {
		
	}
	
	
	/*
	 * Handle the next round (Select pattern, color, update timers)
	 * */
	public void handleNextTurn() {
		
	}
	
	
	/*
	 * Handle player death (set spectator, check win)
	 * */
	public void handlePlayerDeath(Player player) {
		
	}
	
	
	/**
	 * Check if there is a winner. 
	 * Return whether there is a winner or not.
	 * 
	 * @return true (if the win condition(s) have been met) 
	 * */
	public boolean checkWin() {
		
		//If win, return true
		
		return false;
	}
	
	
	/*
	 * Handle the game's end (Start kick timer, Fireworks?, Stop server)
	 * */
	public void handleGameEnd() {
		
	}
	
}
