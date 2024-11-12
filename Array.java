import java.util.Scanner;
public class Array {
    Scanner sc = new Scanner(System.in);
    public int[] input(){
        System.out.println("Enter the number of elements");
        int n= sc.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
    public void print(int n,int arr[]){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+"  ");
        }
    }
    public int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public int sumIdx(int arr[],int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    // public static void main(String[] args) {
    //     Array array = new Array();
    //     int arr[]=array.input();
        
    // }
}

