package com.zybooks.navdrawerfragments.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.zybooks.navdrawerfragments.R;

public class HomeFragment extends Fragment {

     public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);
//        TODO: Get a reference to each button object
        Button galleryButton1 = root.findViewById(R.id.GalleryItem1);
        Button galleryButton2 = root.findViewById(R.id.GalleryItem2);
        Button galleryButton3 = root.findViewById(R.id.GalleryItem3);

        galleryButton1.setOnClickListener( v -> galleryItemButtonClick(v, 1) );
        galleryButton2.setOnClickListener( v -> galleryItemButtonClick(v, 2) );
        galleryButton3.setOnClickListener( v -> galleryItemButtonClick(v, 3) );
        return root;
    }

    public void galleryItemButtonClick(View view, int item){
        HomeFragmentDirections.ActionNavHomeToNavGallery action = HomeFragmentDirections.actionNavHomeToNavGallery();
          action.setGalleryItemId(item);  // assign the appropriate item number value to the Destination Argument
          Navigation.findNavController(view).navigate(action); // navigate to the gallery page
    }
}