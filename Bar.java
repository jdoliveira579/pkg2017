
package projeto.pkg2017;
public class Bar extends Locais{
    int lotaçao;
    int inscritos;
    int entrada;
    public int retLotaçao(){
        return this.lotaçao;
    }
    public int retEntrada(){
        return this.entrada;
    }
    public int retInscritos(){
        return this.inscritos;
    }
    @Override
    public String toString(){
        return "Nome bar: "+nome+"Lotação max: "+lotaçao+"Custo"+entrada+"Localização: "+coordenadas;
    }
}
