package paket;

import net.minecraft.server.v1_12_R1.EntityCaveSpider;
import net.minecraft.server.v1_12_R1.EntityCreature;
import net.minecraft.server.v1_12_R1.PathfinderGoalMeleeAttack;
import net.minecraft.server.v1_12_R1.WorldServer;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_12_R1.CraftServer;
import org.bukkit.craftbukkit.v1_12_R1.CraftWorld;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{

    private String command = "pet";
    public static EntityCaveSpider cc;
    public static EntityCreature c;
    private Main plugin;

    public Commands(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(!(sender instanceof Player)) return true;
        if(!(cmd.getName().equalsIgnoreCase(command))) return true;

        Player player = (Player) sender;
        Location loc = player.getLocation();
        WorldServer world = ((CraftWorld)player.getWorld()).getHandle();

        cc = new EntityCaveSpider(world);
        c = (EntityCreature) cc;

        c.setNoAI(true);

        //c.setLocation(loc.getX(), loc.getY(), loc.getZ(), 0,0);
        c.getNavigation().a(loc.getX(), loc.getY(), loc.getZ());
        c.setLocation(loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch());

        //CaveSpider csMike = (CaveSpider) cc.getBukkitEntity();
        //csMike.setMaxHealth(100);
        c.setHealth(100);
        c.setCustomName(ChatColor.RED + "Mike");
        c.setCustomNameVisible(true);

        world.addEntity(c);

        return true;
    }
}
