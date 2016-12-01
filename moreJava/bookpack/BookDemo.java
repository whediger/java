package bookPack;

class Book {
  private String title;
  private String author;
  private String pubDate;

  Book(String t, String a, int d){
    title = t;
    author = a;
    bubDate = d;
  }

  void show(){
    System.out.println(title);
    System.out.println(author);
    System.out.println(pubDate);
    System.out.println();
  }
}
