package sakr.mahmoodsakr.fragmentbyjava;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Sakr", "Activity-create");
        setContentView(R.layout.activity_a_layout);
        Toast.makeText(this, "Fragment Adding", Toast.LENGTH_SHORT).show();
        FragmentManager fm = getFragmentManager();
        FragmentTransaction obj = fm.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        FragmentB fragmentB = new FragmentB();
        obj.add(R.id.f1place, fragmentA, "fragmentATag");
        obj.add(R.id.f2place, fragmentB, "fragmentBTag");
        obj.commit();

    }



}
