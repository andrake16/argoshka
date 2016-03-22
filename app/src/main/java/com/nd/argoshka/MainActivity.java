package com.nd.argoshka;

import android.app.Activity;
import android.app.ListActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends Activity {//extends ListActivity  {
    ArrayAdapter<String> adapter1,adapter2,adapter3;
    HashMap<String,String> client;
    List<String> lData,lData2;
    ListView lv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        lv = (ListView) findViewById(R.id.listView);


        List<HashMap<String,String>> clients = new ArrayList<HashMap<String,String>>();


        client = new HashMap<String,String>();
        client.put("FIO","Amanda Peet");
        client.put("phone", "89539223405");
        clients.add(client);

        client = new HashMap<String,String>();
        client.put("FIO","Lilie Sobiesky");
        client.put("phone", "8953946859");
        clients.add(client);

        client = new HashMap<String,String>();
        client.put("FIO","Shone Connery");
        client.put("phone", "8953946861");
        clients.add(client);


        lData = new ArrayList<String>();
        lData.add("Level_1_ZXC");
        lData.add("Level_1_VBN");
        lData.add("Level_1_NMB");

        lData2 = new ArrayList<String>();
        lData2.add("Level_2_ZXCzxcvzxc");
        lData2.add("Level_2_VBNzxcv");
        lData2.add("Level_2_NMBzxcvzxc");

        adapter1 = new ArrayAdapter<String>(this,R.layout.list_item,R.id.tvName, lData);
        adapter2 = new ArrayAdapter<String>(this,R.layout.list_item,R.id.tvName, lData2);



        lv.setAdapter(adapter1);
        lv.setOnItemClickListener(onItemClickListener);



        //getListView().setOnItemLongClickListener(this);


    }

    AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            lv.setAdapter(adapter2);
        }
    };

    /*
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Log.d("ARGOSHKA LOG", String.valueOf(position));


        //Toast.makeText(this, String.valueOf(position), Toast.LENGTH_SHORT).show();
        String value = this.getListView().getItemAtPosition(position).toString();
        //Toast.makeText(this, value, Toast.LENGTH_SHORT).show();

    }*/






    /*

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), getListView().getItemAtPosition(position).toString() ,Toast.LENGTH_SHORT).show();
        //parent.getChildAt(position).findViewById(R.id.tvName).setBackgroundColor(Color.CYAN);

        view.setBackgroundColor(Color.CYAN);

        for(int i=0; i<parent.getChildCount(); i++)
        {
            if(i == position)
            {
                parent.getChildAt(i).setBackgroundColor(Color.CYAN);
            }
            else
            {
                parent.getChildAt(i).setBackgroundColor(Color.TRANSPARENT);
            }

        }



        return true;
    }*/
}
