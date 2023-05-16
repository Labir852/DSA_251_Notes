import java.util.* ;
public class FindSecondLargest {
public static void  printArray(int[] arr,int n)
{
	// System.out.print("Sorted array is : ");
	for(int i = 0;i<n;++i)
	{
		System.out.print(arr[i]+" ");
	}
	// System.out.println();
}

public static int[] sortArray(int[] arr,int n)
{
	for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]>arr[i])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
}
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
		int second_largest=arr[0];
		arr = sortArray(arr,n);

		 
		for(int i=0;i<n-1;++i)
		{
			if(arr[i]>arr[i+1])
			{
				second_largest = arr[i+1];
				break;
			}
		}
		if(second_largest==arr[n-1])
		{
			second_largest = -1;
		}
		

		return second_largest;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(findSecondLargest(n,arr));
	}
}