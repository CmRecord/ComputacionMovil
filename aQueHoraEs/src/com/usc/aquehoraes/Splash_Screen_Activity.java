package com.usc.aquehoraes;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Splash_Screen_Activity extends Activity {
	private long splashDelay = 6000; // 6 segundos

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash__screen);
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				Intent mainIntent = new Intent().setClass(
						Splash_Screen_Activity.this, MainActivity.class);
				// Splash_Screen_Activity.this, LoginActivity.class);
				startActivity(mainIntent);
				finish();// Destruimos esta activity para prevenit que el
							// usuario retorne aqui presionando el boton Atras.
			}
		};

		Timer timer = new Timer();
		timer.schedule(task, splashDelay);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash__screen_, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
