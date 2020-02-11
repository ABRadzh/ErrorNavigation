package in.pagerview.navigation.databinding.onbackstack.viewmodels;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.navigation.Navigation;

import in.pagerview.navigation.databinding.onbackstack.R;


public class SecondTabFragmentViewModel extends BaseObservable {

    public void onClick(View v) {
        Navigation.findNavController(v).navigate(R.id.thirdChildFragment);
    }
}
