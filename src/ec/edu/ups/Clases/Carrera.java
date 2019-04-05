/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Clases;

import java.util.ArrayList;

/**
 *
 * @author David
 */
public class Carrera
{

    @Override
    
    public String toString() 
    {
        return "Carrera{" + "codigo=" + codigo + ", nombre=" + nombre + ", numeroSemestreso=" + numeroSemestres + ", numeroEstudiantes=" + numeroEstudiantes +", titulo=" + titulo + '}';
    }
    public void tex()
    {
      ArrayList Carrera=new Arraylist();
    }
    private int codigo;
    private String nombre;
    Private List<Materia> materia;
    private int numeroSemestres;
    private int numeroEstudiantes;
    private String titulo;
    

     public void setcodigo(int codigo)
     {
      this.codigo=codigo;   
     }
    
    public void setnombre(String nombre)
    {
        this.nombre=nombre; 
    }
    
    public void setnmeroSemestres(int numeroSemestres)
    {
        this.numeroSemestres=numeroSemestres;
    } 
    
    public void setnmeroEstudiantes(int numeroEstudiantes)
    {
        this.numeroEstudiantes=numeroEstudiantes;
    } 
    
    public void settitulo(String titulo)
    {
        this.titulo=titulo;
    } 
    public int getcodigo()
    {
        return this.codigo; 
    }
    
    public String getnombre()
    {
        return this.nombre; 
    }
    
    public int numeroSemestres()
    {
        return this.numeroSemestres;
    } 
    public int numeroEstudiantes()
    {
        return this.numeroEstudiantes;
    }
    public String titulo()
    {
        return this.titulo;
    }
         
    
    
}
