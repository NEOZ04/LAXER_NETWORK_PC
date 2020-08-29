package laxer;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class TestCommand extends Command {

	protected TestCommand() {
		super("test");
		this.setPermission("laxer.test");
		this.setDescription("Test Command");
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean execute(CommandSender sender, String arg1, String[] arg2) {
		// TODO Auto-generated method stub
		
		sender.sendMessage("Whats UP");
		
		return false;
	}
	
	

}
