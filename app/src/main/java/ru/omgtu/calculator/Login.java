package ru.omgtu.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button buttonGoBack;
    Intent intent;
    TextView tvLogin;
    TextView tvPassword;
    TextView tvLoginHint;
    Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        intent = new Intent(Login.this, MainActivity.class);
        buttonGoBack = (Button) findViewById(R.id.buttonIntent2);
        buttonOk = (Button) findViewById(R.id.button);
        tvLogin = (TextView) findViewById(R.id.login);
        tvPassword = (TextView) findViewById(R.id.password);
        tvLoginHint = (TextView) findViewById(R.id.textLoginHint);
        View.OnClickListener oclButtonOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvLoginHint.setText(getResources().getString(R.string.hintLogin) + ": "
                        + tvLogin.getText() + " | " +
                        getResources().getString(R.string.hintPassword) + ": " +
                        tvPassword.getText());
            }
        };
        View.OnClickListener oclButtonGoBack = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        };
        buttonOk.setOnClickListener(oclButtonOk);
        buttonGoBack.setOnClickListener(oclButtonGoBack);

    }
}
