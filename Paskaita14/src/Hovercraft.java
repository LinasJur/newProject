public class Hovercraft implements SeaVessel, LandVehicle{


    String name;
    int maxSpeed;

    public void enterLand() {

    }

    public void enterSea() {

    }


    @Override
    public String drive() {
        return null;
    }

    @Override
    public String swim() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String setName(String name) {
        return name;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int setMaxSpeed(int b) {
        this.maxSpeed = maxSpeed;
        return b;
    }
}
