package com.mycompany.ds;

import java.util.ArrayList;

public class PersonalAcademico extends Usuario{
    
    protected ArrayList<String> incidentes;

    public ArrayList<String> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(ArrayList<String> incidentes) {
        this.incidentes = incidentes;
    }

      
    public void reportarError(String email, String contenido){
        
    }
    public void solicitarAsesormamientoDelSistema(String email, String contenido){
        
    }
    public void comentarEnForo(Foro foro, String comentario){
        
    }
}
