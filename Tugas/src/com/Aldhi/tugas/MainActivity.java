package com.Aldhi.tugas;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//event
		Button button = (Button) findViewById(R.id.button);
		button.setOnClickListener(new View.OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				TextView say;
				say = (TextView) findViewById(R.id.txtNim2);
				
				String kalimat;
				kalimat = (String)say.getText();
				
				if (kalimat == "NIM SAYA: 13111078")
				{
					say.setText("Nama : Aldhi Fajar Maudhi");
				}
				else if(kalimat == "Nama : Aldhi Fajar Maudhi")
				{
					say.setText("Facebook : http://facebook.com/aldhifajar");
				}
				else if(kalimat == "Facebook : http://facebook.com/aldhifajar")
				{
					say.setText("Email : aldhifajar@gmail.com");
				}
				else 
				{
					say.setText("NIM SAYA: 13111078");
				}
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
