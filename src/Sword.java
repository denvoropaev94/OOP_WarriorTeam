public abstract class Sword implements Weapon {
    public abstract int bladeLength();

    @Override
    public String toString() {
        return String.format("Длина клинка: %d величина урона %d ",bladeLength(),damage());
    }
}
