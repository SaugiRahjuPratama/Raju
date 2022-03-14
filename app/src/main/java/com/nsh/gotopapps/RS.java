package com.nsh.gotopapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RS extends ListActivity{
    protected void onCreate (Bundle icicle){
        super.onCreate(icicle);
        String[] listRS = new String[]{"Rumah Sakit Ibnu Sina","Rumah Sakit Awal Bross",
                "Rumah Sakit Jiwa Tampan","RS Eka Hospital"};
        this.setListAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1,listRS));
    }

    protected void onListItemClick (ListView l, View v, int positiion, long id) {
        super.onListItemClick(l, v, positiion, id);
        Object o = this.getListAdapter().getItem(positiion);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Ibnu Sina")) {
                a = new Intent(this,RSIbnuSina.class);

            } else if (pilihan.equals("Rumah Sakit Awal Bross")) {
                a = new Intent(this,RSAwalBross.class);
            }else if (pilihan.equals("Rumah Sakit Jiwa Tampan"))
            {   a = new Intent(this,RSjiwaTampan.class);

            }else if (pilihan.equals("RS Eka Hospital")){
                a = new Intent(this,RSEkaHospital.class);
            }

                startActivity(a);

            }catch(Exception e)
            {
                e.printStackTrace();
            }

            }
        }



