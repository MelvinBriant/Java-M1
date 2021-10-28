import java.util.ArrayList;

public class ListeLIFO {
    protected ArrayList<Object> liste;

    public ListeLIFO() {
        this.liste = new ArrayList<Object>();
    }

    public boolean isEmpty() {
        // True si supérieur à 0, sinon Fale
        return(this.liste.size() > 0);
    }

    public int size() {
        return(this.liste.size());
    }

    public void push(Object obj) {
        this.liste.add(obj);
    }

    public void pop() {
        this.liste.remove(this.liste.size()-1);
    }

    public Object get(int i) {
        return this.liste.get(i);
    }
}
