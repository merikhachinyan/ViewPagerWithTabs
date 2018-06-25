package com.example.meri.viewpagerwithtabs.fragments;


import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.meri.viewpagerwithtabs.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PagerFragment extends Fragment {

    private ImageView mImageView;
    private List<String> mImages;

    private int mPosition;

    public PagerFragment() {
    }

    public void setFields(List<String> images, int position){
        mImages = images;
        mPosition = position;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pager, container, false);

        mImageView = view.findViewById(R.id.pager_image);
        mImageView.setScaleType(ImageView.ScaleType.FIT_XY);

        Picasso.with(getContext()).load(Uri.parse(mImages.get(mPosition))).into(mImageView);

        return view;
    }
}
