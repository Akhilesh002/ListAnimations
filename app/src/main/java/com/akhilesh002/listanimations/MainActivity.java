package com.akhilesh002.listanimations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ListItem> listItems;
    private ListItemAdapter listItemAdapter;
    private String[] name = new String[]{"abc","bcd" ,"cde","def","efg","fgh","ghi","hij","ijk","jkl","klm","lmn","mno",
            "nop","opq","pqr","qrs","rst","stu","tuv","uvw","uwx","wxy","xyz"};
    private String[] desc1 = new String[]{"abc101","bcd102" ,"cde103","def104","efg105","fgh106","ghi107","hij108","ijk109","jkl110","klm111","lmn112","mno113",
            "nop114","opq115","pqr116","qrs117","rst118","stu119","tuv120","uvw121","uwx122","wxy123","xyz124"};
    private String[] desc2 = new String[]{"abc201","bcd202" ,"cde203","def204","efg205","fgh206","ghi207","hij208","ijk209","jkl210","klm211","lmn212","mno213",
            "nop214","opq215","pqr216","qrs217","rst218","stu219","tuv220","uvw221","uwx222","wxy223","xyz224"};
    private String[] desc3 = new String[]{"abc301","bcd302" ,"cde303","def304","efg305","fgh306","ghi307","hij308","ijk309","jkl310","klm311","lmn312","mno313",
            "nop314","opq315","pqr316","qrs317","rst318","stu319","tuv320","uvw321","uwx322","wxy323","xyz324"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.item_per_list);
        listItems = populateItem();
        listItemAdapter = new ListItemAdapter(this, listItems);
        recyclerView.setAdapter(listItemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));
    }

    private ArrayList<ListItem> populateItem() {
        ArrayList<ListItem> list =  new ArrayList<>();

        for (int i = 0; i < 24; i++){
            ListItem listItem = new ListItem();
            listItem.setName(name[i]);
            listItem.setDisc1(desc1[i]);
            listItem.setDisc2(desc2[i]);
            listItem.setDisc3(desc3[i]);
            list.add(listItem);
        }
        return list;
    }
}
