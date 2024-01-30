import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        store.addToy(1, "Игрушечный меч", 15, 30);
        store.addToy(2, "Солдатики", 10, 20);
        store.addToy(3, "Кукла", 5, 25);

        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Выберите опцию:");
            System.out.println("1. Добавить игрушку");
            System.out.println("2. Изменить вес игрушки");
            System.out.println("3. Розыгрыш игрушек");
            System.out.println("4. Выйти");

            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Введите ID игрушки: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // consume the newline
                    System.out.println("Введите название игрушки: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите количество игрушек: ");
                    int quantity = scanner.nextInt();
                    System.out.println("Введите вес игрушки: ");
                    double weight = scanner.nextDouble();
                    store.addToy(id, name, quantity, weight);
                    break;
                case 2:
                    System.out.println("Введите ID игрушки, у которой хотите изменить вес: ");
                    int toyId = scanner.nextInt();
                    System.out.println("Введите новый вес: ");
                    double newWeight = scanner.nextDouble();
                    store.changeToyWeight(toyId, newWeight);
                    break;
                case 3:
                    store.drawToys();
                    break;
                case 4:
                    System.out.println("До свидания!");
                    break;
                default:
                    System.out.println("Неверный ввод");
                    break;
            }
        } while (option != 4);
    }
}