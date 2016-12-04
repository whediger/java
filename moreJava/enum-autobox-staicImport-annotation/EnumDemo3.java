//use enum constructor, instance variable, and method

enum Transport {
  CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

  private int speed; //typical speed for each transport

  //constructor
  Transport(int s) { speed = s; }

  int getSpeed() { return speed; }
}

class EnumDemo3 {
  public static void main(String args[])
  {
    Transport tp;

    //display speed of AIRPLANE
    System.out.println("Typical speed of airplane is " +
                          Transport.AIRPLANE.getSpeed() +
                          " miles an hour.\n");

    //display all transports speeds
    System.out.println("all transports speeds");
    for(Transport t : Transport.values())
      System.out.println(t + " typical speed is " +
                            t.getSpeed() + " miles an hour.");
  }
}
