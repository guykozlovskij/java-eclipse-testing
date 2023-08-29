
 class HelloWorld {

	 @SuppressWarnings("unused")
	public static void main(String[] args) {
		    System.out.println("Hello");

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
		    
		  }

	 public static String addExclamationPoint(String s) {
		 
		 return s + "!";
	 }
}
