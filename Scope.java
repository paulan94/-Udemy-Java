class Scope{

	public static String txt = "ClassString";

	public static void main(String[] args){
		String txt = "mainString";
		System.out.println(Scope.txt);
		System.out.println(txt);
		sec();
	}

	public static void sec(){
		String txt = "";
	}
}