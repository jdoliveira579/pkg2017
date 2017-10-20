package projeto.pkg2017;
import java.util.*;
public class Exposicao extends Locais{
    String forma;
    int custo;
    ArrayList<Pessoa> inscritos; //fazer um array e ao iniciar o local o array tem tamanho = numero de inscritos
    public Exposicao(String nome, int[] coordenadas, String forma, int custo){
        super(nome, coordenadas);
        this.forma = forma;
        this.custo = custo;
    }
    public void addPessoa(Pessoa a){
        inscritos.add(a);
    }
    public String toString(){
        return nome+" "+coordenadas+" exposicao "+forma+" custo: "+custo+"euros ";
    }
}
