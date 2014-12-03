package com.code2care.android.togglebuttonexample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ToggleButtonEx extends ActionBarActivity {

	private Button button;
	private TextView buttonState;
	private int flag = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_toggle_button_ex);

		button = (Button) findViewById(R.id.toggleButton);

		buttonState = (TextView) findViewById(R.id.buttonState);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {

				if (flag == 0) {

					flag = 1; // 1 => Button ON
					button.setBackgroundResource(R.drawable.switch_on);
					buttonState.setText("State : ON");
				} else {
					flag = 0; // 0 => Button OFF
					button.setBackgroundResource(R.drawable.switch_off);
					buttonState.setText("State : OFF");
				}

			}
		});
	}

}
