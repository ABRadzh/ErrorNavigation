package in.pagerview.navigation.databinding.onbackstack.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import in.pagerview.navigation.databinding.onbackstack.R;
import in.pagerview.navigation.databinding.onbackstack.viewmodels.ThirdChildFragmentViewModel;
import in.pagerview.navigation.databinding.onbackstack.databinding.FragmentThirdChildBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdChildFragment extends BaseFragment {

    private FragmentThirdChildBinding binding;

    public ThirdChildFragment() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_third_child, container, false);
            binding.setPresenter(new ThirdChildFragmentViewModel());
        }
        getBindingRoot();
        return binding.getRoot();
    }

    @Override
    public void getBindingRoot() {
        setBindingRoot(binding.getRoot());
    }
}
