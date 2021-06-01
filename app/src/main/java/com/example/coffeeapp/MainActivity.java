 package com.example.coffeeapp;
 import java.text.NumberFormat;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
     int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
    displayPrice(quantity*5);
    }
    public void increment(View view) {
        quantity+=1;
        display(quantity);

    }
     public void decrement(View view) {
        quantity-=1;
        display(quantity);
     }

    private void display(int number)  {
        TextView quantityTextview = (TextView)  findViewById(R.id.quantity_text_view);
        quantityTextview.setText("" + number);
    }

     private void displayPrice(int number) {
         TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
         priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
     }

}