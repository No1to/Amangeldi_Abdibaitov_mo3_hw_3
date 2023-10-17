package com.example.amangeldi_abdibaitov_mo3_hw_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> contactNameList = new ArrayList<>();
    private RecyclerView rvContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData() {
        contactNameList.add("Адилет");
        contactNameList.add("Adil");
        contactNameList.add("Алексей");
        contactNameList.add("Нургазы");
        contactNameList.add("Рамис");
        contactNameList.add("Не Рамис");
        contactNameList.add("Аанг");
        contactNameList.add("Тай Ли");
        contactNameList.add("Зуко");
        contactNameList.add("Хулио");
        contactNameList.add("Диабето");
        contactNameList.add("Гомер");
        contactNameList.add("Дин");
        contactNameList.add("Noito");
        initAdapter();
    }

    private void initAdapter() {
        ContactAdapter adapter = new ContactAdapter(contactNameList);
        rvContact.setAdapter(adapter);
    }

    private void initView() {
        rvContact = findViewById(R.id.rv_contact);
    }
}