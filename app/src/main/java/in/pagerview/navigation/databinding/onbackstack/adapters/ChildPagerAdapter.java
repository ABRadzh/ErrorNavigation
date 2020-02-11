package in.pagerview.navigation.databinding.onbackstack.adapters;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import in.pagerview.navigation.databinding.onbackstack.fragments.FifthTabFragment;
import in.pagerview.navigation.databinding.onbackstack.fragments.ForthTabFragment;


public class ChildPagerAdapter extends FragmentStatePagerAdapter {

    private final static int PAGE_4 = 0;
    private final static int PAGE_5 = 1;

    private ForthTabFragment forthTabFragment;
    private FifthTabFragment fifthTabFragment;

    public ChildPagerAdapter(@NonNull FragmentManager fm) {
//        super(fm);
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == PAGE_5) {
            fifthTabFragment = FifthTabFragment.newInstance();
            return fifthTabFragment;
        }
        forthTabFragment = ForthTabFragment.newInstance();
        return forthTabFragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        Fragment createdFragment = (Fragment) super.instantiateItem(container, position);
        switch (position) {
            case PAGE_4:
                forthTabFragment = (ForthTabFragment) createdFragment;
                break;
            case PAGE_5:
                fifthTabFragment = (FifthTabFragment) createdFragment;
                break;
        }
        return createdFragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == PAGE_4) {
            return "Child Pager #1";
        }
        return "Child Pager #2";
    }

}