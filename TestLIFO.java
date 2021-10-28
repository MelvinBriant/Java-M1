public class TestLIFO {
    
    public static void main(String[] args) {
        ListeLIFO liste = new ListeLIFO();
        liste.push("test 1");
        liste.push("test 2");
        liste.push("test 3");
        // Methode que j'ai faites afin de pouvoir afficher des valeurs du tableau.
        System.out.println(liste.get(0));
        System.out.println("Taille du tableau : "+liste.size());
        liste.pop();
        System.out.println("Taille du tableau : "+liste.size());
        System.out.println(liste.get(1));
    }
}
