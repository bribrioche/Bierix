package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class creation_account extends AppCompatActivity
{

    private TextView Inscription_bttn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creation_account);
        initActivity();
    }

    private void initActivity()
    {
        //récupération des objets graphiques
        Inscription_bttn = (TextView) findViewById(R.id.Inscription_bttn);

        //méthode pour gérer l'évèment en question
        createOnClicInscription_bttn();
    }

    private void createOnClicInscription_bttn()
    {
        Inscription_bttn.setOnClickListener(new ImageButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                confirmation();
            }
        });
    }

    public void confirmation()
    {
        Intent intent = new Intent(creation_account.this, Redirection.class);
        startActivity(intent);
    }

}