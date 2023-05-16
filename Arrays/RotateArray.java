import java.util.Scanner;

public class RotateArray extends FindSecondLargest
{

    public static int[] ArrayRotator(int[] arr,int n, int k)
    {
        int temp = arr[0];
        int i =0,j=0;

        for(j = 1;j<=k;++j)
        {
            temp = arr[0];
            for(i=0;i<n;i++)
            {
                if(i==n-1)
                {
                    arr[i] = temp;
                    break;
                }
                arr[i] = arr[i+1];
            }
        }
        
        return arr;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		
        int k = sc.nextInt();
        int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
        arr = ArrayRotator(arr,n,k);
		FindSecondLargest.printArray(arr,n);
    }
}