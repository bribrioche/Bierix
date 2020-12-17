package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Description_biere extends AppCompatActivity {

    private TextView paiement_redirection;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_biere);
        initActivity();
    }

    private void initActivity()
    {
        //récupération des objets graphiques
        paiement_redirection = (TextView) findViewById(R.id.paiement_redirection);

        //méthode pour gérer l'évèment en question
        createOnClicRedir_paiement();
    }

    private void createOnClicRedir_paiement()
    {
        paiement_redirection.setOnClickListener(new TextView.OnClickListener()
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
        Intent intent = new Intent(Description_biere.this, AjoutPanier.class);
        startActivity(intent);
    }
}