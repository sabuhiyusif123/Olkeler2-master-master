package project.sabuhi.com.olkeler;

import android.support.v4.app.Fragment;

/**
 * Created by SABUHI on 5/2/2016.
 */
public class OlkeListActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){

        return  new OlkeListFragment();
    }
}
