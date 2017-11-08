package com.example.tanmay.recyclerviews;

import android.icu.text.RelativeDateTimeFormatter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView) findViewById(R.id.rv);

        Contact[] contacts=new Contact[14];

        contacts[0]=new Contact();
        contacts[0].contactName="tanmay";
        contacts[0].contactNumber="9999999999";

        contacts[1]=new Contact();
        contacts[1].contactName="tanmay";
        contacts[1].contactNumber="9999999999";

        contacts[2]=new Contact();
        contacts[2].contactName="tanmay";
        contacts[2].contactNumber="9999999999";

        contacts[3]=new Contact();
        contacts[3].contactName="tanmay";
        contacts[3].contactNumber="9999999999";

        contacts[4]=new Contact();
        contacts[4].contactName="tanmay";
        contacts[4].contactNumber="9999999999";

        contacts[5]=new Contact();
        contacts[5].contactName="tanmay";
        contacts[5].contactNumber="9999999999";

        contacts[6]=new Contact();
        contacts[6].contactName="tanmay";
        contacts[6].contactNumber="9999999999";

        contacts[7]=new Contact();
        contacts[7].contactName="tanmay";
        contacts[7].contactNumber="9999999999";

        contacts[8]=new Contact();
        contacts[8].contactName="tanmay";
        contacts[8].contactNumber="9999999999";

        contacts[9]=new Contact();
        contacts[9].contactName="tanmay";
        contacts[9].contactNumber="9999999999";

        contacts[10]=new Contact();
        contacts[10].contactName="tanmay";
        contacts[10].contactNumber="9999999999";

        contacts[11]=new Contact();
        contacts[11].contactName="tanmay";
        contacts[11].contactNumber="9999999999";

        contacts[12]=new Contact();
        contacts[12].contactName="tanmay";
        contacts[12].contactNumber="9999999999";

        contacts[13]=new Contact();
        contacts[13].contactName="tanmay";
        contacts[13].contactNumber="9999999999";



        Adapter adapter=new Adapter(contacts);


        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
