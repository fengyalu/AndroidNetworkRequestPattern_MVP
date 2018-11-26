package com.mvp.demo.fyl.luodao.mvp.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.mvp.demo.fyl.luodao.R;
import com.mvp.demo.fyl.luodao.base.BaseActivity;
import com.mvp.demo.fyl.luodao.exception.ExceptionHandle;
import com.mvp.demo.fyl.luodao.manager.ConstantEnvironment;
import com.mvp.demo.fyl.luodao.manager.UrlManager;
import com.mvp.demo.fyl.luodao.mvp.contract.LoginContract;
import com.mvp.demo.fyl.luodao.mvp.presenter.LoginPresenter;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View, View.OnClickListener, AdapterView.OnItemSelectedListener {

    private Button button;
    private EditText editUserName, editPassWord;
    private Spinner spinner;
    private String[] enArry = {"生产", "开发", "UAT"};
    private String urlType = ConstantEnvironment.PRODUCTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initSpinner();
    }

    private void initSpinner() {
        //创建ArrayAdapter对象
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, enArry);
        spinner.setAdapter(adapter);
    }

    private void initView() {
        editUserName = (EditText) findViewById(R.id.edit_username);
        editPassWord = (EditText) findViewById(R.id.edit_password);
        spinner = (Spinner) findViewById(R.id.login_environment);
        button = (Button) findViewById(R.id.loginBtn);
        button.setOnClickListener(this);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    protected LoginPresenter onCreatePresenter() {
        return new LoginPresenter(this);
    }


    @Override
    public void sucess(String str) {
        startActivity(new Intent(LoginActivity.this,QueryActivity.class));
        Toast.makeText(LoginActivity.this, "登陆成功！", Toast.LENGTH_LONG).show();
    }

    @Override
    public void fail(ExceptionHandle.ResponeThrowable e) {
        Toast.makeText(LoginActivity.this, e.message.toString(), Toast.LENGTH_LONG).show();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginBtn:
                UrlManager.getinstance().setProperties(urlType);
                startActivity(new Intent(LoginActivity.this,QueryActivity.class));
                String userName = editUserName.getText().toString();
                String passWord = editPassWord.getText().toString();
                if (!TextUtils.isEmpty(userName) && !TextUtils.isEmpty(passWord)) {
                    presenter.login(userName, passWord);
                }else if (TextUtils.isEmpty(userName)){
                    Toast.makeText(LoginActivity.this,"用户名不能为空",Toast.LENGTH_SHORT).show();
                }else if (TextUtils.isEmpty(passWord)){
                    Toast.makeText(LoginActivity.this,"密码不能为空",Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            urlType = ConstantEnvironment.PRODUCTION;
        } else if (position == 1) {
            urlType = ConstantEnvironment.DEVELOPMENT;
        } else if (position == 2) {
            urlType = ConstantEnvironment.UAT;
        } else {
            urlType = ConstantEnvironment.PRODUCTION;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
