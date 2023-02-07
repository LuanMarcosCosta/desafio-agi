# language: pt

Funcionalidade: Pesquisar no site da Agi
  Eu como usuario
  quero acessar o site da agi
  Para pesquisar no site

  Contexto: Visualizar site
    Quando estou no site
    E clico no icone de pesquisa

  @pesquisa-correta
  Cenario: Pesquisa por titulos
    E digito "Teste"
    E clico em "pesquisar"
    Entao vejo resultados da pesquisa

  @pesquisa-incorreta
  Cenario: pesquisa por apenas numeros
    E digito somente numeros
    E clico bo botao pesquisa
    Entao vejo nenhuma pesquisa encontrada
