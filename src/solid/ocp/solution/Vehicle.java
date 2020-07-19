package solid.ocp.solution;

public class Vehicle {
	
	private int power;
    private int suspensionHeight;

    //Cambio en los modificadoes de acceso en cada metodo de los getter and setter
    
    public int getPower() {
        return power;
    }

    public void setPower(final int power) {
        this.power = power;
    }

    public int getSuspensionHeight() {
        return suspensionHeight;
    }

    public void setSuspensionHeight(final int suspensionHeight) {
        this.suspensionHeight = suspensionHeight;
    }
}
