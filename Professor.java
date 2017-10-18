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
public class Professor extends Pessoa{
    String tipo;
    public String retTipo(){
        return this.tipo;
    }
    @Override
    public String toString(){
        return "Professor"+tipo+nome+"com perfil"+perfil;
    }
}
