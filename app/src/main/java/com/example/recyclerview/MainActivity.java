package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        List<Contacts>contactsList=new ArrayList<>();
        contactsList.add(new Contacts("index","9840096937",R.drawable.index));
        contactsList.add(new Contacts("index1","9840096938",R.drawable.index1));
        contactsList.add(new Contacts("index2","9840096939",R.drawable.index2));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
