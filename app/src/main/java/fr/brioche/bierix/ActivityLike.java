package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityLike extends AppCompatActivity {


    private ImageButton btnUser;
    private ImageButton btnPanier;
    private ImageButton btnPhoto;
    private TextView voirFiche1;
    private TextView ajout1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_like);

        initActivity();
    }

    /**
     * initialisation de l'activity
     */
    private void initActivity(){
        //récupération des objets graphiques

        btnPanier = (ImageButton)findViewById(R.id.btnPanier);
        btnUser = (ImageButton)findViewById(R.id.btnUser);
        btnPhoto = (ImageButton)findViewById(R.id.btnPhoto);

        voirFiche1 = (TextView)findViewById(R.id.voirFiche1);
        ajout1 = (TextView)findViewById(R.id.ajout1);

        //méthode pour gérer les évnements
        createOnClicBtnPanier();
        createOnClicBtnPhoto();
        createOnClicBtnUser();
        createOnClicVoirFiche1();
        createOnClicAjout1();

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
     * évenement clic sur bouton voirFiche1
     */
    private void createOnClicVoirFiche1(){
        voirFiche1.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityFiche1();
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
    }


    /**
     * redirection vers Activity Description
     */
    public void openActivityFiche1(){
        Intent intent = new Intent(this, Description_biere.class);
        startActivity(intent);
    }

    /**
     * évenement clic sur bouton voirFiche1
     */
    private void createOnClicAjout1(){
        ajout1.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityAjout1();
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
    }


    /**
     * redirection vers Activity Description
     */
    public void openActivityAjout1(){
        Intent intent = new Intent(this, AjoutPanier.class);
        startActivity(intent);
    }

}