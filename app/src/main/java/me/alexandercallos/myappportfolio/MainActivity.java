package me.alexandercallos.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final private String TOAST_MSG_POPULAR_MOVIES = "This button will launch my \"Popular Movies\" app!";
    final private String TOAST_MSG_STOCK_HAWK = "This button will launch my \"Stock Hawk\" app!";
    final private String TOAST_MSG_BUILD_IT_BIGGER = "This button will launch my \"Build It Bigger\" app!";
    final private String TOAST_MSG_MAKE_YOUR_APP_MATERIAL = "This button will launch my \"Make Your App Material\" app!";
    final private String TOAST_MSG_GO_UBIQUITOUS = "This button will launch my \"Go Ubiquitous\" app!";
    final private String TOAST_MSG_CAPSTONE = "This button will launch my capstone app!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAllButtons();
    }

    private void initAllButtons() {
        initButton(R.id.buttonPopularMovies, TOAST_MSG_POPULAR_MOVIES);
        initButton(R.id.buttonStockHawk, TOAST_MSG_STOCK_HAWK);
        initButton(R.id.buttonBuildItBigger, TOAST_MSG_BUILD_IT_BIGGER);
        initButton(R.id.buttonMakeYourAppMaterial, TOAST_MSG_MAKE_YOUR_APP_MATERIAL);
        initButton(R.id.buttonGoUbiquitous, TOAST_MSG_GO_UBIQUITOUS);
        initButton(R.id.buttonCapstone, TOAST_MSG_CAPSTONE);
    }

    private void initButton(int buttonID, final String message) {
        Context someContext = getApplicationContext();
        Button someButton = (Button) findViewById(buttonID);
        someButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View someView) {
                generateToast(message);
            }
        });
    }

    private void generateToast(String message) {
        Context context = getApplicationContext();
        Toast someToast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        someToast.show();
    }
}
