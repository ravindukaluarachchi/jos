import java.util.Scanner;
class Jos{
	static void clearScreen(){
		System.out.print("\u001b[2J");
	}
	static String print(String cont,String colour){
		String fin=null;
		if(colour.equals("red")){
			System.out.print("\u001b[31m"+cont+"\u001b[0m");
			fin="\u001b[31m"+cont+"\u001b[0m";
		}else if(colour.equals("blue")){
			System.out.print("\u001b[34m"+cont+"\u001b[0m");
		}else if(colour.equals("white")){
			System.out.print("\u001b[37m"+cont+"\u001b[0m");
		}else if(colour.equals("yellow")){
			System.out.print("\u001b[33m"+cont+"\u001b[0m");
		}else if(colour.equals("cyan")){
			System.out.print("\u001b[36m"+cont+"\u001b[0m");
		}
		return fin;
	}
	static void print(String cont,String colour,int bold){
		if(colour.equals("red")){
			System.out.print("\u001b[31m \u001b[1m"+cont+"\u001b[0m");
		}else if(colour.equals("blue")){
			System.out.print("\u001b[34m \u001b[1m"+cont+"\u001b[0m");
		}else if(colour.equals("white")){
			System.out.print("\u001b[37m \u001b[1m"+cont+"\u001b[0m");
		}else if(colour.equals("yellow")){
			System.out.print("\u001b[33m \u001b[1m"+cont+"\u001b[0m");
		}else if(colour.equals("cyan")){
			System.out.print("\u001b[36m \u001b[1m"+cont+"\u001b[0m");
		}
	}
	static void goHome(){
		System.out.print("\u001b[H");
	}
	static void goEnd(){
		System.out.print("\u001b[E");
	}
	static void print(String cont,int x,int y){
		System.out.println("\u001b["+y+";"+x+"H"+cont+" \u001b[0m");	
	}
	static void boot(){
		clearScreen();
		goHome();
		print("Welcome to ","white");
		print("Java","cyan");	
		print("OS","yellow");
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
		System.out.println("\ninitializing grnd.img...");
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
		System.out.print("loading kernel modules.....");
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
		System.out.print(".");
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
		System.out.println(".");
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
		System.out.print("Loading GUI...");
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
		System.out.print(".");
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
		System.out.print(".");
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
		System.out.print(".");
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
		System.out.print(".");
		try{
		Thread.sleep(1000);
		}catch(Exception e){}
		for(int i=0;i<90000;i++){
		    System.out.print("\b-");
		    System.out.print("\b/");
		    System.out.print("\b|");
		    System.out.print("\b\\");			
		}
	}
	static String name,password;
	static void drawLogin(){
		clearScreen();
		System.out.print("\u001b[0;0H");
		System.out.print("\033[1;45m***                             user login                                   ***");
		
		print("***                                                                          ***\u001b[0m",0,22);
		print("\u001b[44m                             \u001b[0m",23,7);
		for(int i=8;i<14;i++){
			print("\u001b[47m                             \u001b[0m",23,i);
		}
		print("\u001b[47m     \u001b[34mUsername :\u001b[0m          ",23,9);
		print("\u001b[47m     \u001b[34mPassword :\u001b[0m          ",23,11);
		System.out.print("\u001b[9;38H");
		Scanner scn=new Scanner(System.in);
		name=scn.nextLine();
		System.out.print("\u001b[11;38H");		
		password=scn.nextLine();
		
	}
	static void drawMessage(String title,String message){
		print("\u001b[44m                                          X \u001b[0m",19,7);
		for(int i=8;i<12;i++){
			print("\u001b[47m                                            \u001b[0m",19,i);
		}
		print("\u001b[44m\u001b[37m"+title,20,7);
		print("\u001b[47m\u001b[34m"+message,27,9);
		print("\u001b[47m\u001b[43m  Ok  ",38,10);
				

	}
	public static void main(String args[]){
		System.out.print(" Please scale your terminal window to 80x24 and press enter to continue!");
		try {System.in.read();}catch(Exception e){} 
		boot();
		drawLogin();
		if(name.equals("ravindu")){
			int i;
			for(i=0;i<3;i++){	
				if (password.equals("***")){
					i=3;
					drawMessage("Login Sucess","user "+name+" is granted permission");
					try {System.in.read();}catch(Exception e){}
					drawMessage("Error","Failed to Load Mouse Drivers.");
					try {System.in.read();}catch(Exception e){}
					loadDesktop();
				}else{
					drawMessage("Login failed!","Wrong password.");
					try {System.in.read();}catch(Exception e){}
					drawLogin();
				}
			}
		}else{
			drawMessage("Login failed!","invailed user name.");
	        	try {System.in.read();}catch(Exception e){}
			drawLogin();
		}
	        try {System.in.read();}catch(Exception e){}
		clearScreen();
   
    
    
		
		
	}
	static void loadDesktop(){
		
		new Desktop();
	}

}
