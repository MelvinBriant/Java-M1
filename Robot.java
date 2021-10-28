public abstract class Robot {
    
    protected int coordI;
    protected int coordJ;
    protected int id;
    static int numSerie = 0;


    public Robot(int cI, int cJ) {
        this.coordI = cI;
        this.coordJ = cJ;
        this.id = numSerie++;
    }

    protected void move(int di, int dj) {
        coordI += di;
        coordJ += dj;
    }

    // Accesseur NUMSERIE
    public int getNumSerie() {
        return(numSerie);
    }

    public void setNumSerie(int nS) {
        numSerie = nS;
    }

    // Accesseur pour accès au num série
    public int getId() {
        return(this.id);
    }

    // Accesseur pour gérer dimension du Monde pour Robot
    public int getI() {
        return coordI;
    }

    public int getJ() {
        return coordJ;
    }

    public abstract void action(Monde m);

    public abstract void move(Monde m);
}
