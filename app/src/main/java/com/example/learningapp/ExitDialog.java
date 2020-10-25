package com.example.learningapp;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class ExitDialog extends Dialog implements
        android.view.View.OnClickListener {

    public Activity c;
    public Dialog d;
    public Button yes,no;

    public ExitDialog(Activity a) {
        super(a);
        // TODO Auto-generated constructor stub
        this.c = a;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_exit_dialog);
        d=new Dialog(getContext());
        yes = (Button) findViewById(R.id.btn_yes_main);
        no = (Button) findViewById(R.id.btn_no_main);
        yes.setOnClickListener(this);
        no.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_yes_main:
                c.finish();
                System.exit(0);
                break;
            case R.id.btn_no_main:
                d.dismiss();
                break;
            default:
                break;
        }
        dismiss();
    }
}
