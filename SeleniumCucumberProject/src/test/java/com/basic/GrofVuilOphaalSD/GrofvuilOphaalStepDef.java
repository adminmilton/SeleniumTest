
package com.basic.GrofVuilOphaalSD;
import java.awt.RenderingHints.Key;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.it.Date;

public class GrofvuilOphaalStepDef {

	
WebDriver driver;

@Test
@Given("^gebruiker opent de website amstelveen\\.nl$")
public void gebruiker_opent_de_website_amstelveen_nl() throws Throwable {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\milton\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
    driver = new FirefoxDriver();
	driver.manage().window().maximize();
    driver.get("https://www.amstelveen.nl/");
    Thread.sleep(8000);
	
}

@Then("^gebruiker klikt op icoon Afval en grofvuil$")
public void gebruiker_klikt_op_icoon_Afval_en_grofvuil() throws Throwable {
	 driver.findElement(By.xpath("//span[@class='icoon webicon webicon-afvalcontainer']")).click();
	 Thread.sleep(2000);   
    
}

@Then("^gebruiker klikt op knop Afspraak maken grofvuil ophalen$")
public void gebruiker_klikt_op_knop_Afspraak_maken_grofvuil_ophalen() throws Throwable {
	driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Afvalkalender'])[1]/following::h2[1]")).click();
    
}

@Then("^gebruiker klikt op knop Regelen zonder inloggen$")
public void gebruiker_klikt_op_knop_Regelen_zonder_inloggen() throws Throwable {
	driver.findElement(By.xpath("//a[contains(.,'Regelen zonder inloggen')]")).click();
    Thread.sleep(6000);

    
}

@Then("^gebruiker kiest Aanhef dhr bij Aanhef$")
public void gebruiker_kiest_Aanhef_dhr_bij_Aanhef() throws Throwable {
	driver.findElement(By.xpath("//input[@value='dhr.'and @type='radio']")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
}

@Then("^gebruiker vult \"([^\"]*)\"  in veld Voorletters$")
public void gebruiker_vult_in_veld_Voorletters(String Voorletters) throws Throwable {
    driver.findElement(By.xpath("//fieldset[6]/div/div[2]/div/div/input")).sendKeys(Voorletters);
    Thread.sleep(500);
}

@Then("^gebruiker vult \"([^\"]*)\" in veld Voorvoegsel$")
public void gebruiker_vult_in_veld_Voorvoegsel(String Voorvoegsel) throws Throwable {
	driver.findElement(By.xpath("//fieldset[6]/div/div[3]/div/div/input")).sendKeys(Voorvoegsel);
	Thread.sleep(500);
}

@Then("^gebruiker vult \"([^\"]*)\" in veld Achternaam$")
public void gebruiker_vult_in_veld_Achternaam(String Achternaam) throws Throwable {
	driver.findElement(By.xpath("//fieldset[6]/div/div[4]/div/div/input")).sendKeys(Achternaam);

	Thread.sleep(500);
}

@Then("^gebruiker vult \"([^\"]*)\" in veld Email$")
public void gebruiker_vult_in_veld_Email(String Email) throws Throwable {
	driver.findElement(By.xpath("//fieldset[6]/div/div[5]/div/div/input")).sendKeys(Email);
    
}

@Then("^gebruiker vult \"([^\"]*)\" in veld Telefoon$")
public void gebruiker_vult_in_veld_Telefoon(String Telefoon) throws Throwable {
	driver.findElement(By.xpath("//fieldset[6]/div/div[6]/div/div/input")).sendKeys(Telefoon);
	
   //driver.quit();
  //  driver = null;
}


@Then("^gebruiker vult in Postcode$")
public void gebruiker_vult_in_Postcode() throws Throwable {
    
    
}

@Then("^gebruiker vult in Plaats$")
public void gebruiker_vult_in_Plaats() throws Throwable {
    
    
}

@Then("^gebruiker vult in Eventuele beschrijving van de locatie$")
public void gebruiker_vult_in_Eventuele_beschrijving_van_de_locatie(String locatie) throws Throwable {
    driver.findElement(By.xpath("//textarea[@placeholder='Eventuele beschrijving van de locatie']")).sendKeys(locatie);
    
}

@Then("^gebruiker kiest voor bij Uw meldingSoort afvalHuishoudelijk Brandbaar$")
public void gebruiker_kiest_voor_bij_Uw_meldingSoort_afvalHuishoudelijk_Brandbaar() throws Throwable {
	WebElement radio1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[11]/div/div[1]/fieldset/div/label[1]"));
    radio1.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
}

@Then("^gebruiker kiest bij Huishoudelijk Brandbaar voor Papier & karton$")
public void gebruiker_kiest_bij_Huishoudelijk_Brandbaar_voor_Papier_karton() throws Throwable {
	WebElement option1 = driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[11]/div/div[2]/fieldset/div/label[1]"));
    option1.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
	
}

@Then("^gebruiker selecteert in dropdownListKeuze ophaaldatum voor een datum$")
public void gebruiker_selecteert_in_dropdownListKeuze_ophaaldatum_voor_een_datum() throws Throwable {
	 WebElement datumdd = driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[12]/div/div[1]/label"));
	 datumdd.click();
	 WebElement datumd = driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[12]/div/div[1]/div/div/ul/li/div[3]/span/div"));
	 datumd.click();
	 
    
}

@Then("^gebruiker selecteert in dropdownList'Omvang in kubieke voor een meter$")
public void gebruiker_selecteert_in_dropdownList_Omvang_in_kubieke_meter_voor_een_meter() throws Throwable {
	WebElement dd2 =driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[12]/div/div[3]/label")); 
    dd2.click();
    WebElement dd2meter =driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[12]/div/div[3]/div/div/ul/li/div[3]/span/div")); 
    dd2meter.click();
}

@Then("^gebruiker vult in Test bij veld Toelichting melding \"([^\"]*)\"$")
public void gebruiker_vult_in_Test_bij_veld_Toelichting_melding(String beschrijving) throws Throwable {
  driver.findElement(By.xpath("//textarea[@placeholder='Toelichting melding']")).sendKeys(beschrijving);
	    
}

@Then("^gebruiker vinkt bij Heeft u een Amstelveenpas\\? voor Nee$")
public void gebruiker_vinkt_bij_Heeft_u_een_Amstelveenpas_voor_Nee() throws Throwable {
	WebElement radioNee = driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[12]/div/div[8]/fieldset/div/label[2]"));
    radioNee.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(1000);
    
    
}

@Then("^gebruiker vinkt bij Mogen wij u informeren over deze zaak\\? voor Nee$")
public void gebruiker_vinkt_bij_Mogen_wij_u_informeren_over_deze_zaak_voor_Nee() throws Throwable {
	WebElement radioZaakNee = driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[14]/div/div[1]/fieldset/div/label[2]"));
	radioZaakNee.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(1000);
}

@Then("^gebruiker vinkt aan bij ondertekening$")
public void gebruiker_vinkt_aan_bij_ondertekening() throws Throwable {
	WebElement radioOnderteken = driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[17]/div/div[5]/div/label"));
	radioOnderteken.click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(1000);
	
	
	
	
	
}
@Then("^gebruiker klikt op knop Indienen$")
public void gebruiker_klikt_op_knop_Indienen() throws Throwable {
    driver.findElement(By.xpath("//button[@title='indienen']")).click();
    
}

@Then("^browser suit af\\.$")
public void browser_suit_af() throws Throwable {
    driver.quit();
    driver = null;
    
}

@Then("^gebruiker kiest voor bij Uw meldingSoort afval Huishoudelijk Bruin- /witgoed & metaal$")
public void gebruiker_kiest_voor_bij_Uw_meldingSoort_afval_Huishoudelijk_Bruin_witgoed_metaal() throws Throwable {
    driver.findElement(By.xpath("(//span[contains(@class,'check')])[16]")).click();
    
}

@Then("^gebruiker kiest voor bij Huishoudelijk Bruin- /witgoed & metaal\\* voor Fornuis$")
public void gebruiker_kiest_voor_bij_Huishoudelijk_Bruin_witgoed_metaal_voor_Fornuis() throws Throwable {
	 driver.findElement(By.xpath("(//span[contains(@class,'check')])[26]")).click();
    
}

@Then("^gebruiker kiest voor bij Uw meldingSoort afval Huishoudelijk Tuin- & snoeiafval$")
public void gebruiker_kiest_voor_bij_Uw_meldingSoort_afval_Huishoudelijk_Tuin_snoeiafval() throws Throwable {
	 driver.findElement(By.xpath("(//span[contains(@class,'check')])[17]")).click();
	   
    
}
@Then("^gebruiker kiest Aanhef mvr bij Aanhef$")
public void gebruiker_kiest_Aanhef_mvr_bij_Aanhef() throws Throwable {
	driver.findElement(By.xpath("//input[@value='mevr.'and @type='radio']")).click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}
@Then("^gebruiker vult in straat$")
public void gebruiker_vult_in_straat() throws Throwable {
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[9]/div/div[4]/label")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[9]/div/div[4]/div/div/ul/li/div[3]/span/div")).click();
	   
}

@Then("^gebruiker vult in nummer$")
public void gebruiker_vult_in_in_nummer() throws Throwable {
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[9]/div/div[5]/div/div/div[1]/span/i")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/div/div/div/div[2]/div/div/form/fieldset[9]/div/div[5]/div/div/ul/li/div[3]/span/div")).click();
	  
	
	
}

@Then("^gebruiker vult in Eventuele \"([^\"]*)\" van de locatie$")
public void gebruiker_vult_in_Eventuele_van_de_locatie(String beschrijving) throws Throwable {
   driver.findElement(By.xpath("//textarea[contains(@placeholder,'Eventuele beschrijving van de locatie')]")).sendKeys(beschrijving);
    
}
}




