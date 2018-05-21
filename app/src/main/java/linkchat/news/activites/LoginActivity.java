package linkchat.news.activites;


import android.support.v4.app.Fragment;

import linkchat.news.fragments.LoginFragment;

public class LoginActivity extends BaseFragmentActivity {

    @Override
    Fragment createFragment() {
        return LoginFragment.newInstance();
    }
}
