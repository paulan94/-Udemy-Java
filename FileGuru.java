class FileGuru{
	public static void main(String[] args){

		try{
			if (args.length == 0){
				System.out.println("No args specified");
				System.out.println("Please enter a file or directory name");
				System.out.println("and an option ([-ls | -rf | -wf]");
			}
			else if (args.length == 1){
				System.out.println("Only 1 arg specified, enter 2nd option");

			}

			if (args[1].equals("-ls")){
				//then we want to list stuff
				Actions lister = new Actions(args[0]);
				lister.list();

			}
			else if (args[1].equals("-rf")){

				Actions reader = new Actions(args[0]);
				reader.read();

			}
			else if (args[1].equals("-wf")){
				
				Actions writer = new Actions(args[0]);
				writer.write();
			}
		}
		catch (Exception e){
			//Do nothing.
			//empty catch block is usually bad practice
			System.out.println("Error was " + e);
		}
	}
}