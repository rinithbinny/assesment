package assessment;

import java.util.*;  


class country{
	String name;
	public country(String name,List<State> list) {
		super();
		this.name = name;
		this.list=list;
	}
	List<State> list=new ArrayList<State>();  

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<State> getList() {
		return list;
	}
	public void setList(List<State> list) {
		this.list = list;
	}
}
class State{
	public State(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;
}
public class program3 {
	public static void main(String[] args)  {
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter  number- ");  
		HashMap<String, List<State>> myMaps = new HashMap<String, List<State>>();
		int nums= sc.nextInt(); 
		for(int i=0;i<nums;i++) {
			String input=sc.next();
			String[] arrSplit = input.split("/");
			if(myMaps.containsKey(arrSplit[0])) {
				 List<State> abc=myMaps.get(arrSplit[0]);
				 State a=new State(arrSplit[1]);
				 abc.add(a);
				 myMaps.put(arrSplit[0], abc);
			}
			else {
				List<State> list=new ArrayList<State>();
				State a=new State(arrSplit[1]);
				list.add(a);
				myMaps.put(arrSplit[0], list);

				
			}

		}
		myMaps.entrySet().forEach(entry -> {
			
			
		    System.out.println(entry.getKey() + " ");
		    country a=new country(entry.getKey(),entry.getValue());
		    
		    for (int i=0; i<entry.getValue().size(); i++)
		    {
		        System.out.println("--"+entry.getValue().get(i).name);
		    }
		});
	}

}
