package project.sabuhi.com.olkeler;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Cavid on 7/4/2016.
 */
public class OlkePagerActivity extends FragmentActivity {

    private ViewPager mViewPager;
    private ArrayList<Olke> mOlkeler;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mViewPager = new ViewPager(this);
        mViewPager.setId(R.id.viewPager);
        setContentView(mViewPager);

        mOlkeler = OlkeLab.get(this).getOlkeler();

        FragmentManager fm= getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentPagerAdapter(fm) {
            @Override
            public Fragment getItem(int position) {
                Olke olke = mOlkeler.get(position);
                return  OlkeFragment.newInstance(olke.getId());
            }

            @Override
            public int getCount() {
                return mOlkeler.size();
            }
        });
        UUID olkeId = (UUID)getIntent()
                .getSerializableExtra(OlkeFragment.EXTRA_OLKE_ID);
        for (int i = 0; i < mOlkeler.size(); i++) {
            if (mOlkeler.get(i).getId().equals(olkeId)) {
                mViewPager.setCurrentItem(i);
                break;
            }
        }
    }
}
