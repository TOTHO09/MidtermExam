package sidespell.tech.midtermexam.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import sidespell.tech.midtermexam.R;

public class MainFragment extends Fragment {
    private EditText etAlbum;
    private RecyclerView rvAlbum;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
         etAlbum = (EditText) view.findViewById(R.id.etAlbum);
         rvAlbum=(RecyclerView)view.findViewById(R.id.rvAlbum);

        // TODO: Find all views here..

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        // TODO: Perform logic operations here..

    }




}
