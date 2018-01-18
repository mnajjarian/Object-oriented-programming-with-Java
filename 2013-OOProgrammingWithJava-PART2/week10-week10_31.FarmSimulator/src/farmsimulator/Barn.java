
package farmsimulator;

import java.util.Collection;

public class Barn {
    private final BulkTank bulkTankBarn;
    private MilkingRobot robot;
    
    public Barn(BulkTank tank) {
        this.bulkTankBarn = tank;
        this.robot = null;
    }
    public BulkTank getBulkTank() {
        return this.bulkTankBarn;
    }
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        this.robot.setBulkTank(bulkTankBarn);
    }
    public void takeCareOf(Cow cow) {
        try {
            this.robot.milk(cow);
        } catch (Exception e) {
            throw new IllegalStateException();
        }
    }
    public void takeCareOf(Collection<Cow> cows) {
        for (Cow c : cows) {
            takeCareOf(c);
        }
    }

    @Override
    public String toString() {
        return Math.ceil(this.bulkTankBarn.getVolume()) + "/"
                + Math.ceil(this.bulkTankBarn.getCapacity());
    }
}
