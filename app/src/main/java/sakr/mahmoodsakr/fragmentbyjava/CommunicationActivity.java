package sakr.mahmoodsakr.fragmentbyjava;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class CommunicationActivity extends AppCompatActivity implements Communicator {
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communication_layout);
        manager = getFragmentManager();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction obj = fm.beginTransaction();
        SenderFragment senderFragment = new SenderFragment();
        ReceiverFragment receiverFragment = new ReceiverFragment();
        obj.add(R.id.senderFragmentLayout, senderFragment, "sender_fragment");
        obj.add(R.id.recivingFragmentLayout, receiverFragment, "receiver_fragment");
        obj.commit();

    }



    @Override
    public void interfaceMethod(String data) {
        FragmentManager fm = getFragmentManager();
        ReceiverFragment receiverFragment2= (ReceiverFragment) fm.findFragmentByTag("receiver_fragment");
        receiverFragment2.applyData(data);
        Toast.makeText(this, "Handling Data", Toast.LENGTH_SHORT).show();

    }
}
