package com.mcbabo.membercards;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;
    private ImageView imageView2;
    private TextView textView2;
    private ImageView imageView3;
    private TextView textView3;
    private ImageView imageView4;
    private TextView textView4;
    private ImageView imageView5;
    private TextView textView5;
    private ImageView imageView6;
    private TextView textView6;
    private ImageView imageView7;
    private TextView textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        final CardView cv = (CardView) findViewById(R.id.card1);
        final CardView cv2 = (CardView) findViewById(R.id.card2);
        final CardView cv3 = (CardView) findViewById(R.id.card3);
        final CardView cv4 = (CardView) findViewById(R.id.card4);
        final CardView cv5 = (CardView) findViewById(R.id.card5);
        final CardView cv6 = (CardView) findViewById(R.id.card6);
        final CardView cv7 = (CardView) findViewById(R.id.card7);

        // using the id we set earlier.
        final ViewGroup.LayoutParams params = (ViewGroup.LayoutParams) cv.getLayoutParams();
        final ViewGroup.LayoutParams params2 = (ViewGroup.LayoutParams) cv2.getLayoutParams();
        final ViewGroup.LayoutParams params3 = (ViewGroup.LayoutParams) cv3.getLayoutParams();
        final ViewGroup.LayoutParams params4 = (ViewGroup.LayoutParams) cv4.getLayoutParams();
        final ViewGroup.LayoutParams params5 = (ViewGroup.LayoutParams) cv5.getLayoutParams();
        final ViewGroup.LayoutParams params6 = (ViewGroup.LayoutParams) cv6.getLayoutParams();
        final ViewGroup.LayoutParams params7 = (ViewGroup.LayoutParams) cv7.getLayoutParams();

        final float height_1 = getResources().getDimensionPixelSize(R.dimen.card_view_height);
        final float height_2 = getResources().getDimensionPixelSize(R.dimen.card_view_height2);

        imageView = (ImageView) findViewById(R.id.barcode1);
        textView = (TextView) findViewById(R.id.textcode);
        imageView2 = (ImageView) findViewById(R.id.barcode2);
        textView2= (TextView) findViewById(R.id.textcode2);
        imageView3 = (ImageView) findViewById(R.id.barcode3);
        textView3 = (TextView) findViewById(R.id.textcode3);
        imageView4 = (ImageView) findViewById(R.id.barcode4);
        textView4 = (TextView) findViewById(R.id.textcode4);
        imageView5 = (ImageView) findViewById(R.id.barcode5);
        textView5 = (TextView) findViewById(R.id.textcode5);
        imageView6 = (ImageView) findViewById(R.id.barcode6);
        textView6 = (TextView) findViewById(R.id.textcode6);
        imageView7 = (ImageView) findViewById(R.id.barcode7);
        textView7 = (TextView) findViewById(R.id.textcode7);

        cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (params.height == height_1){
                    params.height = (int) height_2;
                    cv.setLayoutParams(params);
                }else if (params.height == height_2){
                    params.height = (int) height_1;
                    params2.height = (int) height_2;
                    params3.height = (int) height_2;
                    params4.height = (int) height_2;
                    params5.height = (int) height_2;
                    params6.height = (int) height_2;
                    params7.height = (int) height_2;
                    cv.setLayoutParams(params);
                    cv2.setLayoutParams(params2);
                    cv3.setLayoutParams(params3);
                    cv4.setLayoutParams(params4);
                    cv5.setLayoutParams(params5);
                    cv6.setLayoutParams(params6);
                    cv7.setLayoutParams(params7);

                    try {
                        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                        BitMatrix bitMatrix = multiFormatWriter.encode(textView.getText().toString(), BarcodeFormat.CODE_128, imageView.getWidth(), imageView.getHeight());
                        Bitmap bitmap = Bitmap.createBitmap(imageView.getWidth(), imageView.getHeight(), Bitmap.Config.RGB_565);
                        bitmap.setHasAlpha(true);
                        for (int i = 0; i < imageView.getWidth(); i++) {
                            for (int j = 0; j < imageView.getHeight(); j++) {
                                bitmap.setPixel(i, j, bitMatrix.get(i, j) ? Color.BLACK : Color.rgb(255,0,205));
                            }
                        }
                        imageView.setImageBitmap(bitmap);
                    } catch (WriterException e) {
                        e.printStackTrace();
                    }
                };
            }
        });


        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (params2.height == height_1){
                    params2.height = (int) height_2;
                    cv2.setLayoutParams(params2);
                }else if (params2.height == height_2){
                    params.height = (int) height_2;
                    params2.height = (int) height_1;
                    params3.height = (int) height_2;
                    params4.height = (int) height_2;
                    params5.height = (int) height_2;
                    params6.height = (int) height_2;
                    params7.height = (int) height_2;
                    cv.setLayoutParams(params);
                    cv2.setLayoutParams(params2);
                    cv3.setLayoutParams(params3);
                    cv4.setLayoutParams(params4);
                    cv5.setLayoutParams(params5);
                    cv6.setLayoutParams(params6);
                    cv7.setLayoutParams(params7);

                    try {
                        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                        BitMatrix bitMatrix = multiFormatWriter.encode(textView2.getText().toString(), BarcodeFormat.CODE_128, imageView2.getWidth(), imageView2.getHeight());
                        Bitmap bitmap = Bitmap.createBitmap(imageView2.getWidth(), imageView2.getHeight(), Bitmap.Config.RGB_565);
                        bitmap.setHasAlpha(true);
                        for (int i = 0; i < imageView2.getWidth(); i++) {
                            for (int j = 0; j < imageView2.getHeight(); j++) {
                                bitmap.setPixel(i, j, bitMatrix.get(i, j) ? Color.BLACK : Color.rgb(242, 255, 41));
                            }
                        }
                        imageView2.setImageBitmap(bitmap);
                    } catch (WriterException e) {
                        e.printStackTrace();
                    }
                };
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (params3.height == height_1){
                    params3.height = (int) height_2;
                    cv3.setLayoutParams(params);
                }else if (params3.height == height_2){
                    params.height = (int) height_2;
                    params2.height = (int) height_2;
                    params3.height = (int) height_1;
                    params4.height = (int) height_2;
                    params5.height = (int) height_2;
                    params6.height = (int) height_2;
                    params7.height = (int) height_2;
                    cv.setLayoutParams(params);
                    cv2.setLayoutParams(params2);
                    cv3.setLayoutParams(params3);
                    cv4.setLayoutParams(params4);
                    cv5.setLayoutParams(params5);
                    cv6.setLayoutParams(params6);
                    cv7.setLayoutParams(params7);

                    try {
                        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                        BitMatrix bitMatrix = multiFormatWriter.encode(textView3.getText().toString(), BarcodeFormat.CODE_128, imageView3.getWidth(), imageView3.getHeight());
                        Bitmap bitmap = Bitmap.createBitmap(imageView3.getWidth(), imageView3.getHeight(), Bitmap.Config.RGB_565);
                        bitmap.setHasAlpha(true);
                        for (int i = 0; i < imageView3.getWidth(); i++) {
                            for (int j = 0; j < imageView3.getHeight(); j++) {
                                bitmap.setPixel(i, j, bitMatrix.get(i, j) ? Color.BLACK : Color.rgb(51, 53, 214));
                            }
                        }
                        imageView3.setImageBitmap(bitmap);
                    } catch (WriterException e) {
                        e.printStackTrace();
                    }
                };
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (params4.height == height_1){
                    params4.height = (int) height_2;
                    cv.setLayoutParams(params4);
                }else if (params4.height == height_2){
                    params.height = (int) height_2;
                    params2.height = (int) height_2;
                    params3.height = (int) height_2;
                    params4.height = (int) height_1;
                    params5.height = (int) height_2;
                    params6.height = (int) height_2;
                    params7.height = (int) height_2;
                    cv.setLayoutParams(params);
                    cv2.setLayoutParams(params2);
                    cv3.setLayoutParams(params3);
                    cv4.setLayoutParams(params4);
                    cv5.setLayoutParams(params5);
                    cv6.setLayoutParams(params6);
                    cv7.setLayoutParams(params7);

                    try {
                        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                        BitMatrix bitMatrix = multiFormatWriter.encode(textView4.getText().toString(), BarcodeFormat.CODE_128, imageView4.getWidth(), imageView4.getHeight());
                        Bitmap bitmap = Bitmap.createBitmap(imageView4.getWidth(), imageView3.getHeight(), Bitmap.Config.RGB_565);
                        bitmap.setHasAlpha(true);
                        for (int i = 0; i < imageView4.getWidth(); i++) {
                            for (int j = 0; j < imageView4.getHeight(); j++) {
                                bitmap.setPixel(i, j, bitMatrix.get(i, j) ? Color.BLACK : Color.rgb(1, 50, 32));
                            }
                        }
                        imageView4.setImageBitmap(bitmap);
                    } catch (WriterException e) {
                        e.printStackTrace();
                    }
                };
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (params5.height == height_1){
                    params5.height = (int) height_2;
                    cv5.setLayoutParams(params5);
                }else if (params5.height == height_2){
                    params.height = (int) height_2;
                    params2.height = (int) height_2;
                    params3.height = (int) height_2;
                    params4.height = (int) height_2;
                    params5.height = (int) height_1;
                    params6.height = (int) height_2;
                    params7.height = (int) height_2;
                    cv.setLayoutParams(params);
                    cv2.setLayoutParams(params2);
                    cv3.setLayoutParams(params3);
                    cv4.setLayoutParams(params4);
                    cv5.setLayoutParams(params5);
                    cv6.setLayoutParams(params6);
                    cv7.setLayoutParams(params7);

                    try {
                        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                        BitMatrix bitMatrix = multiFormatWriter.encode(textView5.getText().toString(), BarcodeFormat.CODE_128, imageView5.getWidth(), imageView5.getHeight());
                        Bitmap bitmap = Bitmap.createBitmap(imageView5.getWidth(), imageView5.getHeight(), Bitmap.Config.RGB_565);
                        bitmap.setHasAlpha(true);
                        for (int i = 0; i < imageView5.getWidth(); i++) {
                            for (int j = 0; j < imageView5.getHeight(); j++) {
                                bitmap.setPixel(i, j, bitMatrix.get(i, j) ? Color.BLACK : Color.rgb(255, 0, 0));
                            }
                        }
                        imageView5.setImageBitmap(bitmap);
                    } catch (WriterException e) {
                        e.printStackTrace();
                    }
                };
            }
        });
        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (params5.height == height_1){
                    params5.height = (int) height_2;
                    cv5.setLayoutParams(params5);
                }else if (params5.height == height_2){
                    params.height = (int) height_2;
                    params2.height = (int) height_2;
                    params3.height = (int) height_2;
                    params4.height = (int) height_2;
                    params5.height = (int) height_2;
                    params6.height = (int) height_1;
                    params7.height = (int) height_2;
                    cv.setLayoutParams(params);
                    cv2.setLayoutParams(params2);
                    cv3.setLayoutParams(params3);
                    cv4.setLayoutParams(params4);
                    cv5.setLayoutParams(params5);
                    cv6.setLayoutParams(params6);
                    cv7.setLayoutParams(params7);

                    try {
                        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                        BitMatrix bitMatrix = multiFormatWriter.encode(textView6.getText().toString(), BarcodeFormat.CODE_128, imageView6.getWidth(), imageView6.getHeight());
                        Bitmap bitmap = Bitmap.createBitmap(imageView6.getWidth(), imageView6.getHeight(), Bitmap.Config.RGB_565);
                        bitmap.setHasAlpha(true);
                        for (int i = 0; i < imageView6.getWidth(); i++) {
                            for (int j = 0; j < imageView6.getHeight(); j++) {
                                bitmap.setPixel(i, j, bitMatrix.get(i, j) ? Color.BLACK : Color.rgb(237, 201, 103));
                            }
                        }
                        imageView6.setImageBitmap(bitmap);
                    } catch (WriterException e) {
                        e.printStackTrace();
                    }
                };
            }
        });
        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (params5.height == height_1){
                    params5.height = (int) height_2;
                    cv5.setLayoutParams(params5);
                }else if (params5.height == height_2){
                    params.height = (int) height_2;
                    params2.height = (int) height_2;
                    params3.height = (int) height_2;
                    params4.height = (int) height_2;
                    params5.height = (int) height_2;
                    params6.height = (int) height_2;
                    params7.height = (int) height_1;
                    cv.setLayoutParams(params);
                    cv2.setLayoutParams(params2);
                    cv3.setLayoutParams(params3);
                    cv4.setLayoutParams(params4);
                    cv5.setLayoutParams(params5);
                    cv6.setLayoutParams(params6);
                    cv7.setLayoutParams(params7);

                    try {
                        MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
                        BitMatrix bitMatrix = multiFormatWriter.encode(textView7.getText().toString(), BarcodeFormat.CODE_128, imageView7.getWidth(), imageView7.getHeight());
                        Bitmap bitmap = Bitmap.createBitmap(imageView7.getWidth(), imageView7.getHeight(), Bitmap.Config.RGB_565);
                        bitmap.setHasAlpha(true);
                        for (int i = 0; i < imageView7.getWidth(); i++) {
                            for (int j = 0; j < imageView7.getHeight(); j++) {
                                bitmap.setPixel(i, j, bitMatrix.get(i, j) ? Color.BLACK : Color.rgb(66, 105, 47));
                            }
                        }
                        imageView7.setImageBitmap(bitmap);
                    } catch (WriterException e) {
                        e.printStackTrace();
                    }
                };
            }
        });
    }
}