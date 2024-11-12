public class Apply_Operation_To_Array_2460 {
    public static int[] applyOperations(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]*=2;
                arr[i+1]=0;
            }
        }
        int k=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                arr[k]=arr[j];
                k++;
            }
        }
        while(k<arr.length){
            arr[k]=0;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,0};
        arr=applyOperations(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
