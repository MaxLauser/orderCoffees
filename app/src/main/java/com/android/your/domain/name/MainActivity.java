/**
 * IMPORTANT: Make sure you are using the correct package name.
 * This example uses the package name:
 * package com.example.android.justJava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.android.your.domain.name;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.your.domain.name.el.name.R;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    // Quantities
    private int americao_quantity = 0;
    private int cappuccino_quantity = 0;
    private int coca_quantity = 0;
    private int coca_zero_quantity = 0;
    private int chocolate_quantity = 0;
    private int latte_quantity = 0;
    private int mocha_quantity = 0;
    private int espresso_quantity = 0;
    private int espresso_macchiato_quantity = 0;
    private int iced_lemon_tea_quantity = 0;

    // Prices
    private double americao_price = 2.70;
    private double cappuccino_price = 4.02;
    private double coca_price = 1;
    private double coca_zero_price = 1.60;
    private double chocolate_price = 3.75;
    private double latte_price = 2.95;
    private double mocha_price = 3.45;
    private double espresso_price = 4;
    private double espresso_macchiato_price = 4.45;
    private double iced_lemon_tea_price = 4.60;

    // quantities textViews ArrayList
    ArrayList<TextView> quantities_text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {

        double totalPrice = americao_quantity * americao_price
                + cappuccino_quantity * cappuccino_price
                + coca_quantity * coca_price
                + coca_zero_quantity * coca_zero_price
                + chocolate_quantity * chocolate_price
                + latte_quantity * latte_price
                + mocha_quantity * mocha_price
                + espresso_quantity * espresso_price
                + espresso_macchiato_quantity * espresso_macchiato_price
                + iced_lemon_tea_quantity * iced_lemon_tea_price;
        displayPrice(totalPrice);
        // display the message "Your order has been submitted"
        Toast.makeText(this, "Your order has been submitted", Toast.LENGTH_SHORT).show();
    }

    /**
     * This method is called when the clearOrder button is clicked.
     */
    public void reset(View view) {

        TextView americano_quantity_txt = (TextView) findViewById(R.id.americano_quantity);
        TextView cappuccino_quantity_txt = (TextView) findViewById(R.id.cappuccino_quantity);
        TextView coca_quantity_txt = (TextView) findViewById(R.id.coca_quantity);
        TextView coca_zero_quantity_txt = (TextView) findViewById(R.id.coca_zero_quantity);
        TextView chocolate_quantity_txt = (TextView) findViewById(R.id.chocolate_quantity);
        TextView latte_quantity_txt = (TextView) findViewById(R.id.latte_quantity);
        TextView mocha_quantity_txt = (TextView) findViewById(R.id.mocha_quantity);
        TextView espresso_quantity_txt = (TextView) findViewById(R.id.espresso_quantity);
        TextView espresso_macchiato_quantity_txt = (TextView) findViewById(R.id.espresso_macchiato_quantity);
        TextView iced_lemon_tea_quantity_txt = (TextView) findViewById(R.id.iced_lemon_tea_quantity);


        // resetting quantities
        americano_quantity_txt.setText("0");
        cappuccino_quantity_txt.setText("0");
        coca_quantity_txt.setText("0");
        coca_zero_quantity_txt.setText("0");
        chocolate_quantity_txt.setText("0");
        latte_quantity_txt.setText("0");
        mocha_quantity_txt.setText("0");
        espresso_macchiato_quantity_txt.setText("0");
        espresso_quantity_txt.setText("0");
        iced_lemon_tea_quantity_txt.setText("0");

        // resetting total price
        displayPrice(0);

    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(double number) {
        TextView priceTextView = (TextView) findViewById(R.id.total_price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

//==============================================================================================


    /**
     * This methods is called when the plus button is clicked.
     */

    public void americano_increment(View view) {

        TextView americano_quantity_txt = findViewById(R.id.americano_quantity);
        americao_quantity++;
        americano_quantity_txt.setText(""+americao_quantity);
    }

    public void cappuccino_increment(View view) {
        TextView cappuccino_quantity_txt = (TextView) findViewById(R.id.cappuccino_quantity);
        cappuccino_quantity++;
        cappuccino_quantity_txt.setText(""+cappuccino_quantity);

    }

    public void coca_increment(View view) {
        TextView coca_quantity_txt = (TextView) findViewById(R.id.coca_quantity);
        coca_quantity++;
        coca_quantity_txt.setText(""+coca_quantity);
    }

    public void coca_zero_increment(View view) {
        TextView coca_zero_quantity_txt = (TextView) findViewById(R.id.coca_zero_quantity);
        coca_zero_quantity++;
        coca_zero_quantity_txt.setText(""+coca_zero_quantity);
    }

    public void chocolate_increment(View view) {
        TextView chocolate_quantity_txt = (TextView) findViewById(R.id.chocolate_quantity);
        chocolate_quantity++;
        chocolate_quantity_txt.setText(""+chocolate_quantity);
    }

    public void latte_increment(View view) {
        TextView latte_quantity_txt = (TextView) findViewById(R.id.latte_quantity);
        latte_quantity++;
        latte_quantity_txt.setText(""+latte_quantity);
    }

    public void mocha_increment(View view) {
        TextView mocha_quantity_txt = (TextView) findViewById(R.id.mocha_quantity);
        mocha_quantity++;
        mocha_quantity_txt.setText(""+mocha_quantity);
    }

    public void espresso_increment(View view) {
        TextView espresso_quantity_txt = (TextView) findViewById(R.id.espresso_quantity);
        espresso_quantity++;
        espresso_quantity_txt.setText(""+espresso_quantity);
    }

    public void espresso_macchiato_increment(View view) {
        TextView espresso_macchiato_quantity_txt = (TextView) findViewById(R.id.espresso_macchiato_quantity);
        espresso_macchiato_quantity++;
        espresso_macchiato_quantity_txt.setText(""+espresso_macchiato_quantity);
    }

    public void iced_lemon_tea_increment(View view) {
        TextView iced_lemon_tea_quantity_txt = (TextView) findViewById(R.id.iced_lemon_tea_quantity);
        iced_lemon_tea_quantity++;
        iced_lemon_tea_quantity_txt.setText(""+iced_lemon_tea_quantity);
    }

    //==============================================================================================

    /**
     * This methods is called when the minus button is clicked.
     */
    public void americano_decrement(View view) {
        TextView americano_quantity_txt = findViewById(R.id.americano_quantity);
        if (americao_quantity > 0) americao_quantity--;
        else americao_quantity = 0;
        americano_quantity_txt.setText(""+americao_quantity);

    }

    public void cappuccino_decrement(View view) {

        TextView cappuccino_quantity_txt = (TextView) findViewById(R.id.cappuccino_quantity);
        if (cappuccino_quantity > 0) cappuccino_quantity--;
        else cappuccino_quantity = 0;
        cappuccino_quantity_txt.setText(""+cappuccino_quantity);
    }

    public void coca_decrement(View view) {
        TextView coca_quantity_txt = (TextView) findViewById(R.id.coca_quantity);
        if (coca_quantity > 0) coca_quantity--;
        else coca_quantity = 0;
        coca_quantity_txt.setText(""+coca_quantity);
    }


    public void coca_zero_decrement(View view) {
        TextView coca_zero_quantity_txt = (TextView) findViewById(R.id.coca_zero_quantity);
        if (coca_zero_quantity > 0) coca_zero_quantity--;
        else coca_zero_quantity = 0;
        coca_zero_quantity_txt.setText(""+coca_zero_quantity);
    }

    public void chocolate_decrement(View view) {
        TextView chocolate_quantity_txt = (TextView) findViewById(R.id.chocolate_quantity);
        if (chocolate_quantity > 0) chocolate_quantity--;
        else chocolate_quantity = 0;
        chocolate_quantity_txt.setText(""+chocolate_quantity);
    }

    public void latte_decrement(View view) {
        TextView latte_quantity_txt = (TextView) findViewById(R.id.latte_quantity);
        if (latte_quantity > 0) latte_quantity--;
        else latte_quantity = 0;
        latte_quantity_txt.setText(""+latte_quantity);
    }

    public void mocha_decrement(View view) {
        TextView mocha_quantity_txt = (TextView) findViewById(R.id.mocha_quantity);
        if (mocha_quantity > 0) mocha_quantity--;
        else mocha_quantity = 0;
        mocha_quantity_txt.setText(""+mocha_quantity);

    }

    public void espresso_decrement(View view) {
        TextView espresso_quantity_txt = (TextView) findViewById(R.id.espresso_quantity);
        if (espresso_quantity > 0) espresso_quantity--;
        else espresso_quantity = 0;
        espresso_quantity_txt.setText(""+espresso_quantity);

    }

    public void espresso_macchiato_decrement(View view) {
        TextView espresso_macchiato_quantity_txt = (TextView) findViewById(R.id.espresso_macchiato_quantity);
        if (espresso_macchiato_quantity > 0) espresso_macchiato_quantity--;
        else espresso_macchiato_quantity = 0;
        espresso_macchiato_quantity_txt.setText(""+espresso_macchiato_quantity);

    }

    public void iced_lemon_tea_decrement(View view) {
        TextView iced_lemon_tea_quantity_txt = (TextView) findViewById(R.id.iced_lemon_tea_quantity);
        if (iced_lemon_tea_quantity > 0) iced_lemon_tea_quantity--;
        else iced_lemon_tea_quantity = 0;
        iced_lemon_tea_quantity_txt.setText(""+iced_lemon_tea_quantity);

    }


}