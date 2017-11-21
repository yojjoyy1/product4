package com.example.user_j.product4;

import android.content.DialogInterface;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    private EditText edtATM;
    private Button btnN0,btnN1,btnN2,btnN3,btnN4,btnN5,btnN6,btnN7,btnN8,btnN9;
    private Button btnBack,btnOK,btnEnd;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtATM = (EditText)findViewById(R.id.edtATM);
        btnN0 = (Button)findViewById(R.id.btnN0);
        btnN1 = (Button)findViewById(R.id.btnN1);
        btnN2 = (Button)findViewById(R.id.btnN2);
        btnN3 = (Button)findViewById(R.id.btnN3);
        btnN4 = (Button)findViewById(R.id.btnN4);
        btnN5 = (Button)findViewById(R.id.btnN5);
        btnN6 = (Button)findViewById(R.id.btnN6);
        btnN7 = (Button)findViewById(R.id.btnN7);
        btnN8 = (Button)findViewById(R.id.btnN8);
        btnN9 = (Button)findViewById(R.id.btnN9);
        btnBack = (Button)findViewById(R.id.btnBack);
        btnOK = (Button)findViewById(R.id.btnNOK);
        btnEnd = (Button)findViewById(R.id.btnEnd);
        btnN0.setOnClickListener(listener);
        btnN1.setOnClickListener(listener);
        btnN2.setOnClickListener(listener);
        btnN3.setOnClickListener(listener);
        btnN4.setOnClickListener(listener);
        btnN5.setOnClickListener(listener);
        btnN6.setOnClickListener(listener);
        btnN7.setOnClickListener(listener);
        btnN8.setOnClickListener(listener);
        btnN9.setOnClickListener(listener);
        btnBack.setOnClickListener(listener);
        btnOK.setOnClickListener(listener);
        btnEnd.setOnClickListener(listener);
    }
    private Button.OnClickListener listener = new Button.OnClickListener()
    {
      @Override
      public void onClick(View v)
      {
          switch (v.getId())
          {
              case R.id.btnN0:

                  displayATM("0");
                  break;
              case R.id.btnN1:
                  displayATM("1");
                  break;
              case R.id.btnN2:
                  displayATM("2");
                  break;
              case R.id.btnN3:
                  displayATM("3");
                  break;
              case R.id.btnN4:
                  displayATM("4");
                  break;
              case R.id.btnN5:
                  displayATM("5");
                  break;
              case R.id.btnN6:
                  displayATM("6");
                  break;
              case R.id.btnN7:
                  displayATM("7");
                  break;
              case R.id.btnN8:
                  displayATM("8");
                  break;
              case R.id.btnN9:
                  displayATM("9");
                  break;
              case R.id.btnBack:
                  String str = edtATM.getText().toString();
                  if(str.length()>0)
                  {
                      str = str.substring(0,str.length() - 1);
                      edtATM.setText(str);
                  }
                  break;
              case R.id.btnNOK:
                  str = edtATM.getText().toString();
                  if(str.equals("123456"))
                  {
                      Toast toast = Toast.makeText(MainActivity.this,"密碼正確，歡迎使用提款功能!",Toast.LENGTH_LONG);
                      toast.show();
                      toast.setGravity(Gravity.CENTER,0,0);
                  }
                  else
                  {
                      Toast toast = Toast.makeText(MainActivity.this,"密碼錯誤，請重新輸入。",Toast.LENGTH_LONG);
                      toast.show();
                      edtATM.setText("");
                  }
                  break;
              case R.id.btnEnd:
                  AlertDialog show = new AlertDialog.Builder(MainActivity.this).setTitle("確認視窗").setIcon(R.mipmap.ic_launcher)
                          .setPositiveButton("確定", new DialogInterface.OnClickListener() {
                              @Override
                              public void onClick(DialogInterface dialog, int which) {
                                  finish();
                              }
                          })
                          .setNegativeButton("取消",new DialogInterface.OnClickListener() {
                              @Override
                              public void onClick(DialogInterface dialog, int which) {

                              }
                          })
                          .setMessage("確定要結束應用程式嗎?").show();

                  break;
          }
      }
    };
    private void displayATM(String s)
    {
        String str = edtATM.getText().toString();
        edtATM.setText(str + s);
    }
}
