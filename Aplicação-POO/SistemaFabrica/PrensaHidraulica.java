public class PrensaHidraulica extends MaquinaIndustrial {
    private double temperaturaAtual;

    public PrensaHidraulica(String numeroSerie) {
        super(numeroSerie);
        this.temperaturaAtual = 25.0;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void acionarRefrigeracao() {
        temperaturaAtual = 25.0;
    }

    /**
        * produz um lote de peças e atualiza a temperatura da prensa
        * @param quantidade a quantidade de peças a ser produzida
        * @throws MaquinaDesligadaException se a máquina estiver desligada
        * @throws SuperaquecimentoException se a temperatura já estiver no limite
    */
    @Override
    public void produzirLote(int quantidade) throws Exception {
        if (!isLigada()) {
            throw new MaquinaDesligadaException("Maquina desligada.");
        }

        if (temperaturaAtual >= 90.0) {
            throw new SuperaquecimentoException("Prensa superaquecida.");
        }

        temperaturaAtual += quantidade * 1.5;
        double energia = quantidade * 2.0;
        registrarProducao(quantidade, energia);
        System.out.println("Prensa " + getNumeroSerie() + " produziu lote de " + quantidade + " pecas.");
    }
}
