package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class login_class extends AppCompatActivity
{

    private TextView Connexion;

    @SuppressLint("WrongViewCast")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Connexion = (TextView) findViewById(R.id.connexion_bttn);
        Connexion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view)
            {
                openMainActivity();
        }});
    }

    public void openMainActivity()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}