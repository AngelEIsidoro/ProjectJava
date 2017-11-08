import java.util.*;
public class Nodoo
{
    private int valor;
    private Nodoo prox;
    
    public Nodoo() {
        this.valor = 0;
        this.prox = null;
    }
    public Nodoo(int v) {
        this.valor = v;
        this.prox = null;
    }
    public void setValor(int v) {
        valor = v;
    }
    public void setProx(Nodoo p) {
        prox = p;
    }
    public int getValor() {
        return valor;
    }
    public Nodoo getProx() {
        return prox;
    }
}