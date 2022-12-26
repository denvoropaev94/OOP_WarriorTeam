public class SharpSword extends Sword{
    @Override
    public int bladeLength() {
        return 76;
    }

    @Override
    public int damage() {
        return 40;
    }

    @Override
    public String toString() {
        return "Острый меч-" +  super.toString();
    }
}
