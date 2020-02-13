package in.pagerview.navigation.databinding.onbackstack.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import in.pagerview.navigation.databinding.onbackstack.R;
import in.pagerview.navigation.databinding.onbackstack.databinding.FragmentFifthBinding;
import in.pagerview.navigation.databinding.onbackstack.viewmodels.FifthTabFragmentViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class FifthTabFragment extends BaseFragment {

    private FragmentFifthBinding binding;

    public static FifthTabFragment newInstance() {
        return new FifthTabFragment();
    }

    public FifthTabFragment() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_fifth, container, false);
            binding.setPresenter(new FifthTabFragmentViewModel());
        }
        getBindingRoot();
        return binding.getRoot();
    }

    @Override
    public void getBindingRoot() {
        setBindingRoot(binding.getRoot());
    }

//    @Override
//    public void onDestroyView() {
//        super.onDestroyView();
//        if(binding.getRoot().getParent() != null)
//            ((ViewGroup)binding.getRoot().getParent()).removeView(binding.getRoot());
//    }
}
