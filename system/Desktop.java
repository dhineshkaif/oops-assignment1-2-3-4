package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("45 inch");
	}

	public static void main(String[] args) {

     	Desktop dell = new Desktop();
     	dell.desktopSize();
     	dell.computerModel();
//		single inheritance
     	
	}

}
