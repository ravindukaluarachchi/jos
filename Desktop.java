import java.util.*;
class Desktop{
	Desktop(){
		drawDesktop();
	}
	void drawDesktop(){
		System.out.print("\u001b[2J");
		System.out.print("\u001b[H");
		for(int i=0;i<23;i++){
			System.out.print("\033[1;43m                                                                                ");
		}
                System.out.print("\u001b[H");    
		System.out.println("\u001b[44m                                                                                ");               
                System.out.print("\u001b[24;0H");    
		System.out.print("\u001b[44m                                                                                ");
		System.out.print("\u001b[H \u001b[44m <>                                Main Menu");
		System.out.print("\u001b[24;65H\u001b[44mMonday 11:06 AM");

		System.out.print("\u001b[4;8H\u001b[46m      \u001b[0m");
		System.out.print("\u001b[5;8H\u001b[46m      \u001b[0m");
		System.out.print("\u001b[6;8H\u001b[46m      \u001b[0m");
		System.out.print("\u001b[7;8H\u001b[46m      \u001b[0m");
		System.out.print("\u001b[8;6H\u001b[46m          \u001b[0m");
		System.out.print("\u001b[9;7H\u001b[44mComputer\u001b[0m");
		System.out.print("\u001b[5;9H\u001b[41m    \u001b[0m");
		System.out.print("\u001b[6;9H\u001b[41m    \u001b[0m");
		
		System.out.print("\u001b[4;25H\u001b[47m       \u001b[0m");
		System.out.print("\u001b[5;25H\u001b[47m\u001b[31m _____ \u001b[0m");
		System.out.print("\u001b[6;25H\u001b[47m\u001b[31m _____ \u001b[0m");
		System.out.print("\u001b[7;25H\u001b[47m\u001b[31m _____ \u001b[0m");
		System.out.print("\u001b[8;25H\u001b[47m       \u001b[0m");
		System.out.print("\u001b[9;23H\u001b[44mText Editor\u001b[0m");

		System.out.print("\u001b[4;40H\u001b[45m           \u001b[0m");
		System.out.print("\u001b[5;40H\u001b[0m  >        ");
		System.out.print("\u001b[6;40H\u001b[0m           ");
		System.out.print("\u001b[7;40H\u001b[0m           ");
		System.out.print("\u001b[8;40H\u001b[0m           ");
		System.out.print("\u001b[9;43H\u001b[44mJTerm\u001b[0m");

		
		System.out.print("\u001b[5;60H\u001b[47m           ");
		System.out.print("\u001b[6;60H\u001b[47m\u001b[33m   JAVA\u001b[36mOS  ");
		System.out.print("\u001b[7;60H\u001b[47m           ");
		System.out.print("\u001b[9;63H\u001b[44mAbout\u001b[0m");

		System.out.print("\u001b[21;55H\u001b[0m                          ");
		System.out.print("\u001b[22;55H\u001b[0m  Run \u001b[47m                  \u001b[0m  ");
		System.out.print("\u001b[23;55H\u001b[0m                          ");


		System.out.print("\u001b[0m");
		input();
	}
	void input(){
		Scanner scn=new Scanner(System.in);
		System.out.print("\u001b[22;61H\u001b[47m");
		String cmd=scn.nextLine();
		System.out.print("\u001b[0m");
		if(cmd.equals("Text Editor")){
			new TextEditor();
			drawDesktop();
		}else if(cmd.equals("JTerm")){
			new JTerm();
			drawDesktop();
		}else if(cmd.equals("halt")){
			new Halt();
		}
		try{System.in.read();}catch(Exception e){}
	}
}
