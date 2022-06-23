package com.example.chattingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

//import com.example.chattingapp.Adapter.FragmentsAdapter;
import com.example.chattingapp.databinding.ActivityMainPageBinding;
import com.google.firebase.auth.FirebaseAuth;

public class MainPage extends AppCompatActivity {
    ActivityMainPageBinding binding;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //init binding
        binding = ActivityMainPageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        //init firebase
        auth = FirebaseAuth.getInstance();


        //ini tabs
//        binding.viewPager.setAdapter(new FragmentsAdapter(getSupportFragmentManager()));
//        binding.tabLayout.setupWithViewPager(binding.viewPager);
    }
    //init menu bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu , menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.settings:
                Toast.makeText(this, "Setting clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(MainPage.this, Sign_In.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}
