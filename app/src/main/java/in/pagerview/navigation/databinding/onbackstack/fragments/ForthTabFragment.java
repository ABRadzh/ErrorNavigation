package in.pagerview.navigation.databinding.onbackstack.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import in.pagerview.navigation.databinding.onbackstack.R;
import in.pagerview.navigation.databinding.onbackstack.databinding.FragmentForthBinding;
import in.pagerview.navigation.databinding.onbackstack.viewmodels.ForthTabFragmentViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class ForthTabFragment extends BaseFragment {

    private FragmentForthBinding binding;

    public static ForthTabFragment newInstance() {
        return new ForthTabFragment();
    }

    public ForthTabFragment() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_forth, container, false);
            binding.setPresenter(new ForthTabFragmentViewModel());
        }
        getBindingRoot();
        return binding.getRoot();
    }

    @Override
    public void getBindingRoot() {
        setBindingRoot(binding.getRoot());
    }
}
