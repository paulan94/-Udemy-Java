class Calc{
	public static void main(String[] args){

		try {

			if (args.length == 0){
				System.out.println("Program Error: No args inputted");
			}
			else if (args.length < 3){
				System.out.println("Less than 3 args. We need 2 numbers and an operation.\n Ex: 2 x 5");
			}

			else if (args.length > 3){
				System.out.println("Too many damn args bro");
			}

			else {
				double a = Double.parseDouble(args[0]);
				double b = Double.parseDouble(args[2]);
				String op = args[1];
		
				double p = a + b;
				double s = a - b;
				double m = a * b;
				double d = a / b;
		
				System.out.println("\n================");
				System.out.println("\nWelcome to Calc!");
				System.out.println("\n================");
				System.out.println("\nYou have entered: " + a + " " + op + " " +b);
		
				switch (op){
					case "+":
					System.out.println("\n" + a + " " + op + " " + b + " = " + p);
					break;
		
					case "-":
					System.out.println("\n" + a + " " + op + " " + b + " = " + s);
					break;
		
					case "x":
					System.out.println("\n" + a + " " + op + " " + b + " = " + m);
					break;
		
					case "/":
					System.out.println("\n" + a + " " + op + " " + b + " = " + d);
					break;
		
					default:
					System.out.println("Testing in here");
				}
			}
		}
		catch (NumberFormatException e ){
			System.out.println("NumberFormatException occured bro");
			System.out.println("First and third arg must be numbers");
			System.out.println("Error Details: " + e);
		}
		catch (Exception e){
			System.out.println("PROGRAM ERROR:");
			throw e;
		}
	}
}