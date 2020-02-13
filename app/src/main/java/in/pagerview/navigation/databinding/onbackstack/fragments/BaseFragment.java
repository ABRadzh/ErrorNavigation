package in.pagerview.navigation.databinding.onbackstack.fragments;

import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    private View bindingRoot;

    public abstract void getBindingRoot();

    public void setBindingRoot(View bindingRoot) {
        this.bindingRoot = bindingRoot;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (bindingRoot.getParent() != null)
            ((ViewGroup) bindingRoot.getParent()).removeView(bindingRoot);
    }
}
