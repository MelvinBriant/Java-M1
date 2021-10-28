import java.util.ArrayList;

public class Monde {
    
    protected int dimension;
    protected ArrayList<Robot> robots;
    protected ListeLIFO[][] terrain;

    public Monde(ArrayList<Robot> listeRobot, int d){
        this.robots = listeRobot;
        this.dimension = d;

        this.terrain = new ListeLIFO[this.dimension][this.dimension];
        for(int i=0; i<this.dimension; i++) {
            for(int j=0; j<this.dimension; j++) {
                this.terrain[i][j] = new ListeLIFO();

                int randomPapier = (int)(Math.random() * 3);
                for(int nbPapier = 0; nbPapier < randomPapier; nbPapier++) {
                    this.terrain[i][j].push(new PapierGras());
                }
            }
        }
    }

    // Accesseur DIMENSION
    public int getDimension() {
        return this.dimension;
    }

    public void setDimension(int d) {
        this.dimension = d;
    }

    // Retourne la pile de terrain
    public ListeLIFO getTerrain(int i, int j) {
        return this.terrain[i][j];
    }

    public void nextRound() {
        for(Robot r:robots) {
            r.move(this);
            r.action(this);
        }
    }

    public String toString(){
        return toStringv2();
    }

    public String toStringv2() {
        String world = "  ";
            for(int i = 0; i < this.dimension; i++) {
                for(int j = 0; j < this.dimension; j++) {
                    int size = this.terrain[i][j].size();
                    boolean bounder = (j == (this.dimension - 1));
                    for(Robot r: robots){
                        if(r.getI() == i && r.getJ() == j) {
                            world += String.format("%3s", r.toString());
                        }
                    }
                    if(size == 0) {
                        if(bounder) {
                            world += ". " + "\n" + "  ";
                        }
                        else {
                            world += ".  ";
                        }
                    }
                    else {
                        if(bounder) {
                            world += String.valueOf(size) + "  " + "\n" + "  ";
                        }
                        else {
                            world += String.valueOf(size) + "  ";
                        }
                    }
                }
            }
            return world;
        }
}
