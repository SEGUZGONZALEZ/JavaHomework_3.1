public class BonusMilesService {

    public int calculate(int cost) {
        int rublesAmount = 20; // Количество рублей за 1 бонусную милю

        return cost / rublesAmount;
    }
}
