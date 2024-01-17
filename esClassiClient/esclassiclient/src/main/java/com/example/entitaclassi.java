package main.java.com.example;

import java.util.ArrayList;
/**
 *
 * @author itismeucci
 */
public class entitaclasse {
        private String id_classe;
        private ArrayList<alunno> listaAlunni = new ArrayList<alunno>();

        public entitaclasse(String id_classe) {
            this.id_classe = id_classe;
        }

        public void aggiungiAlunno(alunno A){
            listaAlunni.add(A);
        }

        @Override
        public String toString() {
            return "entitaclasse [id_classe=" + id_classe + ", listaAlunni=" + listaAlunni + "]";
        }
    
        
}


