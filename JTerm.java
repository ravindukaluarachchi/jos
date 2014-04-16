import java.util.Scanner;
class JTerm{
	JTerm(){
		System.out.println("\u001b[6;18H\u001b[44m\u001b[32m [$]JTerm                                X ");
		for(int i=7;i<18;i++){
			System.out.println("\u001b["+i+";18H\u001b[0m                                           ");
		}
	
		System.out.println("\u001b[0m");
		checkCommand();
	}
	int j=7;
	String s="";
	void readText(){
		System.out.print("\u001b["+j+";19H\u001b[37m>");
		Scanner input=new Scanner(System.in);
		s=input.nextLine();
		System.out.print("\u001b[0m");			
	}
	void checkCommand(){
		while(!s.equals("quit")){
			if(s.equals("version")){
				System.out.print("\u001b["+(j+1)+";19H\u001b[37mJAVAOS version 0.1");	
				j++;			
				s="";			
			}else if(s.startsWith("print ")){
				String s1=s.substring(6);
				System.out.print("\u001b["+(j+1)+";19H\u001b[37m"+s1);
				j++;				
				s="";			
			}else{
				j++;
				readText();
			}
			
		}
	}

}
