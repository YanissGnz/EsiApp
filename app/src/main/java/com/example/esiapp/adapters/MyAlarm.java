package com.example.esiapp.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;

import androidx.core.app.NotificationCompat;

import com.example.esiapp.R;

public class MyAlarm extends BroadcastReceiver {
    Notetodo notetodo;
    @Override
    public void onReceive(Context context, Intent intent) {
        MediaPlayer mediaPlayer = MediaPlayer.create(context, R.raw.remider);
        mediaPlayer.start();
        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = notificationHelper.getChannelNotification(notetodo.getText());
        notificationHelper.getManager().notify(1, nb.build());
    }
}