package com.classes;

import com.interfaces.AparelhoTelefonico;

public class ICall implements AparelhoTelefonico {

  @Override
  public void ligar(String numero) {
    System.out.println("Ligando para " + numero + " no iCall");
  }

  @Override
  public void atender() {
    System.out.println("Atendendo chamada no iCall");
  }

  @Override
  public void iniciarCorreioDeVoz() {
    System.out.println("Iniciando correio de voz no iCall");
  }

}
