package com.example.socialsignin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Button btnLogout = findViewById(R.id.btnSignOut);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform logout action here, e.g., clear session, navigate back to login activity, etc.
                logout();
            }
        });
    }

    private void logout() {
        // Add your logout logic here, such as clearing session, preferences, or navigating to login activity
        // For example, navigating back to MainActivity (login activity)
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
        finish(); // Finish the current activity to prevent the user from returning to it using the back button
    }
}
