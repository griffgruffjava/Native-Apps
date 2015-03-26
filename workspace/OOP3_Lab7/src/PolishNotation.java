import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class PolishNotation {
	public static void main(String args[])
	{
		LinkedList<String> line = new LinkedList<String>();
		int a=0,b=0;
		try
		{
//			File file = new File("pnB");
			File file = new File("polishNotation");
			Scanner sc = new Scanner(file);
			while(sc.hasNext())
			{
				line.add(sc.next());
				System.out.println(((LinkedList<String>) line).getLast());
			}
			
		
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		String pn1 = line.pop();
		String pn2 = line.pop();
		String pnOperator;
		while(pn2.charAt(0)!='Q')
		{
//			pn2 =line.pop();	
			pnOperator =line.pop();
			System.out.println(pn1+pnOperator+pn2);
			line.push(doComp(pn1,pn2,pnOperator));
			pn1=line.pop();
			pn2 =line.pop();
		}
		
		System.out.print("The answer is "+pn1);
		
		
	}
	
	public static String doComp(String pn1,String pn2,String pnOper)
	{
		int p1 = Integer.parseInt(pn1);
		int p2 = Integer.parseInt(pn2);
		int answer;
		String ans="";
		
		if(pnOper.equals("+"))
		{
			answer=p1+p2;
			return ans+=answer;
		}
		else if(pnOper.equals("-"))
		{
			answer=p1-p2;
			return ans+=answer;
		}
		else if(pnOper.equals("/"))
		{
			answer=p1/p2;
			return ans+=answer;
		}
		else
		{
			answer=p1*p2;
			return ans+=answer;
		}
		

	}
	
}















