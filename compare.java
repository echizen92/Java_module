class compare {

  public static void main(String[] args) {
      String first = args[0];
      String second = args[1];

    // compare the arguements
    
    boolean isSame = first.equals(args[0]); // true
    isSame = first.equals(args[1]); // false

     // print out 
    System.out.println("Words given: " + first + ", " + second);
    

    System.out.print("They are the same: ");
    System.out.println(isSame); 
  }
}
