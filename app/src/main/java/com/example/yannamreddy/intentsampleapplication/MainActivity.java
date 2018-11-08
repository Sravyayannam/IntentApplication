package com.example.yannamreddy.intentsampleapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


import java.io.File;

import static com.example.yannamreddy.intentsampleapplication.contacts.MY_PERMISSIONS_REQUEST_READ_CONTACTS;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button);
        final Button button2 = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button

                Log.e("share intent","test");

                Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sample);

                    Intent share= new Intent(Intent.ACTION_SEND);
                    share.putExtra("sms_body", "Text hello");
                    share.putExtra(Intent.EXTRA_STREAM, uri);
                    share.setType("audio/*");
                    share.putExtra("address", "6502798921");

                //share.setData(Uri.parse("smsto:"+"6502798921"));


                //share.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                startActivity(Intent.createChooser(share,"Test Intent"));


//--------------------------------------------------------------------------------------------------------------------
             /*  if(int permissionCheck ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.WRITE_CALENDAR))*/

             /*  ActivityCompat.requestPermissions(MainActivity.this,
                        new String[]{Manifest.permission.READ_CONTACTS},
                        MY_PERMISSIONS_REQUEST_READ_CONTACTS);

                Intent intent = new Intent(Intent.ACTION_SEND);
                //intent.setClassName("com.android.mms", "com.android.mms.ui.ComposeMessageActivity");
               // intent.putExtra("sms_body", "Text Message Here");
                intent.putExtra(Intent.EXTRA_TEXT, "Hi there");
                intent.putExtra("address", "6502798921");
                intent.putExtra(Intent.EXTRA_STREAM, uri);
                intent.setType("audio/*");
                startActivity(Intent.createChooser(intent,"Test Intent"));*/
//---------------------------------------------------------------------------------------------------------
               // Uri sampleuri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sample);

                /*if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,
                        Manifest.permission.READ_EXTERNAL_STORAGE)) {
                } else {
                    ActivityCompat.requestPermissions(MainActivity.this,
                            new String[]{Manifest.permission.READ_CONTACTS},
                            MY_PERMISSIONS_REQUEST_READ_CONTACTS);*/


             /*   if (ContextCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.READ_CONTACTS)
                        != PackageManager.PERMISSION_GRANTED) {

                    // Permission is not granted
                    // Should we show an explanation?
                    if (ActivityCompat.shouldShowRequestPermissionRationale(MainActivity.this,
                            Manifest.permission.READ_CONTACTS)) {
                        // Show an explanation to the user *asynchronously* -- don't block
                        // this thread waiting for the user's response! After the user
                        // sees the explanation, try again to request the permission.
                    } else {
                        // No explanation needed; request the permission
                        ActivityCompat.requestPermissions(MainActivity.this,
                                new String[]{Manifest.permission.READ_CONTACTS},
                                MY_PERMISSIONS_REQUEST_READ_CONTACTS);
                        Intent intent = new Intent(Intent.ACTION_SEND);
                        intent.putExtra("sms_body", "Text Message Here");
                        intent.putExtra(Intent.EXTRA_STREAM, uri);
                        intent.setType("audio/*");
                        intent.putExtra("address", "6502798921");

                        startActivity(Intent.createChooser(intent,"Test Intent"));
                        // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                        // app-defined int constant. The callback method gets the
                        // result of the request.
                    }
                } else {
                    // Permission has already been granted
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.putExtra("sms_body", "Text Message Here");
                    intent.putExtra(Intent.EXTRA_STREAM, uri);
                    intent.setType("audio/*");
                    intent.putExtra("address", "6502798921");

                    startActivity(Intent.createChooser(intent,"Test Intent"));
                }*/

//-----------------------------------------------------------------------------------------------------

              /* String root = Environment.getExternalStorageDirectory().toString();
                File myDir = new File(root + "/saved_images");
                if (!myDir.exists()) {
                    myDir.mkdirs();
                }

                String fname = "sample.mp3";

                File file = new File (myDir, fname);
                Intent install = new Intent(Intent.ACTION_VIEW);
                install.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);

                Uri apkURI = FileProvider.getUriForFile(
                        MainActivity.this,
                        MainActivity.this.getApplicationContext()
                                .getPackageName() + ".provider", file);
                install.setDataAndType(apkURI, "audio/*");
                install.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                MainActivity.this.startActivity(install);*/
               // final File file = new File(Environment.getExternalStorageDirectory(), uri);
            //---------------------------------------------------------------------

                /*Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sample);
                Intent share= new Intent(android.content.Intent.ACTION_SEND);
                share.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                share.putExtra(Intent.EXTRA_STREAM, uri);
                share.putExtra(Intent.EXTRA_TEXT, "Hello");
                share.setType("audio/*");
                share.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
                share.putExtra("address", "6502798921");

                startActivity(Intent.createChooser(share,"Test Intent"));

                */



              /*  shareIntent = new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                shareIntent.putExtra(Intent.EXTRA_STREAM, bmpUri);
                shareIntent.putExtra(Intent.EXTRA_TEXT,"Hey please check this application " + "https://play.google.com/store/apps/details?id=" +getPackageName());
                shareIntent.setType("image/png");
                startActivity(Intent.createChooser(shareIntent,"Share with"));*/
               /* intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra("sms_body", "Text Message Here");
                intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
                intent.setType("audio/*");
                intent.putExtra("address", "8005551212");*/
               /* sendIntent.setType("audio/*");
                sendIntent.putExtra(Intent.EXTRA_STREAM,sdcard );
                File audio = new File("/path/to/audio.mp3");

                sendIntent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(audio));*/

               /* intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra("sms_body", "Text Message Here");
                intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
                intent.setType("audio/*");
                intent.putExtra("address", "8005551212");*/


                // button.setText("Welcome");
            }
        });
    }
      public void buttonClick(View v){

          Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.sample);

          Intent share= new Intent(Intent.ACTION_SEND);

          //share.putExtra("sms_body", "Text hello");
          share.putExtra("android.intent.extra.TEXT", "This is the test message text");
          //share.putExtra(Intent.EXTRA_TEXT, "welcome");
          share.putExtra(Intent.EXTRA_STREAM, uri);
          share.setType("audio/*");
         // share.putExtra("address", "6502798921");
          //share.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
          startActivity(Intent.createChooser(share,"Test Intent"));
      }




}
