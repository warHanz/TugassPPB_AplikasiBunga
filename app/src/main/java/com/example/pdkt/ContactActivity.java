package com.example.pdkt;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

    public class ContactActivity extends AppCompatActivity {

        ListView listView;
        String mTitle[] = {"Facebook", "Whatsapp", "Instagram"};
        String mDescription[] = {"Reihan", "088225381206", "@reihanmulyawan"};
        int images[] = {R.drawable.facebook, R.drawable.whatsapp, R.drawable.instagram};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_contact);

            listView = findViewById(R.id.listView);

            MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
            listView.setAdapter(adapter);

        }

        public void hal_utama(View view) {
            Intent intent =new Intent(ContactActivity.this, MainActivity.class);
            startActivity(intent);
        }

        class MyAdapter extends ArrayAdapter<String> {

            Context context;
            String rTitle[];
            String rDescription[];
            int rImgs[];

            MyAdapter (Context c, String title[], String description[], int imgs[]) {
                super(c, R.layout.row, R.id.textView1, title);
                this.context = c;
                this.rTitle = title;
                this.rDescription = description;
                this.rImgs = imgs;

            }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View row = layoutInflater.inflate(R.layout.row, parent, false);
                ImageView images = row.findViewById(R.id.image);
                TextView myTitle = row.findViewById(R.id.textView1);
                TextView myDescription = row.findViewById(R.id.textView2);

                images.setImageResource(rImgs[position]);
                myTitle.setText(rTitle[position]);
                myDescription.setText(rDescription[position]);

                return row;
            }
        }
}
