package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//    	setContentView(R.layout.activity_display_message);        
        
        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Create the text view
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);
        textView.setBackgroundColor(BIND_WAIVE_PRIORITY);
 
        TextView ednome = (TextView) findViewById(R.id.textView1);
        
//        if (ednome!=null) {
//        	
//        	ednome.setText(textView.getText());
//        
//        } else {
//        	textView.setText("Objeto View n�o encontrado");
//            // Set the text view as the activity layout
//            setContentView(textView);        
//        	
//        }
        
        
        setContentView(textView);        
        
    }


    /** Called when the user clicks the Send button */
    public void voltar(View view) {
        // Do something in response to button
    	
//    	Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
    	
//  Alterado no Master
    	finish();
    }       
    
}
