package br.com.cod3r.chain.ExercicioChain;

public class RespostaEmCSV implements Resposta {

    private Resposta resposta;



    public RespostaEmCSV(Resposta resposta) {
        this.resposta = resposta;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.CSV) {
            System.out.println(conta.getTitular() + ";" + conta.getSaldo());
        } else {
            if (resposta != null) {
                resposta.responde(req, conta);
            }
        }
    }
}
