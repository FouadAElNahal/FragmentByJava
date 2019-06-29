package sakr.mahmoodsakr.fragmentbyjava;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.v("Sakr", "FragmentA-onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("Sakr", "FragmentA-onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        Log.v("Sakr", "FragmentA-OnCreateView");
        return inflater.inflate(R.layout.fragment_a_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v("Sakr", "FragmentA-onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.v("Sakr", "FragmentA-onStart");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.v("Sakr", "FragmentA-onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.v("Sakr", "FragmentA-onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.v("Sakr", "FragmentA-onStop");

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.v("Sakr", "FragmentA-onSavedInstance");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.v("Sakr", "FragmentA-onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.v("Sakr", "FragmentA-onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.v("Sakr", "FragmentA-onDetach");
    }
}
