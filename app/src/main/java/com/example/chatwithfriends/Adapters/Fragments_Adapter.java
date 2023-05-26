package com.example.chatwithfriends.Adapters;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.chatwithfriends.Fragments.calls_Fragment;
import com.example.chatwithfriends.Fragments.chats_Fragment;
import com.example.chatwithfriends.Fragments.status_Fragment;

public class Fragments_Adapter extends FragmentPagerAdapter {


    public Fragments_Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new chats_Fragment();
            case 1: return new status_Fragment();
            case 2: return new calls_Fragment();

            default: return new chats_Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        String title = "Chats";

        if(position == 0)
            title = "Chats";
        if(position == 0)
            title = "Status";
        if(position == 0)
            title = "Calls";

//        switch (position){
//            case 0: title = "Chats";
//            case 1: title = "Status";
//            case 2: title = "Calls";
//            default: title = "Chats";
//        }
        return title;
    }
}
