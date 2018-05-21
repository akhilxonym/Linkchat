package linkchat.news.activites;

import android.support.v4.app.Fragment;

import linkchat.news.fragments.RegisterFragment;

public class RegisterActivity extends BaseFragmentActivity {
    @Override
    Fragment createFragment() {
        return RegisterFragment.newInstance();
    }
}
