package br.com.cod3r.observer.Youtube;

public class Namorada implements ChegadaAniversarianteObserver{

    @Override
    public void chegou(ChegadaAniversarianteEvent event) {
        System.out.println("Apagar as luzes...");
        System.out.println("Fazer silencio...");
        System.out.println("Surpresa!!!");
    }
}
