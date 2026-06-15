public class Mago extends Personagem implements Magico {

  public Mago(String nome, int pontosVida) {
    super(nome, pontosVida);
  }

  @Override
  public void atacar(Personagem alvo) throws AlvoInvalidoException {
    lancarFeitico(alvo);
  }

  @Override
  public void lancarFeitico(Personagem alvo) throws AlvoInvalidoException {
    if (alvo.getPontosVida() <= 0) {
      throw new AlvoInvalidoException(alvo.getNome() + " já está fora de combate!");
    }
    
    System.out.println(getNome() + " lança um feitiço em " + alvo.getNome());
    alvo.receberDano(15);
  }
}