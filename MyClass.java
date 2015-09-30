public class MyClass implements MakeFig{
	
	public int mySize = 10;
	public String Form = "none";
	
	public boolean setForm(String Form){
		this.Form = Form;
		return true;
	}
	public String getForm(){
		return this.Form;
	}
	public int getSize(){
		return this.mySize;
	}
	public boolean setSize(int Size){
		this.mySize = Size;
		return true;
	}
}

class Main{
	
	public static void main(String []argv){
		
		MyClass test = new MyClass();
		
		test.setForm("Cuadrado");
		System.out.println("Cambio de Forma : " + test.getForm());
		
	}
}
