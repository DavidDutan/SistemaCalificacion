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
public class HistorialCalificaciones
{

    @Override
    public String toString() 
    {
        return "HistorialCalificaciones{" + "materia=" + materia+ ", estidiante=" + estudiante + ", aprovechamiento1=" + aprovechamiento1 +  ", aprovechamiento2=" + aprovechamiento2 +  ", examen1=" + examen1 + ",examen2=" + examen2 +  '}';
    }
    private Materia materia;
    Private Estudiante estudiante;
    private int aprovechamiento1;
    private int examen1;
    private int aprovechamiento2;
    private int examen2;
    
    

     public void setmateria(Materia materia){
      this.materia=materia;   
     }
    
    public void setestudiante(Estudiante estudiante)
    {
        this.estudiante=estudiante; 
    }
    
    public void setaprovechamientos1(int aprovechamiento1)
    {
        this.aprovechamiento1=aprovechamiento1;
    } 
    
     public void setaprovechamientos2(int aprovechamiento2)
    {
        this.aprovechamiento2=aprovechamiento2;
    } 
      public void setexamen1(int examen1)
    {
        this.examen1=examen1;
    } 
      
        public void setexamen2(int examen2)
    {
        this.examen2=examen2;
    }
        
    public Materia getmateria()
    {
       
        return this.materia; 
    }
    
    public Estudiante getestudiante()
    {
        return this.Estudiante; 
    }
    
    public int getaprovechamiento1()
    {
        return this.aprovechamiento1;
    } 
    
    public int getexamen1()
    {
        return this.examen1;
    }
    public int getaprovechamiento2()
    {
        return this.aprovechamiento2;
    }
    public int getexamen2()
    {
      return this.examen2;  
    }
}
