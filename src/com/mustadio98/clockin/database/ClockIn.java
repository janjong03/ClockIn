package com.mustadio98.clockin.database;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class ClockIn {
private SQLiteDatabase database;
private MySQLiteHelper mySQLiteHelper;
private String[] allColumnsClock={MySQLiteHelper.CLOCKIN_ID, MySQLiteHelper.CLOCKIN_NAME, MySQLiteHelper.CLOCKIN_TIME, MySQLiteHelper.CLOCKOUT_TIME};
private String[] allColumnsBreak={MySQLiteHelper.BREAK_NAME, MySQLiteHelper.BREAKOUT_TIME, MySQLiteHelper.BREAKIN_TIME, MySQLiteHelper.CLOCKIN_ID};

public ClockIn(Context context){
	mySQLiteHelper=new MySQLiteHelper(context);
}

public void open() throws SQLException{
	database=mySQLiteHelper.getWritableDatabase();
}

public void close(){
	mySQLiteHelper.close();
}
}
