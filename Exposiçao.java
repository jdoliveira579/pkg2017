/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pkg2017;

/**
 *
 * @author João Oliveira
 */
public class Exposiçao extends Locais{
    String forma;
    int custo;
    int inscritos;
    public int retInscritos(){
        return this.inscritos;
    }
    public String retForma(){
        return this.forma;
    }
    public int retCusto(){
        return this.custo;
    }
    @Override
    public String toString(){
        return "Nome: "+nome+"Forma artistica: "+forma+"Custo: "+custo+"Local:"+ coordenadas;
    }
}
