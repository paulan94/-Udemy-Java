class Ghost{

	private String says; //only modified within ghost class

	public Ghost(String x){
		says = x;
	}

	public void speak(){
		System.out.println("The ghost says " + says);
	}
}