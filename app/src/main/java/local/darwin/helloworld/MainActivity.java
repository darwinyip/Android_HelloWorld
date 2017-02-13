package local.darwin.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addText(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        TextView centerText = (TextView) findViewById(R.id.centerText);
        centerText.setText(editText.getText());
        editText.setText("");
    }

    public void changeColor(View view) {
        view.setBackgroundColor(rand.nextInt());
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setBackgroundColor(rand.nextInt());
        RelativeLayout mainBackground = (RelativeLayout) findViewById(R.id.main);
        mainBackground.setBackgroundColor(rand.nextInt());
    }
}
