
class ByTwos implements Series {
  int start;
  int val;
  int prev;

  ByTwos(){
    start = 0;
    val = 0;
    prev = -2;
  }

  public int getNext(){
    val += 2;
    return val;
  }

  public void reset() {
    val = start;
  }

  public void setStart(int x){
    start = x;
    val = x;
  }

  int getPrevious(){
    return prev;
  }
}
