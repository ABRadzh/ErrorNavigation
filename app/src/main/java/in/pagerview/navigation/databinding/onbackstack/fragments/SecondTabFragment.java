package in.pagerview.navigation.databinding.onbackstack.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import in.pagerview.navigation.databinding.onbackstack.R;
import in.pagerview.navigation.databinding.onbackstack.databinding.FragmentSecondBinding;
import in.pagerview.navigation.databinding.onbackstack.viewmodels.SecondTabFragmentViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondTabFragment extends BaseFragment {

    private FragmentSecondBinding binding;

    public static SecondTabFragment newInstance() {
        return new SecondTabFragment();
    }

    public SecondTabFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false);
            binding.setPresenter(new SecondTabFragmentViewModel());
        }
        getBindingRoot();
        return binding.getRoot();
    }

    @Override
    public void getBindingRoot() {
        setBindingRoot(binding.getRoot());
    }

}
