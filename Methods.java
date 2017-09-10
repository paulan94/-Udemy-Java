class Methods{
	public static void main(String[] args){
		System.out.println("Hello World");
		System.out.println("Hello World2");

		for (int i = 0; i < 5; i++){
			num();
		}
	}

	public static void num(){
		double x = Math.random() * 100;
		int myInt = (int) x;
		System.out.println(x);
	}
}