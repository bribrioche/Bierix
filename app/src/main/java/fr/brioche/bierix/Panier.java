package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Panier extends AppCompatActivity {



    private ImageButton btnUser;
    private ImageButton btnLike;
    private ImageButton btnPhoto;
    private ImageButton btnSearch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panier);

        initActivity();
    }

    /**
     * initialisation de l'activity
     */
    private void initActivity(){
        //récupération des objets graphiques

        btnLike = (ImageButton)findViewById(R.id.btnLike);
        btnUser = (ImageButton)findViewById(R.id.btnUser);
        btnPhoto = (ImageButton)findViewById(R.id.btnPhoto);
        btnSearch = (ImageButton)findViewById(R.id.btnSearch);


        //méthode pour gérer les évnements
        createOnClicBtnLike();
        createOnClicBtnPhoto();
        createOnClicBtnUser();
        createOnClicBtnSearch();

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