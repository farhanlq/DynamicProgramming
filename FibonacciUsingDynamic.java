import java.util.Scanner;

public class FibonacciUsingDynamic {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int num=scn.nextInt();
	int arr[]=new int[num];
	int res[]=fiboDynamic(arr);
	System.out.println("Fibonacci Series using Dynamic Programming are ");
	for(int i=0;i<num;i++){
		System.out.print(arr[i]+" ");
	}
}

public static int[] fiboDynamic(int arr[]){
	arr[0]=0;
	arr[1]=1;
	for(int i=2;i<arr.length;i++){
		arr[i]=arr[i-1]+arr[i-2];
	}
	
	return arr;
}
}
