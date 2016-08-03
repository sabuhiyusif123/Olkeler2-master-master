package project.sabuhi.com.olkeler;

import android.support.v4.app.Fragment;
import android.view.MenuItem;

import java.util.UUID;

public class OlkeActivity extends SingleFragmentActivity {


        @Override
        protected Fragment createFragment() {

            UUID olkeId= (UUID)getIntent().getSerializableExtra(OlkeFragment.EXTRA_OLKE_ID);

            return OlkeFragment.newInstance(olkeId);
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
