class Main{
	private String name;
	private int id;
	
	public Main(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	//Accessing private variable
	public void display(){
		System.out.println(name);
		System.out.println(id);
	}

	//getter setter for Name
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	//getter setter for Id
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
}

public class Encapsulation{
	public static void main(String [] args){
		Main e = new Main("Rushikesh", 100);
		
		//System.out.println(e.name); //we can't access because of private
		e.display();

		e.setName("Rohan");
		System.out.println(e.getName());
		e.setId(200);
		System.out.println(e.getId());

		e.setName("Tushar");
		System.out.println(e.getName());
		e.setId(200);
		System.out.println(e.getId());
	}
}	