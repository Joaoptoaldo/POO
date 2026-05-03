import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InjetoraPlastico injetora = new InjetoraPlastico("inj-001");
        BracoRoboticoMontagem braco = new BracoRoboticoMontagem("bra-001");
        PrensaHidraulica prensa = new PrensaHidraulica("pre-001");


        List<MaquinaIndustrial> maquinas = new ArrayList<>();
        maquinas.add(injetora);
        maquinas.add(braco);
        maquinas.add(prensa);

        injetora.abastecerPlastico(10.0);

        for (MaquinaIndustrial maquina : maquinas) {
            try {
                maquina.produzirLote(60);
            } catch (MaquinaDesligadaException e) {
                System.out.println("Máquina desligada: " + maquina.getNumeroSerie());
            } catch (Exception e) {
                System.out.println("Erro no pré-teste: " + e.getMessage());
            }
        }

        for (MaquinaIndustrial maquina : maquinas) {
            maquina.ligar();
        }

        for (int lote = 1; lote <= 3; lote++) {
            for (MaquinaIndustrial maquina : maquinas) {
                try {
                    maquina.produzirLote(40);
                } catch (FaltaMateriaPrimaException e) {
                    System.out.println("ALARME INJETORA: Falta matéria prima!");
                } catch (EquipamentoDescalibradoException e) {
                    System.out.println("ALARME BRACO: Equipamento descalibrado!");
                } catch (SuperaquecimentoException e) {
                    System.out.println("ALARME PRENSA: Superaquecimento!");
                } catch (MaquinaDesligadaException e) {
                    System.out.println("ALARME: Maquina desligada durante o turno!");
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }

        System.out.println("\nRELATORIO FINAL");
        for (MaquinaIndustrial maquina : maquinas) {
            System.out.println("Numero de serie: " + maquina.getNumeroSerie());
            System.out.println("Total de pecas produzidas: " + maquina.getPecasProduzidasTotais());
            System.out.println("Energia total consumida (kWh): " + maquina.getEnergiaConsumidaKWh());
            System.out.println();
        }
    }
}
