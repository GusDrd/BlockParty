package fr.azrock.blockparty.commands;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import fr.azrock.blockparty.commands.cmds.StartCmd;

public class BPCommand extends ACommand {

	private ArrayList<SubCommand> subCommands;
	
	
	public BPCommand() {
		super("Blockparty");
		
		subCommands = new ArrayList<SubCommand>();
		registerSubCommands();
	}
	
	
	public void registerSubCommands() {
		subCommands.add(new StartCmd());
	}

	
	@Override
	public void execute(Player player, String[] args) {

		if(args.length == 0) {

			if(!player.hasPermission("sheepwars.help")) return;

			player.sendMessage(ChatColor.RED+"Try with /bp <start/stop/skip/zone>");
			return;

		}else {

			SubCommand cmdArg = getSC(args[0]);

			//Check if argument exists
			if(cmdArg == null) {
				if(!player.hasPermission("blockparty.help")) return;

				player.sendMessage(ChatColor.RED+"This command doesn't exist. Try /blockparty to get a list of commands.");
				return;
			}

			if(!player.hasPermission(cmdArg.permission())) return;


			ArrayList<String> al = new ArrayList<String>();		//Declare new ArrayList al
			al.addAll(Arrays.asList(args));  					//Initialize new arrayList al with the args array's content.
			al.remove(0);										//Remove first argument (eg. /parcours add Test, remove 'add' argument)
			args = al.toArray(new String[al.size()]);			//Set new args to the modified ArrayList al in order to compensate for seperate arg classes.

			try {
				cmdArg.execute(player, args);
			}catch(Exception e) { 
				player.sendMessage(ChatColor.RED+"An error occured!"); 
				e.printStackTrace(); 
			}
		}

	}
	
	/*
	 * 
	 * */
	public SubCommand getSC(String args) {
		for(SubCommand sc : subCommands) {
			if(sc.name().equalsIgnoreCase(args)) return sc;
		}
		
		return null;
	}
}
