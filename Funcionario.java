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
public class Funcionario extends Pessoa{
    String tempo;
    public String retTempo(){
        return this.tempo;
    }
    @Override
    public String toString(){
        return "Funcionario a tempo"+tempo+","+nome+"com perfil"+perfil;
    }
}
