public class BonusMilesService {
    public int calculate(int price) {
        int rubOneMiles = 20;
        int miles = price / rubOneMiles;
        return miles;
}
}