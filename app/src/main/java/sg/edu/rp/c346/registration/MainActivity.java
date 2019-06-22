package sg.edu.rp.c346.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    EditText name;
    ToggleButton tbMember;
    Button register;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextName);
        tbMember = findViewById(R.id.toggleButtonMember);
        register = findViewById(R.id.buttonRegister);
        result = findViewById(R.id.textViewResult);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "";

                if(!tbMember.isChecked()){
                    text = "Non-Member " + name.getText().toString()+" Registered!";
                }else{
                    text = "Member "+name.getText().toString()+" Registered!";
                }
                result.setText(text);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflatethemenu;thisaddsitemstotheactionbarifitispresent.
        //R.menu_main=nameofthemenuresourcefile
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //Handleactionbaritemclickshere.
        int id=item.getItemId();

        if(id==R.id.action_reset){
            name.setText("");
            tbMember.setChecked(false);
            result.setText("");
        }else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }


}
