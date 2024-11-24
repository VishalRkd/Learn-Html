package com.spawn.learnhtml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private long backPressedTime;
    private Toast backToast;
    Toolbar tool;
    ListView listView;
    ArrayList<String> arrList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = findViewById(R.id.tool);
        setSupportActionBar(toolbar);


        listView = findViewById(R.id.listId);
        arrList.add("Introduction to HTML");
        arrList.add("HTML Structure and Basic Tags");
        arrList.add("Text Elements and Formatting");
        arrList.add("HTML Lists");
        arrList.add("Links and Navigation");
        arrList.add("Images and Media");
        arrList.add("Tables");
        arrList.add("Forms and Inputs");
        arrList.add("HTML Attributes");
        arrList.add("HTML5 Semantic Elements");
        arrList.add("HTML Block and Inline Elements");
        arrList.add("Multimedia (Audio and Video)");
        arrList.add("Canvas and SVG");
        arrList.add("Meta Tags and SEO");
        arrList.add("HTML APIs (e.g., Geolocation, Drag and Drop)");
        arrList.add("Accessibility in HTML");
        arrList.add("Responsive HTML Design");
        arrList.add("HTML Entities");
        arrList.add("Web Storage");
        arrList.add("HTML Global Attributes");
        arrList.add("HTML Forms and Form Elements");
        arrList.add("HTML Table Elements");
        arrList.add("HTML5 Form Attributes");
        arrList.add("HTML Text-Level Elements");
        arrList.add("HTML Input Types");
        arrList.add("HTML Element Styling");
        arrList.add("HTML Page Metadata");
        arrList.add("HTML Accessibility Best Practices");
        arrList.add("HTML Best Practices and Optimization");

        ArrayAdapter<String> arrAdapter = new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_list_item_1, arrList);
        listView.setAdapter(arrAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = arrList.get(position);
                Intent intent = new Intent(MainActivity2.this, DetailActivity.class);
                intent.putExtra("topic_name", selectedItem);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {

        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}