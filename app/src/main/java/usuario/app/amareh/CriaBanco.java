package usuario.app.amareh;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Luciano Medeiros on 10/10/2016.
 */

class CriaBanco extends SQLiteOpenHelper{


    public static final String NOME_BANCO = "banco.db";
    public static final String TABELA = "usuario";
    public static final String ID = "_id";
    public static final String LOGIN = "login";
    public static final String SENHA = "senha";
    public static final String EMAIL = "email";



    private static final int VERSAO = 1;

    public CriaBanco(Context context) {
        super(context, NOME_BANCO,null,VERSAO);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "CREATE TABLE"+TABELA+"("
                + ID + "integer primary key autoincrement,"
                + LOGIN + "LOGIN,"
                + SENHA + "SENHA"
                + EMAIL + "EMAIL"
                +")";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS" + TABELA);
        onCreate(db);

    }





    public CriaBanco(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
}
