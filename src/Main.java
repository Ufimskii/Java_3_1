public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 6235; // В предыдущем ДЗ именно такую цену я ставил
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}

