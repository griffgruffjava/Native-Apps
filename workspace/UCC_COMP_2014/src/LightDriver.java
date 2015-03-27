import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class LightDriver
{
	public List<LightSwitch> switches = new ArrayList<LightSwitch>();
	public List<Gate> gates = new ArrayList<>();
	public List<Bulb> bulbs = new ArrayList<>();
	public List
	
	public LightDriver(){

		/*
		Scanner in = null;
		try{
		in = new Scanner(new File("file/ya.txt"));
		}
		catch (Exception ex)
		{
			
		}*/
		Scanner in = new Scanner(System.in);
		int numOfLightSwitches = in.nextInt();
		int numOfBulbs = in.nextInt();
		int numOfGates = in.nextInt();
		
		//   
		
		for (int i=0; i<numOfLightSwitches; i++)
		{
			int identifier = in.nextInt();
			int state = in.nextInt();
			
			
			switches.add(new LightSwitch(identifier,
					                     state));
		}
		for (int i=0; i<numOfBulbs; i++)
		{
			int identifier = in.nextInt();
			int sourceOne = in.nextInt();
			
			bulbs.add(new Bulb(identifier,
					           sourceOne));
		}
		for (int i=0;i<numOfGates;i++)
		{
			int identifier = in.nextInt();
			int sourceOne = in.nextInt();
			int sourceTwo = in.nextInt();
			int gateType = in.nextInt();
			
			gates.add(new Gate(identifier,
					           sourceOne,
					           sourceTwo,
					           gateType));
		}
		
	}
	
	
	public static void main(String args[])
	{
		LightDriver app = new LightDriver();
	}
	private class Bulb extends SwitchesAndGates
	{
		public int onlySource;
		
		public Bulb(int identifier, int onlySource)
		{
			super.identifier = identifier;
			this.onlySource = onlySource;
			super.state = -1;
		}
		
		
	}
	public class Gate extends SwitchesAndGates
	{
		
		public Gate(int identifier, int sourceOne, int sourceTwo, int gateType)
		{
		
			super.identifier = identifier;
			this.sourceOne = sourceOne;
			this.sourceTwo = sourceTwo;
			this.gateType = gateType;
			super.state = -1;
		}
		
		
	}
	private class LightSwitch extends SwitchesAndGates
	{
		public LightSwitch(int identifier,int state)
		{
			super.identifier=identifier;
			super.state=state;
		}
	}
	private class SwitchesAndGates{
		public int identifier;
		public int state;
		public int sourceOne;
		public int sourceTwo;
		public int gateType;
	}
	
	public void setGateStates(){
		/*
		Iterator<Gate> it = gates.iterator();
		while (it.hasNext())
		{
			int count=0;
			Gate g1 = it.next();
			int sourceSwitch;
			int state1;
			int state2;
			for (LightSwitch l : switches)
			{
				if (g1.sourceOne == l.identifier)
				{
					count++;
					state1 = l.state;
				}
				if (g1.sourceTwo == l.identifier)
				{
					count++;
					state2 = l.state;
				}
			}
			if (count == 2)
				
			//if (g1.sourceOne== )
		
		}
	 */
	}

}
