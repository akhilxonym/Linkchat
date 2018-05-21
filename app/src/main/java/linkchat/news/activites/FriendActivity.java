package linkchat.news.activites;

import android.support.v4.app.Fragment;

import linkchat.news.fragments.FriendFragment;

public class FriendActivity extends BaseFragmentActivity {
    @Override
    Fragment createFragment() {
        return FriendFragment.newInstance();
    }
}
