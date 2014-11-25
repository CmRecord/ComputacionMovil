package DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class EventoSqLite {
	BaseDeDatos BaseDeDatos;
	SQLiteDatabase sqlData;

	public EventoSqLite(Context context) {
		BaseDeDatos = new BaseDeDatos(context);
	}

	public void OpenDataBase() {
		sqlData = BaseDeDatos.getWritableDatabase();
	}

	public void CloseDataBase() {
		BaseDeDatos.close();
	}

}
