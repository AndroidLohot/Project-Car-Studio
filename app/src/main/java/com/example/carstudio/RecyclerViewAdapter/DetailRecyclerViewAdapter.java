package com.example.carstudio.RecyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.carstudio.CustomClass.Car;
import com.example.carstudio.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailRecyclerViewAdapter extends RecyclerView.Adapter<DetailRecyclerViewAdapter.MyViewHolder> {


    private ArrayList<Car> carList;
    private MyRecyclerAdapter.MyRecyclerEvent myClickEvent;

    public DetailRecyclerViewAdapter(Context context, ArrayList<Car> carList) {
        this.carList = carList;
        this.myClickEvent = (MyRecyclerAdapter.MyRecyclerEvent) context;
    }

    @NonNull
    @Override
    public DetailRecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_rv_layout, parent, false);
        return new DetailRecyclerViewAdapter.MyViewHolder(myView);
    }


    @Override
    public void onBindViewHolder(@NonNull DetailRecyclerViewAdapter.MyViewHolder holder, int position) {

        Car car = carList.get(position);

        holder.itemView.setTag( carList.get( position ) );

        holder.tvCarName.setText(car.getCarName());

        Glide
                .with(holder.itemView.getContext())
                .load(car.getCatImage())
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.ivCarImage);


    }

    @Override
    public int getItemCount() {
        return carList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView ivCarImage;
        private TextView tvCarName;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivCarImage = itemView.findViewById(R.id.ivCarImage_DRV);
            tvCarName = itemView.findViewById(R.id.tvCarName_DRV);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    myClickEvent.setOnItemClickListener(carList.indexOf((Car) itemView.getTag()));

                }
            });

        }

    }
}
