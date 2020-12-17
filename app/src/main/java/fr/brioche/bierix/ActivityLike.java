package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ActivityLike extends AppCompatActivity {


    private ImageButton btnUser;
    private ImageButton btnPanier;
    private ImageButton btnPhoto;

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

        //méthode pour gérer les évnements
        createOnClicBtnPanier();
        createOnClicBtnPhoto();
        createOnClicBtnUser();

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
}