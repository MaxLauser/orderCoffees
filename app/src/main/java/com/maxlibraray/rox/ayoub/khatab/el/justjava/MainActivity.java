/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.maxlibraray.rox.ayoub.khatab.el.justjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    // newQuantity is the quantity that user choose
    private int newQuantity = 2;
    // initialQuantity is the default quantity
    private int initialQuantity = 0;
    private int price = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display(initialQuantity);
        displayPrice(initialQuantity * price);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        display(newQuantity);
        displayPrice(newQuantity * price);
        Toast.makeText(this,"Your order has been submitted",Toast.LENGTH_SHORT);
    }

    /**
     * This method is called when the clearOrder button is clicked.
     */
    public void newOrder(View view) {
        newQuantity = 0;
        display(initialQuantity);
        displayPrice(initialQuantity * price);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        newQuantity += 1;
        display(newQuantity);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement(View view) {
        // quantity must be positive number
        if (newQuantity >0)
        {
            newQuantity -= 1;
            display(newQuantity);
        }
        else
        {
            newQuantity = 0;
            display(newQuantity);
        }

    }
}