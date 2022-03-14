package com.nsh.gotopapps;

import android.app.DownloadManager;
import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSIbnuSina extends ListActivity {
        protected void onCreate (Bundle icicle){
            super.onCreate(icicle);
            String[] listACT = new String[]{"Call Center","Sms Center", "Driving Direction",
                    "Website", "info di google","Exit"};
            this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listACT));
        }

        protected void onListItemClick (ListView l, View v,int positiion, long id){
            super.onListItemClick(l, v, positiion, id);
            Object o = this.getListAdapter().getItem(positiion);
            String pilihan = o.toString();
            tampilkanpilihan(pilihan);
        }

        private void tampilkanpilihan (String pilihan){
            try {
                Intent a = null;
                if (pilihan.equals("Call Center")) {
                    String nope ="tel:0813-9406-4142";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nope));

                } else if (pilihan.equals("Sms Center")) {
                    String smsText = "Saugi Rahju Pratama";
                    a = new Intent(Intent.ACTION_VIEW);
                    a.setData(Uri.parse("sms:081394064142"));
                    a.putExtra("sms_body", smsText);
                }
                else if (pilihan.equals("Driving Direction"))
                {
                    String lokasirs = "google.navigation:q=0.463823,101.390353";
                    a= new Intent(Intent.ACTION_VIEW,Uri.parse(lokasirs));
                }
                else if (pilihan.equals("Website")) {
                    String website = "http://www.IbnuSina.net";
                    a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));

                }

                else if (pilihan.equals("info di google"))
                {
                    a = new Intent(Intent.ACTION_WEB_SEARCH);
                    a.putExtra(SearchManager.QUERY,"Rumah Sakit Ibnu Sina");

                }
                    startActivity(a);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
