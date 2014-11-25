package com.usc.aquehoraes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btnBuscar = (Button) findViewById(R.id.BtnBuscarEvento);
		Button btnRegEvent = (Button) findViewById(R.id.btnRegEvento);
		Button btnAcercade = (Button) findViewById(R.id.btnAcercaDe);
		Button btnPerfil = (Button) findViewById(R.id.btnPerfil);

		// calendarioEventos.setTimeInMillis(System.currentTimeMillis());
		// calendarioEventos.set(Calendar.HOUR_OF_DAY,
		// timePicker.getCurrentHour());
		// calendarioEventos.set(Calendar.MINUTE,
		// timePicker.getCurrentMinute());
		// calendarioEventos.set(Calendar.SECOND, 0);
		btnPerfil.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent perfil = new Intent();
				perfil.setClass(MainActivity.this, PerfilActivity.class);
				startActivity(perfil);

			}
		});

		btnBuscar.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent buscar = new Intent();
				buscar.setClass(MainActivity.this, CalendarioActivity.class);
				startActivity(buscar);
			}
		});

		btnRegEvent.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent registrar = new Intent();
				registrar.setClass(MainActivity.this, RegEventActivity.class);
				startActivity(registrar);
			}
		});

		btnAcercade.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent buscar = new Intent();
				buscar.setClass(MainActivity.this, AboutActivity.class);
				startActivity(buscar);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
