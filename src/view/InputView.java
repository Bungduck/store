package view;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public int getId(){
        return scanner.nextInt();
    }

}
