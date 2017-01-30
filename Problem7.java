class Problem7{
   public static void main(String[] args){
     int[] list = {3, 9, 6, 12, 23, -25, 54, 9, 0, -12, 27};
     System.out.println(list[getMaxIndex(list)]);
     System.out.println(list[getMinIndex(list)]);
}

static int getMaxIndex(int[] A){

      int i, maxIndex=0, n=A.length;
      for(i=1; i<n; i++){
         if(A[i]>A[maxIndex])
          { maxIndex = i;
      }
      }
      return maxIndex;
   }

static int getMinIndex(int[] A){

      int i, minIndex=0, n=A.length;
      for(i=1; i<n; i++){
         if(A[i]<A[minIndex])
           { minIndex = i;
      } 
      }
      return minIndex;
   }
}
