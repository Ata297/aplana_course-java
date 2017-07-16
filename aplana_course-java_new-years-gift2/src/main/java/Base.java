import sweetnesses.*;

import java.util.Scanner;

/**
 * Входной класс
 *
 * @author Анастасия Вязьмина
 * @version 0.1
 * @since 27.06.2017
 */
public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            helloUser();
            Sweetness[] candies = chooseCandiesInPresent(scanner);
            Sweetness[] jellies = chooseJelliesInPresent(scanner);
            Sweetness[] zephyrs = chooseZephyrsInPresent(scanner);
            Sweetness[] chocolates = chooseChocolatesInPresent(scanner);
            Sweetness[] cakes = chooseCakesInPresent(scanner);

            Sweetness[][] present = сollectPresent(candies, jellies, zephyrs, chocolates, cakes);
            showPresent(present);
            System.out.printf("Цена собранного подарка: %.2f руб.\n", calculateCostPresent(present));
            System.out.printf("Вес собранного подарка: %.2f гр.\n", calculateWeightPresent(present));
        } finally {
            scanner.close();
        }
    };

    /**
     * Выдает приветственную информацию пользователю
     */
    private static void helloUser() {
        System.out.println("Давайте соберем подарок!");
        System.out.println("В доступе есть Конфеты, Желе, Зефир, Шоколад и Кексы.");
    };

    /**
     * Выбирает конфеты в подарок
     *
     * @param scanner общий сканнер для консоли
     * @return конфеты в подарок
     */
    private static Candy[] chooseCandiesInPresent(Scanner scanner) {
        Candy[] candies;
        int count = 0;
        String filling = "";
        System.out.println("Хотите положить конфеты в подарок? (да/нет)");
        if (scanner.next().equals("да")) {
            System.out.println("Сколько положим? (в штуках)");
            count = scanner.nextInt();
            candies = new Candy[count];
            System.out.println("Хотите начинку в конфеты? (да/нет)");
            if (scanner.next().equals("да")) {
                System.out.println("Какую?");
                filling = scanner.next();
            }
            for (int i = 0; i < candies.length; i++) {
                candies[i] = new Candy(filling);
            }
        } else {
            candies = new Candy[count];
        }
        return candies;
    };

    /**
     * Выбирает желе в подарок
     *
     * @param scanner общий сканнер для консоли
     * @return желе в подарок
     */
    private static Jelly[] chooseJelliesInPresent(Scanner scanner) {
        Jelly[] jellies;
        int count = 0;
        Boolean inSugar = false;
        System.out.println("Хотите положить желе в подарок? (да/нет)");
        if (scanner.next().equals("да")) {
            System.out.println("Сколько положим? (в штуках)");
            count = scanner.nextInt();
            jellies = new Jelly[count];
            System.out.println("Желе хотите в сахаре? (да/нет)");
            inSugar = scanner.next().equals("да");
            for (int i = 0; i < jellies.length; i++) {
                jellies[i] = new Jelly(inSugar);
            }
        } else {
            jellies = new Jelly[count];
        }
        return jellies;
    };

    /**
     * Выбирает зефир в подарок
     *
     * @param scanner общий сканнер для консоли
     * @return зефир в подарок
     */
    private static Zephyr[] chooseZephyrsInPresent(Scanner scanner) {
        Zephyr[] zephyrs;
        int count = 0;
        Boolean inChocolate = false;
        System.out.println("Хотите положить зефир в подарок? (да/нет)");
        if (scanner.next().equals("да")) {
            System.out.println("Сколько положим? (в штуках)");
            count = scanner.nextInt();
            zephyrs = new Zephyr[count];
            System.out.println("Зефир хотите в в шоколаде? (да/нет)");
            inChocolate = scanner.next().equals("да");
            for (int i = 0; i < zephyrs.length; i++) {
                zephyrs[i] = new Zephyr(inChocolate);
            }
        } else {
            zephyrs = new Zephyr[count];
        }
        return zephyrs;
    };

    /**
     * Выбирает шоколад в подарок
     *
     * @param scanner общий сканнер для консоли
     * @return шоколад в подарок
     */
    private static Chocolate[] chooseChocolatesInPresent(Scanner scanner) {
        Chocolate[] chocolates;
        int count = 0;
        Boolean withNuts = false;
        System.out.println("Хотите положить шоколад в подарок? (да/нет)");
        if (scanner.next().equals("да")) {
            System.out.println("Сколько положим? (в штуках)");
            count = scanner.nextInt();
            chocolates = new Chocolate[count];
            System.out.println("Шоколад с орехами? (да/нет)");
            withNuts = scanner.next().equals("да");
            for (int i = 0; i < chocolates.length; i++) {
                chocolates[i] = new Chocolate(withNuts);
            }
        } else {
            chocolates = new Chocolate[count];
        }
        return chocolates;
    };

    /**
     * Выбирает кексы в подарок
     *
     * @param scanner общий сканнер для консоли
     * @return кексы в подарок
     */
    private static Cake[] chooseCakesInPresent(Scanner scanner) {
        Cake[] cakes;
        int count = 0;
        String filling = "";
        System.out.println("Хотите положить кексы в подарок? (да/нет)");
        if (scanner.next().equals("да")) {
            System.out.println("Сколько положим? (в штуках)");
            count = scanner.nextInt();
            cakes = new Cake[count];
            System.out.println("Хотите начинку? (да/нет)");
            if (scanner.next().equals("да")) {
                System.out.println("Какую?");
                filling = scanner.next();
            }
            for (int i = 0; i < cakes.length; i++) {
                cakes[i] = new Cake(filling);
            }
        } else {
            cakes = new Cake[count];
        }
        return cakes;
    };

    /**
     * Собирает подарок
     *
     * @param candies конфеты в подарке
     * @param jellies желе в подарке
     * @param zephyrs зефир в подарке
     * @param chocolates шоколад в подарке
     * @param cakes кексы в подарке
     * @return собранный подарок
     */
    private static Sweetness[][] сollectPresent(Sweetness[] candies,
                                              Sweetness[] jellies,
                                              Sweetness[] zephyrs,
                                              Sweetness[] chocolates,
                                              Sweetness[] cakes) {
        Sweetness[][] present = {candies, jellies, zephyrs, chocolates, cakes};
        return present;
    };

    /**
     * Показывает состав подарка
     *
     * @param present подарок
     */
    private static void showPresent(Sweetness[][] present) {
        System.out.println("Состав собранного подарка:");
        boolean isEmpty = true;
        for(int i = 0; i < present.length; i++) {
            if (present[i].length > 0) {
                System.out.print(present[i][0].toString());
                System.out.printf(" - %d штук/а/и\n", present[i].length);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("пусто");
        }
    };

    /**
     * Считает стоимость подарка
     *
     * @param present подарок
     * @return стоимость подарка
     */
    private static float calculateCostPresent(Sweetness[][] present) {
        float cost = 0;
        for(int i = 0; i < present.length; i++) {
            for (Sweetness sweetness : present[i]) {
                cost += sweetness.getPrice();
            }
        }
        return cost;
    };

    /**
     * Считает вес подарка
     *
     * @param present подарок
     * @return вес подарка
     */
    private static float calculateWeightPresent(Sweetness[][] present) {
        float weight = 0;
        for(int i = 0; i < present.length; i++) {
            for (Sweetness sweetness : present[i]) {
                weight += sweetness.getWeight();
            }
        }
        return weight;
    };
}
