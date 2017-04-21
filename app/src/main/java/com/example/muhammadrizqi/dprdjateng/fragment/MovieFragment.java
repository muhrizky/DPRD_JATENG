package com.example.muhammadrizqi.dprdjateng.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.muhammadrizqi.dprdjateng.R;
import com.example.muhammadrizqi.dprdjateng.Sekretariat.bagianhumas;
import com.example.muhammadrizqi.dprdjateng.Sekretariat.bagiankeuangan;
import com.example.muhammadrizqi.dprdjateng.Sekretariat.bagianumum;
import com.example.muhammadrizqi.dprdjateng.Sekretariat.perundangudangan;
import com.example.muhammadrizqi.dprdjateng.Sekretariat.strukturorganisasi;
import com.example.muhammadrizqi.dprdjateng.Sekretariat.tugassekretariat;
import com.example.muhammadrizqi.dprdjateng.Sekretariat.visimisisekre;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link MovieFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MovieFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

  //  private OnFragmentInteractionListener mListener;

    public MovieFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MovieFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MovieFragment newInstance(String param1, String param2) {
        MovieFragment fragment = new MovieFragment();
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
        View v = inflater.inflate(R.layout.fragment_movie, container, false);
        ImageButton newPage = (ImageButton)v.findViewById(R.id.Bag_umum);
        newPage.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), bagianumum.class);
                startActivity(intent);
            }
        });
        ImageButton newPage1 = (ImageButton) v.findViewById(R.id.Bag_humas);
        newPage1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), bagianhumas.class);
                startActivity(intent);
            }
        });
        ImageButton newPage2 = (ImageButton) v.findViewById(R.id.Bag_keuangan);
        newPage2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), bagiankeuangan.class);
                startActivity(intent);
            }
        });

        ImageButton newPage3 = (ImageButton) v.findViewById(R.id.perundang_udangan);
        newPage3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), perundangudangan.class);
                startActivity(intent);
            }
        });
        ImageButton newPage4 = (ImageButton) v.findViewById(R.id.tugas_sekretariat);
        newPage4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), tugassekretariat.class);
                startActivity(intent);
            }
        });
        ImageButton newPage5 = (ImageButton) v.findViewById(R.id.visi_misi_sekre);
        newPage5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), visimisisekre.class);
                startActivity(intent);
            }
        });
        ImageButton newPage6 = (ImageButton) v.findViewById(R.id.struktur_organisasi);
        newPage6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), strukturorganisasi.class);
                startActivity(intent);
            }
        });
        return v;

    }
};

    // TODO: Rename method, update argument and hook method into UI event
 //   public void onButtonPressed(Uri uri) {
    //    if (mListener != null) {
      //      mListener.onFragmentInteraction(uri);
     //   }
  //  }

   // @Override
  //  public void onAttach(Context context) {
    //    super.onAttach(context);
 //       if (context instanceof OnFragmentInteractionListener) {
 //           mListener = (OnFragmentInteractionListener) context;
 //       } else {
  //          throw new RuntimeException(context.toString()
   //                 + " must implement OnFragmentInteractionListener");
     //   }


 //   @Override
  //  public void onDetach() {
   //     super.onDetach();
    //    mListener = null;
   // }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
  //  public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
   //     void onFragmentInteraction(Uri uri);
  //  }
//}
