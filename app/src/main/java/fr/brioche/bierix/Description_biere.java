package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Description_biere extends AppCompatActivity {

    private TextView paiement_redirection;
    private ImageView like;
    private ImageView unLike;

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
        like = (ImageView)findViewById(R.id.heart);
        unLike = (ImageView)findViewById(R.id.heart2);

        //méthode pour gérer l'évèment en question
        createOnClicRedir_paiement();
        createOnClicLike();
        createOnClicUnLike();
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

    private void createOnClicLike()
    {
        like.setOnClickListener(new ImageView.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                unLike.setVisibility(View.VISIBLE);
                like.setVisibility(View.INVISIBLE);
            }
        });
    }

    private void createOnClicUnLike()
    {
        unLike.setOnClickListener(new ImageView.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                like.setVisibility(View.VISIBLE);
                unLike.setVisibility(View.INVISIBLE);
            }
        });
    }

    public void confirmation()
    {
        Intent intent = new Intent(Description_biere.this, AjoutPanier.class);
        startActivity(intent);
    }
}