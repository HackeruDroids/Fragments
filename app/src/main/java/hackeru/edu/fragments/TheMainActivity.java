package hackeru.edu.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

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
                manager.beginTransaction().
                        replace(R.id.frame1, new TextFragment()).
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
