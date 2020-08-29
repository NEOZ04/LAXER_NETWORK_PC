package laxer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		// TODO Auto-generated method stub
		this.getLogger().info("Plugin telah di aktifkan...");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		switch (command.getName().toLowerCase()) {
			case "test": 
				if (sender instanceof Player) {
					sender.sendMessage("[Sang OP] Eyyyoooo Whats Up " + sender.getName());	
				}else {
					sender.sendMessage("[Sang OP] Eyyyoooo Whats Up");	
				}
				break;
			case "spawn": 
				if (sender instanceof Player) {
					
					((Player) sender).teleport(this.getServer().getWorld("world").getSpawnLocation());
					sender.sendMessage(ChatColor.GREEN + "Teleport to spawn...");
					return true;
				}
				sender.sendMessage(ChatColor.RED + "Please use this command in game.");
				break;
		}
		
		if (command.getName().equalsIgnoreCase("test")) {
		}
		
		return false;
	}
	
}
