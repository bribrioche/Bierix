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

    private ImageButton btnUser;
    private ImageButton btnLike;
    private ImageButton btnPhoto;
    private ImageButton btnSearch;
    private ImageButton btnPanier;

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

        btnLike = (ImageButton)findViewById(R.id.btnLike);
        btnUser = (ImageButton)findViewById(R.id.btnUser);
        btnPhoto = (ImageButton)findViewById(R.id.btnPhoto);
        btnSearch = (ImageButton)findViewById(R.id.btnSearch);
        btnPanier = (ImageButton)findViewById(R.id.btnPanier);

        //méthode pour gérer l'évèment en question
        createOnClicRedir_paiement();
        createOnClicLike();
        createOnClicUnLike();

        createOnClicBtnLike();
        createOnClicBtnPhoto();
        createOnClicBtnUser();
        createOnClicBtnSearch();
        createOnClicBtnPanier();
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

    /**
     * évenement clic sur bouton btnLike
     */
    private void createOnClicBtnLike(){
        btnLike.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLike();
            }
        });
    }

    /**
     * évenement clic sur bouton btnPanier
     */
    private void createOnClicBtnPanier(){
        btnPanier.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityPanier();
            }
        });
    }


    /**
     * évenement clic sur bouton btnUser
     */
    private void createOnClicBtnUser(){
        btnUser.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLogin();
            }
        });
    }


    /**
     * redirection vers Activity Like
     */
    public void openActivityLike(){
        Intent intent = new Intent(this, ActivityLike.class);
        startActivity(intent);
    }

    /**
     * redirection vers Activity Panier
     */
    public void openActivityPanier(){
        Intent intent = new Intent(this, Panier.class);
        startActivity(intent);
    }

    /**
     * redirection vers Activity Login
     */
    public void openActivityLogin(){
        Intent intent = new Intent(this, login_class.class);
        startActivity(intent);
    }

    /**
     * évenement clic sur bouton MainActivity
     */
    private void createOnClicBtnPhoto(){
        btnPhoto.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }


    /**
     * redirection vers MainActivity
     */
    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    /**
     * évenement clic sur bouton btnSearch
     */
    private void createOnClicBtnSearch(){
        btnSearch.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitSearch();
            }
        });
    }


    /**
     * redirection vers Activity Search
     */
    public void openActivitSearch(){
        Intent intent = new Intent(this, Search.class);
        startActivity(intent);
    }
}