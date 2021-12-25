//Task2
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class lab5 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N = 0;
            try {
                System.out.println("Введите размерность массива:");
                N = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Введите целое число.");
                System.exit(1);
            }
            if (N > 0) {
            } else {
                System.out.println("Размерность не может быть равна 0 или быть отрицательной.");
                return;
            }
            ArrayList<Integer> list = new ArrayList<>();
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < N; i++) {
                list.add(in.nextInt());
            }
            System.out.println("Оригинальный массив: " + list);

            int X = 0;
            try{
                System.out.println("Введите элемент, который хотите удалить");
                X = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка. Введите целое число.");
                System.exit(1);
            }

            while (list.contains(X)) {
                list.remove((Integer) X);
            }
            System.out.println("Массив после удаления элемента "+ X +": " + list);
            in.close();
    }
}
