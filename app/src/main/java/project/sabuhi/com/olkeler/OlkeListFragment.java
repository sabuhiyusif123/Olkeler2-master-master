package project.sabuhi.com.olkeler;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
                    //VACIBB!!!!!!!!! TEXT VIEW LAR ELAVE ETMISEM ONA GORE ERROR VERIR
/**
 * Created by SABUHI on 5/2/2016.
 */
public class OlkeListFragment extends android.support.v4.app.ListFragment {
    private static final String TAG= "OlkeListFragment";
    private TextView olkeAdi;

    private ArrayList<Olke> mOlkeler;
    @Override
    public void onListItemClick(ListView l,View v,int position,long id){

       Olke o = ((OlkeAdapter)getListAdapter()).getItem(position);

        Intent i = new Intent(getActivity(),OlkePagerActivity.class);
        i.putExtra(OlkeFragment.EXTRA_OLKE_ID,o.getId());
        startActivity(i);
//        if(position==0){
////            olkeAdi = (TextView) v.findViewById(R.id.olke_adi);
////            olkeAdi.setText("Afghanistan");
//            Log.d("OlkeListFragment","Clicked AF");
//        }
    }
    private class OlkeAdapter extends ArrayAdapter<Olke> {
        public OlkeAdapter(ArrayList<Olke> olkeler) {
            super(getActivity(), 0, olkeler);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent){ // If we weren't given a view, inflate one
        if (convertView == null) {
            convertView = getActivity().getLayoutInflater()
                    .inflate(R.layout.list_item_olke, null);
        }
        // Configure the view for this Crime
        Olke o = getItem(position);
        TextView textView =
                (TextView)convertView.findViewById(R.id.olke_list_item_textView);
          textView.setText(o.getNameOlke());
//        TextView textView2 =
//                (TextView)convertView.findViewById(R.id.olke_list_item_textView2);
//                        textView2.setText("Paytaxt");

        return convertView;
    }
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.olke_title);
        mOlkeler = OlkeLab.get(getActivity()).getOlkeler();
        OlkeAdapter adapter = new OlkeAdapter(mOlkeler);
        setListAdapter(adapter);

    }
}
