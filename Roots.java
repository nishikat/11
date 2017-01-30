/*
 * Roots.java
 * Nishika Tripathi
 * 1404168
 * pa4
 * Program that finds the roots of a polynomial
 */

import java.util.*;

class Roots{

      public static int degree;
      public static double[] polyArray;
      public static double[] diffArray;
      public static int coefNum;

      public static void main( String[] args ){
            double resolution = 0.01;
            double tolerance = 0.0000001;
            double threshold = 0.001;
            double endpointL;
            double endpointR;

            int polyRootPointer = 0;
            int diffRootPointer = 0;

            boolean rootFound = false;

            Scanner sc = new Scanner(System.in);



            System.out.print("Enter the degree: ");
            degree = sc.nextInt();
            coefNum = degree + 1;
            System.out.print("Enter " + coefNum + " coefficients: ");
            double[] coefficients = new double[coefNum];
            polyArray = new double[coefNum];
            double[] polyRootArray = new double[degree];
            diffArray = new double[coefNum];
            double[] diffRootArray = new double[degree];
            for(int i = 0; i < coefNum; i++) {
                  coefficients[i] = sc.nextDouble();
            }
            System.out.print("Enter the left and right endpoints: ");
            endpointL = sc.nextDouble();
            endpointR = sc.nextDouble();

            diff(coefficients);

            for (double i = endpointL; i < endpointR-resolution; i = i + resolution){
                  if (isPositive(diffArray, i) != isPositive(diffArray, i+resolution) || isPositive(diffArray, i) == 0) {
                        diffRootArray[diffRootPointer] = findRoot(diffArray, i, i+resolution, tolerance);
                        diffRootPointer++;
                  }
            }

            for (int i = 0; i < diffRootArray.length; i++) {
                  double tempValue;
                  tempValue = poly(coefficients, diffRootArray[i]);
                  tempValue = Math.abs(tempValue);
                  if (tempValue < threshold) {
                        polyRootArray[polyRootPointer] = diffRootArray[i];
                        polyRootPointer++;
                        rootFound = true;
                  }
            }

            for (double i = endpointL; i < endpointR-resolution; i = i + resolution){
                  if (isPositive(coefficients, i) != isPositive(coefficients, i+resolution) || isPositive(coefficients, i) == 0) {
                        polyRootArray[polyRootPointer] = findRoot(coefficients, i, i+resolution, tolerance);
                        polyRootPointer++;
                        rootFound = true;
                  }
            }

            Arrays.sort(polyRootArray);


            if (rootFound == true) {
                  for (int i = 0; i < polyRootArray.length; i++) {
                        if (polyRootArray[i] != 0.0) {
			      System.out.println();
                              System.out.printf("Root found at %.5f%n", polyRootArray[i]);
                        }
                  }
            } else {
		  System.out.println();
                  System.out.println("No roots were found in the specified range.");
            }
      }

      static double poly(double[] C, double x){
            double polySum = 0;
            polyArray[0] = C[0];
            for (int i = 1; i < polyArray.length; i++){
                  polyArray[i] = C[i]*(Math.pow(x, i));
            }
            for (int i = 0; i < polyArray.length; i++){
                  polySum = polySum + polyArray[i];
            }
            return(polySum);

      }

      static double[] diff(double[] C){ 
            for (int i = 0; i < degree; i++){
                  diffArray[i] = (i+1)*C[i+1];
            }
            return(diffArray);
      }

      static double findRoot(double[] C, double a, double b, double tolerance){
            double root = 0.0 , residual;
            while ( Math.abs(b - a) > tolerance ) {
                  root = (a + b) / 2.0;
                  residual = poly(C, root);
                  if (poly(C, a) > 0 && poly(C, b) < 0) {
                        if (residual > 0)
                              a = root;
                        else
                              b = root;
                  } else if (poly(C, a) < 0 && poly(C, b) > 0) {
                        if (residual > 0)
                              b = root;
                        else
                              a = root;
                  }
            }
            return(root);
      }

      static int isPositive(double[] C, double a){
            double endpointTempA;
            endpointTempA = poly(C, a);
            if (endpointTempA <= 0) {
                  return(1);
            } else if (endpointTempA >= 0) {
                  return(2);
            } else {
                  return(0); 
            }
      }
}
