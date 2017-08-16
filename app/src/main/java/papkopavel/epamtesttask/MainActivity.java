package papkopavel.epamtesttask;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button firstButton;
    TextView textView;
    String textString = "Hello EPAM!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstButton = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.TextView);

        firstButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText(textString);
                Toast.makeText(getApplicationContext(),textString,Toast.LENGTH_SHORT).show();

            }
        });
    }
}
