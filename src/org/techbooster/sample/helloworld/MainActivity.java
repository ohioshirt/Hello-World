package org.techbooster.sample.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// �A�N�V�����o�[�ɕ\�����郁�j���[�̍쐬
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
