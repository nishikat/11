import java.util.Scanner;

class BreakContinue {
   public static void main(String[] args) {
      int n;
      double x;
      Scanner sc = new Scanner(System.in);
      while(true){  // a seemingly infinite loop
         
         // prompt for and get user input
                   System.out.print("Enter a positive integer or 0 to exit: ");
                            n = sc.nextInt();
                                     
                                              if(n == 0)   // time to exit loop
                                                          break;    // jump to a point after closing brace
                                                                   
                                                                            
                                                                                     if (n < 0)   // invalid value
                                                                                                 continue; // jump to end of this iteration
                                                                                                          
                                                                                                                   // calculate and print squareroot
                                                                                                                            x = Math.sqrt(n);
                                                                                                                                     System.out.println( "squareroot("+ n +") = "+ x );
                                                                                                                                              
                                                                                                                                                       //continue lands here
                                                                                                                                                             }
                                                                                                                                                                   //break lands here
                                                                                                                                                                         System.out.println("bye!");
                                                                                                                                                                            }
                                                                                                                                                                            }
