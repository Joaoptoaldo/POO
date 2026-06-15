public abstract class MaquinaIndustrial {
    private final String numeroSerie;
    private boolean ligada;
    private int pecasProduzidasTotais;
    private double energiaConsumidaKWh;

    public MaquinaIndustrial(String numeroSerie) {
        this.numeroSerie = numeroSerie;
        this.ligada = false;
        this.pecasProduzidasTotais = 0;
        this.energiaConsumidaKWh = 0.0;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getPecasProduzidasTotais() {
        return pecasProduzidasTotais;
    }

    public double getEnergiaConsumidaKWh() {
        return energiaConsumidaKWh;
    }

    /**
        * liga a máquina se ela ainda estiver desligada
     * @throws IllegalStateException se a máquina já estiver ligada
     */
    public void ligar() {
        if (ligada) {
            throw new IllegalStateException("A maquina ja esta ligada.");
        }
        ligada = true;
    }

    /**
        * desliga a máquina se ela ainda estiver ligada
     * @throws IllegalStateException se a máquina já estiver desligada
     */
    public void desligar() {
        if (!ligada) {
            throw new IllegalStateException("A maquina ja esta desligada.");
        }
        ligada = false;
    }

    /**
     * registra a produção de peças e o consumo de energia
     * @param pecas a quantidade de peças produzidas
     * @param energia a quantidade de energia consumida 
     */
    protected void registrarProducao(int pecas, double energia) {
        pecasProduzidasTotais += pecas;
        energiaConsumidaKWh += energia;
    }
    
    public abstract void produzirLote(int quantidade) throws Exception;
}
