package com.example.csseat19.paint;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends ActionBarActivity {

    private Button buttonRed, buttonGreen, buttonBlue, buttonYellow, buttonPurple, buttonBlack, buttonWhite;

    private ImageButton buttonPen, buttonErase, buttonBackground;

    private PaintView paintView;

    private int tool = 0;
    /**
     * 0 = pen
     * 1 = eraser
     * 2 = background
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonRed = (Button) findViewById(R.id.buttonRed);
        buttonGreen = (Button) findViewById(R.id.buttonGreen);
        buttonBlue = (Button) findViewById(R.id.buttonBlue);
        buttonYellow = (Button) findViewById(R.id.buttonYellow);
        buttonPurple = (Button) findViewById(R.id.buttonPurple);
        buttonBlack = (Button) findViewById(R.id.buttonBlack);
        buttonWhite = (Button) findViewById(R.id.buttonWhite);
        buttonPen = (ImageButton) findViewById(R.id.buttonPen);
        buttonErase = (ImageButton) findViewById(R.id.buttonErase);
        buttonBackground = (ImageButton) findViewById(R.id.buttonBackground);
        paintView = (PaintView) findViewById(R.id.paintView);

        paintView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                paintView.init( paintView.getHeight(), paintView.getWidth() );
            }
        });

        buttonBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.setColor(Color.BLACK);

            }
        });

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.setColor(Color.RED);
            }
        });

        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.setColor(Color.GREEN);
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.setColor(Color.BLUE);
            }
        });

        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.setColor(Color.YELLOW);
            }
        });

        buttonPurple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.setColor(Color.argb(255, 212, 0, 255));
            }
        });

        buttonWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.setColor(Color.WHITE);
            }
        });

        buttonPen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.setColor(paintView.DEFAULT_COLOR);
            }
        });

        buttonErase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.setColor(paintView.BG_COLOR);
            }
        });

        buttonBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                paintView.clear();
            }
        });





    }

}
