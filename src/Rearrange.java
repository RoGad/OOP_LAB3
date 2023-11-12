import java.util.ArrayList;

class Rearrange {
    public static void rearrangeList(ArrayList<Integer> list) {
        int size = list.size();
        int positiveIndex = 0;

        for (int i = 0; i < size; i++) {
            if (list.get(i) >= 0) {
                // Находим первый отрицательный элемент
                while (positiveIndex < size && list.get(positiveIndex) >= 0) {
                    positiveIndex++;
                }

                // Переставляем положительный элемент в начало
                if (positiveIndex < size) {
                    int temp = list.get(i);
                    list.set(i, list.get(positiveIndex));
                    list.set(positiveIndex, temp);
                    positiveIndex++;
                }
            }
        }
    }
}
