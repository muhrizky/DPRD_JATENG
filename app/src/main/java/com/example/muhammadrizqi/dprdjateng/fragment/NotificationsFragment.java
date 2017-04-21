package com.example.muhammadrizqi.dprdjateng.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.muhammadrizqi.dprdjateng.R;
import com.example.muhammadrizqi.dprdjateng.informasi_lain_activty.facebook;
import com.example.muhammadrizqi.dprdjateng.informasi_lain_activty.twitter;
import com.example.muhammadrizqi.dprdjateng.informasi_lain_activty.wartadprdjateng;
import com.example.muhammadrizqi.dprdjateng.informasi_lain_activty.webdprdjateng;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link NotificationsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NotificationsFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

  //  private OnFragmentInteractionListener mListener;

    public NotificationsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NotificationsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NotificationsFragment newInstance(String param1, String param2) {
        NotificationsFragment fragment = new NotificationsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_notifications, container, false);
        ImageButton newPage = (ImageButton)v.findViewById(R.id.facebook);
        newPage.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), facebook.class);
                startActivity(intent);
            }
        });
        ImageButton newPage1 = (ImageButton) v.findViewById(R.id.twitter);
        newPage1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), twitter.class);
                startActivity(intent);
            }
        });
        ImageButton newPage2 = (ImageButton) v.findViewById(R.id.webdprdjateng);
        newPage2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), webdprdjateng.class);
                startActivity(intent);
            }
        });

        ImageButton newPage3 = (ImageButton) v.findViewById(R.id.wartadprdjateng);
        newPage3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), wartadprdjateng.class);
                startActivity(intent);
            }
        });

        return v;

    }
};
