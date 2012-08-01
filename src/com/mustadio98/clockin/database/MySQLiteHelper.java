package com.mustadio98.clockin.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MySQLiteHelper extends SQLiteOpenHelper {

	private static final String DATABASE_NAME="timecclock.db";
	private static final int DATABASE_VERSION=1;
	
	public MySQLiteHelper(Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL("CREATE TABLE clockin(clockInID integer primary key autoincrement, clockinTime integer not null, clockoutTime integer not null);");
		database.execSQL("Create TABLE break(breakID integer primary key autoincrement, breakOutTime integer not null, breakInTime integer not null, clockinID integer not null, FOREIGN KEY(clockinID) references clockin(clockinID);");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
