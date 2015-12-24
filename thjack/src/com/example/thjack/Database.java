package com.example.thjack;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper{

	public Database(Context context) {
		super(context, "db",null, 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String pin = "CREATE TABLE pin( code TEXT PRIMARY KEY)";
		String pass = "CREATE TABLE pass( pass TEXT PRIMARY KEY)";
		String imagee = "CREATE TABLE image( image blob PRIMARY KEY)";
		db.execSQL(pin);
	}
	
	public int insert(String pinn){
		SQLiteDatabase db = this.getWritableDatabase();
		// Inserting Row
		String ins="insert into pin values("+pinn+");";
		db.execSQL(ins);
		db.close(); // Closing database connection
		return 1;
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}

}
