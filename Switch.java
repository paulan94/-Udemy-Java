class Switch{

	public static void main(String[] args){

		if (args.length == 0){
			System.out.println("No args specified");
		}

		else{
			int x = Integer.parseInt(args[0]);

			switch (x){
				case 1: System.out.println("1 is fun");
				break;

				case 2: System.out.println("2 is great");
				break;

				case 3: System.out.println("3 is free");
				break;

				case 4: System.out.println("4 is more");
				break;

				case 5: System.out.println("5 is live");
				break;

				case 6: System.out.println("6 is wix");
				break;

				case 7: System.out.println("7 is eleven"); break;
				case 8: System.out.println("8 is late"); break;
				case 9: System.out.println("9 is wine"); break;

				default: System.out.println("Error, invalid number");

			}

			
		}
		
	}
}