package sidespell.tech.midtermexam.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import sidespell.tech.midtermexam.R;

public class MainFragment extends Fragment {
    private EditText etAlbum;
    private RecyclerView rvAlbum;
    private ProgressBar pgBar;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        etAlbum = (EditText) view.findViewById(R.id.etAlbum);
        rvAlbum = (RecyclerView) view.findViewById(R.id.rvAlbum);
        pgBar = (ProgressBar) view.findViewById(R.id.pgBar);
        // TODO: Find all views here..
        pgBar.setVisibility(View.GONE);


        return view;
    }


    @Override
    public void onViewCreated(final View view, @Nullable Bundle savedInstanceState) {
        // TODO: Perform logic operations here..


        etAlbum.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    //performSearch();
                    pgBar.setVisibility(View.VISIBLE);
                    return true;
                }
                return false;
            }
        });

    }
}
