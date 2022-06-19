public class Main {

    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();
        int price = 10000; // Стоимость билета
        int miles = service.calculate(price);
        System.out.println("За покупку авиабилета стоимостью " + price + " Вы получите " + miles + " миль.");

    }
}