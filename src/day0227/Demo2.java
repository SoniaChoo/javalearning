class Demo2 {
    public static void main(String[] args)
	{
		show(0);//15
		show(1);//14
	}	
	public static void show(int i)
	{
		switch(i)
		{	
			case 1:
				i+=1;
			case 4:
				i+=8;			
			case 2:
				i+=4;
			default:
				i+=2;
		}
		System.out.println("i="+i);
	}
}