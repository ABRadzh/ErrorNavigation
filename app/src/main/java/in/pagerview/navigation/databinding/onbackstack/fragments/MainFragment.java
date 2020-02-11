package in.pagerview.navigation.databinding.onbackstack.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import in.pagerview.navigation.databinding.onbackstack.viewmodels.MainFragmentViewModel;
import in.pagerview.navigation.databinding.onbackstack.adapters.MainPagerAdapter;
import in.pagerview.navigation.databinding.onbackstack.R;
import in.pagerview.navigation.databinding.onbackstack.databinding.FragmentMainPagerBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private FragmentMainPagerBinding binding;
    private MainPagerAdapter mainPageAdapter;

    public MainFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main_pager, container, false);

            if (mainPageAdapter == null && isAdded()) {
                mainPageAdapter = new MainPagerAdapter(getChildFragmentManager());
                binding.setViewModel(
                        new MainFragmentViewModel(
                                binding.pager,
                                mainPageAdapter
                        )
                );
            }
        }
        return binding.getRoot();
    }
}
