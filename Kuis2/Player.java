public class Player extends DamageableObject {
    int score;
    int livesRemaining;

    public Player(String name, int posX, int posY) {
        super(name, posX, posY, 100);
        this.score = 0;
        this.livesRemaining = 3;
    }

    @Override
    public void OnKilled() {
        System.out.println("Player " + name + " telah mati! Kehilangan 1 nyawa.");
        livesRemaining--;
    }
}
