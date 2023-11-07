/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;

/**
 *
 * @author Tania Mancia
 */
public class Doctor extends Persona {

    private String especialidades;

    public Doctor() {
        establecerNombre("EDUARDO");
        establecerApellido("MARTINEZ");
        establecerResidencia("COL.SATELITE");
        establecerSalario(15000);
        establecerEdad(30);
        
    }

 
   

    @Override
    String estudiosU() {
        return "Requiere estudios universitarios en medicina";
    }

   
    @Override
    String Objetivolabor() {
        return "Atender a pacientes y proporcionar atención médica";
    }

    @Override
    String subclase() {
        return "Doctor";
    }

    @Override
    String especialidades() {
        return "Cirujia Plastica";
    }

    public void establecerEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public String obtenerEspecialidades() {
        return especialidades;
    }

    
}

