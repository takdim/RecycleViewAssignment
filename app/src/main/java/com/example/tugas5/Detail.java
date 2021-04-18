package com.example.tugas5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class Detail extends AppCompatActivity {

    private TextView tvJudul, tvGenre, tvDescription;
    private ImageView photo;
    String judul;
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

        image = getIntent().getIntExtra("photo", 0);
        photo.setImageResource(image);
        tvJudul.setText(judul);

//        getIncomingExtra();

    }
//
//    private void getIncomingExtra() {
//        if(getIntent().hasExtra("photo") && getIntent().hasExtra("name") && getIntent().hasExtra("genre") && getIntent().hasExtra("detail")){
//            String foto = getIntent().getStringExtra("photo");
//            String judul = getIntent().getStringExtra("name");
//            String genre = getIntent().getStringExtra("genre");
//            String description = getIntent().getStringExtra("detail");
//
//            setDataActivity(foto, judul, genre, description);
//
//        }
//    }
//
//    private void setDataActivity(String foto, String judul, String genre, String description) {
//
//        Glide.with(Detail.this).asBitmap().load(foto).into(photo);
//
//        tvJudul.setText(judul);
//        tvGenre.setText(genre);
//        tvDescription.setText(description);
//    }
}