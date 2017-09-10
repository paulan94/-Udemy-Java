class Casting{
	public static void main(String[] args){
		String myStr = "94.3231";
		double myDub = Double.parseDouble(myStr);
		float myFlo = (float) myDub;
		int myInt = (int) myFlo;

		System.out.println(myInt);

	}
}