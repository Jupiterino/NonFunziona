

import java.util.ArrayList;
/**
 *
 * @author itismeucci
 */
public class alunno {
        private String nome;
        private String cognome;
        private String dataNascita;
        private ArrayList<Float> votiAlunno = new ArrayList<Float>();

    
    
    public alunno(String nome, String cognome, String dataNascita) {
            this.nome = nome;
            this.cognome = cognome;
            this.dataNascita = dataNascita;
        }

    public void aggiungiVoto(Float A){
        votiAlunno.add(A);
    }


    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getDataNascita() {
        return dataNascita;
    }
    
    @Override
    public String toString() {
        return "alunno [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + ", votiAlunno="
                + votiAlunno + "]";
    }

    
    
}