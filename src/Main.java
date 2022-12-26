public class Main {
    public static void main(String[] args) {
        Comandor comandor = new Comandor("Den",100,new SharpSword(),new IronShield());
        Team<Archer> archerTeam = new Team<>(comandor);
        System.out.println(comandor);
        archerTeam.addWarriors(new Archer("Kolyan",89,new LongBow(),new WoodenShield()));
        archerTeam.addWarriors(new Archer("Tom",59,new LongBow(),new WoodenShield()));
        archerTeam.addWarriors(new Archer("Kot",44,new LongBow(),new IronShield()));
        archerTeam.forEach(System.out::println);
        System.out.println("Суммарный урон:" + archerTeam.getAllDamage()+" "+
                "Суммарное здоровье:"+ " " + archerTeam.getAllHealthPoint() + " " +
                "Зона поражение макс:"+ " " + archerTeam.getMaxRadius()+ " " + "Минимальная защита: " + archerTeam.minProtected());
        System.out.println("------------------------");
        Comandor comandor2 = new Comandor("Mark",200,new LongBow(),new IronShield());
        Team<Barbarian> axes = new Team<>(comandor2);
        axes.addWarriors(new Barbarian("ars",32,new Sekira(),new LeatherShield()));
        System.out.println(comandor2);
        for (Barbarian item: axes) {
            System.out.println(item);
        }
        System.out.println("Суммарный урон" + axes.getAllDamage()+
                "Суммарное здоровье" + axes.getAllHealthPoint() +
                "Зона поражение макс: " + axes.getMaxRadius() + " " +
                "Минимальная защита: " + axes.minProtected());
        System.out.println("----------------------");
        Comandor comandor3 = new Comandor("Matvey",200,new SharpSword(),new IronShield());
        Team<Warrior> warriorTeam = new Team<>(comandor3);
        warriorTeam.addWarriors(new Barbarian("Anton",54,new Sekira(),new LeatherShield()));
        warriorTeam.addWarriors(new Archer("Guk",66,new LongBow(),new WoodenShield()));
        warriorTeam.addWarriors(new Knight("Oleg",75,new SharpSword(),new IronShield()));
        warriorTeam.addWarriors(new Knight("Gleb",77,new ShortSword(),new IronShield()));
        System.out.println(comandor3);
        warriorTeam.forEach(System.out::println);
        System.out.println("Суммарный урон-" + warriorTeam.getAllDamage()+ " " +
                "Суммарное здоровье-" + warriorTeam.getAllHealthPoint() + " " +
                "Зона поражение макс- " + warriorTeam.getMaxRadius() + " " +
                "Минимальная защита- " + warriorTeam.minProtected());

    }
}