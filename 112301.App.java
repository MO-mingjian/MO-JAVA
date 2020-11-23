package APP;

import java.util.Scanner;

public class APP {

	public static void main(String[] args) {
		while (true){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int x=(int)Math.floor(Math.random()*(100));
        int y=(int)Math.floor(Math.random()*(100));
        System.out.println("R("+x+","+y+")");
	}}

}
