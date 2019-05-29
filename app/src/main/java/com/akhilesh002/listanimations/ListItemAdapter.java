package com.akhilesh002.listanimations;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private ArrayList<ListItem> listItems;
    int previousPosition = -2;

    public ListItemAdapter(Context cxt, ArrayList<ListItem> listItems){
        inflater = LayoutInflater.from(cxt);
        this.listItems = listItems;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.list_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, @SuppressLint("RecyclerView") int i) {
        viewHolder.name.setText(listItems.get(i).getName());
        viewHolder.desc1.setText(listItems.get(i).getDisc1());
        viewHolder.desc2.setText(listItems.get(i).getDisc2());
        viewHolder.desc3.setText(listItems.get(i).getDisc3());

        if(i > previousPosition){         //  scrolling down
            AnimationUtil.animate(viewHolder, true);
        }else{                            //    scrolling down
            AnimationUtil.animate(viewHolder, false);
        }
        previousPosition = i;

        ScaleAnimation fade_in = new ScaleAnimation(0.85f, 1f, 0.85f, 1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        fade_in.setDuration(400);
        fade_in.setFillAfter(true);
        viewHolder.cardView.startAnimation(fade_in);

    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        CardView cardView;
        TextView name;
        TextView desc1;
        TextView desc2;
        TextView desc3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = itemView.findViewById(R.id.card_view);
            name = itemView.findViewById(R.id.name);
            desc1 = itemView.findViewById(R.id.desc1);
            desc2 = itemView.findViewById(R.id.desc2);
            desc3 = itemView.findViewById(R.id.desc3);
        }
    }
}
