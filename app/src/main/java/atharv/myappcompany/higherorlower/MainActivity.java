package atharv.myappcompany.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int randomNumber;

     public void generateRandomNumber() {
         Random rand = new Random();

// Obtain a number between [0 - 49].
         randomNumber = rand.nextInt(20);
     }
     public void check(View view) {



         EditText eT = (EditText) findViewById(R.id.editTextNumber);
         Log.i("ENTERED VALUE", eT.getText().toString());

         Log.i("RANDOM VALUE",Integer.toString(randomNumber));
         String enteredValue = eT.getText().toString();

         int eV = Integer.parseInt(enteredValue);

          String msg;
         if (randomNumber < eV)
         {
           msg = "LOWER !!";
         }
         else if (randomNumber > eV)
         {
             msg = "HIGHER !!";
         }
         else
         {
             msg = " Cheers U GOT it, try again to play again ";

             generateRandomNumber();
         }

         Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
         
     }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();

    }
}