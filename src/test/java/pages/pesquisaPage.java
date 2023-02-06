package pages;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;

import static runner.RunBase.getdriver;
import static support.Utils.*;

public class pesquisaPage {

 // @pesquisa-correta //
 private By vBotaoLupa = By.id("search-open");
 private By vCampoPesquisa = By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/form/label/input");
 private By vBotaoPesquisar = By.xpath("//*[@id=\"masthead\"]/div[1]/div[2]/form/input");
 private By vMensagem = By.xpath("//*[@id=\"primary\"]/header/h1");

 public void abreSite(){
  getdriver().manage().window().maximize();
  getdriver().get("https://blogdoagi.com.br/");
 }

 // @pesquisa-correta //
 public void cliqueLupa(){
   clickElement(vBotaoLupa);
 }

 public void preenchePesquisa(String pesquisaTitulo){
  fillField(vCampoPesquisa, pesquisaTitulo);
 }

 public void cliquePesquisa(){
  clickElement(vBotaoPesquisar);
 }

 public void verResultado(){
  checkMessage(vMensagem, "Resultados da busca por: Teste");
 }

 // @pesquisa-incorreta //


}
