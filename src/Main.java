import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }

    private static void task1() {
        int[] arr = generateRandomArray();
// Задание №1. Посчитать сумму всех выплат за месяц
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum += arr[i];
    }
        System.out.println("Сумма трат за месяц составила "+sum+" рублей");
        System.out.println();

// Задание №2. Найти максимальную и минимальную траты
        int maxArr = 99_999;
        int minArr = 200_001;
        for (int i=0; i<arr.length; i++) {
            final int current = arr[i];
            if (current > maxArr) {
                maxArr = current;
            }
            if ((current < minArr)) {
                minArr = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minArr+" рублей." +
                " Максимальная сумма трат за день составила "+maxArr+" рублей");
        System.out.println();

// Задание №3. Найти среднюю сумму трат за месяц
        float newSum = 0f;
        for (int o=0; o<arr.length; o++) {
            newSum += arr[o];
        }
        float average = newSum/30f;
        System.out.println("Средняя сумма трат за месяц составила "+average+" рублей");
        System.out.println();

// Задание №4. Корректно отобразить имя и фамилию сотрудника
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1; i>=0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}