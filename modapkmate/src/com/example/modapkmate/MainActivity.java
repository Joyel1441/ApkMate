package com.example.modapkmate;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity {
    EditText etApk;
    Button btnSearch;
    String ApkName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

etApk=findViewById(R.id.etApk);
btnSearch=findViewById(R.id.btnSearch);

btnSearch.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
if(!etApk.getText().toString().isEmpty()){ 
ApkName=etApk.getText().toString().trim();
Intent i =new Intent (MainActivity.this,Activity2.class);
i.putExtra("ApkName",ApkName);
startActivity(i);
}
else{
etApk.setError("Please enter an apk name");
}
}
});
    }
}