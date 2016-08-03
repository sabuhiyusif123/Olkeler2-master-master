package project.sabuhi.com.olkeler;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.UUID;

/**
 * Created by Cavid on 4/30/2016.
 */
public class OlkeFragment extends Fragment {
    private Olke mOlke;
    private TextView mNameField;
    private TextView mNameField1;
    private TextView mNameField2;
    private Olke afp;
    public static final String EXTRA_OLKE_ID = "project.sabuhi.com.olkeler.olke_id";

    public static OlkeFragment newInstance(UUID olkeId){
        Bundle args = new Bundle();

        args.putSerializable(EXTRA_OLKE_ID, olkeId);

        OlkeFragment fragment = new OlkeFragment();

        fragment.setArguments(args);
        return  fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mOlke = new Olke();
        UUID olkeId=(UUID)getArguments().getSerializable(EXTRA_OLKE_ID);
        mOlke =OlkeLab.get(getActivity()).getOlke(olkeId);
        afp = new Olke();
        afp.setPaytaxt("Ashqabad");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_olke, parent, false);

        mNameField = (TextView) v.findViewById(R.id.olke_adi);
        mNameField.setText(mOlke.getNameOlke());
        mNameField2 =(TextView) v.findViewById(R.id.paytaxtAdi);
        mNameField2.setText(afp.getPaytaxt());

        return v;
    }
}
