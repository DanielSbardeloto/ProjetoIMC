/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uricer;

/**
 *
 * @author aluno
 */
public class Calculo {
    
    private String sexo;
    private double estatura;
    private double peso;

    public Calculo(String sexo, double estatura, double peso) {
        this.sexo = sexo;
        this.estatura = estatura;
        this.peso = peso;
    }
    
    
    
    public int calcular(){
        
        double imcGeral = peso/ Math.pow(estatura, 2);
        
        if(sexo.equals("M")){
            int imc = 1;
            
            if(imcGeral < 20.7){
                imc = 0;
            }else if (imcGeral > 26.4){
                imc = 2;
            }
            
            return imc;
            
        }else{
            int imc = 1;
            
            if(imcGeral < 19.1){
                imc = 0;
            }else if (imcGeral > 25.8){
                imc = 2;
            }
            
            return imc; 
        }  
    }
}
