
class StringJoinDemo {
  public static void main(String[] args) {
    String result = String.join(" ", "one", "two", "three");

    System.out.println(result);

    result = String.join(", ", "joe", "shmoe", "ID", "009162", "Email: joe.shmoe@someCompany.com");
    System.out.println(result);
  }
}
