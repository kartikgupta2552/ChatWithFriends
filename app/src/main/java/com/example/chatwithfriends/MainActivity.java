package com.example.chatwithfriends;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.chatwithfriends.Adapters.Fragments_Adapter;
import com.example.chatwithfriends.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        auth = FirebaseAuth.getInstance();

        binding.viewPager.setAdapter(new Fragments_Adapter(getSupportFragmentManager()));
        binding.tabLayout.setupWithViewPager(binding.viewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu , menu);

        return super.onCreateOptionsMenu(menu);

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.settings:
                Intent intenT = new Intent(MainActivity.this , SettingActivity.class);
                startActivity(intenT);
                break;

            case R.id.logout:
                auth.signOut();
                Intent intent = new Intent(MainActivity.this , signInActivity.class);
                startActivity(intent);
                finish();
                break;

            case R.id.groupchat:
                Intent intentt = new Intent(MainActivity.this , GroupChatActivity.class);
                startActivity(intentt);
                break;

        }
        return true;
    }
}