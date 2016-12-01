package bookpackext;

import bookpack.*;

class UseBook {
  public static void main(String[] args){
    Book books[] = new Book[5];

    books[0] = new Book("Java and stuff", "Schitz", 2014);
    books[1] = new Book("Java totally man", "Schitz", 2014);
    books[2] = new Book("The Art of disembodied java", "Shitz and Homie", 2003);
    books[3] = new Book("Red storm stuff", "someone", 1995);
    books[4] = new Book("On the Road", "chicken Little", 1943);

    for (int i = 0; i < books.length; i++) books[i].show();
  }
}
