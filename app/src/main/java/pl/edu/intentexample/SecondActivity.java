
package pl.edu.intentexample;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView messageText = findViewById(R.id.txtMessage);
        Button backButton = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        String message = intent.getStringExtra("MESSAGE");

        if (message != null) {
            messageText.setText(message);
        }

        backButton.setOnClickListener(v -> finish());
    }
}
