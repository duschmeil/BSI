package POO.aula1;

public class caneta {
    String corCaneta;
    Integer carga;
    Double espessura;
    String corTinta;
    Boolean tampada;

    public caneta(String corCaneta, Integer carga, Double espessura, String corTinta, Boolean tampada) {
        this.corCaneta = corCaneta;
        this.carga = carga;
        this.espessura = espessura;
        this.corTinta = corTinta;
        this.tampada = tampada;
    }


    public void rabiscar () {
        if (carga > 0 & tampada == false) {
            System.out.println("Caneta Rabiscando...");
        }
        
    }
}