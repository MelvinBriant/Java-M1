public class RobotPollueurIdiot extends Robot {

    public RobotPollueurIdiot(int i, int j) {
        super(i,j);
    }

    public void action(Monde m) {
        if(Math.random() < 0.2) {
            m.getTerrain(getI(), getJ()).push(new PapierGras());
        }
    }

    public void move(Monde m) {
        // Récupération du déplacement en fonction de la dimension du monde
        int i = (int) (Math.random() * m.getDimension() -1);
        int j = (int) (Math.random() * m.getDimension() -1);

        // Déplacement du robot
        move(i-getI(), j-getJ());
    }

    // Pour affichage
    public String toString() {
        String s = String.valueOf(getId());
        return "I"+s;
    }
}