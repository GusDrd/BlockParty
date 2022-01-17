package fr.azrock.blockparty.commands;

import org.bukkit.entity.Player;

public abstract class SubCommand {

	public abstract void execute(Player player, String[] args);
	
	public abstract String name();
	
	public abstract String permission();
	
}
