package ua.com.rozetka;

import static com.codeborne.selenide.Selenide.$;

public class LoginPopup {
    public LoginPopup fillLogin(String input){
        $("input[id='auth_email']").val(input);
        return this;
    }

    public LoginPopup fillPassword(String input){
        $("input[id='auth_pass']").val(input);
        return this;
    }

    public LoginPopup clickOnLogin(){
        $(".form__row .button.auth-modal__submit").click();
        return this;
    }
}
