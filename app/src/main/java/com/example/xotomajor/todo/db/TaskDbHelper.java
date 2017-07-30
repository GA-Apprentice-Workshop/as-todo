package com.example.xotomajor.todo.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import static com.example.xotomajor.todo.db.TaskContract.*;


public class TaskDbHelper extends SQLiteOpenHelper {
    /*
    A class for creating our database. See TaskContract to learn more about the constants used
    below during the creation process.

    Android ships with a SQLite DB that we're using for our app to store tasks!
     */
    public TaskDbHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // SQL: the language of databases. This SQL statement will create a table when executed.
        String createTable = "CREATE TABLE " + com.example.xotomajor.todo.db.TaskContract.TaskEntry.TABLE + " ( " +
                com.example.xotomajor.todo.db.TaskContract.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                com.example.xotomajor.todo.db.TaskContract.TaskEntry.COL_TASK_TITLE + " TEXT NOT NULL);";
        // Execute the SQL statement
        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + com.example.xotomajor.todo.db.TaskContract.TaskEntry.TABLE);
        onCreate(db);
    }
}
