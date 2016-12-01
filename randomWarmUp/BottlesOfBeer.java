
public class BottlesOfBeer {

  public void sing(int numOfBeers){

    singVerse(numOfBeers);
    numOfBeers--;

    if ( numOfBeers >= 1 ){
      sing(numOfBeers);
    }
    if ( numOfBeers == 0 ){
      singLastVerse();
    }
  }

  public void singVerse(int numOfBeers){
    System.out.println(numOfBeers + " bottles of beer on the wall,");
    System.out.println(numOfBeers + " bottles of beer,");
    System.out.println(" ya’ take one down, ya’ pass it around, " + numOfBeers + " bottles of beer on the wall.");
  }

  public void singLastVerse(){
    System.out.println("No more bottles of beer on the wall,");
    System.out.println("No more bottles of beer,");
    System.out.println("ya’ took them down, ya’ passed them around, there are no more bottles of beer on the wall!");
  }

  public static void main(String[] args){

    int bottlesOfBeer = 4;

    BottlesOfBeer bobsBeer = new BottlesOfBeer();

    bobsBeer.sing(bottlesOfBeer);

  }
}
