import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class Main {

    public static final String msgYesOrNot = "Введите да или нет";
    public static final String msgSorry = "Жаль, что Вы передумали";
    public static final String msgYes = "да";
    public static final String msgNot = "нет";
    public static List<Product> menu = new ArrayList<>();


    public static void main(String[] args) {

        menu.add(new Pizza(1, "«4 сыра»", 250, 4));
        menu.add(new Pizza(2, "«Деревенская»", 310, 2));
        menu.add(new Pizza(3, "«Пепперони»", 330, 5));
        menu.add(new Pizza(5, "«Чикаго»", 330, 3));
        menu.add(new Pizza(6, "«Мюнхенская»", 390, 3));
        menu.add(new Pizza(7, "«С грибами и ветчиной»", 310, 4));
        menu.add(new Burger(8, "«Бургер Кинг-Конг»", 150, 4));
        menu.add(new Burger(9, "«ЧизБургер»", 200, 5));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в нашу пиццерию «Pizza Bello»\n" +
                "Вывести меню?\n" +
                msgYesOrNot);

        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase(msgYes)) {
            System.out.println("Отсортировать меню 1: по цене, 2: по наименованию, 3: по рейтингу");
            int numberOption = scanner.nextInt();
            switch (numberOption) {
                case 1:
                    printListSortPrice(menu);
                    break;
                case 2:
                    printListSortName(menu);
                    break;
                case 3:
                    printListSortRating(menu);
                    break;
            }
        } else if (answer.equalsIgnoreCase(msgNot)) {
            System.out.println(msgSorry);
        }

        System.out.println("\nВы готовы сделать заказ? \n" +
                "Введите " + msgYesOrNot);
        String answer2 = scanner.nextLine();
        if (answer2.equalsIgnoreCase(msgNot)) {
            System.out.println(msgSorry);
        } else if (answer2.equalsIgnoreCase(msgYes)){

        System.out.println("Заказ");
        System.out.println("Введите №id из меню и количество для заказа, для завершения заказа наберите end");
//
        while (true) {
            String answer3 = scanner.nextLine();
            if (answer3.equalsIgnoreCase("end")) {
                break;
            }
            String id = scanner.nextLine();
            String quantity = scanner.nextLine();
            int idS = Integer.parseInt(id);
            int quantityS = Integer.parseInt(quantity);
        }
    }
 }

    public static void printListSortPrice(List<Product> products) {
        products.stream()
                .sorted(Comparator.comparing(Product::getPrice))
                .forEach(System.out::println);
    }

    public static void printListSortName(List<Product> products) {
        products.stream()
                .sorted(Comparator.comparing(Product::getNameProduct))
                .forEach(System.out::println);
    }

    public static void printListSortRating(List<Product> products) {
        products.stream()
                .sorted(Comparator.comparing(Product::getRating))
                .forEach(System.out::println);
    }
}