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
	public static void main(String args[])
	{
		int arr[]={1,3,6,2,4};
		bubble(arr);
	}
}