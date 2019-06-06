package com.e.wearablepractice;

import android.app.Notification;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnNotification,btnNotification1;

    NotificationManagerCompat notificationManagerCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNotification1=findViewById(R.id.btnNotification1);
        btnNotification=findViewById(R.id.btnNotification);

        notificationManagerCompat=NotificationManagerCompat.from(this);

        btnNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplayNotification();

            }
        });
        btnNotification1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            DisplayNotification2();
            }
        });
    }

    private void DisplayNotification(){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this,"Channel1")
                .setSmallIcon(R.drawable.ic_message_black_24dp)
                .setContentTitle("Message")
                .setContentText("Call Me When Free")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        notificationManagerCompat.notify(1,builder.build());
    }
    private void DisplayNotification2(){
        NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this,"Channel2")
                .setSmallIcon(R.drawable.ic_message_black_24dp)
                .setContentTitle("Message")
                .setContentText("This is Second Message")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setCategory(NotificationCompat.CATEGORY_MESSAGE);

        notificationManagerCompat.notify(2,builder.build());
    }



}
