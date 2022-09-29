package mx.edu.tesoem.isc.g7s21.p17s2120222jdga145;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import mx.edu.tesoem.isc.g7s21.p17s2120222jdga145.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}