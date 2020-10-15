package Pages;

import org.openqa.selenium.WebDriver;

public class BuyPage {

    private DslPage dsl;

    public BuyPage(WebDriver navegador){
        dsl = new DslPage(navegador);
    }

    public void setSelectProduct(){
        dsl.choose("Printed Dress");
    }
    public void setAddToCart(){
        dsl.select("//div[1]/p/button/span");
    }
    public void setCheckout(){
        dsl.select("//div[4]/a/span");
    }
    public void setValidationProduct(){
        dsl.validationProduct("Printed Dress");
    }
    public void setNext(){
        dsl.select("//div[3]/div/p[2]/a[1]/span");
    }
    public void setRegisterEmail(String email){
        dsl.register("email_create", + Math.round(Math.random() * 1000) + email);
    }
    public void setConfirmEmail(){
        dsl.confirm("#SubmitCreate > span");
    }
    public void setSelectPeople(){
        dsl.fill("id_gender2");
    }
    public void setName(String name){
        dsl.register("customer_firstname", name);
    }
    public void setLastName(String lastname){
        dsl.register("customer_lastname", lastname);
    }
    public void setPassword(String password){
        dsl.register("passwd", password);
    }
    public void setClickFieldDay(){
        dsl.fill("days");
    }
    public void setSelectDay(){
        dsl.confirm("#days > option:nth-child(7)");
    }
    public void setClickFieldMonth(){
        dsl.fill("months");
    }
    public void setSelectMonth(){
        dsl.select("//*[@id=\"months\"]/option[5]");
    }
    public void setClickFieldYear(){
        dsl.fill("years");
    }
    public void setSelectYear(){
        dsl.select("//div[3]/div/select/option[24]");
    }
    public void setClickCheckNewsletter(){
        dsl.fill("newsletter");
    }
    public void setConfirmTerm(){
        dsl.fill("optin");
    }
    public void setNameForSend(String name){
        dsl.register("firstname", name);
    }
    public void setLastnameForSend(String lastname){
        dsl.register("lastname", lastname);
    }
    public void setAddress(String address){
        dsl.inform("address1", address);
    }
    public void setCity(String city){
        dsl.register("city", city);
    }
    public void setClickFieldState(){
        dsl.fill("id_state");
    }
    public void setSelectState(){
        dsl.select("//*[@id=\"id_state\"]/option[6]");
    }
    public void setInformPostcode(String postcode){
        dsl.register("postcode", postcode);
    }
    public void setInformPhone(String phone){
        dsl.register("phone_mobile", phone);
    }
    public void setConfirmRegistration(){
        dsl.select("//div[4]/button/span");
    }
    public void setValidationAddressRegistation(){
        dsl.validationAddress("//*[@id=\"address_delivery\"]/li[4]");
    }
    public void setAdvance(){
        dsl.select("//p/button/span");
    }
    public void setClickCheck(){
        dsl.fill("cgv");
    }
    public void setConfirm(){
        dsl.select("//*[@id=\"form\"]/p/button/span");
    }
    public void setValidationBuyValue(){
        dsl.validationBuyValue("total_price");
    }
    public void setFormOfPay(){
        dsl.pay("bankwire");
    }
    public void setCompleteBuy(){
        dsl.select("//*[@id=\"cart_navigation\"]/button/span");
    }
    public void setValidationBuySucess(){
        dsl.validationBuy("#center_column > div > p");
    }

}
