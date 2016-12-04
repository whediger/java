
//enum of transportation varieties
enum Transport {
  CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo {
  public static void main(String args[])
  {
    Transport tp;

    tp = Transport.AIRPLANE;

    //output of enum value
    System.out.println("value of tp: " + tp);
    System.out.println();

    tp = Transport.TRAIN;

    //compare two emum values
    if(tp == Transport.TRAIN)
      System.out.println("tp contains TRAIN,\n");

    switch(tp) {
      case CAR:
        System.out.println("its a car");
        break;
      case TRUCK:
        System.out.println("its a truck");
        break;
      case AIRPLANE:
        System.out.println("its a plane");
        break;
      case TRAIN:
        System.out.println("its a train");
        break;
      case BOAT:
        System.out.println("its a boat");
        break;
    }
  }
}
