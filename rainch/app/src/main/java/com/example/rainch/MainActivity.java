package com.example.rainch;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int countRight = 0;
    private int countLeft = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rightTurn(View view) {
        ImageView right = findViewById(R.id.right_rainch);
        ImageView left = findViewById(R.id.left_rainch);
        TextView off = findViewById(R.id.off);
        off.setText("Count Right " + ++countRight);
        Animation r = AnimationUtils.loadAnimation(this,R.anim.right);
        Animation rr = AnimationUtils.loadAnimation(this,R.anim.left);
        right.startAnimation(rr);
        left.startAnimation(r);
    }

    public void leftTurn(View view) {
        ImageView left = findViewById(R.id.left_rainch);
        ImageView right = findViewById(R.id.right_rainch);
        TextView on = findViewById(R.id.on);
        on.setText("Count Left " + ++countLeft);
        Animation r = AnimationUtils.loadAnimation(this,R.anim.left);
        Animation rr = AnimationUtils.loadAnimation(this,R.anim.right);
        left.startAnimation(r);
        right.startAnimation(rr);
    }

}