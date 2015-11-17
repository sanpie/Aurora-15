package com.example.aurora15;




import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;
 
public class SplashScreen extends Activity {
 
   
    private static int SPLASH_TIME_OUT = 1500;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
     
        final ImageView myImage = (ImageView)findViewById(R.id.imgLogo);
        final Animation myRotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
        myImage.startAnimation(myRotation);

        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (activeNetwork != null && activeNetwork.isConnectedOrConnecting()) {
            Toast.makeText(this, "you are connected to internet", Toast.LENGTH_LONG).show();

            //boolean isWiFi = activeNetwork.getType() == ConnectivityManager.TYPE_WIFI;
           // if (isWiFi) {
          //      Toast.makeText(this, "you are dependent on wifi for internet ", Toast.LENGTH_SHORT).show();
        //    }

        }
        else
        {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(SplashScreen.this);


        //    alertDialog.setTitle("Internet is OFF...");


            alertDialog.setMessage("Are you sure you want to ON it?");


            alertDialog.setIcon(R.drawable.ic_launcher);


            alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int which) {


                    Intent intent = new Intent(Settings.ACTION_DATA_ROAMING_SETTINGS);
                    startActivity(intent);
                }
            });


            alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

                //    Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
                    dialog.cancel();
                    finish();
                }
            });


            alertDialog.show();
        }

    

   LocationManager locationManager = (LocationManager)getSystemService(LOCATION_SERVICE);
        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER))
        {
            Toast.makeText(this, "GPS is Enabled in your device", Toast.LENGTH_SHORT).show();
        //    Intent intent = new Intent(this,ShowLocationActivity.class);
          //    startActivity(intent);
        }
        else
        {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(SplashScreen.this);


   //         alertDialog.setTitle("GPS is OFF...");


            alertDialog.setMessage("Are you sure you want to ON it?");


            alertDialog.setIcon(R.drawable.ic_launcher);


            alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog,int which) {


                    Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                    startActivity(intent);
                }
            });


            alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int which) {

       //             Toast.makeText(getApplicationContext(), "You clicked on NO", Toast.LENGTH_SHORT).show();
                    dialog.cancel();
                    finish();
                }
            });


            alertDialog.show();
        }
   


            
        
        new Handler().postDelayed(new Runnable() {
 

            @Override
            public void run() {
            
                Intent i = new Intent(SplashScreen.this, MyActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.down_from_top,R.anim.up_from_bottom);

                finish();
            }
        }, SPLASH_TIME_OUT);
    }
 
}