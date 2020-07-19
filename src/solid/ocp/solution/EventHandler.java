package solid.ocp.solution;

public class EventHandler {
	 private Vehicle vehicle;

	    public EventHandler(final Vehicle vehicle) {
	        this.vehicle = vehicle;
	    }

	    public void changeDrivingMode(final DrivingMode drivingMode) {
	        vehicle.setPower(drivingMode.getPower());
	        vehicle.setSuspensionHeight(drivingMode.getSuspensionHeight());
	        // si se desea crear oto modo pues se procede a crear otra clase.
	    }
}
