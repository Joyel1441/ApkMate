package com.example.modapkmate;

import android.app.Activity;
import android.widget.ScrollView;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.net.Uri;
import android.app.SearchManager;
import android.content.Intent;

public class Activity2 extends Activity  {
String ApkName,Store;
Button btnHappyMod;
Button btnApkMonk;
Button btnRevDl;
Button btnApkHome;
Button btnAllCrackApk;
Button btnApkMb;
Button btnAPM;
Button btnApkMirror;
Button btnGetJar;
Button btnApk4All;
Button btnAmzModApk;
Button btnApkPure;
Button btnRexDl;
Button btnModApkDown;
Button btnAndroid1;
Button btnHiAppHere;
Button btnA2ZApk;
Button btnDlAndroid;
Button btnApkReal;
Button btnPaidFullPro;
Button btnModMafia;
Button btnApkDlMod;
Button btnAndroPark;
Button btnApk4Fun;
Button btnOceanOfApk;
Button btnApkMody;
Button btnStartCrack;
Button btnApkHouse;
Button btnApkSum;
Button btnGoogle;
Button btnAndroPalace;

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

getActionBar().hide();

ApkName=getIntent().getStringExtra("ApkName");

btnHappyMod=findViewById(R.id.btnHappyMod);
btnRevDl=findViewById(R.id.btnRevDl);
btnApkHome=findViewById(R.id.btnApkHome);
btnAllCrackApk=findViewById(R.id.btnAllCrackApk);
btnApkMb=findViewById(R.id.btnApkMb);
btnAPM=findViewById(R.id.btnAPM);
btnApkMirror=findViewById(R.id.btnApkMirror);
btnGetJar=findViewById(R.id.btnGetJar);
btnApk4All=findViewById(R.id.btnApk4All);
btnAmzModApk=findViewById(R.id.btnAmzModApk);
btnApkPure=findViewById(R.id.btnApkPure);
btnRexDl=findViewById(R.id.btnRexDl);
btnModApkDown=findViewById(R.id.btnModApkDown);
btnAndroid1=findViewById(R.id.btnAndroid1);
btnHiAppHere=findViewById(R.id.btnHiAppHere);
btnA2ZApk=findViewById(R.id.btnA2ZApk);
btnDlAndroid=findViewById(R.id.btnDlAndroid);
btnApkReal=findViewById(R.id.btnApkReal);
btnPaidFullPro=findViewById(R.id.btnPaidFullPro);
btnModMafia=findViewById(R.id.btnModMafia);
btnApkDlMod=findViewById(R.id.btnApkDlMod);
btnAndroPark=findViewById(R.id.btnAndroPark);
btnApk4Fun=findViewById(R.id.btnApk4Fun);
btnOceanOfApk=findViewById(R.id.btnOceanOfApk);
btnApkMody=findViewById(R.id.btnApkMody);
btnStartCrack=findViewById(R.id.btnStartCrack);
btnApkHouse=findViewById(R.id.btnApkHouse);
btnApkSum=findViewById(R.id.btnApkSum);
btnGoogle=findViewById(R.id.btnGoogle);
btnAndroPalace=findViewById(R.id.btnAndroPalace);

btnHappyMod.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.happymod.com/search.html?q="+ApkName;
Toast.makeText(getApplicationContext(),"Happymod",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnRevDl.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.revdl.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Revdl",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApkHome.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://apkhome.net/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Apkhome",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnAllCrackApk.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://allcrackapk.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Allcrackapk",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApkMb.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://apkmb.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Apkmb",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnAPM.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://androidapkmods.com/?amp=1&s="+ApkName;
Toast.makeText(getApplicationContext(),"Androidapkmods",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApkMirror.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.apkmirror.com/?post_type=app_release&searchtype=apk&s="+ApkName;
Toast.makeText(getApplicationContext(),"Apkmirror",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnGetJar.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.getjar.com/search/?q="+ApkName;
Toast.makeText(getApplicationContext(),"Getjar",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApk4All.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://apk4all.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Apk4all",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnAmzModApk.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="http://www.amzmodapk.com/search?q="+ApkName;
Toast.makeText(getApplicationContext(),"Amzmodapk",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApkPure.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://m.apkpure.com/search?q="+ApkName;
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnRexDl.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://rexdl.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Rexdl",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnModApkDown.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.modapkdown.com/search.html?q="+ApkName;
Toast.makeText(getApplicationContext(),"Modapkdown",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnAndroid1.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://android-1.com/en/igry/?story="+ApkName+"&do=search&subaction=search";
Toast.makeText(getApplicationContext(),"Android-1",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnHiAppHere.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="http://m.hiapphere.com/index/search?q="+ApkName;
Toast.makeText(getApplicationContext(),"Hiapphere",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnA2ZApk.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://a2zapk.com/Search/"+ApkName+"/";
Toast.makeText(getApplicationContext(),"A2Zapk",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnDlAndroid.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://dlandroid.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Flandroid",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApkReal.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://apkreal.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Apkreal",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnPaidFullPro.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.paidfullpro.in/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Paidfullpro",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnModMafia.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.modmafia.co/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Modmafia",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApkDlMod.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.apkdlmod.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Aokdlmod",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnAndroPark.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.andropark.info/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Andropark",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApk4Fun.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.apk4fun.com/s.php?s="+ApkName;
Toast.makeText(getApplicationContext(),"Apk4fun",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnOceanOfApk.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://oceanofapk.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Oceanofapk",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApkMody.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://apkmody.io/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Apkmody",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnStartCrack.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://startcrack.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Startcrack",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApkHouse.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://apkhouse.com/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Apkhouse",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnApkSum.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://m.apksum.com/search?q="+ApkName;
Toast.makeText(getApplicationContext(),"Apksum",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnGoogle.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.google.com/search?q="+ApkName+"+cracked+apk+free+download";
Toast.makeText(getApplicationContext(),"Google",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});

btnAndroPalace.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
Store="https://www.andropalace.org/?s="+ApkName;
Toast.makeText(getApplicationContext(),"Androidpalace",Toast.LENGTH_SHORT).show();
Intent k=new Intent(Intent.ACTION_VIEW,Uri.parse(Store));
startActivity(Intent.createChooser(k,"Open with:"));
}
});
}
}