package com.project.ibrapptly.fadingtoast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class FadingToast {

    static private LayoutInflater layoutInflater;
    static private TextView tvCustomToastText;
    static private View view;

    @SuppressLint("InflateParams")
    public static void fadeUp(Context context, String message) {

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert layoutInflater != null;
        view = layoutInflater.inflate(R.layout.popup, null);

        tvCustomToastText = view.findViewById(R.id.customToastText);
        tvCustomToastText.setText(message);
        tvCustomToastText.setTextColor(context.getResources().getColor(R.color.mainColor));


        view.animate()
                .alpha(1)
                .translationX(0)
                .setDuration(2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.animate()
                        .alpha(0)
                        .translationX(1000)
                        .setDuration(10000);
            }
        },1500);

        Toast toast = new Toast(context);
        toast.setGravity(Gravity.TOP, 0, 150);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }

    public static void fadeCentre(Context context, String message) {

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.popup, null);

        tvCustomToastText = view.findViewById(R.id.customToastText);
        tvCustomToastText.setText(message);
        tvCustomToastText.setTextColor(context.getResources().getColor(R.color.mainColor));


        view.animate()
                .alpha(1)
                .translationX(0)
                .setDuration(2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.animate()
                        .alpha(0)
                        .translationX(1000)
                        .setDuration(10000);
            }
        },1500);

        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }

    public static void fadeDown(Context context, String message) {

        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = layoutInflater.inflate(R.layout.popup, null);

        tvCustomToastText = view.findViewById(R.id.customToastText);
        tvCustomToastText.setText(message);
        tvCustomToastText.setTextColor(context.getResources().getColor(R.color.mainColor));


        view.animate()
                .alpha(1)
                .translationX(0)
                .setDuration(2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                view.animate()
                        .alpha(0)
                        .translationX(1000)
                        .setDuration(10000);
            }
        },1500);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
    }
}
