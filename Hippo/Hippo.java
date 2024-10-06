public class Hippo extends Animal{
	public Hippo(){}

	public Hippo(String name){
		super(name);
		System.out.println("Creating a Hipoo named "+super.getName());
	}
}