import java.io.*;
import java.util.Scanner;

public class Main {

    //* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).
    public static boolean fileContainsWord(String fileName, String word) throws FileNotFoundException {
        byte[] fileBytes = readFile(fileName).getBytes();
        byte[] wordBytes = word.getBytes();

        int counter = 0;

        for (int i = 0; i < fileBytes.length; i++) {
            if (fileBytes[i] == wordBytes[counter]) {
                counter++;
                if (counter == wordBytes.length) {
                    return true;
                }
            } else {
                counter = 0;
            }
        }

        return false;
    }

    public static void writeFile(String fileName, String sentence) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);

        for (int i = 0; i < 5; i++) {
            fos.write(sentence.getBytes());
        }

        fos.flush();
        fos.close();
    }

    public static String readFile(String fileName) throws FileNotFoundException {
        String result = "";

        Scanner sc = new Scanner(new FileInputStream(fileName));
        while (sc.hasNext()) {
            result = result + sc.nextLine() + "\n";
        }
        sc.close();

        return result;
    }

    // Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
    public static String concatFiles(String fileName1, String fileName2) throws FileNotFoundException {
        return readFile(fileName1) + readFile(fileName2);
    }

    public static void main(String[] args) throws IOException {
        InputStream in;
        OutputStream out;

        final String sentence1 = "а за деревом дерево, \n";
        final String sentence2 = "а за деревом куст. А за кустом снова дерево, \n";
        final String fileName1 = "test.txt";
        final String fileName2 = "test1.txt";

        // Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет)
        writeFile(fileName1, sentence1);
        writeFile(fileName2, sentence2);

        System.out.println(concatFiles(fileName1, fileName2));

        // Это вот встроенные методы, которые фурычат.
        System.out.println(readFile(fileName1).contains("дерево"));
        System.out.println(readFile(fileName1).indexOf("дерево") != -1);
        // Мой метод работает тоже.
        System.out.println(fileContainsWord(fileName1, "дерево"));
        System.out.println(fileContainsWord(fileName1, "деревоо"));
        System.out.println(fileContainsWord(fileName2, "дерево"));
        System.out.println(fileContainsWord(fileName2, "куст"));
    }
}
