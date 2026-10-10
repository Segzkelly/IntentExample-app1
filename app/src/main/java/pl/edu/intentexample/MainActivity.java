
package pl.edu.intentexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secondButton = findViewById(R.id.btnSecond);
        Button websiteButton = findViewById(R.id.btnWebsite);
        Button locationButton = findViewById(R.id.btnLocation);

        secondButton.setOnClickListener(v -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    SecondActivity.class
            );

            intent.putExtra(
                    "MESSAGE",
                    "Message sent from MainActivity"
            );

            startActivity(intent);
        });

        websiteButton.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://www.android.com");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        locationButton.setOnClickListener(v -> {
            Uri geoUri = Uri.parse("geo:50.3217,19.1949");
            Intent intent = new Intent(Intent.ACTION_VIEW, geoUri);

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        });
    }
}
