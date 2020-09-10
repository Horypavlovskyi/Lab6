package ua.zp.brainacad;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	// write your code here
//        System.out.println("Купить книгу: " + Book.CONSTANTA);
//        System.out.println("Оператор: " + PostOffice.CONSTANTA);
//        System.out.println("Покупатель: " + StoreCustomer.CONSTANTA);
//        System.out.println("Продавец: " + Seller.CONSTANTA);

    Book mafia = new Book();
//    mafia.name = "\"Коломбо\"";
//    mafia.page = 30;
//    System.out.println("Книга " + mafia.name + " " + mafia.page + " страниц.");

    mafia.setName("\"Коломбо\"");
    mafia.setPage(30);
    System.out.println("Книга " + mafia.getName() + " " + mafia.getPage() + " страниц.");
    mafia.chapter(4);
    PostOffice.post(10, 2, 3);


    Seller TV = new Seller();
    TV.setTechnics("TV Samsung");
    TV.setNameProduct("L200");
    TV.setPrice(15);

    Seller refrigerator = new Seller();
    refrigerator.setTechnics("Refrigerator Toshiba");
    refrigerator.setNameProduct("100500");
    refrigerator.setPrice(10);

    Seller airConditioning = new Seller();
    airConditioning.setTechnics("Air Conditioning Wirpool");
    airConditioning.setNameProduct("XXX");
    airConditioning.setPrice(5);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите количество товара для покупки: ");
    int s = scanner.nextInt();
    System.out.println("Цена за " + s + " штук составит: " + s * refrigerator.getPrice() + "$");



//    TV.remainder(10);
//    refrigerator.remainder(5);
//    airConditioning.remainder(2);















}
}

//    Первая часть посвящена базовым навыкам по работе с классами. Необходимо создать
//    несколько классов, описывающих определенные объекты.
//        1.1 Создать 3 класса с публичными полями, которые описывают объекты из списка:
//        Книга, Отделение почты, Клиент магазина, свой вариант.
//        1.2 Константы.
//        Дополнить классы константными значениями, полями класса (static final). Поля
//        должны иметь отношение к предметной области.
//        1.3 Создание экземпляров
//        Создать дополнительный класс, например Main, для проверки предыдущих шагов.
//        В этом классе создать main метод, в котором создать экземпляры описанных ранее
//        классов.
//        1.4 Инициализация полей объекта
//        С помощью доступа к переменной, через «точку» у объекта класса,
//        проинициализировать поля.
//        Пример: obj.field = 12L;
//        1.5 Вывод информации о объекте
//        Вывести на экран информацию о каждом объекте в формате:
//        Имя класса: Test
//        Field1 = 123
//        Field2 = ”qwerty”