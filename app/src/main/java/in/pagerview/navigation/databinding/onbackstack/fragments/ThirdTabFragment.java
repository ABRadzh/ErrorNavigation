package in.pagerview.navigation.databinding.onbackstack.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import in.pagerview.navigation.databinding.onbackstack.R;
import in.pagerview.navigation.databinding.onbackstack.databinding.FragmentThirdBinding;
import in.pagerview.navigation.databinding.onbackstack.viewmodels.ThirdTabFragmentViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdTabFragment extends Fragment {

    private FragmentThirdBinding binding;

    public static ThirdTabFragment newInstance() {
        return new ThirdTabFragment();
    }

    public ThirdTabFragment() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_third, container, false);
            binding.setPresenter(new ThirdTabFragmentViewModel());
        }
        return binding.getRoot();
    }
}
