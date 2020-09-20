package com.sameer.mccexp13;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;

public class cityfinder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cityfinder);
    }
    public void finder(View view){
        EditText edt=(EditText)findViewById(R.id.editTextTextPersonName);
        Intent i=new Intent(cityfinder.this,distmap.class);
        String str=edt.getText().toString();
        i.putExtra("name",str);
        startActivity(i);
    }
}