/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pkg2017;
import java.util.*;

public class Projeto2017 {
    public static void menu(ArrayList<Pessoa> comunidade){
        int primeira, segunda;
        System.out.print("1-Inscrição no convívio\n" + "2-Selecionar os locais a visitar\n" +
"3-Seriação dos locais a visitar\n" + "4-Visualização de “Guest Lists”\n" +
"5-Contabilização das receitas dos locais visitados\n"+"6-Sair\n");
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        primeira = n1.nextInt();
        System.out.flush();
        switch(primeira){
            case 1:
                System.out.print("1-Professor\n"+"2-Funcionário\n"+"3-Aluno\n"+"4-Voltar\n");
                segunda = n2.nextInt();
                switch(segunda){
                    case 1:
                        //se eu colocar um if e colocar o nome e perfil a pedir logo depois do if nao é necessario o switch
                        //e depois no if chamar as funçoes inscrever aluno, func, prof
                    break;
                    case 2:
            
                    break;
                    case 3:
                        //Inscrevr aluno
                        Scanner nome1 = new Scanner(System.in);
                        Scanner perfil1 = new Scanner(System.in);
                        Scanner curso1 = new Scanner(System.in);
                        System.out.print("Nome-->perfil-->curso\n");
                        Aluno novo = new Aluno(nome1.nextLine(),perfil1.nextLine(), curso1.nextLine());
                        comunidade.add(novo);
                        System.out.println(comunidade);
                    break;
                    case 4:
                        return;
                }
            break;
            case 2:
                System.out.print("1-Parque\n"+"2-Exposição\n"+"3-Bar\n");
                segunda = n2.nextInt();
                switch(segunda){
                    case 1:
                        
                    break;
                    case 2:
            
                    break;
                    case 3:
            
                    break;
                }
            break;
            case 3:
            
            break;
            case 4:
            
            break;
            case 5:
            
            break;
            case 6:
            break;
        }
    }
    public static void main(String[] args) {
            ArrayList<Pessoa> comunidade = new ArrayList<Pessoa>();
            menu(comunidade);
    }
    
}
