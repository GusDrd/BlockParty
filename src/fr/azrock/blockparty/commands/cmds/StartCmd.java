package fr.azrock.blockparty.commands.cmds;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import fr.azrock.blockparty.BlockParty;
import fr.azrock.blockparty.commands.SubCommand;

public class StartCmd extends SubCommand {

	@Override
	public void execute(Player player, String[] args) {
		
		Bukkit.broadcastMessage(ChatColor.RED+"The game has been forced to start by "+ChatColor.YELLOW+player.getName()+ChatColor.RED+".");
		BlockParty.get().getGame().startGame();
		
	}

	@Override
	public String name() {
		return "start";
	}

	@Override
	public String permission() {
		return "blockparty.start";
	}

}
