package com.mustadio98.clockin.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class ClockIn {
private SQLiteDatabase database;
private MySQLiteHelper mySQLiteHelper;
private String[] allColumnsClock={MySQLiteHelper.CLOCKIN_ID, MySQLiteHelper.CLOCKIN_TIME, MySQLiteHelper.CLOCKOUT_TIME};
private String[] allColumnsBreak={MySQLiteHelper.BREAKOUT_TIME, MySQLiteHelper.BREAKIN_TIME, MySQLiteHelper.CLOCKIN_ID};
private String[] clockInStart={MySQLiteHelper.CLOCKIN_ID, MySQLiteHelper.CLOCKIN_TIME};

public ClockIn(Context context){
	mySQLiteHelper=new MySQLiteHelper(context);
}

public void open() throws SQLException{
	database=mySQLiteHelper.getWritableDatabase();
}

public void close(){
	mySQLiteHelper.close();
}

public Clock clockIn(int clockIn){
	ContentValues contentValues=new ContentValues();
	contentValues.put(MySQLiteHelper.CLOCKIN_TIME, clockIn);
	long insertId=database.insert(MySQLiteHelper.CLOCKIN_NAME, null, contentValues);
	Cursor cursor=database.query(MySQLiteHelper.CLOCKIN_ID, allColumnsClock, MySQLiteHelper.CLOCKIN_ID + "=" + insertId, null, null, null, null);
	cursor.moveToFirst();
	Clock clock= cursorToClock(cursor);
	cursor.close();
	return clock;
	
}
private Clock cursorToClock(Cursor cursor){
	Clock clock=new Clock();
	return clock;
	
}


//public void addJob(int catId, String title, float lat, float lon){
//	String sql = String.format(
//		"INSERT INTO locations (_id,category_id, title, lat, lon) " +
//		"VALUES (NULL,%d,'%s', %f, %f);",
//		catId,title, lat, lon);
//	try{
//		getWritableDatabase().execSQL(sql);
//	} catch (SQLException e) {
//        Log.e("Error writing new location", e.toString());
//	}
//}

}

