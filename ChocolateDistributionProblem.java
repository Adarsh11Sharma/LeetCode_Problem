


class ChocolateDistributionProblem{
static int FindMinDiff(int []arr,int m){
int min=arr[0];
int index=0;
    for (int i=0;i<m;i++){
        if (arr[i]<min){
            min=arr[i];
            index=i;
        }
       
    }
   int diff=arr[m-1]-min;
    
  return diff ;
}

    public static void main(String[] args) {
        

        int arr[]={7,3,2,4,9,12,56};
        int m=3;

        System.out.println("Minimum difference is: " + FindMinDiff(arr, m));
    }

}