package projeto.pkg2017;
import java.util.*;
public class Aluno extends Pessoa{
    String curso;
    Aluno(String nome,  String perfil,String curso){
        this.nome = nome;
        this.perfil = perfil;
        this.curso = curso;
    }
    public String retCurso(){
        return this.curso;
    }
    @Override
    public String toString(){
        return "Aluno "+nome+" do curso "+curso + " com perfil " +perfil;
    }
    /*public void addAluno(){
        Scanner nome1 = new Scanner(System.in);
        Scanner perfil1 = new Scanner(System.in);
        Scanner curso1 = new Scanner(System.in);
        System.out.print("Nome-->perfil-->curso");
        Aluno novo = new Aluno(nome1.nextLine(),perfil1.nextLine(), curso1.nextLine());
        lista.add(novo);
    }*/
}
