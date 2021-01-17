package dilshod.iskandarov.pizza_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Method;

public class Selected_Activity extends AppCompatActivity {

    private TextView Title, Method;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Title = findViewById(R.id.title);
        Method = findViewById(R.id.method);
        img = findViewById(R.id.imageView000);

        Intent intent = getIntent();
        if ( intent != null){
            Title.setText(intent.getStringExtra("title"));
            Method.setText(intent.getStringExtra("method"));
        }

    }
}