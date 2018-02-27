package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by sajjadpatel on 2018-02-25.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    public Fragment createFragment(){
        return new CrimeListFragment();
    }
}
