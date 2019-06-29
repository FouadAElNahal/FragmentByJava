package sakr.mahmoodsakr.fragmentbyjava;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Mahmood.Sakr on 3/12/2018.
 */

public class ReceiverFragment extends Fragment {
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.receiver_fragment_layout, container, false);
    }



    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.receivingtextview);
    }

    public void applyData(String data) {
        Toast.makeText(getActivity(), "Receving Data", Toast.LENGTH_SHORT).show();
        textView.setText(data);
    }
}
