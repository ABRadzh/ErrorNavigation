package in.pagerview.navigation.databinding.onbackstack.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import in.pagerview.navigation.databinding.onbackstack.R;
import in.pagerview.navigation.databinding.onbackstack.databinding.FragmentFirstBinding;
import in.pagerview.navigation.databinding.onbackstack.viewmodels.FirstTabFragmentViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstTabFragment extends Fragment {

    private FragmentFirstBinding binding;

    public static FirstTabFragment newInstance() {
        return new FirstTabFragment();
    }

    public FirstTabFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (binding == null) {
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_first, container, false);
            binding.setPresenter(new FirstTabFragmentViewModel());
        }
        return binding.getRoot();
    }
}
