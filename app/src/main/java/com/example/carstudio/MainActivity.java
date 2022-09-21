package com.example.carstudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.carstudio.CustomClass.Car;
import com.example.carstudio.RecyclerViewAdapter.MyRecyclerAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyRecyclerAdapter.MyRecyclerEvent{

    private RecyclerView rvMainList;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Car> carList;
    private MyRecyclerAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMainList = findViewById(R.id.rvMainList);

        layoutManager = new GridLayoutManager(this, 2);

        carList = new ArrayList<>();

        carList.add(new Car(1, "https://wallpaperaccess.com/full/363918.jpg", "Costume Cars"));
        carList.add(new Car(2, "https://media.istockphoto.com/photos/dealer-new-cars-stock-picture-id480652712?b=1&k=20&m=480652712&s=170667a&w=0&h=dcmAjMGPXz8YFjCfhjJi8icIe-LGmOX6LuCaTXpyFJA=", "Company Cars"));
        carList.add(new Car(3, "https://akm-img-a-in.tosshub.com/businesstoday/images/story/202006/second_hand_car_660_090620050440.jpg", "SH Cars"));
        carList.add(new Car(4, "https://media.istockphoto.com/photos/close-up-of-a-man-receiving-new-car-key-picture-id628453996?k=20&m=628453996&s=612x612&w=0&h=o0YMpSeU9tL73tn3xih1fGd3RQ8XViJpIgOeCTI_RB4=", "Rant Car"));

        myAdapter = new MyRecyclerAdapter(this, carList);
        rvMainList.setLayoutManager(layoutManager);
        rvMainList.setAdapter(myAdapter);

    }

    @Override
    public void setOnItemClickListener(int position) {

    }
}