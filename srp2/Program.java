package srp2;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        InputFromConsole inputFromConsole = new InputFromConsole();
        Order order = inputFromConsole.inputFromConsole();
        SaveOrder saveOrder = new SaveOrder();
        saveOrder.saveToJson(order);
    }

}
