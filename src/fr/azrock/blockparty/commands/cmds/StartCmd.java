package fr.azrock.blockparty.commands.cmds;

import org.bukkit.entity.Player;

import fr.azrock.blockparty.commands.SubCommand;

public class StartCmd extends SubCommand {

	@Override
	public void execute(Player player, String[] args) {
		
		//TODO: Force start game
		
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
