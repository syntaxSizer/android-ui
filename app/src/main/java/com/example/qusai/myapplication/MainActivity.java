package com.example.qusai.myapplication;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] items = {"one", "two", "three","four","five","six","seven","eight"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items));
    }
    //founction to disply toast when clicking the list items
    public void onListItemClick(ListView parent , View v, int position , long id){

        Toast.makeText(this , "you have picked " + items[position], Toast.LENGTH_LONG).show();
    }
}
