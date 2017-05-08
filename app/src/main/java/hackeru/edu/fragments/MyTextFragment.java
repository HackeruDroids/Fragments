package hackeru.edu.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyTextFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyTextFragment extends Fragment {
    private static final String ARG_MIVZAKIM = "mivzakim";
    private ArrayList<String> mivzakim;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param mivzakim the mivzakim.
     * @return A new instance of fragment MyTextFragment.
     */

    public static MyTextFragment newInstance(ArrayList<String> mivzakim) {
        MyTextFragment fragment = new MyTextFragment();
        Bundle args = new Bundle();
        args.putStringArrayList(ARG_MIVZAKIM, mivzakim);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mivzakim = getArguments().getStringArrayList(ARG_MIVZAKIM);
           // Toast.makeText(getActivity(), "cxczxzxc", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_text, container, false);
    }

}
