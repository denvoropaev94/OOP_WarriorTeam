public class Knight extends Warrior<Sword,Shield>{
    public Knight(String name, int healthpoint, Sword weapon,Shield defense) {
        super(name, healthpoint, weapon,defense);
    }

    @Override
    public String toString() {
        return "Рыцарь: " + super.toString();
    }
}
