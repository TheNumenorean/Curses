package net.lotrcraft.curses;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

public class Curses extends JavaPlugin {
	Logger log = Logger.getLogger("minecraft");
	//Set<Player> players;

	public void onDisable() {
		log.info("Curses! Curses is disabled.");
	}

	public void onEnable() {
		log.info("Curses! Curses is enabled.");
		this.getServer()
				.getPluginManager()
				.registerEvent(Event.Type.PLAYER_MOVE, new CursesListener(),
						Event.Priority.Highest, this);
		//players = new HashSet<Player>();
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
		Player[] players = Bukkit.getServer().getOnlinePlayers();
		Player cursed = null;
		if (args.length != 1) return false;
		for (int i = 0; i <= players.length; i++){
		 if (args.toString() == players[i].toString()){
			 cursed = players[i];
		 }
		}
		if (cursed == null) return false;
		cursed.damage(100);
		cursed.sendMessage("You have been cursed!!!!!");
		return true;
		
	}
}
