package paket;

import net.minecraft.server.v1_12_R1.EntityCaveSpider;
import net.minecraft.server.v1_12_R1.World;
import org.bukkit.ChatColor;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Player;

public class PetCaveSpider extends EntityCaveSpider {

    private Player petOwner;

    public PetCaveSpider(World world, Player player) {
        super(world);
        this.petOwner = player;

        CaveSpider petCaveSpider = (CaveSpider) this.getBukkitEntity();

        petCaveSpider.setMaxHealth(100);

        this.setHealth(100);
        this.setCustomName(ChatColor.AQUA + "Dcp pouk (krodet'sya)");
        this.setCustomNameVisible(true);

        this.targetSelector.a(new PathfinderGoalFollowOwner(this, petOwner, 0.6F));
    }
}
