package in.pagerview.navigation.databinding.onbackstack.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import in.pagerview.navigation.databinding.onbackstack.viewmodels.FirstChildFragmentViewModel;
import in.pagerview.navigation.databinding.onbackstack.R;
import in.pagerview.navigation.databinding.onbackstack.databinding.FragmentFirstChildBinding;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstChildFragment extends Fragment {

    private FragmentFirstChildBinding binding;

    public FirstChildFragment() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first_child, container, false);
            binding.setPresenter(new FirstChildFragmentViewModel());
        }
        return binding.getRoot();
    }
}
