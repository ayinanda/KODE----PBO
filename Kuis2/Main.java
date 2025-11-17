public class Main {
    public static void main(String[] args) {
        Player p = new Player("Ayin", 0, 0);
        Monster m = new Monster("Goblin", 5, 5, 3, "Green");

        System.out.println(m.MakeNoise());
        m.TakeDamage(50);
        m.TakeDamage(40); 

        p.TakeDamage(150);
    }
}