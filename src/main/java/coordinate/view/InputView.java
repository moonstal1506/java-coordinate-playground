package coordinate.view;

import java.util.Scanner;

public class InputView {

    private Scanner scanner = new Scanner(System.in);

    public String input(){
        System.out.println("좌표를 입력하세요.");
        return scanner.nextLine();
    }

}
