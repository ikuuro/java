/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastroaluno;

/**
 *
 * @author Admin
 */
public class CadastroAluno {

    public static void main(String[] args) {
                        //valores
        String nome = "Ikaro Santos" ;
        int idade = 18;
        char sexo = 'M' ;
        double altura = 1.80 ;
        String endereco = "Rua Raimundo Machado";
        String observacao = "Aos 13 anos me mudei para são paulo" ;
        double peso = 75;
        double imc = peso/(altura * altura);
      
                        //saídas
     System.out.println("Nome:" + nome);
     System.out.println("Idade:" + idade);
     System.out.println("Sexo:" + sexo);
     System.out.println("Altura:" + altura);
     System.out.println("Endereço:" + endereco);
     System.out.println("Observações:" + observacao);
     System.out.println("Peso:" + peso);
     System.out.println("IMC:" + imc);
    }
}
