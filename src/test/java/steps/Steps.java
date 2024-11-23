package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.reusableMethods;
import org.junit.Assert;
import pages.DopingPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Steps {
    DopingPage dopingPage = new DopingPage();
    @Given("Dopinghafiza ana sayfası açıldı")
    public void dopinghafizaAnaSayfasıAcıldı() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @When("Sayfa yüklendiği zaman")
    public void sayfaYuklendigiZaman() throws InterruptedException {
        reusableMethods.waitForElementToBeVisible(dopingPage.yorumlarVeBasarilarimiz);
    }
    @Then("Sayfa başlığı doping hafıza içeriyor")
    public void sayfaBaslıgıDopingHafızaIceriyor() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Doping Hafıza";
        assert actualTitle != null;
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Sayfa başlığı doping hafıza içeriyor.");
        } else {
            System.out.println("Sayfa başlığı doping hafıza içermiyor.");
        }
    }

    @Given(": Kullanıcı ana sayfadadır")
    public void kullanıcıAnaSayfadadır() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = ConfigReader.getProperty("url");
        Assert.assertEquals(expectedURL, actualURL);
    }

    @When(": Yorumlar ve Başarılarımız butonunun tıklanabilir.")
    public void yorumlarVeBasarılarımızButonununTıklanabilir() {
        reusableMethods.waitForElementToBeClickable(dopingPage.yorumlarVeBasarilarimiz);
    }

    @Then(": Yorumlar ve Başarılarımız butonuna tıklandı.")
    public void yorumlarVeBasarılarımızButonunaTıklandı() {
        dopingPage.yorumlarVeBasarilarimiz.click();
    }
    @And(": Kullanıcı Yorumlar ve Başarılarımız Sayfasında.")
    public void kullanıcıYorumlarVeBasarılarımızSayfasında() {
        reusableMethods.waitForElementToBeVisible(dopingPage.yorumlarVeBasarilarimizHeader);
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = ConfigReader.getProperty("url") + "yorumlar";
        Assert.assertEquals(expectedURL, actualURL);
    }

    @Given(": Paketlerimiz butonunun tıklanabilir olmasını bekleyin.")
    public void paketlerimizButonununTıklanabilirOlmasınıBekleyin() {
        reusableMethods.waitForElementToBeClickable(dopingPage.paketlerimiz);
    }

    @When(": Paketlerimiz butonuna tıklayın")
    public void paketlerimizButonunaTıklayın() {
        dopingPage.paketlerimiz.click();
    }

    @Then(": Paketlerimiz sayfasında paketlerin geldiği doğrulanmalıdır.")
    public void paketlerimizSayfasındaPaketlerinGeldigiDogrulanmalıdır() throws InterruptedException {
        reusableMethods.waitForElementToBeVisible(dopingPage.paketlerBody);
        if(dopingPage.paketlerBody.isDisplayed()){
            System.out.println("Paketlerimiz sayfasında paketlerin geldiği doğrulanmıştır.");
        }
        else{
            System.out.println("Paketlerimiz sayfasında paketlerin gelmediği doğrulanmıştır.");
        }


    }


}
