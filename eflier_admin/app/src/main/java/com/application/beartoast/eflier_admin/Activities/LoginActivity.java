package com.application.beartoast.eflier_admin.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.application.beartoast.eflier_admin.R;

public class LoginActivity extends AppCompatActivity {

    EditText UsernameText, PasswordText;
    Button LoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        UsernameText = (EditText) findViewById(R.id.lg_username_textbox);
        PasswordText = (EditText) findViewById(R.id.lg_password_textbox);
        LoginButton = (Button) findViewById(R.id.lg_login_button);

        /* INSTANTIATE HANDLERS */
        ButtonHandler bh = new ButtonHandler();

        /* SET EVENT LISTENERS */
        LoginButton.setOnClickListener(bh);

        UsernameText.requestFocus();
    }

    private class ButtonHandler implements View.OnClickListener {
        public void onClick(View v) {
            if (v.getId() == LoginButton.getId()) {
                Intent mainIntent = new Intent(LoginActivity.this,MainMenuActivity.class);
                LoginActivity.this.startActivity(mainIntent);
                LoginActivity.this.finish();
            }
        }
    }
}
