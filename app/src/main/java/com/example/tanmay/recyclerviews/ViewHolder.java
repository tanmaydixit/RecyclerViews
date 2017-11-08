package com.example.tanmay.recyclerviews;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by tanmay on 8/11/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    TextView nameTextView;
    TextView numbertextView;
    ImageView imageView;


    public ViewHolder(View itemView) {
        super(itemView);
        nameTextView=(TextView) itemView.findViewById(R.id.tv1);
        numbertextView=(TextView) itemView.findViewById(R.id.tv2);
        imageView=(ImageView) itemView.findViewById(R.id.item_image);
    }
}
