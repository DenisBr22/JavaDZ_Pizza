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

        menu.add(new Pizza(1, "«Пицца 4 сыра»", 250, 4));
        menu.add(new Pizza(2, "«Пицца Деревенская»", 310, 2));
        menu.add(new Pizza(3, "«Пицца Пепперони»", 330, 5));
        menu.add(new Pizza(5, "«Пицца Чикаго»", 330, 3));
        menu.add(new Pizza(6, "«Пицца Мюнхенская»", 390, 3));
        menu.add(new Pizza(7, "«Пицца с грибами и ветчиной»", 310, 4));
        menu.add(new Burger(8, "«Бургер Кинг-Конг»", 150, 4));
        menu.add(new Burger(9, "«ЧизБургер»", 200, 5));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в нашу пиццерию «Pizza Bello»\n" +
                "Вывести меню?\n" +
                msgYesOrNot);
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(msgNot)) {
                System.out.println(msgSorry);
                break;
            } else if (answer.equalsIgnoreCase(msgYes)) {
                System.out.println("Отсортировать меню 1: по цене, 2: по наименованию, 3: по рейтингу");
                String answer4 = scanner.nextLine();
                int numberOption = Integer.parseInt(answer4);
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
            }
            System.out.println("Введите №id из меню и количество для заказа, для завершения заказа введите «стоп»");
            Basket order = new Basket();
            while (true) {
                String answer3 = scanner.nextLine();
                if (answer3.equalsIgnoreCase("стоп")) {
                    break;
                }
                int idS = Integer.parseInt(answer3);
                String answer5 = scanner.nextLine();
                int quantityS = Integer.parseInt(answer5);
                for (Product p : menu) {
                    if (p.getIdProduct() == idS) {
                        order.addOrder(p, quantityS);
                    }
                }
            }
            order.printOrder();
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