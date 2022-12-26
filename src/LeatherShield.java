public class LeatherShield extends Shield{

    @Override
    public int protection() {
        return 30;
    }

    @Override
    public String KindOfShield() {
        return "Кожа крокодила";
    }

    @Override
    public String toString() {
        return "Кожанный щит "  + super.toString();
    }
}
