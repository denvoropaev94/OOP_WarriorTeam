public abstract class Shield implements Defense {
    public abstract String KindOfShield();

    @Override
    public String toString() {
        return String.format("Уровень защиты: %d Вид щита: %s ",protection(),KindOfShield());
    }
}
