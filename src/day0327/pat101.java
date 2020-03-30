import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class pat101
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] inputNumStr = in.nextLine().split("\\s+");
		int[] inputNum = new int[inputNumStr.length]; //输入的数，存入数组中
		
		for(int i = 0; i <= inputNumStr.length-1; i++)
		{
			inputNum[i] = Integer.parseInt(inputNumStr[i]);
		}
		
		List<Integer> list = new ArrayList<>(); 
		int xiShuInput;
		int zhiShuInput;
		for(int i = 0; i <= inputNum.length-2; i += 2)
		{
			xiShuInput = inputNum[i];
			zhiShuInput = inputNum[i+1];
			
			if(xiShuInput==0 && zhiShuInput==0)
			{
				list.add(0);
				list.add(0);
			}
			else if (xiShuInput==0 && zhiShuInput!=0)
			{
				
			}
			else if(xiShuInput!=0 && zhiShuInput==0)
			{
				
			}
			else if(xiShuInput!=0 && zhiShuInput!=0)
			{
				list.add(inputNum[i] * inputNum[i+1]);
				list.add(inputNum[i+1] - 1);
			}
		}
		
		if(list.size() == 0)
		{
			System.out.println("0 0");
		}
		else
		{
			for(int i = 0; i <= list.size()-1; i++)
			{
				System.out.print(list.get(i));
				if(i != list.size()-1)
				{
					System.out.print(" ");
				}
			}
		}
	}
}