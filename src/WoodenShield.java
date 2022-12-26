public class WoodenShield extends Shield{
    @Override
    public int protection() {
        return 10;
    }

    @Override
    public String KindOfShield() {
        return "Дерево";
    }

    @Override
    public String toString() {
        return "Деревянный щит " + super.toString();
    }
}
