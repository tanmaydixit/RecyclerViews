package com.example.tanmay.recyclerviews;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by tanmay on 8/11/17.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder> {


    Contact[] contacts;

    public Adapter(Contact[] contactsArray){

        contacts=contactsArray;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View newView=layoutInflater.inflate(R.layout.item_format,parent,false);
        ViewHolder viewHolder=new ViewHolder(newView);
        Log.e("uptou","oncreate called");
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Log.e("uptou","onbind called at"+position);
        holder.nameTextView.setText(contacts[position].contactName);
        holder.numbertextView.setText(contacts[position].contactNumber);

    }

    @Override
    public int getItemCount() {
        return contacts.length;
    }
}
