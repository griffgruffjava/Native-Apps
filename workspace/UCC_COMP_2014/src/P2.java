 import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class P2 {
	public static void main(String args[])
	{
		try{
			File file = new File("P2a");
			Scanner sc = new Scanner(file);
			
			String seq = sc.next();
			String goToLine = sc.next();
//			System.out.println(seq);
//			System.out.println(goToLine);
			String ans = findAns(seq,"2");
			
			
//			int checkSum = convertFromBinary(sc.next());
//			
//			for(int i=1;i<=checkSum;i++)
//			{
//				runTotal+=convertFromBinary(sc.next());
////				System.out.println("On "+i+" loop, total is "+runTotal);
//			}
		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
	
	public static String findAns(String s,String n)
	{
		int finishLine=Integer.parseInt(n);
		System.out.println("finish line is "+finishLine+"\n"+s);
		String nextLine="";
		int i = 0;
		int currentLine = 1;
		while(currentLine<=finishLine)
		{
			System.out.println("while1");
			while(s.length()>=i+1)
			{
				System.out.println("while2");
				char targetNum=s.charAt(i);
				int count=1;
				System.out.print("sLength is "+s.length());
				while(s.length()>=i+2)//while3
				{
					System.out.println("while3");
					if(targetNum==s.charAt(i+1))
					{	
						System.out.println("h1 "+s);
//						System.out.println(s.charAt(i+1));
						System.out.println("h2");
						while(((i+1)<s.length())&&targetNum==s.charAt(i+1))
						{
							System.out.println("h3");
							count++;
							
						}
					}
					
				//	i++;
					nextLine+=count+""+targetNum;
					count=1;
					System.out.println("while2-end");
//					System.out.println("Current count="+count+"\ni="+i+"\ns.len="+s.length()+"\ns is "+s);
//					currentLine++;
				}
				i++;
			}
			
			currentLine++;
			s=nextLine;
			System.out.println("\ni="+i+"\ns.len="+s.length()+"\ns is "+s);
		}
		//System.out.println(nextLine);
		
		return "";
	}
}



















