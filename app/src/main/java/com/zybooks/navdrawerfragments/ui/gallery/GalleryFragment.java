package com.zybooks.navdrawerfragments.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.zybooks.navdrawerfragments.R;
import com.zybooks.navdrawerfragments.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gallery,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = view.findViewById(R.id.text_gallery);

        int item = GalleryFragmentArgs.fromBundle(getArguments()).getGalleryItemId(); // get the value of the Destination Argument
        textView.setText("Gallery Item: " + item); // set the textView appropriately
    }
}