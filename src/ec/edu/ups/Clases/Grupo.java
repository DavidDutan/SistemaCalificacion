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
public class Grupo
{

    @Override
    public String toString() 
    {
        return "grupo{" + "codigo=" + codigo+ ", nombre=" + nombre + ", cupo=" + cupo +  '}';
    }
    private int codigo;
    private String nombre;
    private int cupo;
    
    

     public void setcodigo(int codigo){
      this.codigo=codigo;   
     }
    
    public void setnombre(String nombre)
    {
        this.nombre=nombre; 
    }
    
    public void setcupo(int cupo)
    {
        this.cupo=cupo;
    } 
     
    public int getcodigo()
    {
        return this.codigo; 
    }
    
    public String getnombre()
    {
        return this.nombre; 
    }
    
    public int getcupo()
    {
        return this.cupo;
    } 
    
    
}
