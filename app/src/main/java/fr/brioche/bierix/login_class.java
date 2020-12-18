package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;

import android.widget.TextView;

import org.w3c.dom.Text;


public class login_class extends AppCompatActivity
{


    private TextView btnRetour;
    private TextView lien_page_account;
    private TextView connexion_bttn;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        initActivity();
    }

    /**
     * initialisation de l'activité login
     */
    private void initActivity()
    {
        //récupération des objets graphiques
        btnRetour = (TextView) findViewById(R.id.btnRetour);
        lien_page_account = (TextView) findViewById(R.id.lien_page_account);
        connexion_bttn = (TextView) findViewById(R.id.connexion_bttn);

        //méthode pour gérer l'évèment en question
        createOnClicBtnRetour();
        createOnClicBtnlien_page_account();
        createOnClicprofil();
    }

    private void createOnClicprofil()
    {
        connexion_bttn.setOnClickListener(new ImageButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openprofil();
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
    }

    public void openprofil()
    {
        Intent intent = new Intent(login_class.this, Profil.class);
        startActivity(intent);
    }

    private void createOnClicBtnlien_page_account()
    {
        lien_page_account.setOnClickListener(new ImageButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                opencreation_account();
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
    }

    public void opencreation_account()
    {
        Intent intent = new Intent(login_class.this, creation_account.class);
        startActivity(intent);
    }


    /**
     * évenement clic sur bouton btnRetour
     */
    private void createOnClicBtnRetour()
    {
        btnRetour.setOnClickListener(new ImageButton.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openActivityLogin();
            }
        });
    }

    /**
     * redirection vers MainActivity
     */
    public void openActivityLogin()
    {
        Intent intent = new Intent(login_class.this, MainActivity.class);
        startActivity(intent);
    }

}