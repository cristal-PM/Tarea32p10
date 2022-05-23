package com.example.ejercicio3;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> implements View.OnClickListener{
    private List<ListElement> dats;
    private LayoutInflater flayer;
    private Context content;
    private View.OnClickListener listener;
    public ListAdapter(List<ListElement> dats , Context context) {
        this.flayer=LayoutInflater.from(context);
        this.dats = dats;
        this.content=context;

    }
    @Override
    public int getItemCount(){
        return dats.size();
    }

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=flayer.inflate(R.layout.list_element,null);
        v.setOnClickListener(this);
        return new ListAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder , final int position){
        holder.bindData(dats.get(position));
    }
    public void setItems(List<ListElement> items){dats=items;}
    public void setOnClickListener(View.OnClickListener listener){
        this.listener=listener;
    }
    @Override
    public void onClick(View view) {
        if(listener!=null){listener.onClick(view);}
    }

    public class ViewHolder extends  RecyclerView.ViewHolder{
        ImageView icon;
        TextView name,city,status;
        ViewHolder(View itemView){
            super(itemView);
            icon=itemView.findViewById(R.id.img);
            name=itemView.findViewById(R.id.textView2);
            city=itemView.findViewById(R.id.city);
            status=itemView.findViewById(R.id.textView4);
        }
        void bindData(ListElement items){
            icon.setColorFilter(Color.parseColor(items.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(items.getName());
            city.setText(items.getCity());
            status.setText(items.getStatus());
        }
    }
}
