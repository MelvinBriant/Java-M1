public class RobotNettoyeurNormal extends Robot {
    private int directionGaucheDroite, directionHautBas;

    public RobotNettoyeurNormal(int i, int j) {
        super(i,j);
        this.directionGaucheDroite = 1; // Pareil que RobotPollueur -> Initialisation à 1 pour aller vers la droite
        this.directionHautBas = 1; // Initialisation à 1 pour aller en bas
    }

    public void action(Monde m) {
        m.getTerrain(getI(), getJ()).pop();
    }

    public void move(Monde m) {
        // Vérification de s'il est au bout de la ligne
        if(getJ() == m.getDimension() -1){
            this.directionGaucheDroite = -1; // Met à -1 pour aller vers la gauche
            move(this.directionHautBas, 0); 
        }

        // Vérification s'il est tout à gauche de la ligne
        if(getJ() == 0){
            this.directionGaucheDroite = 1; // Met à -1 pour aller vers la droite
            move(this.directionHautBas, 0); 
        }

        // Vérification de s'il est tout en haut
        if(getI() == 0){
            this.directionHautBas = 1; // Descend
        }

        // Vérification de s'il est tout en bas
        if(getI() == m.getDimension() -1){
            this.directionHautBas = -1; // Monte
        }

        move(0, directionGaucheDroite);
    }

    // Pour affichage
    public String toString() {
        String s = String.valueOf(getId());
        return "N"+s;
    }
}
