package com.classes;

import com.interfaces.ReprodutorMusical;

public class ITunes implements ReprodutorMusical {

  @Override
  public void tocar() {
    System.out.println("Tocando música no iTunes");
  }

  @Override
  public void pausar() {
    System.out.println("Pausando música no iTunes");
  }

  @Override
  public void selecionarMusica() {
    System.out.println("Selecionando música no iTunes");
  }

}
