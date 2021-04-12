package com.willteksoftwares.personalbudgetingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

   // private CardView budgetCardView, todayCardView;

   // private ImageView weekBtnImageView, todayBtnImageView, monthBtnImageView, analyticsImageView; /*budgetBtnImageView ;*/

    private CardView analyticsCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* weekBtnImageView = findViewById(R.id.weekBtnImageView);
        todayBtnImageView = findViewById(R.id.todayBtnImageView);
        monthBtnImageView = findViewById(R.id.monthBtnImageView);
        analyticsImageView = findViewById(R.id.analyticsImageView);
       // budgetBtnImageView = findViewById(R.id.budgetBtnImageView);*/

        analyticsCardView = findViewById(R.id.analyticsCardView);



       /* budgetBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BudgetActivity.class);
                startActivity(intent);
            }
        });*/

       /* todayBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TodaySpendingActivity.class);
                startActivity(intent);
            }
        });

        weekBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WeekSpendingActivity.class);
                intent.putExtra("type", "week");
                startActivity(intent);
            }
        });

        monthBtnImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WeekSpendingActivity.class);
                intent.putExtra("type", "month");
                startActivity(intent);
            }
        });

        analyticsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChooseAnalyticActivity.class);
                startActivity(intent);
            }
        });*/

        analyticsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ChooseAnalyticActivity.class);
                startActivity(intent);
            }
        });


    }
}