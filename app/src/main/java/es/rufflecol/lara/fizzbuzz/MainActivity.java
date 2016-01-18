package es.rufflecol.lara.fizzbuzz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.fizz_buzz);

        String numberDisplayed = "";
        String fizz = "Fizz";
        String buzz = "Buzz";
        String fizzBuzz = "FizzBuzz";

        for (int number = 1; number < 101; number++) {

            if ((number % 3) + (number % 5) == 0) {
                numberDisplayed += fizzBuzz;
            } else if (number % 3 == 0) {
                numberDisplayed += fizz;
              } else if (number % 5 == 0) {
                numberDisplayed += buzz;
            } else /* (number != (number % 3) + (number % 5)) */ {
                numberDisplayed += number;
            }

            if (number != 100) {
                numberDisplayed += "\n" + "\n";
            }

        }
        textView.setText(numberDisplayed);
    }
}




// Line 29 - Commented out code is unnecessary as the last 'else' automatically runs the code inside the {} using the remaining numbers
