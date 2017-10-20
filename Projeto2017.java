package projeto.pkg2017;
import java.util.*;

public class Projeto2017 {
    public static void inscrever_aluno(ArrayList<Pessoa> comunidade,String nome, String perfil){
        String curso = new String();
        Scanner curso1 = new Scanner(System.in);
         System.out.print("Curso (LEI - LDM)\n");
        curso = curso1.nextLine();
        curso = curso.toLowerCase();
        //condiçao if para verificar se é LEI ou LDM se nao da erro e volta atras
        Aluno novo_aluno = new Aluno(nome ,perfil, curso);
        comunidade.add(novo_aluno);
    }
    public static void inscrever_professor(ArrayList<Pessoa> comunidade, String nome, String perfil){
        String tipo = new String();
        System.out.print("Tipo (Auxiliar - Associado - Catedratico): \n");
        Scanner tipo1 = new Scanner(System.in);
        tipo = tipo1.nextLine();
        tipo = tipo.toLowerCase();
        //condiçao if para verificar se é Auxiliar - Associado - Catedrático se nao da erro e volta atras
        Professor novo_professor = new Professor(nome, perfil, tipo);
        comunidade.add(novo_professor);
    }
    public static void inscrever_funcionario(ArrayList<Pessoa> comunidade, String nome, String perfil){
      String tempo = new String();
      System.out.print("Tempo (Parcial - Integral): \n");
      Scanner tempo1 = new Scanner(System.in);
      tempo = tempo1.nextLine();
      tempo = tempo.toLowerCase();
      //condiçao if para verificar se é parcil ou integral se nao da erro e volta atras
      Funcionario novo_funcionario = new Funcionario(nome, perfil, tempo);
      comunidade.add(novo_funcionario);
    }
    public static void mostrar_locais(ArrayList<Locais> locais){
      for(Locais a : locais)
        System.out.println(a);
    }
    public static void criar_exposicao(ArrayList<Locais> locias, String nome, int[] coordenadas){
      String forma = new String();
      Scanner forma1 = new Scanner(System.in);
      forma = forma1.nextLine();
    }
    public static void menu(ArrayList<Pessoa> comunidade, ArrayList<Locais> locais){
        int primeira=0, segunda=0;
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        while(primeira != 6){
          System.out.print("1-Inscricao no convivio\n" + "2-Selecionar os locais a visitar\n" +"3-Seriacao dos locais a visitar\n" + "4-Visualizacao de Guest Lists\n" +"5-Contabilizacao das receitas dos locais visitados\n"+"6-Sair\n");
          primeira = n1.nextInt();
          System.out.flush();
          switch(primeira){
            case 1:
                //Funçao de pedir nome e perfil
                    System.out.print("1-Professor\n"+"2-Funcionario\n"+"3-Aluno\n"+"4-Voltar\n");
                    segunda = n2.nextInt();
                    if(segunda == 4)break;
                    String nome = new String();
                    System.out.print("Nome:\n");
                    Scanner nome1 = new Scanner(System.in);
                    nome = nome1.nextLine();
                    String perfil = new String();
                    System.out.print("Perfil (Desportivo - Boemio - Cultural - Poupadinho):\n");
                    Scanner perfil1 = new Scanner(System.in);
                    perfil = perfil1.nextLine();
                    //condiçao if para verificar se é Desportivo - Boemio - Cultural - Poupadinho se nao da erro e volta atras
                    switch(segunda){
                    case 1://Professor
                        inscrever_professor(comunidade,nome, perfil);
                        mostrar_locais(locais);
                        //FUNÇÃO MOSTRAR OS LOCAIS
                    break;
                    case 2://Funcionario
                        inscrever_funcionario(comunidade, nome, perfil);
                        //FUNÇAO MOSTRAR LOCAIS
                    break;
                    case 3://Aluno
                        inscrever_aluno(comunidade,nome, perfil);
                        //FUNÇAO MOSTRAR LOCAIS
                    break;
                    case 4:
                    break;
                    default:
                        System.out.println("Opcao errada");
                    break;
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
                    case 4:
                    break;
                    default:
                        System.out.println("Opcao errada");
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
            default:
                System.out.println("Opcao errada");
            break;
            }
          }
    }
    public static void main(String[] args) {
        ArrayList<Pessoa> comunidade = new ArrayList<Pessoa>();
        ArrayList<Locais> locais = new ArrayList<Locais>();
        menu(comunidade, locais);
        for(Pessoa a : comunidade)
          System.out.println(a);
    }
}
