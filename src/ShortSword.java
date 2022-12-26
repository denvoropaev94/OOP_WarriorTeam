public class ShortSword extends Sword{
    @Override
    public int bladeLength() {
        return 15;
    }

    @Override
    public int damage() {
        return 10;
    }

    @Override
    public String toString() {
        return "Короткий меч-" + super.toString();
    }
}
