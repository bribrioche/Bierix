package fr.brioche.bierix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    //constantes
    private static final int RETOUR_PRENDRE_PHOTO = 1;

    // propriétés
    private ImageButton btnPhoto;
    //private Button btnPhoto;
    private ImageView imgAffichePhoto;
    private String photoPath = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initActivity();
    }

    /**
     * initialisation de l'activity
     */
    private void initActivity(){
        //récupération des objets graphiques
        btnPhoto = (ImageButton)findViewById(R.id.btnPhoto);
        imgAffichePhoto = (ImageView)findViewById(R.id.imgAffichePhoto);
        //méthode pour gérer les évnements
        createOnClicBtnPhoto();

    }

    /**
     * évenement clic sur bouton BtnPhoto
     */
    private void createOnClicBtnPhoto() {
        btnPhoto.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                prendreUnePhoto();
            }
        });
    }

    /**
     * accès à l'appareil photo et mémorise dans un fichier temporaire
     */
    private void prendreUnePhoto(){
        // créer un intent pour ouvrir une fentêtre pour prendre la photo
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        // test pour contrôler que l'intent peut être géré
        if (intent.resolveActivity(getPackageManager()) != null){
            // créer un nom de fichier unique
            String time = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()); //récupération de la date heure minute seconde actuelle
            File photoDir = getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            try {
                File photoFile = File.createTempFile("photo" + time, ".jpg", photoDir); //création fichier temporaire
                //  enregistrer le chemin complet
                photoPath = photoFile.getAbsolutePath();
                // créer l'URI
                Uri photoUri = FileProvider.getUriForFile(MainActivity.this,
                        MainActivity.this.getApplicationContext().getPackageName() + ".provider" ,
                        photoFile);
                // transfert Uri vers l'intent pour enregistrer la photo dans le fichier temp
                intent.putExtra(MediaStore.EXTRA_OUTPUT, photoUri);
                //ouvrir l'activity par rapport à l'intent
                startActivityForResult(intent, RETOUR_PRENDRE_PHOTO);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * retour de l'appel de l'appareil photos (startActivityForresult)
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        // vérifie le bon code de retour et l'état du retour ok
        if (requestCode == RETOUR_PRENDRE_PHOTO && resultCode == RESULT_OK){
            // récupérer l'image
            Bitmap image = BitmapFactory.decodeFile(photoPath);
            //afficher l'image
            imgAffichePhoto.setImageBitmap(image);
        }
    }


}