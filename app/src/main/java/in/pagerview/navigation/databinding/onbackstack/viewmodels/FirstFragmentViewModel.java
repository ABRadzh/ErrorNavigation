package in.pagerview.navigation.databinding.onbackstack.viewmodels;

import androidx.databinding.BaseObservable;
import androidx.viewpager.widget.ViewPager;

import in.pagerview.navigation.databinding.onbackstack.adapters.ChildPagerAdapter;

public class FirstFragmentViewModel extends BaseObservable {

    public FirstFragmentViewModel(ViewPager viewPager, ChildPagerAdapter adapter) {
        viewPager.setAdapter(adapter);
    }
}
