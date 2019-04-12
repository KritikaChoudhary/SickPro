package com.example.myproject2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b7=findViewById(R.id.button7);
        Button b1=findViewById(R.id.bu1);
        Button rev=findViewById(R.id.button10);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent explicit=new Intent(MainActivity.this,FirstActivityPart1.class);
                startActivity(explicit);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:108"));
                startActivity(intent);
            }
        });
        rev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eId1="teamsickpro@gmail.com";
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{eId1});
                email.putExtra(Intent.EXTRA_SUBJECT, "Feedback:");
                email.putExtra(Intent.EXTRA_TEXT, "Fill in the details:\n\nWhat do you like the most about our App? \n\n___\n\n Rate our App: \n\n___\n\nSuggestions/Queries: \n\n___");
                email.setType("message/rfc822");
                startActivity(email);
            }
        });
    }
}
