import java.util.Scanner;

class Plural{

   public static void main(String[] args){

      int n;
      String s;
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter an integer: ");
      n = sc.nextInt();
      s = ( n==1 ? "singular" : "plural" );
      System.out.println(s);

      System.out.println("I have " + n + " apple" + (n==1?" here.":"s here."));
   }
}
