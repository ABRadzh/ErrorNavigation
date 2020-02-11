package in.pagerview.navigation.databinding.onbackstack.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import in.pagerview.navigation.databinding.onbackstack.R;
import in.pagerview.navigation.databinding.onbackstack.adapters.ChildPagerAdapter;
import in.pagerview.navigation.databinding.onbackstack.databinding.FragmentFirstPagerBinding;
import in.pagerview.navigation.databinding.onbackstack.viewmodels.FirstFragmentViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class PagerFirstFragment extends Fragment {

    private FragmentFirstPagerBinding binding;
    private ChildPagerAdapter childPagerAdapter;

    public PagerFirstFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first_pager, container, false);

            if (childPagerAdapter == null && isAdded()) {
                childPagerAdapter = new ChildPagerAdapter(getChildFragmentManager());
                binding.setViewModel(
                        new FirstFragmentViewModel(
                                binding.pager,
                                childPagerAdapter
                        )
                );
            }
        }
        return binding.getRoot();
    }
}
