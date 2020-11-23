package APP;

import java.util.Scanner;

public class APP {

	public static void main(String[] args) {
		while (true){
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();
        if(i==1) {
        	 int x=(int)Math.floor(Math.random()*(101));
             int y=(int)Math.floor(Math.random()*(101));
        System.out.println("R("+x+","+y+")");
	}}

}
}

