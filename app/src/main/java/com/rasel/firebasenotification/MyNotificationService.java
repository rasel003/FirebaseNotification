package com.rasel.firebasenotification;

import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyNotificationService extends FirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this, "CHANNEL_ID")
                        .setSmallIcon(R.drawable.common_google_signin_btn_icon_dark)
                        .setContentTitle("Hurray! It is working...")
                        .setContentText("Your first notification..")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        .setAutoCancel(true);

        NotificationManagerCompat mNotificationMgr = NotificationManagerCompat.from(this);
        mNotificationMgr.notify(1, mBuilder.build());
    }
}
