


import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Util {
	
	public static void sendMessage(CommandSender sender ,String message)
	{
		
		sender.sendMessage("kili :"+message);	
		Bukkit.getLogger().info("kili :"+message);
	}
	public static void sendMessageEvent( Player p ,String message)
	{
		
		p.chat("kili :"+message);	
		Bukkit.getLogger().info("kili :"+message);
	}
}
