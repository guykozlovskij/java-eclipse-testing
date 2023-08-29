import java.util.ArrayList;

class HelloWorld {

	 @SuppressWarnings("unused")
	public static void main(String[] args) {
		    System.out.println("Hello");
		    
// class is a java file that helps us make objects

//		    int a = 5;
		    char b = 'i';
		    long c = 400;
		    double d = 3.2;

		    String name = "Susan";
		    System.out.println(name.toUpperCase());
		    
		    
		    String exclaim =  addExclamationPoint("hot dogs");
		    System.out.println(exclaim);
		    
		    
		    
		    Animal a = new Animal();
		    String dog = a.iAmDog();
		    System.out.println(dog);
		    
		    
		    ArrayList<Integer> arr = new ArrayList<Integer>();
		    
		    a.doStuff();
		    
		  }

	 public static String addExclamationPoint(String s) {
		 
		 return s + "!";
	 }
}
