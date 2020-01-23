import java.util.Random;
import java.util.Scanner;

public class lesson_03 {
    public static char [][] field;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static Random RANDOM = new Random();
    public static Scanner SCANNER = new Scanner(System.in);

    public static void initField() {
        field = new char[SIZE][SIZE];
        for(int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                field [i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printField() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn(){
        int x;
        int y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        }
        while(!isCellValid(x, y) || !isCellEmpty(x, y));
        field[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if(x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        return true;
    }

    public static boolean isCellEmpty(int x, int y) {
        if (field[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        field[y][x] = DOT_O;
    }

    public static boolean isDraw() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char symb) {
        boolean win = true;

        for (int y = 0; y < SIZE; y++) {
            win = true;

            for (int x = 0; x < SIZE; x++) {
                if (field[y][x] != symb) {
                    win = false;
                    break;
                }
            }

            if (win) {
                return true;
            }
        }

        for (int y = 0; y < SIZE; y++) {
            win = true;

            for (int x = 0; x < SIZE; x++) {
                if (field[x][y] != symb) {
                    win = false;
                    break;
                }
            }

            if (win) {
                return true;
            }
        }

        for (int y = 0; y < SIZE; y++) {
            win = true;

            if (field[y][y] != symb) {
                win = false;
                break;
            }
        }

        if (win) {
            return true;
        }

        for (int y = 0; y < SIZE; y++) {
            win = true;

            if (field[SIZE - 1 - y][y] != symb) {
                win = false;
                break;
            }
        }

        if (win) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        initField();
        printField();
        while (true) {
            humanTurn();
            printField();
            if (checkWin(DOT_X)) {
                System.out.println("Человек победил.");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья.");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(DOT_O)) {
                System.out.println("Компуктер победил.");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья.");
                break;
            }
        }
        System.out.println("Игра закончена.");
    }
}
