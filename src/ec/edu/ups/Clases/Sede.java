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
public class Sede
{

    @Override
    public String toString() 
    {
        return "Sede{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" +telefono+ '}';
    }
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private list<Carrera> carrera;
    

     public void setcodigo(int codigo){
      this.codigo=codigo;   
     }
    
    public void setnombre(String nombre)
    {
        this.nombre=nombre; 
    }
    
    public void setdireccion(String direccion)
    {
        this.direccion=direccion;
    } 
    
     public void settelefono(String telefono)
    {
        this.telefono=telefono;
    } 
    
    public int getcodigo()
    {
        return this.codigo; 
    }
    
    public String getnombre()
    {
        return this.nombre; 
    }
    
    public String getdireccion()
    {
        return this.direccion;
    } 
    
    public String gettelefono()
    {
        return this.telefono;
    }

    
}
