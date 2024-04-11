package com.example.practice7.UI.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.practice7.R;
import com.example.practice7.UI.View.FirstScreen;

public class MainActivity extends AppCompatActivity {

    public MainActivity() { super (R.layout.activity_main); }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view,
                            FirstScreen.class, null)
                    .commit();
        }
    }

}