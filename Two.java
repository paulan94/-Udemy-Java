class Two extends One {

	public static void main(String[] args){

		System.out.println("This is from Two.java class");

		txt();
		Three.msg();

	}
}

class Three {
	public static void msg(){
		System.out.println("this is msg from three.java class");

	}
}