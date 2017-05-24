package com.herprogramacion.toolbarapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Omar on 18/05/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ListItem> listItems;
    private Context context;

    private int obtenerImg(){
        int opt = 0;
        int i[]={1,2,3,4,5,6,7,8,9};
        for (int j = 0; j < i.length;j++){

            opt = i[j];
        }
        switch (opt){
            default:
            case 0:
                return R.drawable.girl1;
            case 1:
                return R.drawable.girl2;
            case 2:
                return R.drawable.girl3;
            case 3:
                return R.drawable.girl4;
            case 4:
                return R.drawable.girl5;
            case 5:
                return R.drawable.girl6;
            case 6:
                return R.drawable.girl7;
            case 7:
                return R.drawable.girl8;
        }
    }

    public MyAdapter(List<ListItem> listItems, Context context) {
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        ListItem listItem = listItems.get(position);

//        holder.avatar.setImageDrawable(obtenerImg());


    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public CircleImageView avatar;
        public TextView list_item_textview;

        public ViewHolder(View itemView) {
            super(itemView);

            avatar = (CircleImageView) itemView.findViewById(R.id.avatar);
            list_item_textview = (TextView) itemView.findViewById(R.id.list_item_textview);
        }
    }
}
