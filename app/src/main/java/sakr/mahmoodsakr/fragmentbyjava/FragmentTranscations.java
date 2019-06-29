package sakr.mahmoodsakr.fragmentbyjava;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FragmentTranscations extends AppCompatActivity {
    FragmentManager manager;
    FragmentTransaction trans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_transcations_layout);
        manager = getFragmentManager();
    }

    public void addA(View v) {
        if ((FragmentA) manager.findFragmentByTag("Fragment_A") == null) {
            FragmentA fragmentA = new FragmentA();
            trans = manager.beginTransaction();
            trans.add(R.id.fragmentPlacement1, fragmentA, "Fragment_A");
            trans.commit();
            Toast.makeText(this, "Adding Fragment A", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Fragment A has been added before !", Toast.LENGTH_SHORT).show();
        }
    }

    public void removeA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("Fragment_A");
        if (fragmentA != null) {
            trans = manager.beginTransaction();
            trans.remove(fragmentA);
            trans.commit();
            Toast.makeText(this, "Removing Fragment A", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Fragment A wasn't added before", Toast.LENGTH_SHORT).show();
        }
    }

    public void replceA_with_B(View v) {
        FragmentB fragmentB = new FragmentB();
        trans = manager.beginTransaction();
        trans.replace(R.id.fragmentPlacement1, fragmentB, "Fragment_B");
        trans.commit();
        Toast.makeText(this, "Fragment A is replced with Fragment B", Toast.LENGTH_SHORT).show();
    }

    public void addB(View v) {
        if ((FragmentB) manager.findFragmentByTag("Fragment_B") == null) {
            FragmentB fragmentB = new FragmentB();
            trans = manager.beginTransaction();
            trans.add(R.id.fragmentPlacement2, fragmentB, "Fragment_B");
            trans.commit();
            Toast.makeText(this, "Adding Fragment B", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Fragment B has been added before !", Toast.LENGTH_SHORT).show();
        }
    }


    public void removeB(View v) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("Fragment_B");
        if (fragmentB != null) {
            trans = manager.beginTransaction();
            trans.remove(fragmentB);
            trans.commit();
            Toast.makeText(this, "Removing Fragment B", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Fragment B wasn't added before", Toast.LENGTH_SHORT).show();

        }
    }


    public void attachA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("Fragment_A");
        if (fragmentA != null) {
            trans = manager.beginTransaction();
            trans.attach(fragmentA);
            trans.commit();
            Toast.makeText(this, "Fragment A is attched / showed", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "Fragment A was not be founded to be attached !", Toast.LENGTH_LONG).show();
    }

    public void detachA(View v) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("Fragment_A");
        if (fragmentA != null) {
            trans = manager.beginTransaction();
            trans.detach(fragmentA);//hide
            trans.commit();
            Toast.makeText(this, "Fragment A is detached / hidden", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "Fragment A was not be founded to be detached !", Toast.LENGTH_LONG).show();
    }

    public void replceB_with_A (View v) {
        FragmentA fragmentA = new FragmentA();
        trans = manager.beginTransaction();
        trans.replace(R.id.fragmentPlacement2, fragmentA, "Fragment_A");
        trans.commit();
        Toast.makeText(this, "Fragment B is replced with Fragment A", Toast.LENGTH_SHORT).show();
    }
}
