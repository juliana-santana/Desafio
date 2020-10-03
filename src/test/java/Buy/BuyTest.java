package Buy;

import org.junit.Test;

public class BuyTest extends BaseTest {

    @Test
    public void makeFirstBuyOnTheWebsite() {
        page.setSelectProduct();
        page.setAddToCart();
        page.setCheckout();
        page.setValidationProduct();
        page.setNext();
        page.setRegisterEmail("teste@testeee.com");
        page.setConfirmEmail();
        page.setSelectPeople();
        page.setName("Maria");
        page.setLastName("Alice");
        page.setPassword("123456789");
        page.setClickFieldDay();
        page.setSelectDay();
        page.setClickFieldMonth();
        page.setSelectMonth();
        page.setClickFieldYear();
        page.setSelectYear();
        page.setClickCheckNewsletter();
        page.setConfirmTerm();
        page.setNameForSend("Maria");
        page.setLastnameForSend("Alice");
        page.setAddress("Endereço para register nº123");
        page.setCity("Porto");
        page.setClickFieldState();
        page.setSelectState();
        page.setInformPostcode("90099");
        page.setInformPhone("5523987878787");
        page.setConfirmRegistration();
        page.setValidationAddressRegistation();
        page.setAdvance();
        page.setClickCheck();
        page.setConfirm();
        page.setValidationBuyValue();
        page.setFormOfPay();
        page.setCompleteBuy();
        page.setValidationBuySucess();
    }
}
