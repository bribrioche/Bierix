package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Panier extends AppCompatActivity {

    private ImageButton btnUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panier);

        initActivity();

    }

    private void initActivity(){
        btnUser = (ImageButton)findViewById(R.id.btnUser);

        createOnClicBtnUser();
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }

    private void createOnClicBtnUser(){
        btnUser.setOnClickListener(new ImageButton.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityLogin();
            }
        });
    }

    public void openActivityLogin(){
        Intent intent = new Intent(Panier.this, login_class.class);
        startActivity(intent);
    }
}