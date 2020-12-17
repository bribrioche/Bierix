package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class AjoutPanier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_panier);
        rediriger();
        overridePendingTransition(R.anim.fadeinredir, R.anim.fadeoutredir);
    }

    private void rediriger()
    {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run()
            {
                Intent intent = new Intent(AjoutPanier.this, Panier.class);
                startActivity(intent);
            }
        }, 2000);
    }
}