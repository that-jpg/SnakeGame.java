import java.util.Scanner;

/**
 * Created by vntjomg on 12/12/16.
 */
public class SnakeGame {


    public static void main(String[] args) {
        final int HEIGHT = 5;
        final int WIDTH = 5;

        Snake snake = new Snake();
        Apple apple = new Apple(HEIGHT, WIDTH);

        Screen screen = new Screen(snake, apple, HEIGHT, WIDTH);


        screen.redraw(snake);

        System.out.print("Enter something:");
        while(true) {
            System.out.print("\n ---- \n");
            Scanner scanner = new Scanner(System.in);
            String movement = scanner.nextLine();

            if(!screen.moveSnake(movement)) {
                break;
            }

            screen.redraw(snake);
        }
        System.out.println("--------- GAME OVER ---------");
        System.out.println("Your final score is " + screen.score);

    }
}
