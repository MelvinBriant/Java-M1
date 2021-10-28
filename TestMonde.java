import java.util.ArrayList;
import java.util.Scanner;

public class TestMonde {
    public static void main(String[] args) {
        int dimension = 20;
        ArrayList<Robot> robots = new ArrayList<Robot>();

        // Ajout des pollueurs
        robots.add(new RobotPollueurIdiot((int) (Math.random()*dimension), (int) (Math.random()*dimension)));
        robots.add(new RobotPollueurBute((int) (Math.random()*dimension), (int) (Math.random()*dimension)));

        // Ajout des nettoyeurs
        robots.add(new RobotNettoyeurManiaque((int) (Math.random()*dimension), (int) (Math.random()*dimension)));
        robots.add(new RobotNettoyeurNormal((int) (Math.random()*dimension), (int) (Math.random()*dimension)));

        // Création du monde
        Monde m = new Monde(robots,dimension);

        Scanner scan = new Scanner(System.in);

        for(int i=1; i<=20; i++){
            System.out.print("============================ TOUR "+i+" ============================"+"\n");
            System.out.println(m);
            m.nextRound();
            scan.next();
        }
    }
}
