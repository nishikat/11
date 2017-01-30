public class Sum {

    public static int sum(int n) {
        if (n == 0) return 0;
        else return 1 + sum(n-1);
    }

   public static void main(String[] args) {
      int N = Integer.parseInt(args[0]);
      System.out.println(sum(N));
   }

}
