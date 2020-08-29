package laxer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
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
		// TODO Auto-generated method stub
		if (command.getName().equalsIgnoreCase("test")) {
			if (sender instanceof Player) {
				sender.sendMessage("[Sang OP] Eyyyoooo Whats Up " + sender.getName());	
			}else {
				sender.sendMessage("[Sang OP] Eyyyoooo Whats Up");	
			}
		}
		
		return false;
	}
	
}
