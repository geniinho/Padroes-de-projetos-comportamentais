package br.com.cod3r.chain.ExercicioChain;

public class RespostaEmPorcento implements Resposta{

    private Resposta resposta;

    public RespostaEmPorcento(Resposta resposta) {
        this.resposta = resposta;
    }

    @Override
    public void responde(Requisicao req, Conta conta) {
        if (req.getFormato() == Formato.PORCENTO) {
            System.out.println(conta.getTitular() + "%" + conta.getSaldo());
        } else {
            if (resposta != null) {
                resposta.responde(req, conta);
            }
        }
    }
}
