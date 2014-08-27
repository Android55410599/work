package app.buusk.my_layout;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class Activity55410599 extends ActionBarActivity implements OnClickListener {
	private Button btnone, btntwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btnone = (Button) findViewById(R.id.btn_on);
        btntwo = (Button) findViewById(R.id.chang1);
        btntwo.setOnClickListener(this);
//        btnone.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast.makeText(Activity55410599.this, "Onwara", Toast.LENGTH_SHORT).show();
//			}
//		});
    }
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.chang1:
			Intent i = new Intent(getApplicationContext(),Main.class);
			startActivity(i);
			break;

		default:
			break;
		}
		
	}
}
