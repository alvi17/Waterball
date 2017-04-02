package alvi17.waterball;




import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WB_Menu extends BaseActivity {

	private Button WB_Button_New, WB_Button_Score,
			WB_Button_Exit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wb_menu);
		Init();
	}

	
	private void Init() {
		// TODO Auto-generated method stub
		WB_Button_New = (Button) findViewById(R.id.id_newgamebtn);
		WB_Button_Score = (Button) findViewById(R.id.id_scorebtn);
		WB_Button_Exit = (Button) findViewById(R.id.id_exitgamebtn);

		WB_Button_New.setOnClickListener(new OnClick());
		WB_Button_Score.setOnClickListener(new OnClick());
		WB_Button_Exit.setOnClickListener(new OnClick());
	}

	private class OnClick implements OnClickListener {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.id_newgamebtn:
				Intent intent = new Intent(WB_Menu.this, WB_Delay.class);
				intent.putExtra("place","0");
				startActivity(intent);
				finish();
				break;

			case R.id.id_scorebtn:
				Intent i = new Intent(WB_Menu.this, WB_Score.class);
				startActivity(i);
				break;

			case R.id.id_exitgamebtn:
				finish();
				break;
            }
		}

	}
	
	@Override
	public void onResume() {
		super.onResume();

		/**
		 * ҳ����ʼ��ÿ��Activity�ж���Ҫ��ӣ�����м̳еĸ�Activity���Ѿ�����˸õ��ã���ô��Activity����ز�����ӣ�
		 * ������StatService.onPageStartһ��onPageEnd��������ʹ��
		 */

	}

	@Override
	public void onPause() {
		super.onPause();

		/**
		 * ҳ�������ÿ��Activity�ж���Ҫ��ӣ�����м̳еĸ�Activity���Ѿ�����˸õ��ã���ô��Activity����ز�����ӣ�
		 * ������StatService.onPageStartһ��onPageEnd��������ʹ��
		 */

	}
}
