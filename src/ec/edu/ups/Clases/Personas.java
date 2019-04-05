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
public class Personas
{

    @Override
    public String toString() 
    {
        return "Personas{" + "codigo=" + codigo + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono +", cedula=" + cedula + ", correo=" + correo +",sede=2" +sede+ '}';
    }
    private int codigo;
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    private String correo;
    private Sede sede;
    

     public void setcodigo(int codigo){
      this.codigo=codigo;   
     }
    
    public void setnombre(String nombre)
    {
        this.nombre=nombre; 
    }
    
    public void setcedula(String cedula)
    {
        this.cedula=cedula;
    } 
    
     public void settelefono(String telefono)
    {
        this.telefono=telefono;
    } 
     
     public void setdireccion(String direccion)
    {
        this.direccion=direccion;
    }
     public void setcorreo(String correo)
     {
         this.correo=correo;
     }
     public void setsede(Sede sede)
     {
         this.sede=sede;
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
 public String getcedula()
    {
        return this.cedula;
    }
  public String getcorreoo()
    {
        return this.correo;
    }
  public Sede getsede()
  {
      return this.sede;
  }
    
}
