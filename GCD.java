/* GCD.java
 *Nishika Tripathi
 * 1404168
 * pa3
 * find gcd of only integers and no negative
 */

import java.util.Scanner;

class GCD{

public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
int x,y;

 System.out.print("Enter a positive integer:");
  while(true){
    while(!sc.hasNextInt()){
       sc.next();
       System.out.print("Please enter a positive integer:");}
       x = sc.nextInt();
    if(x>0){
	break;}
       System.out.print("Please enter a positive integer:");}
       
 System.out.print("Enter another positive integer:");
  while(true){
    while(!sc.hasNextInt()){
       sc.next();
       System.out.print("Please enter a positive integer:");}
       y = sc.nextInt();
    if(y>0){
        break;}
       System.out.print("Please enter a positive integer:");}

       System.out.println("The GCD of " +x+ " and " +y+ " is " +GCD(x,y));
       System.exit(0);}

 public static int GCD (int x, int y) {
   if (y==0){
   return x;}
	else{
	return GCD(y, x%y);}
}
}
