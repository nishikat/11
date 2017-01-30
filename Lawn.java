//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------
// Lawn.java
// Nishika Tripathi
// 1404168
// pa1
// Calculates the area and time to mow lawn.
//-----------------------------------------------------------------------------

import java.util.Scanner;

class Lawn{
    public static void main( String[] args ){
	double length, width, length2, width2, area, rate, time;
	int h, s, m, n;
	String g;
	Scanner scan  = new Scanner(System.in);
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the length and width of the lot, in feet:  ");
	length = scan.nextDouble();
	width = scan.nextDouble();
	System.out.print("Enter the length and width of the house, in feet:  ");
	length2 = scan.nextDouble();
	width2 = scan.nextDouble();
	System.out.print("The lawn  area is ");
	area = width*length-width2*length2;
	System.out.println(area+ " square feet.");
	System.out.print("Enter the mowing rate, in square feet per second: ");
	rate = scan.nextDouble();
	System.out.print("The mowing time is ");
	     time = area/rate;
	     s = (int) Math.round(time);
	     m = s/60;
	     s = s%60;
	     h = m/60;
	     m = m%60;
	System.out.println(h+ (h==1?" hour " :" hours ")  +m+ (m==1?" minute" :" minutes") +  " and "  +s+ (s==1?" second.":" seconds."));
     
	}
}
