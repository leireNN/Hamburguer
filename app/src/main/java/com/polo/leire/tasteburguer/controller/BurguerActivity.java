package com.polo.leire.tasteburguer.controller;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.polo.leire.tasteburguer.R;
import com.polo.leire.tasteburguer.model.Burguer;


public class BurguerActivity extends Activity {
    private static final String TAG = BurguerActivity.class.getSimpleName();

    private ImageView mWineImage = null;
    private Burguer mBurguer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Pantalla que quiero mostrar.
        setContentView(R.layout.burguer_main);

        mBurguer = new Burguer("Goico Grill", "Hamburguesa", R.drawable.leon, "", "", "No esta nada mal",5);

        mWineImage = (ImageView) findViewById(R.id.felinos);

    }

    //Metodo de respuesta al click del botón.
    public void changeImage(View view){
        mWineImage.setImageResource(R.drawable.leon);
    }
}
