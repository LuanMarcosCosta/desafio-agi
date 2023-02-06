package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.pesquisaPage;

public class pesquisaStep {

    pesquisaPage pesquisa = new pesquisaPage();

    // @pesquisa-correta //
    @Quando("^estou no site$")
    public void estou_no_site()  {
        pesquisa.abreSite();
    }

    @Quando("^clico no icone de pesquisa$")
    public void clico_no_icone_de_pesquisa()  {
        pesquisa.cliqueLupa();
    }

    @Quando("^digito \"([^\"]*)\"$")
    public void digito(String arg1)  {
        pesquisa.preenchePesquisa("Teste");
    }

    @Quando("^clico em \"([^\"]*)\"$")
    public void clico_em(String arg1)  {
        pesquisa.cliquePesquisa();
    }

    @Entao("^vejo resultados da pesquisa$")
    public void vejo_resultados_da_pesquisa()  {
        pesquisa.verResultado();
    }

    // @pesquisa-incorreta //

    @Quando("^digito somente numeros$")
    public void digito_somente_numeros()  {

    }

    @Quando("^clico bo botao pesquisa$")
    public void clico_bo_botao_pesquisa() {

    }

    @Entao("^vejo nenhuma pesquisa encontrada$")
    public void vejo_nenhuma_pesquisa_encontrada()  {

    }
}
