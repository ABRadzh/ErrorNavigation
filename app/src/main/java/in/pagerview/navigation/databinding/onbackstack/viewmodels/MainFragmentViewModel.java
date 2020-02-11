package in.pagerview.navigation.databinding.onbackstack.viewmodels;

import androidx.databinding.BaseObservable;
import androidx.viewpager.widget.ViewPager;

import in.pagerview.navigation.databinding.onbackstack.adapters.MainPagerAdapter;

public class MainFragmentViewModel extends BaseObservable {

    public MainFragmentViewModel(ViewPager viewPager, MainPagerAdapter adapter) {
        viewPager.setAdapter(adapter);
    }
}
