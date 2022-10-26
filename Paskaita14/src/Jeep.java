public class Jeep implements LandVehicle {

  String name;
  int maxSpeed;


  @Override
  public String drive() {
    System.out.println("vaziuojam!!!");
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
    return maxSpeed;
  }
}



