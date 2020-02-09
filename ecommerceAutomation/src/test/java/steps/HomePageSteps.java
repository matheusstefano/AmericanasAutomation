package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.jsoup.select.Evaluator.ContainsText;
import org.junit.Assert;
import pages.HomePage;
import support.BaseSteps;

public class HomePageSteps extends BaseSteps {

	public static HomePage homePage = new HomePage(driver);

	@Given("Que o usuario esteja no site da Americanas")
	public void que_o_usuario_esteja_no_site_da_Americanas() {
		homePage.openPage();
	}

	@When("^Digitar \"([^\\\"]*)\" no campo de busca$")
	public void digitar_no_campo_de_busca(String value) throws InterruptedException {
		homePage.writeFieldSearch(value);
	}

	@And("Clicar em buscar")
	public void clicar_em_buscar() {
		homePage.clickForSearch();
	}

	@Then("Devera ser apresentado o produto")
	public void devera_ser_apresentado_o_produto() throws InterruptedException {
		Assert.assertEquals("iphone", homePage.checkTitleForSearch());
	}

	@And("O usuario devera adicionar ao carrinho")
	public void o_usuario_devera_adicionar_ao_carrinho() throws InterruptedException {
		homePage.selecionarProduto();
		Thread.sleep(2000);
		homePage.adicionarCarrinho();
		homePage.clickContinue();
		Assert.assertTrue(homePage.checkCarrinho().contains("Iphone"));
	}

}
