package com.example.xotomajor.todo.db;
//package com.aziflaj.todolist.db;

        import android.provider.BaseColumns;

public class TaskContract {
    /*
    This is class provides some constants we can use to access the database.

    Android ships with SQLite database that we're using here to save our tasks!
     */
    public static final String DB_NAME = "com.aziflaj.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        // Our database table name
        public static final String TABLE = "tasks";
        // A column to use for storing a task named title
        public static final String COL_TASK_TITLE = "title";
    }
}