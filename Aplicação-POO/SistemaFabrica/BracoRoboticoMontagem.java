public class BracoRoboticoMontagem extends MaquinaIndustrial {
    private double percentualCalibracao;

    public BracoRoboticoMontagem(String numeroSerie) {
        super(numeroSerie);
        this.percentualCalibracao = 100.0;
    }

    public double getPercentualCalibracao() {
        return percentualCalibracao;
    }

    public void recalibrar() {
        percentualCalibracao = 100.0;
    }

    /**
        * produz um lote de peças, respeitando o limite mínimo de calibração
        * @param quantidade a quantidade de peças a ser produzida
        * @throws MaquinaDesligadaException se a máquina estiver desligada
        * @throws EquipamentoDescalibradoException se a calibração estiver abaixo do mínimo
     */
    @Override
    public void produzirLote(int quantidade) throws Exception {
        if (!isLigada()) {
            throw new MaquinaDesligadaException("Maquina desligada.");
        }

        if (percentualCalibracao < 20.0) {
            throw new EquipamentoDescalibradoException("Braco robotico descalibrado.");
        }

        double energia = 15.0;
        percentualCalibracao -= quantidade * 0.5;
        if (percentualCalibracao < 0.0) {
            percentualCalibracao = 0.0;
        }

        registrarProducao(quantidade, energia);
        System.out.println("Braco " + getNumeroSerie() + " produziu lote de " + quantidade + " pecas.");
    }
}
