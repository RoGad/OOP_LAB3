import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MainRearrangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод списка от пользователя
        System.out.println("Введите элементы списка через пробел:");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        // Создание списка и заполнение его элементами
        ArrayList<Integer> list = new ArrayList<>();
        for (String element : elements) {
            list.add(Integer.parseInt(element));
        }

        // Перестановка элементов списка
        Rearrange.rearrangeList(list);

        // Сортировка списка по возрастанию
        Collections.sort(list);

        // Вывод результата
        System.out.println("Результат:");
        System.out.println(list);
    }
}
