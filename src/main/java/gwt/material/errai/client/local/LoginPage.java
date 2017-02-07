package gwt.material.errai.client.local;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import gwt.material.design.client.constants.*;
import gwt.material.design.client.ui.MaterialButton;
import gwt.material.design.client.ui.MaterialCheckBox;
import gwt.material.design.client.ui.MaterialTextBox;
import gwt.material.design.client.ui.animate.MaterialAnimator;
import gwt.material.design.client.ui.animate.Transition;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.security.shared.api.annotation.RestrictedAccess;
import org.jboss.errai.ui.nav.client.local.DefaultPage;
import org.jboss.errai.ui.nav.client.local.Navigation;
import org.jboss.errai.ui.nav.client.local.Page;
import org.jboss.errai.ui.nav.client.local.TransitionTo;
import org.jboss.errai.ui.nav.client.local.api.SecurityError;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.EventHandler;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
@Page(path = "login", role = {org.jboss.errai.ui.nav.client.local.api.LoginPage.class, SecurityError.class} )
public class LoginPage extends Composite {


    @Inject
    @DataField("username")
    MaterialTextBox txtUserName = new MaterialTextBox();

    @Inject
    @DataField("password")
    MaterialTextBox txtPassword = new MaterialTextBox();

    @Inject
    @DataField("remember-me")
    MaterialCheckBox cbRememberMe = new MaterialCheckBox();

    @Inject
    @DataField("login")
    MaterialButton btnLogin = new MaterialButton();

    @Inject
    @DataField("signup")
    MaterialButton btnSignUp = new MaterialButton();

    // Navigations
    @Inject private TransitionTo<SignupPage> signupTransition;

    @Inject
    RootPanel rootPanel;

    @Inject
    Navigation navigation;

    @PostConstruct
    public void init() {
        LoginPage.this.getElement().getStyle().setOpacity(0);
        Runnable callback = new Runnable() {
            @Override
            public void run() {
                LoginPage.this.getElement().getStyle().setOpacity(1);
            }
        };
        MaterialAnimator.animate(Transition.FADEINUP, this, 200, callback);
        txtUserName.setPlaceholder("Username");
        txtUserName.setIconType(IconType.EMAIL);

        txtPassword.setPlaceholder("Password");
        txtPassword.setType(InputType.PASSWORD);
        txtPassword.setIconType(IconType.SECURITY);

        cbRememberMe.setText("Remember Me");
        cbRememberMe.setType(CheckBoxType.FILLED);

        btnLogin.setText("Login");
        btnLogin.setBackgroundColor("blue");
        btnLogin.setWaves(WavesType.DEFAULT);

        btnSignUp.setText("Sign Up");
        btnSignUp.setType(ButtonType.FLAT);
        btnSignUp.setWaves(WavesType.DEFAULT);

        btnSignUp.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent clickEvent) {
                signupTransition.go();
            }
        });

        rootPanel.add(this);
    }
}
