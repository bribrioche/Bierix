package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;

public class Search extends AppCompatActivity {

    private static final String[] BEERS = new String[]{
            "Blonde","Brune","Blanche","IPA","Affligem","Bush Ambrée"
    };

    private ImageButton search_button;
    private ScrollView list_biere;

    private ImageButton btnUser;
    private ImageButton btnPanier;
    private ImageButton btnPhoto;
    private ImageButton btnLike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        initActivity();

        AutoCompleteTextView editText = findViewById(R.id.ACTV);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,BEERS);
        editText.setAdapter(adapter);
    }

    private void initActivity(){
        //récupération des objets graphiques

        btnPanier = (ImageButton)findViewById(R.id.btnPanier);
        btnUser = (ImageButton)findViewById(R.id.btnUser);
        btnPhoto = (ImageButton)findViewById(R.id.btnPhoto);
        btnLike = (ImageButton)findViewById(R.id.btnLike);
        list_biere = (ScrollView)findViewById(R.id.list_biere);


        list_biere.setVisibility(View.INVISIBLE);

        search_button = (ImageButton)findViewById(R.id.search_button) ;

        //méthode pour gérer les évnements
        createOnClicBtnPanier();
        createOnClicBtnPhoto();
        createOnClicBtnUser();
        createOnClicBtnLike();

        createOnClicSearch_button();

    }

    private void createOnClicSearch_button(){
        search_button.setOnClickListener(new ImageView.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                list_biere.setVisibility(View.VISIBLE);
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
}