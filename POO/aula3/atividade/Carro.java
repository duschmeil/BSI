package POO.aula3.atividade;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int cv;
    private String tipo;

    Carro() {
        marca = "desconhecido";
        modelo = "desconhecido";
        ano = 0;
        cv = 0;
        tipo = "desconhecido";
    }

    public Carro(String marca, String modelo, int ano, int cv, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cv = cv;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getCv() {
        return cv;
    }

    public String getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCv(int cv) {
        if(cv <= 0) {
            System.out.println("CV inválidos!");
        } else {
            this.cv = cv;
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override public String toString() {
        return "MARCA: " + marca + " | MODELO: " + modelo + " | ANO: " + ano + " | CV: " + cv + "| TIPO: " + tipo;
    }
}
