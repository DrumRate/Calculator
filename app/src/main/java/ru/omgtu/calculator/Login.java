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
    Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buttonGoBack = (Button) findViewById(R.id.buttonIntent2);
        intent = new Intent(Login.this, MainActivity.class);
        buttonOk = (Button) findViewById(R.id.button);
        tvLogin = (TextView) findViewById(R.id.login);
        tvPassword = (TextView) findViewById(R.id.password);

        View.OnClickListener oclButtonGoBack = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        };
        buttonGoBack.setOnClickListener(oclButtonGoBack);
    }
}
