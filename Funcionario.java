package projeto.pkg2017;
import java.util.*;
public class Funcionario extends Pessoa{
    String tempo;
    Funcionario(String nome, String perfil, String tempo){
      super(nome, perfil);
      this.tempo = tempo;
    }
    public String toString(){
        return String.format("Funcioario: %s %s %s" ,nome,tempo,perfil);
    }
}
