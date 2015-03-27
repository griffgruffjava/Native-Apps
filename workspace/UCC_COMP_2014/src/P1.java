import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class P1 {
	public static void main(String args[])
	{  
		int runTotal=0;
		
		
		try{
			File file = new File("P1_Test2");
			Scanner sc = new Scanner(file);
			
			int checkSum = convertFromBinary(sc.next());
			
			for(int i=1;i<=checkSum;i++)
			{
				runTotal+=convertFromBinary(sc.next());
//				System.out.println("On "+i+" loop, total is "+runTotal);
			}
		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		System.out.println(convertToBinary(runTotal));
			
		
	}
	
	public static int convertFromBinary(String binaryNum)
	{
		String num = ""+binaryNum;
		int total=0;
		
		
		for(int i=0;i<32;i++)
		{
			if(num.charAt(i)=='1')
			{
				total+=Math.pow(2, (32-(i+1)));
			}
		}
		
		return total;
	}
	
	
	public static String convertToBinary(int decimalNum)
	{
		String binaryNum="";
		
		for(int i=0;i<32;i++)
		{
			if(Math.pow(2, (32-(i+1)))<=decimalNum)
			{
				binaryNum+="1";
				decimalNum-=(int)Math.pow(2, (32-(i+1)));
			}
			else
			{
				binaryNum+="0";
			}
				
		}
		
		
		return binaryNum;
	}
}


















