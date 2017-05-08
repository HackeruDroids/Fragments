package hackeru.edu.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class TheMainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
    BottomNavigationView navigationView;
    FragmentManager manager;
    ColorPickerFragment mColorPickerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_main);
        navigationView = (BottomNavigationView) findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(this);

        manager = getSupportFragmentManager();

        mColorPickerFragment = new ColorPickerFragment();

        manager.beginTransaction().
                add(R.id.frame1, mColorPickerFragment).
                commit();

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id){
            case R.id.navigation_color:
               manager.beginTransaction().
                       replace(R.id.frame1, mColorPickerFragment).
                       commit();
                return true;
            case R.id.navigation_text:
                ArrayList<String> mivakim = new ArrayList<>();
                mivakim.add("Everyone just loves the saltyness of peanut butter mousse rinsed with parsley.");
                mivakim.add("All hands reproduce.");
                mivakim.add("Cur zelus manducare?");
                mivakim.add("When the jack rises for jamaica, all furners crush rough, gutless sails.");

                manager.beginTransaction().
                        replace(R.id.frame1, TextFragment.newInstance(mivakim)).
                        commit();
                return true;
            case R.id.navigation_notifications:
                manager.beginTransaction().
                        replace(R.id.frame1, new ColorPickerFragment()).
                        commit();
                return true;
        }
        return false;
    }
}
