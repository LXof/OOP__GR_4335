import Domen.WaterBottle;

public class App {
    public static void main(String[] args) throws Exception {

        WaterBottle waterBottle = new WaterBottle(2, "Бутылка", 15.0, "Описание бутылки", "Категория", 10, 500);

        System.out.println(waterBottle.toString());
    }
}
