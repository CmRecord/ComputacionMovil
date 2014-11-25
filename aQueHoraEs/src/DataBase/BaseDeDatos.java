package DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDeDatos extends SQLiteOpenHelper {

	static final int DbVersion = 1;
	static final String nombreBD = "BDaQueHoraEs";
	static final String tablaEventos = "TEventos";
	static final String colNombre = "nombreEvento";
	static final String colId = "idEvento";
	static final String colDirector = "directorEvento";
	static final String hora = "horaEvento";
	static final String dia = "diaEvento";
	static final String salon = "salonEvento";

	public BaseDeDatos(Context context) {
		super(context, nombreBD, null, DbVersion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE" + tablaEventos + "{" + colId
				+ "INTEGER PRIMARY KEY , " + colNombre + "TEXT" + colDirector
				+ "TEXT" + hora + "TIME" + dia + "DATE" + salon + "TEXT");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
