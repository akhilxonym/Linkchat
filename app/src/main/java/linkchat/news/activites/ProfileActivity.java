package linkchat.news.activites;

import android.support.v4.app.Fragment;

import linkchat.news.fragments.ProfileFragment;

public class ProfileActivity extends BaseFragmentActivity {
    @Override
    Fragment createFragment() {
        return ProfileFragment.newInstance();
    }
}
