package paket;

import net.minecraft.server.v1_12_R1.World;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{

    private String command = "pet";
    private Main plugin;

    public Commands(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender instanceof Player)) return true;
        if(!(cmd.getName().equalsIgnoreCase(command))) return true;

        Player petOwner = (Player) sender;
        Location loc = petOwner.getLocation();
        World world = ((CraftWorld) loc.getWorld()).getHandle();

        PetCaveSpider pcsMike = new PetCaveSpider(world, petOwner);

        pcsMike.setPosition(loc.getX(), loc.getY(), loc.getZ());

        return true;
    }
}
