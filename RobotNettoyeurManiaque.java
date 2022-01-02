public class RobotNettoyeurManiaque extends Robot {
    
    public RobotNettoyeurManiaque(int i, int j) {
        super(i,j);
    }

    public void action(Monde m) {
        m.getTerrain(getI(), getJ()).pop();
    }

    public void move(Monde m) {
        // Vérification de si la case sur laquelle il ce trouve est sale
        if(m.getTerrain(getI(), getJ()).isEmpty()) {
            // Aucun déplacement nécessaire
            return;
        }

        // Vérification autour si pas trouvé
        for(int i = -1; i <= 1; i++) {
            for(int j = -1; j <= 1; j++) {
                int indexI = Math.min(Math.max(0, getI()+i), m.getDimension()-1);
                int indexJ = Math.min(Math.max(0, getJ()+j), m.getDimension()-1);

                if(m.getTerrain(indexI, indexJ).isEmpty()) {
                    // Déplacement du robot
                    move(i,j);
                    return;
                }
            }
        }

        // Si rien trouvé, il bouge aléatoirement comme le robot idiot
        int i = (int) (Math.random() * m.getDimension()-1);
        int j = (int) (Math.random() * m.getDimension()-1);

        // Déplacement du robot
        move(i-getI(), j-getJ());
    }

    // Pour affichage
    public String toString() {
        String s = String.valueOf(getId());
        return "M"+s;
    }
}
