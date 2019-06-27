package com.example.hellofragment;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class HelloFragment extends Fragment {

    private OnHelloFragmentListener mListener;


    public HelloFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_hello, container, false);

        FrameLayout frameLayoutHello = v.findViewById(R.id.frame_layout_hello);

        frameLayoutHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.clickOnLayer(1);
            }
        });


        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mListener = (OnHelloFragmentListener) context;
    }

    public interface OnHelloFragmentListener {
        // TODO: Update argument type and name
        void clickOnLayer(int value);
    }

}
