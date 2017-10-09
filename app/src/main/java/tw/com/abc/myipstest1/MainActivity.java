package tw.com.abc.myipstest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button BtnOk;
    private EditText Eda,Edb,Edc;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Eda=(EditText)findViewById(R.id.eda);
        Edb=(EditText)findViewById(R.id.edb);
        Edc=(EditText)findViewById(R.id.edc);

        BtnOk=(Button) findViewById(R.id.btnok);
        BtnOk.setOnClickListener(Ok_Listener);

        textView=(TextView) findViewById(R.id.tvshowans);


    }

    // 須注意事項
    // 1.先乘除後加減
    // 2.double 和 Double 的差異
    // 3.型態轉換
    private View.OnClickListener Ok_Listener = new  Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            double a =Double.parseDouble(Eda.getText().toString());
            double b =Double.parseDouble(Edb.getText().toString());
            double c =Double.parseDouble(Edc.getText().toString());

            //公式
            double tmp= b*b-4*a*c;

            double answer1= (-b + Math.sqrt(tmp)) / 2*a;
            //double answer1= -b + Math.sqrt(b*b-4*a*c) / 2*a;
            double answer2= (-b - Math.sqrt(tmp)) / 2*a;
            // +"或"+answer2.toString()  ()
            textView.setText(Double.toString(answer1)+ " 或" + Double.toString(answer2) );
            //textView.setText(tmp.toString());
        }
    };


}
