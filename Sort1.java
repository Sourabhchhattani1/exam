import java.util.*;
public class Sort1
{
	static void bubble(int[] arr)
	{
		
		int n =arr.length;
		int temp = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	static void selection(int[] arr)
	{
		static void bubble(int[] arr)
	{
		
		int n =arr.length;
		int temp = 0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	static void insertion(int[] arr)
	{
		int n =arr.length;
		
		for(int i=1;i<n;i++)
		{
			int key = arr[i];
			int j =i-1;
			while((j>-1) && (arr[j]>key))
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

	public static void main(String args[])
	{
		int arr[]={1,3,6,2,4};
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			bubble(arr);
			
			case 2:
			insertion(arr);

			case 3:
			selection(arr);
		}
		
	}
}
