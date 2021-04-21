package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    private TextView tvJudul, tvGenre, tvDescription;
    private ImageView photo;
    String judul, genre, description;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvJudul = findViewById(R.id.tvJudul);

        tvGenre = findViewById(R.id.tvGenre);
        tvDescription = findViewById(R.id.tvDescription);

        photo = findViewById(R.id.photo);

        judul = getIntent().getStringExtra("name");
        genre = getIntent().getStringExtra("genre");
        description = getIntent().getStringExtra("detail");


        image = getIntent().getIntExtra("photo", 0);
        photo.setImageResource(image);
        tvJudul.setText(judul);
        tvGenre.setText(genre);
        tvDescription.setText(description);



    }

    public void btnBack(View view) {
        Intent goBack = new Intent(Detail.this,MainActivity.class);
        goBack.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(goBack);
    }
}