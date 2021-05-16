package grupas_darbs_2;

import java.util.Scanner;

public class Main_1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("\ncomp");
		System.out.println("decomp");
		System.out.println("size");
		System.out.println("equal");
		System.out.println("about");
		System.out.println("exit");
		System.out.println("\nWrite your desired command");
		
		String choise;

		loop: while (true) {
			choise = sc.nextLine();

			switch (choise) {
            case "comp":
                comp();
                break;
            case "decomp":
                decomp();
                break;
            case "size":
                size();
                break;
            case "equal":
                equal();
                break;
            case "about":
                about();
                break;
            case "exit":
                break loop;
            default:
                System.out.println("wrong command");
        }
	}
		sc.close();
	}
}