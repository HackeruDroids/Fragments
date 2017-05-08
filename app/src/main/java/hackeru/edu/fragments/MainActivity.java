package hackeru.edu.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //The Dynamic Approach:
        //1) Get a reference to the fragment manager:

        //add, remove, replace, find.
        manager = getSupportFragmentManager();
        manager.beginTransaction()
                .replace(R.id.frame1, new ColorPickerFragment())
                .commit();
    }
    public void text(View view) {
        manager.beginTransaction()
                .replace(R.id.frame1, new TextFragment())
                .commit();
    }
    public void color(View view) {
        manager.beginTransaction()
                .replace(R.id.frame1, new ColorPickerFragment())
                .commit();
    }
}
