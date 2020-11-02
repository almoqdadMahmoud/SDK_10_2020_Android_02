package android.sdk.damapp.Utalis;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.sdk.damapp.SelectTypeActivity;

public class SessionManger {

    // Shared Preferences
    SharedPreferences perf_user;

    //Editor The  Shared Preferences
    SharedPreferences.Editor editor_user;

    Context _context;

    int PRIVATE_MODE = 0;
    private static final String PREF_NAME = "Pref_Name";
    private static final String IS_LOGIN = "IsLoginIn_user";
    private static final String KEY_NAME = "name_user";
    private static final String KEY_EMAIL = "email_user";
    private static final String KEY_ADDRESS = "address_user";
    private static final String KEY_PHONE = "phone_user";

    public SessionManger(Context _context){
        this._context = _context;
        perf_user = _context.getSharedPreferences(PREF_NAME,PRIVATE_MODE);
        editor_user = perf_user.edit();
    }


    public void createLoginSession(String name , String email , String phone){
        editor_user.putBoolean(IS_LOGIN,true);
        editor_user.putString(KEY_NAME,name);
        editor_user.putString(KEY_EMAIL,email);
        editor_user.putString(KEY_PHONE,phone);
        editor_user.apply();
    }


    public void checkLogin(){
        if(!this.isLoggedIn()){
            Intent intent = new Intent(_context, SelectTypeActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            _context.startActivity(intent);

        }
    }

    private boolean isLoggedIn() {
      return perf_user.getBoolean(IS_LOGIN,false);
    }

    

}
