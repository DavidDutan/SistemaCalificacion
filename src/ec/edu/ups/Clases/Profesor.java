/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Clases;

/**
 *
 * @author David
 */
public class Profesor
{

    @Override
    public String toString() 
    {
        return "Profesor{" + "titulo=" + titulo + ", cargo=" + cargo + ", salario=" + salario +  '}';
    }
    private String titulo;
    private String cargo;
    private double salario;
    
    

     public void settitulo(String titulo){
      this.titulo=titulo;   
     }
    
    public void setcargo(String cargo)
    {
        this.cargo=cargo; 
    }
    
    public void setsalario(double salario)
    {
        this.salario=salario;
    } 
     
    public String gettitulo()
    {
        return this.titulo; 
    }
    
    public String getcargo()
    {
        return this.cargo; 
    }
    
    public double getsalario()
    {
        return this.salario;
    } 
    
    
}