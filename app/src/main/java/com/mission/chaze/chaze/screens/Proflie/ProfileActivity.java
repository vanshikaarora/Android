package com.mission.chaze.chaze.screens.Proflie;

import android.arch.persistence.room.Room;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.mission.chaze.chaze.R;
import com.mission.chaze.chaze.models.UserProfile;
import com.mission.chaze.chaze.repository.room.AppDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ProfileActivity extends AppCompatActivity {


    @BindView(R.id.editName)
    ImageView editName;
    @BindView(R.id.editGender)
    ImageView editGender;
    @BindView(R.id.editEmail)
    ImageView editEmail;
    @BindView(R.id.editPhone)
    ImageView editPhone;
    @BindView(R.id.editAddress)
    ImageView editAddress;
    @BindView(R.id.profile_name)
    EditText profileName;
    @BindView(R.id.profile_gender)
    EditText profileGender;
    @BindView(R.id.profile_email)
    EditText profileEmail;
    @BindView(R.id.profile_phone)
    EditText profilePhone;
    @BindView(R.id.profile_address)
    EditText profileAddress;

    AppDatabase db;
    UserProfile profileData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ButterKnife.bind(this);


        editName.setOnClickListener(view -> {
            profileName.setEnabled(true);
            profileName.setCursorVisible(true);
            profileName.setFocusable(true);
            profileName.setText("");
            profileName.setHint("");
            profileName.setInputType(InputType.TYPE_CLASS_TEXT);
            InputMethodManager imm = (InputMethodManager) getSystemService(getApplicationContext().INPUT_METHOD_SERVICE);
            imm.showSoftInput(profileName, InputMethodManager.SHOW_IMPLICIT);
        });

        editGender.setOnClickListener(view -> {
            profileGender.setEnabled(true);
            profileGender.setCursorVisible(true);
            profileGender.setFocusable(true);
            profileGender.setText("");
            profileGender.setHint("");
            profileGender.setInputType(InputType.TYPE_CLASS_TEXT);
            InputMethodManager imm = (InputMethodManager) getSystemService(getApplicationContext().INPUT_METHOD_SERVICE);
            imm.showSoftInput(profileGender, InputMethodManager.SHOW_IMPLICIT);
        });

        editEmail.setOnClickListener(view -> {
            profileEmail.setEnabled(true);
            profileEmail.setCursorVisible(true);
            profileEmail.setFocusable(true);
            profileEmail.setText("");
            profileEmail.setHint("");
            profileEmail.setInputType(InputType.TYPE_CLASS_TEXT);
            InputMethodManager imm = (InputMethodManager) getSystemService(getApplicationContext().INPUT_METHOD_SERVICE);
            imm.showSoftInput(profileEmail, InputMethodManager.SHOW_IMPLICIT);
        });

        editAddress.setOnClickListener(view -> {
            profileAddress.setEnabled(true);
            profileAddress.setCursorVisible(true);
            profileAddress.setFocusable(true);
            profileAddress.setText("");
            profileAddress.setHint("");
            profileAddress.setInputType(InputType.TYPE_CLASS_TEXT);
            InputMethodManager imm = (InputMethodManager) getSystemService(getApplicationContext().INPUT_METHOD_SERVICE);
            imm.showSoftInput(profileGender, InputMethodManager.SHOW_IMPLICIT);
        });

        editPhone.setOnClickListener(view -> {
            profilePhone.setEnabled(true);
            profilePhone.setCursorVisible(true);
            profilePhone.setFocusable(true);
            profilePhone.setText("");
            profilePhone.setHint("");
            profilePhone.setInputType(InputType.TYPE_CLASS_TEXT);
            InputMethodManager imm = (InputMethodManager) getSystemService(getApplicationContext().INPUT_METHOD_SERVICE);
            imm.showSoftInput(profilePhone, InputMethodManager.SHOW_IMPLICIT);
        });



        new task().execute("");


    }


public class task extends AsyncTask<String, String, String>{

    @Override
    protected String doInBackground(String... strings) {
        db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "users")
                .build();
        profileData=new UserProfile("","","","","");
        profileData=db.userDao().getUserProfile();

        /*.v("profile118",profileData.getName());//profilePhone.setText(profileData.getPhone());
        profileEmail.setText(profileData.getEmail());
        //profileGender.setText(profileData.getGender());
        profileAddress.setText(profileData.getAddress());
        Log.v("profileline132",profileData.getName()+" "+profileData.getPhone()+" "+profileData.getEmail()+" "+profileData.getGender());
        */return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        String name=profileData.getName();
        Log.v("profile118.5",name);
        profileName.setText(profileData.getName());

    }
}

}
