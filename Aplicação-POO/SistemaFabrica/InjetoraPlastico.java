public class InjetoraPlastico extends MaquinaIndustrial {
    private double kgMateriaPrima;

    public InjetoraPlastico(String numeroSerie) {
        super(numeroSerie);
        this.kgMateriaPrima = 0.0;
    }

    public double getKgMateriaPrima() {
        return kgMateriaPrima;
    }

    /**
        * abastece a máquina com plástico, sem aceitar valor negativo
     * @param kg a quantidade de plástico a ser abastecida
     */
    public void abastecerPlastico(double kg) {
        if (kg < 0) {
            throw new IllegalArgumentException("A quantidade de plastico nao pode ser negativa.");
        }
        kgMateriaPrima += kg;
    }

    /**
        * produz um lote de peças usando plástico como matéria-prima
     * @param quantidade a quantidade de peças a ser produzida
        * @throws MaquinaDesligadaException se a máquina estiver desligada
        * @throws FaltaMateriaPrimaException se o plástico for insuficiente
        */
    @Override
    public void produzirLote(int quantidade) throws Exception {
        if (!isLigada()) {
            throw new MaquinaDesligadaException("Maquina desligada.");
        }

        double plasticoNecessario = quantidade * 0.2;
        if (kgMateriaPrima < plasticoNecessario) {
            throw new FaltaMateriaPrimaException("Plastico insuficiente para o lote.");
        }

        kgMateriaPrima -= plasticoNecessario;
        double energia = quantidade * 0.5;
        registrarProducao(quantidade, energia);
        System.out.println("Injetora " + getNumeroSerie() + " produziu lote de " + quantidade + " pecas.");
    }
}
