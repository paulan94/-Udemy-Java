class AgeCalc {

	public static void main (String[] args) {
		
		// Setting up variables
		int yob = Integer.parseInt(args[1]); // year of birth
		int current = Integer.parseInt(args[0]); // current year
		int age = current - yob; // age calculation
		// Has the person had their birthday this year?
		boolean hadBday = Boolean.parseBoolean(args[2]);
		
		
		if (hadBday) {
			
			System.out.println("You've already had your birthday!");
			
			} else {
				
				age--;
				System.out.println("You've not had your birthday!");
				
			}
		
		System.out.println("You are " + age + " years old!");
		
	}

}