package steps;


import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class DescontosSteps {

    WebDriver driver;

    @Dado("^que estou no site da qazando")
    public void acessar_site_qazando() {

        driver.get("https://www.qazando.com.br/curso.html");

    }

    @Quando("^eu preencho meu e-mail$")
    public void eu_preencho_meu_e_mail() {


    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() {


    }

    @Entao("^eu vejo o código de desconto$")
    public void eu_vejo_o_código_de_desconto() {
        System.out.println("Passou 1");

    }
}
