
public class Abecedarian {

  public static boolean abecedarian(String word){
    Character[] abc = new Character[26];
    int i = 0;
    for (char c = 'a'; c <= 'z'; c++){
      abc[i] = c;
      i++;
    }

    int letterShift = 0;
    for ( int e = 0; e < abc.length; e++){
      if (word.charAt(letterShift) == abc[e]) {
        letterShift++;
      }
      if (letterShift >= word.length()){
        break;
      }
      if (word.length() - letterShift + 1 > abc.length - e){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){

    //true test
    boolean test = abecedarian("abejoptz");
    System.out.println(test);

    //false test
    test = abecedarian("abejoptavz");
    System.out.println(test);

  }
}
