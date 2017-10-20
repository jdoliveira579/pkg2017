package projeto.pkg2017;
import java.util.*;
public class Bar extends Locais{
    int lotacao;
    ArrayList<Pessoa> inscritos;
    int entrada;
    public Bar(String nome, int[] coordenadas, int lotacao, int entrada){
      super(nome, coordenadas);
      this.lotacao = lotacao;
      this.entrada = entrada;
    }
    public void addPessoa(Pessoa a){
      inscritos.add(a);
    }
    public String toString(){
        return "Nome bar: "+nome+"Lotacao max: "+lotacao+"Custo"+entrada+"Localizacao: "+coordenadas;
    }
}
