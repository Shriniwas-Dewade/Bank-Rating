package com.mycompany.myapp2;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View;

public class MainActivity extends Activity
{
	Spinner S1;
	String[] list = {"SBI","HDFC","ICICI","AXIS"};
	RatingBar r1;
	Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		S1 = (Spinner) findViewById(R.id.Spinner1);
		r1 = (RatingBar) findViewById(R.id.RatingBar);
		b1 = (Button) findViewById(R.id.Button);
		b2 = (Button) findViewById(R.id.Button2);
		
		ArrayAdapter AD = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item,list);
		AD.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		S1.setAdapter(AD);
    }
	
	public void toDo(View v){
		Toast.makeText(getApplicationContext(),"" + S1.getSelectedItem().toString(),Toast.LENGTH_SHORT).show();
	}
	
	public void Click(View v){
		Toast.makeText(getApplicationContext(), S1.getSelectedItem() + " : " + r1.getRating(),Toast.LENGTH_SHORT).show();
	}
}
