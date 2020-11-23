package APP;

import java.util.Scanner;

public class APP {

	public static void main(String[] args) throws  InterruptedException {
		while (true){
             Thread.sleep(100);
        	 int x=(int)Math.floor(Math.random()*(101));
             int y=(int)Math.floor(Math.random()*(101));
        System.out.println("R("+x+","+y+")");
	}}

}


