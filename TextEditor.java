import java.util.Scanner;
class TextEditor{
	TextEditor(){
		System.out.println("\u001b[6;18H\u001b[44m\u001b[32m [T]Text Editor                          X ");
		System.out.println("\u001b[7;18H\u001b[45m\u001b[34m File  Edit Help                           ");
		for(int i=8;i<18;i++){
			System.out.println("\u001b["+i+";18H\u001b[47m                                           ");
		}
	
		System.out.println("\u001b[0m");
		checkCommand();
	}
	int j=7;
	String s="";
	void readText(){
		System.out.print("\u001b["+j+";19H\u001b[47m\u001b[34m");
		Scanner input=new Scanner(System.in);
		s=input.nextLine();
		System.out.print("\u001b[0m");			
	}
	void checkCommand(){
		while(!s.equals("$quit")){
			j++;
			readText();
		}

	}

}
