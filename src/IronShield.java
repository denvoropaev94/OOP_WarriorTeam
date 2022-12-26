public class IronShield extends Shield{
    @Override
    public int protection() {
        return 99;
    }

    @Override
    public String KindOfShield() {
        return "Валирийская сталь";
    }

    @Override
    public String toString() {
        return "Железный щит " +  super.toString();
    }
}
