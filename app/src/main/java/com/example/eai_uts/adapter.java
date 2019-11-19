package com.example.eai_uts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.dataViewHolder> {
    responseAPI dataHolderArrayList;
    Context context;

    public adapter (responseAPI dataHolderArrayList, Context context) {
        this.dataHolderArrayList = dataHolderArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public adapter.dataViewHolder onCreateViewHolder (@NonNull ViewGroup viewGroup, int i){
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new adapter.dataViewHolder(view);
    }

    @Override
    public void onBindViewHolder (@NonNull dataViewHolder dataViewHolder, int i){
        dataViewHolder.dataText.setText(dataHolderArrayList.getArticles().get(i).getTitle());
        dataViewHolder.dataDescription.setText(dataHolderArrayList.getArticles().get(i).getDescription());
        Picasso.get()
                .load(dataHolderArrayList.getArticles().get(i).getUrlToImage())
                .into(dataViewHolder.imageView);
    }

    @Override
    public int getItemCount(){
        return dataHolderArrayList.getArticles().size();
    }

    public class dataViewHolder extends RecyclerView.ViewHolder{
        TextView dataText,dataDescription;
        ImageView imageView;

        public dataViewHolder(@NonNull View itemView){
            super(itemView);
            dataText = itemView.findViewById(R.id.textView2);
            dataDescription = itemView.findViewById(R.id.textView3);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
