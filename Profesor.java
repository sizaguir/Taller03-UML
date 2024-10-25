package com.mycompany.ds;

import java.util.ArrayList;

public class Profesor extends PersonalAcademico{
    
    private ArrayList<Curso> cursosACargo;

    public ArrayList<Curso> getCursosACargo() {
        return cursosACargo;
    }

    public void setCursosACargo(ArrayList<Curso> cursosACargo) {
        this.cursosACargo = cursosACargo;
    }

    
    public void cargarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {
        
    }

    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividadSumativa) {
       
    }

    public void aceptarInscripcion(Curso curso, String usuarioEstudiante) {
        
    }

    public void crearNuevoForo(Foro foro) {
        
    }
}
