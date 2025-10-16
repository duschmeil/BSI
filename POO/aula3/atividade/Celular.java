package POO.aula3.atividade;

public class Celular {
    public String marca;
    public String modelo;
    public int memoria;
    public int qntCameras;
    public String telefone;

    Celular() {
        marca = "desconhecido";
        modelo = "desconhecido";
        memoria = 0;
        qntCameras = 0;
        telefone = "desconhecido";
    }

    public Celular(String marca, String modelo, int memoria, int qntCameras, String telefone) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.qntCameras = qntCameras;
        this.telefone = telefone;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getQntCameras() {
        return qntCameras;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setMarca(String iPhone) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = this.modelo;
    }

    public void setMemoria(int memoria) {
        if(memoria <= 0) {
            System.out.println("Memória Inválida!");
        } else {
            this.memoria = memoria;
        }
    }

    public void setQntCameras(int qntCameras) {
        this.qntCameras = qntCameras;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override public String toString() {
        return "MARCA: " + marca + " | MODELO: " + modelo + " | MEMÓRIA: " + memoria + " | NºCameras: " + qntCameras + "| TELEFONE: " + telefone;
    }
}
