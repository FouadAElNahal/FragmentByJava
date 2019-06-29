package sakr.mahmoodsakr.fragmentbyjava;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentB extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v("Sakr", "FragmentB-onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Sakr", "FragmentB-onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v("Sakr", "FragmentB-OnCreateView");
        return inflater.inflate(R.layout.fragment_b_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v("Sakr", "FragmentB-onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v("Sakr", "FragmentB-onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v("Sakr", "FragmentB-onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("Sakr", "FragmentB-onPause");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v("Sakr", "FragmentB-onSavedInstance");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v("Sakr", "FragmentB-onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("Sakr", "FragmentB-onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("Sakr", "FragmentB-onDetach");
    }
}
