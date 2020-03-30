class  Test18
{
	public static void main(String[] args) 
	{
		String s = cutString("abc你好kk谢谢",13);
		System.out.println(s);
	}	
	public static String cutString(String str,int len)
	{
		byte[] arr = str.getBytes();
		int count = 0;
		for(int x = len-1; x>=0; x--)
		{
			if(arr[x]<0)
			{
				count++;
			}
			else
				break;
		}

		if(count%2==0)
			return new String(arr,0,len);
		else
			return new String(arr,0,len-1);
	}
}