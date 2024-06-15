package com.example.homework4;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Set the window insets listener for the root view
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main_container), (v, insets) -> {
            // Handle the window insets
            return insets.consumeSystemWindowInsets();
        });

        Button facebookLogin = findViewById(R.id.facebook_login);
        Button emailLogin = findViewById(R.id.email_login);
        Button gameNow = findViewById(R.id.game_now);

        // Add click listeners for buttons if needed
        facebookLogin.setOnClickListener(v -> {
            // Handle Facebook login
        });

        emailLogin.setOnClickListener(v -> {
            // Handle Email login
        });

        gameNow.setOnClickListener(v -> {
            // Handle Game Now action
        });
    }
}
