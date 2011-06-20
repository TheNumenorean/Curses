package net.lotrcraft.curses;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.plugin.java.JavaPlugin;

public class Curses extends JavaPlugin {
	Logger log = Logger.getLogger("minecraft");
	Set<Player> players;

	public void onDisable() {
		log.info("Curses! Curses is disabled.");
	}

	public void onEnable() {
		log.info("Curses! Curses is enabled.");
		this.getServer()
				.getPluginManager()
				.registerEvent(Event.Type.PLAYER_MOVE, new CursesListener(),
						Event.Priority.Highest, this);
		players = new HashSet<Player>();
	}

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
		//Hello!
		
		
		return true;
	}
}
