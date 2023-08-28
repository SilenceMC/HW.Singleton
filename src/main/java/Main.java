import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        logger.log("Просим пользователя указать данные для списка");
        System.out.println("Введите размерность создаваемого списка:");
        int number = scan.nextInt();

        System.out.println("Введите ограничение на максимальное число, записываемое в список:");
        int maxValue = scan.nextInt();

        ArrayList<Integer> userList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            userList.add(random.nextInt(maxValue));
        }
        logger.log("Создали и наполняем список");

        System.out.println("Получившийся список: \n" + userList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите число для фильтра вашего списка:");
        int filterValue = scan.nextInt();

        Filter filter = new Filter(filterValue);
        System.out.println("Отфильтрованный список: \n" + filter.filterOut(userList));

        logger.log("Завершаем программу");
    }
}
