package br.com.steeldevelopers.fmapet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private AutoCompleteTextView edtLogin, edtPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        setValue();
        onClick();
    }

    private void setValue(){
        edtLogin = (AutoCompleteTextView) findViewById(R.id.edtLogin);
        edtPassword = (AutoCompleteTextView) findViewById(R.id.edtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    private void onClick(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextView();
            }
        });

        edtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtPassword.requestFocus();
            }
        });

        edtPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextView();
            }
        });
    }

    private void nextView(){
        //                startActivity(new Intent(getBaseContext(), null));
        String string = ("Login: " + edtLogin.getText().toString() +
                "\n" + "Password: " + edtPassword.getText().toString());
        Toast.makeText(getBaseContext(), string, Toast.LENGTH_SHORT).show();
    }
}
