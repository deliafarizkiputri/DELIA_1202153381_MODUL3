package com.example.android.delia_1202153381_modul3;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText) findViewById(R.id.userName);
        final EditText password = (EditText) findViewById(R.id.password);
        Button login = (Button) findViewById(R.id.Login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_name = username.getText().toString();
                String pass_ =  password.getText().toString();
                if (user_name.equals("EAD")&&pass_.equals("MOBILE")){
                    //jika username dan password yang dimasukan benar
                    Toast.makeText(getApplicationContext(),"Username dan Password benar Anda berhasil Login",Toast.LENGTH_SHORT).show();
                    //tampilan message jika login berhasil
                    Intent list = new Intent(getApplicationContext(),ListAirMineral.class);
                    //akan menampilkan ke activity selanjutnya yaitu List Air
                    startActivity(list);
                    //activity List Air dijalankan
                }
                else {
                    //jika username dan password salah
                    Toast.makeText(getApplicationContext(),"Username dan Password tidak sesuai Anda gagal Login",Toast.LENGTH_SHORT).show();
                    //akan menampilkan message jika login gagal
                }
            }
        });
    }
}
