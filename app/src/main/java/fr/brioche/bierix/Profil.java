package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Profil extends AppCompatActivity {

    private TextView bouton_accueil;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        initActivity();
    }

    private void initActivity()
    {
        //récupération des objets graphiques
        bouton_accueil = (TextView) findViewById(R.id.bouton_accueil);

        //méthode pour gérer l'évèment en question
        createOnClicRedir_accueil();
    }

    private void createOnClicRedir_accueil()
    {
        bouton_accueil.setOnClickListener(new TextView.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                confirmation();
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
    }

    public void confirmation()
    {
        Intent intent = new Intent(Profil.this, MainActivity.class);
        startActivity(intent);
    }
}