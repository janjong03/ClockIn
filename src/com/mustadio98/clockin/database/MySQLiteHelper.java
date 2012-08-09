package com.mustadio98.clockin.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MySQLiteHelper extends SQLiteOpenHelper {

	public static final String CLOCKIN_NAME="clockin";
	public static final String CLOCKIN_ID="clockinID";
	public static final String CLOCKIN_TIME="clockinTime";
	public static final String CLOCKOUT_TIME="clockoutTime";
	
	public static final String BREAK_NAME="break";
	public static final String BREAK_ID="breakID";
	public static final String BREAKOUT_TIME="breakOutTime";
	public static final String BREAKIN_TIME="breakInTime";
	
	
	private static final String DATABASE_NAME="timecclock.db";
	private static final int DATABASE_VERSION=1;
	
	public MySQLiteHelper(Context context){
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}
	@Override
	public void onCreate(SQLiteDatabase database) {
		database.execSQL("CREATE TABLE clockin(clockInID integer primary key autoincrement, clockinTime DATETIME not null, clockoutTime DATETIME);");
		database.execSQL("Create TABLE break(breakID integer primary key autoincrement, breakOutTime DATETIME not null, breakInTime DATETIME, clockinID integer not null, FOREIGN KEY(clockinID) references clockin(clockinID);");

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		Log.w(MySQLiteHelper.class.getName(), "Upgrading database from version "+ oldVersion + " to " + newVersion +", which will destroy all data");
		
		db.execSQL("DROP TABLE IF EXISTS clockin, break;");
		onCreate(db);

	}

}
