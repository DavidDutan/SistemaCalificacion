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
 public class Materia
{

    @Override
    public String toString() 
    {
        return "Materia{" + "codigo=" + codigo + ", nombre=" + nombre + ", numeroCreditos=" + numeroCreditos + ", numeroHoras=" + numeroHoras +", nivel=" + nivel +", grupo=" +grupo+ ",profesor="+ profesor+ '}';
    }
    private int codigo;
    private String nombre;
    private int numeroCreditos;
    private int numeroHoras;
    private int nivel;
    private Grupo grupo;
    private Profesor profesor;
    

     public void setcodigo(int codigo){
      this.codigo=codigo;   
     }
    
    public void setnombre(String nombre)
    {
        this.nombre=nombre; 
    }
    
    public void setnumeroCreditos(int numeroCreditos)
    {
        this.numeroCreditos=numeroCreditos;
    } 
    
     public void setnumeroHoras(int numeroHoras)
    {
        this.numeroHoras=numeroHoras;
    } 
     
     public void setnivel(int nivel)
    {
        this.nivel=nivel;
    }
     public void setgrupo(Grupo grupo)
     {
         this.grupo=grupo;
     }
     public void setprofesor(Profesor profesor)
     {
         this.profesor=profesor;
     }
   
     public int getcodigo()
    {
        return this.codigo; 
    }
    
    public String getnombre()
    {
        return this.nombre; 
    }
    
    public int getnumeroCreditos()
    {
        return this.numeroCreditos;
    } 
    
    public int getnumeroHoras()
    {
        return this.numeroHoras;
    }
    public int nivel()
    {
        return this.nivel;
    }
    public Grupo getgrupo()
    {
        return this.grupo;
    }
    public Profesor getprofesor()
    {
        return this.profesor;
    }
    
}