package br.com.cod3r.chain.ExercicioChain;

public class VerificaResposa {

    public void responde(Formato formato){
        Resposta percentual = new RespostaEmPorcento(null);

        Resposta csv = new RespostaEmCSV(percentual);
        Resposta xml = new RespostaEmXML(csv);
        Requisicao req = new Requisicao(formato);
        Conta conta= new Conta("Teste", 3000);
        xml.responde(req, conta);

    }
}
