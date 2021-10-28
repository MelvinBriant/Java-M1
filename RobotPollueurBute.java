public class RobotPollueurBute extends Robot {
    private int direction;

    public RobotPollueurBute(int i, int j) {
        super(i,j);

        direction = 1; // Initialisation par défaut pour aller vers la droite
    }

    public void action(Monde m) {
        if(Math.random() < 0.3) {
            m.getTerrain(getI(), getJ()).push(new PapierGras());
        }
    }

    public void move(Monde m) {
        // Vérification de s'il est au bout de la ligne
        if(getJ() == m.getDimension() -1){
            this.direction = -1; // Met à -1 pour aller vers la gauche
        }

        // Vérification s'il est tout à gauche de la ligne
        if(getJ() == 0){
            this.direction = 1; // Remet à 1 pour aller vers la droite
        }

        // Se déplace uniquement sur la ligne
        move(0, direction);
    }

    // Pour affichage
    public String toString() {
        String s = String.valueOf(getId());
        return "B"+s;
    }
}
