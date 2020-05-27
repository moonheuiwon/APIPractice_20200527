package kr.co.tjoeun.apipractice_20200527;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import kr.co.tjoeun.apipractice_20200527.databinding.ActivitySignUpBinding;

public class SignUpActivity extends BaseActivity {

    ActivitySignUpBinding binding;

//    응용 문제.
//    비번은 타이핑할때마다 길이 검사
//    => 0글자 : 비밀번호를 입력해주세요.
//    => 8글자 미만 : 비밀번호가 너무 짧습니다.
//    그이상 : 사용해도 좋은 비밀번호 입니다.


//    비번 확인도 타이핑할때마다 검사.
//    => 0글자 : 비밀번호 확인을 입력해주세요.
//    => 비번과 같다 : 비밀번호 재입력이 확인 되었습니다.
//    => 다르다 : 비밀번호가 서로 다릅니다.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sign_up);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
