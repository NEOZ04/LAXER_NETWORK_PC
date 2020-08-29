package laxer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
    	this.getLogger().info("Plugin has been Enable...");
    }

    @Override
    public void onDisable() {

    }
    
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
    	// TODO Auto-generated method stub
        if (command.getName().equalsIgnoreCase("test")) {
            sender.sendMessage("Eyyoooo Whats Up");
            return true;
        }
    	return false;
    }

}