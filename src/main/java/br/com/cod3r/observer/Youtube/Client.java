package br.com.cod3r.observer.Youtube;

public class Client {
    public static void main(String[] args) {
        Namorada namorada = new Namorada();
        Porteiro porteiro = new Porteiro();

        porteiro.addChegadaAniversarianteObserver(namorada);

        porteiro.start();
    }
}
