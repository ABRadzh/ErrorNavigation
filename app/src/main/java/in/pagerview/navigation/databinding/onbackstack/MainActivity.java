package in.pagerview.navigation.databinding.onbackstack;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import in.pagerview.navigation.databinding.onbackstack.databinding.ActivityMainBinding;
import in.pagerview.navigation.databinding.onbackstack.viewmodels.MainActivityViewModel;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private NavController navController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (binding == null) {
            binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
            binding.setData(new MainActivityViewModel());
        }
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
    }

    @Override
    public void onBackPressed() {
        if (navController.getCurrentDestination() != null) {
            navController.popBackStack();
        } else {
            super.onBackPressed();
        }
    }

}
