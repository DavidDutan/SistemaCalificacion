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
public class Estudiante extends Personas
{

    @Override
    public String toString() 
    {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }
    private Carrera carrera;
    
    

     public void setcarrera(Carrera carrera){
      this.carrera=carrera;   
     }
   
    public Carrera getcarrera()
    {
        return this.carrera;
    } 
    
    
}
