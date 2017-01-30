/*Complex.java
 *Nishika Tripathi
 *1404168
 *pa6
 *complex numbers into double values
 */

class Complex{

   private double re;
   private double im;
   
   public static final Complex ONE = Complex.valueOf(1,0);
   public static final Complex ZERO = Complex.valueOf(0,0);
   public static final Complex I = Complex.valueOf(0,1);

  
   Complex(double a, double b){
      this.re = a;
      this.im = b;
   }

   Complex(double a){
      this.re = a;
      this.im = 0;
   }

   Complex(String s){
      double[] part = new double[2];
      String whatever = s.trim();
      String NUM = "(\\d+\\.\\d*|\\.?\\d+)";
      String SGN = "[+-]?";
      String OP =  "\\s*[+-]\\s*";
      String I =   "i";
      String OR =  "|";
      String REAL = SGN+NUM;
      String IMAG = SGN+NUM+"?"+I;
      String COMP = REAL+OR+
                    IMAG+OR+
                    REAL+OP+NUM+"?"+I;
      
      if( !whatever.matches(COMP) ){
         throw new NumberFormatException(
                   "Cannot parse input string \""+whatever+"\" as Complex");
      }
      whatever = whatever.replaceAll("\\s","");     
      if( whatever.matches(REAL) ){
         part[0] = Double.parseDouble(whatever);
         part[1] = 0;
      }else if( whatever.matches(SGN+I) ){
         part[0] = 0;
         part[1] = Double.parseDouble( whatever.replace( I, "1.0" ) );
      }else if( whatever.matches(IMAG) ){
         part[0] = 0;
         part[1] = Double.parseDouble( whatever.replace( I , "" ) );
      }else if( whatever.matches(REAL+OP+I) ){
         part[0] = Double.parseDouble( whatever.replaceAll( "("+REAL+")"+OP+".+" , "$1" ) );
         part[1] = Double.parseDouble( whatever.replaceAll( ".+("+OP+")"+I , "$1"+"1.0" ) );
      }else{    
         part[0] = Double.parseDouble( whatever.replaceAll( "("+REAL+").+"  , "$1" ) );
         part[1] = Double.parseDouble( whatever.replaceAll( ".+("+OP+NUM+")"+I , "$1" ) );
      }
      
      this.re = part[0];
      this.im = part[1];
}

  
   Complex copy(){
      double reCopy, imCopy;
      reCopy = this.re;
      imCopy = this.im;

      Complex cop = new Complex(reCopy,imCopy);
      return cop;
   }
  
   Complex add(Complex z){
      double reAdd, imAdd;
      reAdd = this.re + z.re;
      imAdd = this.im + z.im;
      
      Complex sum = new Complex(reAdd,imAdd);
      return sum;
   }
   
   Complex negate(){
      double reNeg, imNeg;
      reNeg = this.re * (-1.0);
      imNeg = this.im * (-1.0);

      Complex neg = new Complex(reNeg,imNeg);
      return neg;
   }

   Complex sub(Complex z){
      double reSub, imSub;
      reSub = this.re - z.re;
      imSub = this.im - z.im;

      Complex substract = new Complex(reSub,imSub);
      return substract;
   }

   Complex mult(Complex z){
      double reMult, imMult;
      reMult = (this.re * z.re) - (this.im * z.im);
      imMult = (this.re * z.im) + (this.im * z.re);

      Complex multiplication = new Complex(reMult,imMult);
      return multiplication;
   }

   Complex recip(){
      double reRecip, imRecip;
      if (this.equals(Complex.ZERO)) {
         throw new ArithmeticException("Cannot compute reciprocal, impossible to divide by zero.");
      } else {
         reRecip = this.re / (Math.pow(this.re, 2) + Math.pow(this.im, 2));
         imRecip = (this.im * (-1.0)) / (Math.pow(this.re, 2) + Math.pow(this.im, 2));

         Complex reciprocal = new Complex(reRecip,imRecip);
         return reciprocal;
      }
   }

   Complex div(Complex z){
      double reDiv, imDiv;
      if (z.equals(Complex.ZERO)) {
         throw new ArithmeticException("Cannot compute division, impossible to divide by zero.");
      } else {
         reDiv = ((this.re * z.re) + (this.im * z.im)) / (Math.pow(z.re, 2) + Math.pow(z.im, 2));
         imDiv = ((z.re * this.im) - (z.im * this.re)) / (Math.pow(z.re, 2) + Math.pow(z.im, 2));

         Complex division = new Complex(reDiv,imDiv);
         return division;
      }
      
   }

   Complex conj(){
      double imConj;
      imConj = this.im * (-1.0);

      Complex conjugate = new Complex(this.re,imConj);
      return conjugate;
   }
   
      double Re(){
      return re;
   }

      double Im(){
      return im;
   }

      double abs(){
      double modulus;
      modulus = Math.sqrt(Math.pow(this.re, 2) + Math.pow(this.im, 2));

      return modulus;
   }

      double arg(){
      return Math.atan2(im, re);
   }


      public String toString(){
      String complexString;
      if (this.im < 0.0) {
         if (this.re != 0.0) {
            complexString = new String(this.re + "" + this.im + "i");
         } else {
            complexString = new String(this.im + "i");
         }
      } else if (this.im > 0.0) {
         if (this.re != 0.0) {
            complexString = new String(this.re + "+" + this.im + "i");
         } else {
            complexString = new String(this.im + "i");
         }
      } else {
         if (this.re != 0.0) {
            complexString = new String(this.re + "");
         } else {
            complexString = new String("");
         }
      }
      return complexString;
   }

      public boolean equals(Object obj){
      boolean isEqual = false;
      Complex tempEqual = (Complex)obj;
      if (this.re == tempEqual.re) {
         isEqual = true;
      } 
      if (this.im == tempEqual.im) {
         isEqual = true;
      }
      return isEqual;
   }

      static Complex valueOf(double a, double b){
      Complex valueAB = new Complex(a,b);
      return valueAB;
   }

      static Complex valueOf(double a){
      Complex valueA0 = new Complex(a,0);
      return valueA0;
   }

      static Complex valueOf(String s){
      Complex valueString = new Complex(s);
      return valueString;
   }
}

