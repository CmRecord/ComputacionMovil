package com.usc.aquehoraes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class CalendarioActivity extends Activity {

	private String[] eventos = { "Acelerator2", "Conferecia Computacion",
			"Retrospectiva", "Evento1", "Evento2", "Evento3", "Evento4",
			"Evento5", "Evento 6", "Evento 7" };
	private String[] datos = { "Hora 2:00 pm 20/11/2014",
			"Hora 3:00 pm 1/11/2014", "Hora 4:00 pm 25/11/2014",
			"Hora 2:00 pm 13/11/2014", "Hora 2:00 pm 13/11/2014",
			"Hora 2:00 pm 13/11/2014", "Hora 2:00 pm 13/11/2014",
			"Hora 2:00 pm 13/11/2014", "Hora 2:00 pm 13/11/2014",
			"Hora 2:00 pm 13/11/2014" };
	private TextView tv1;
	private ListView lv1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calendario);
		tv1 = (TextView) findViewById(R.id.txtInfoEvent);
		lv1 = (ListView) findViewById(R.id.listViewEvent);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, eventos);
		lv1.setAdapter(adapter);
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				tv1.setText(lv1.getItemAtPosition(position)
						+ " es " + datos[position]);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calendario, menu);
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
