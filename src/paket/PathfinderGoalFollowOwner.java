package paket;

import net.minecraft.server.v1_12_R1.EntityCreature;
import net.minecraft.server.v1_12_R1.PathfinderGoal;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class PathfinderGoalFollowOwner extends PathfinderGoal {

    private EntityCreature entityCreature;
    private Player petOwner;
    float speed;

    public Player getOwner(){
        return petOwner;
    }

    public void setOwner(Player player){
        this.petOwner = player;
    }

    public PathfinderGoalFollowOwner(EntityCreature entityCreature, Player petOwner, float speed) {
        this.entityCreature = entityCreature;
        this.petOwner = petOwner;
        this.speed = speed;
    }

    @Override
    public boolean a() {
        if(this.entityCreature.aI() >= 5) return false;
        //else if(<shouldwalk?>) return true;
        else return false;
    }

    @Override
    public void c() {
        Location loc = petOwner.getLocation();
        this.entityCreature.getNavigation().a(loc.getX(), loc.getY(), loc.getZ(), speed);
    }

}
