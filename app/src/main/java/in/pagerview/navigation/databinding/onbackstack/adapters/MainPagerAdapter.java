package in.pagerview.navigation.databinding.onbackstack.adapters;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import in.pagerview.navigation.databinding.onbackstack.fragments.FirstTabFragment;
import in.pagerview.navigation.databinding.onbackstack.fragments.SecondTabFragment;
import in.pagerview.navigation.databinding.onbackstack.fragments.ThirdTabFragment;


public class MainPagerAdapter extends FragmentPagerAdapter {

    private final static int PAGE_1 = 0;
    private final static int PAGE_2 = 1;
    private final static int PAGE_3 = 2;

    private FirstTabFragment firstTabFragment;
    private SecondTabFragment secondTabFragment;
    private ThirdTabFragment thirdTabFragment;

    public MainPagerAdapter(@NonNull FragmentManager fm) {
//        super(fm);
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case PAGE_2:
                secondTabFragment = SecondTabFragment.newInstance();
                return secondTabFragment;
            case PAGE_3:
                thirdTabFragment = ThirdTabFragment.newInstance();
                return thirdTabFragment;
            default:
                firstTabFragment = FirstTabFragment.newInstance();
                return firstTabFragment;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        Fragment createdFragment = (Fragment) super.instantiateItem(container, position);
        switch (position) {
            case PAGE_1:
                firstTabFragment = (FirstTabFragment) createdFragment;
                break;
            case PAGE_2:
                secondTabFragment = (SecondTabFragment) createdFragment;
                break;
            case PAGE_3:
                thirdTabFragment = (ThirdTabFragment) createdFragment;
                break;
        }
        return createdFragment;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case PAGE_1:
                return "Main Page #1";
            case PAGE_2:
                return "Main Page #2";
            default:
                return "Main Page #3";
        }
    }
}