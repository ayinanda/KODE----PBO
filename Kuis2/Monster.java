public class Monster extends DamageableObject {
    int threatLevel;
    String color;

    public Monster(String name, int posX, int posY, int threatLevel, String color) {
        super(name, posX, posY, 80);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    @Override
    public void OnKilled() {
        System.out.println("Monster " + name + " telah terbunuh! Monster mengeluarkan suara terakhirnya.");
    }

    public String MakeNoise() {
        return "Grrrrrrrr dari " + name;
    }
}