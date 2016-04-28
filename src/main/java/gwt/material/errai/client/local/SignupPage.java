package gwt.material.errai.client.local;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import gwt.material.design.client.constants.ButtonType;
import gwt.material.design.client.constants.InputType;
import gwt.material.design.client.constants.WavesType;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialTextBox;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class SignupPage extends Composite {

    @Inject
    RootPanel root;

    @Inject
    @DataField("firstname")
    MaterialTextBox txtFirstName = new MaterialTextBox();

    @Inject
    @DataField("lastname")
    MaterialTextBox txtLastName = new MaterialTextBox();

    @Inject
    @DataField("username")
    MaterialTextBox txtUserName = new MaterialTextBox();

    @DataField("email")
    MaterialTextBox txtEmail = new MaterialTextBox();

    @Inject
    @DataField("password")
    MaterialTextBox txtPassword = new MaterialTextBox();

    @Inject
    @DataField("re-password")
    MaterialTextBox txtRePassword = new MaterialTextBox();

    @Inject
    @DataField("signup")
    MaterialButton btnSignUp = new MaterialButton();

    @Inject
    @DataField("login")
    MaterialButton btnLogin = new MaterialButton();

    @PostConstruct
    public void init() {
        txtFirstName.setPlaceholder("First Name");
        txtFirstName.setGrid("l6 m6 s12");

        txtLastName.setPlaceholder("Last Name");
        txtLastName.setGrid("l6 m6 s12");

        txtUserName.setPlaceholder("Username");
        txtUserName.setGrid("l6 m6 s12");

        txtEmail.setPlaceholder("Email");
        txtEmail.setGrid("l6 m6 s12");

        txtPassword.setPlaceholder("Password");
        txtPassword.setType(InputType.PASSWORD);
        txtPassword.setGrid("l6 m6 s12");

        txtRePassword.setPlaceholder("Retype your Password");
        txtRePassword.setGrid("l6 m6 s12");
        txtRePassword.setType(InputType.PASSWORD);

        btnLogin.setText("Login");
        btnLogin.setType(ButtonType.FLAT);
        btnLogin.setWaves(WavesType.DEFAULT);

        btnSignUp.setText("Sign Up");
        btnSignUp.setBackgroundColor("blue");
        btnSignUp.setWaves(WavesType.DEFAULT);

        root.add(this);
    }
}
