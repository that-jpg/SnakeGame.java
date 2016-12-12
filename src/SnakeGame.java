import java.util.Scanner;

/**
 * Created by vntjomg on 12/12/16.
 */
public class SnakeGame {
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.initialize();

        screen.setApple();
        Snake snake = new Snake();

        screen.redraw(snake);




        System.out.print("Enter something:");
        while(true) {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            screen.redraw(snake);
        }
    }
}
