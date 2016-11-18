
public class BottlesOfBeer {

  public void sing(int numOfBeers){

    System.out.println(numOfBeers + " bottles of beer on the wall,");
    System.out.println(numOfBeers + " bottles of beer,");
    System.out.println(" ya’ take one down, ya’ pass it around, " + numOfBeers + " bottles of beer on the wall.");

    numOfBeers--;

    if ( numOfBeers >= 1 ){
      sing(numOfBeers);
    }
    if ( numOfBeers == 0 ){
      System.out.println("No more bottles of beer on the wall,");
      System.out.println("No more bottles of beer,");
      System.out.println("ya’ took them down, ya’ passed them around, now there are no more bottles of beer on the wall!");
    }

  }

  public static void main(String[] args){

    int bottlesOfBeer = 4;

    BottlesOfBeer bobsBeer = new BottlesOfBeer();

    bobsBeer.sing(bottlesOfBeer);

  }
}
