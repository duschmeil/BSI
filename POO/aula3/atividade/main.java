package POO.aula3.atividade;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa("Eduardo", 18, 190, 80, "eduschmeil@gmail.com");
        Pessoa pessoa2 = new Pessoa();

        System.out.println(pessoa1);
        System.out.println(pessoa2);

        pessoa2.setNome("Sofia");
        pessoa2.setIdade(18);
        pessoa2.setAltura(161);
        pessoa2.setPeso(55);
        pessoa2.setEmail("sofidelatte@gmail.com");

        System.out.println(pessoa1);
        System.out.println(pessoa2);

        Celular celular1 = new Celular("Apple", "IPhone 14 PRO", 128, 3, "(41)99223-1207");
        Celular celular2 = new Celular();

        System.out.println(celular1);
        System.out.println(celular2);

        celular2.setMarca("Apple");
        celular2.setModelo("IPhone 13");
        celular2.setMemoria(128);
        celular2.setQntCameras(2);
        celular2.setTelefone("(41)99779-0886");

        System.out.println(celular1);
        System.out.println(celular2);

        Carro carro1 = new Carro("Renault", "Kwid", 2025, 69, "SUV Compacto");
        Carro carro2 = new Carro();

        System.out.println(carro1);
        System.out.println(carro2);

        carro2.setMarca("Chevrolet");
        carro2.setModelo("Tracker");
        carro2.setAno(2024);
        carro2.setCv(110);
        carro2.setTipo("SUV");

        System.out.println(carro1);
        System.out.println(carro2);
    }
}
