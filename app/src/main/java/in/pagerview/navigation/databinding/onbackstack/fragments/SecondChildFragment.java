package in.pagerview.navigation.databinding.onbackstack.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import in.pagerview.navigation.databinding.onbackstack.R;
import in.pagerview.navigation.databinding.onbackstack.viewmodels.SecondChildFragmentViewModel;
import in.pagerview.navigation.databinding.onbackstack.databinding.FragmentSecondChildBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondChildFragment extends Fragment {

    private FragmentSecondChildBinding binding;

    public SecondChildFragment() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second_child, container, false);
            binding.setPresenter(new SecondChildFragmentViewModel());
        }
        return binding.getRoot();
    }

}
