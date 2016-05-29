package actlufecycle.youtube.com;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class ActivityMain extends AppCompatActivity {

    private static final String TAG=ActivityMain.class.getSimpleName();

    //private EditText editTextSampleText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"in method onCreate");
        //editTextSampleText=(EditText)findViewById(R.id.editTextSampleText);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"in method onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"in method onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"in method onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"in method onPause");
    }

    /*@Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"in method onSaveInstanceState");
        outState.putString("samplekey",editTextSampleText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"in method onRestoreInstanceState");
        editTextSampleText.setText(savedInstanceState.getString("samplekey"));
    }*/

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"in method onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"in method onDestroy");
    }
}
