class Main {
  public static void main(String[] args) {
    // Test your methods here
    // Call both methods to see if they are working correctly
   firstlast("Joe", "Biden");
    namefirslast("Joe", "Biden");
    System.out.println(namefirslast("Joe", "Biden"));
  }

  //Create your 2 methods here

public static void firstlast(String firstname, String lastname){

  System.out.println(firstname + ", " + lastname);
}
public static String namefirslast(String firstname, String lastname){

  return lastname + ", " + firstname;
}

}