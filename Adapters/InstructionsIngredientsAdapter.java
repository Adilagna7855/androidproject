package com.example.recipeapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recipeapp.Models.Ingredient;
import com.example.recipeapp.R;
import com.squareup.picasso.Picasso;

import java.lang.reflect.Constructor;
import java.util.List;

public class InstructionsIngredientsAdapter extends RecyclerView.Adapter<InstuctionIngredientsViewHolder> {


    Context context;
    List<Ingredient> list;

    public InstructionsIngredientsAdapter(Context context, List<Ingredient> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstuctionIngredientsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstuctionIngredientsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instructions_step_items,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstuctionIngredientsViewHolder holder, int position) {
        holder.textView_instructions_step_item.setText(list.get(position).name);
        holder.textView_instructions_step_item.setSelected(true);
        Picasso.get().load("https://spoonacular.com/cdn/ingredients_100x100/"+list.get(position).image);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class InstuctionIngredientsViewHolder extends RecyclerView.ViewHolder{
    ImageView imageView_instructions_step_items;
    TextView textView_instructions_step_item;

    public InstuctionIngredientsViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView_instructions_step_items = itemView.findViewById(R.id.imageView_instructions_step_items);
        textView_instructions_step_item = itemView.findViewById(R.id.textView_instructions_step_item);

    }
}
