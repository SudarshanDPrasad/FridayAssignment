package com.example.callerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class ContactScreen extends AppCompatActivity implements ItemOnClick {
    private RecyclerView mrecycleview;
    private ArrayList<Contact> contactArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_screen);
        intidview();
        buildview();
        setview();

    }

    private void setview() {
        ContactAdapter contactAdapter = new ContactAdapter(contactArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mrecycleview.setLayoutManager(linearLayoutManager);
        mrecycleview.setAdapter(contactAdapter);

    }

    private void buildview() {
        contactArrayList= new ArrayList<>();
        Contact contact = new Contact("Prateek Shukha","9986896968",R.drawable.prateek);
        contactArrayList.add(contact);
        Contact contact1 = new Contact("Aditya","8830466523",R.drawable.aditya);
        contactArrayList.add(contact1);
        Contact contact2 = new Contact("Lloyd","9986896968",R.drawable.lloyd);
        contactArrayList.add(contact2);
        Contact contact3 = new Contact("Subham","9321077436",R.drawable.prateek);
        contactArrayList.add(contact3);
        Contact contact4 = new Contact("Fire","101",R.drawable.prateek);
        contactArrayList.add(contact4);
    }

    private void intidview() {
        mrecycleview=findViewById(R.id.recycleview);

    }

    @Override
    public void onCLick(Contact contact) {
        String Data = contact.getNumber().toString();
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + Data));
        startActivity(intent);
    }
}