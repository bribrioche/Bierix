package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class login_class extends AppCompatActivity
{

    private Button Connexion;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Connexion = (Button) findViewById(R.id.connexion_bttn);
        Connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                openMainActivity();
            }
        });
    }

    public void openMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}