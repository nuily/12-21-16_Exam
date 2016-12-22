package nyc.c4q.huilin.a12_21_16_exam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainFragment.class.getSimpleName();
    private MainFragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(this, ExtraCreditActivity.class);
        startActivity(intent);
        if (savedInstanceState == null) {
            hostFragment(new MainFragment());
        } else {
            mFragment = (MainFragment) getSupportFragmentManager().findFragmentByTag(TAG);
        }
    }

    private void hostFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_main, fragment, TAG)
                .commit();
    }

}
