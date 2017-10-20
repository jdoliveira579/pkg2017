package projeto.pkg2017;
import java.util.*;
public class Aluno extends Pessoa{
    String curso;
    public Aluno(String nome,  String perfil,String curso){
        super(nome, perfil);
        this.curso = curso;
    }
    public String toString(){
        return String.format("Aluno: %s %s %s" ,nome,curso,perfil);
    }
}
