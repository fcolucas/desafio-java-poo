package com.classes;

import com.interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {

  @Override
  public void exibirPagina(String pagina) {
    System.out.println("Exibindo página " + pagina + " no Safari");
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba no Safari");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("Atualizando página no Safari");
  }

}
