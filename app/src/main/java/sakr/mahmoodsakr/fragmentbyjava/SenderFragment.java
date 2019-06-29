package sakr.mahmoodsakr.fragmentbyjava;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Mahmood.Sakr on 3/12/2018.
 */

public class SenderFragment extends Fragment implements View.OnClickListener {
    Button b;
    EditText ed;
    Communicator communicator;
    int counter;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.sender_fragment_layout, container, false);

//        b = (Button)v.findViewById(R.id.click_button);
//        b.setOnClickListener(this);
        return v;
    }



    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        b = (Button)getActivity().findViewById(R.id.click_button);
        b.setOnClickListener(this);
        ed = (EditText) getActivity().findViewById(R.id.edittextid);
        communicator = (Communicator) getActivity(); //polymorphism
    }


    @Override
    public void onClick(View v) {
        counter++;
        // call the activity method
        communicator.interfaceMethod("the button was clicked " + counter + " times ! \n and the data is:" + ed.getText().toString());
        Toast.makeText(getActivity(), "Sending Data", Toast.LENGTH_SHORT).show();
    }
}
