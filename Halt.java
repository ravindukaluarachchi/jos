class Halt{
	Halt(){
		System.out.print("\u001b[2J\u001b[0m\u001b[0;0H");
		System.out.print("terminating remaining processes.....");
		for(int i=0;i<89000;i++){
		    System.out.print("\b-");
		    System.out.print("\b\\");
		    System.out.print("\b|");
		    System.out.print("\b/");			
		}
		System.out.println("\b");
		System.out.println("system halt.");
		try{Thread.sleep(1700);}catch(Exception e){}
		System.out.println("\u001b[2J");
	}
}
