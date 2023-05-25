package com.example.project;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.reflect.TypeToken;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements com.example.project.JsonTask.JsonTaskListener {

    Button button;

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";


    private ArrayList<RecyclerViewItem> mountains  = new ArrayList<>();
    private MyAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("onCreate1", "hello from hdskj");

        adapter = new MyAdapter(this, mountains, new MyAdapter.OnClickListener() {
            @Override
            public void onClick(RecyclerViewItem item) {
                Toast.makeText(MainActivity.this, item.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
        RecyclerView view = findViewById(R.id.recycler_view);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(adapter);

        new com.example.project.JsonFile(this, this).execute(JSON_FILE);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });

    }


    @Override
    public void onPostExecute(String json) {
// Create GSON object to perform marshall/unmarshall operations
        Log.d("onPostExecute0", "hello from jhsbjh" );
        Gson gson = new Gson();

        Type type = new TypeToken <ArrayList<Item>>(){}.getType();

        List<Item> listOfItems = gson.fromJson(json, type);

        for (Item item : listOfItems){
            mountains.add(new RecyclerViewItem(item.getTitle(), item.getName(), item.getLocation(), item.getCost(), item.getsize(), item.getCategory()));
        }


        adapter.notifyDataSetChanged();
        Log.d("MainActivity", json);
    }

}
