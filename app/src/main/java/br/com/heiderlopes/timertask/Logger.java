package br.com.heiderlopes.timertask;

import android.util.Log;

import java.util.TimerTask;

public class Logger extends TimerTask {

    private long cont = 0;

    public Logger() {
        Log.i("LOGGER", "Logger iniciado");
    }
    @Override
    public void run() {
        cont++;
        Log.i("LOGGER", String.valueOf(cont));
    }
}
