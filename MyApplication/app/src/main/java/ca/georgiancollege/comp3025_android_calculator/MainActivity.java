package ca.georgiancollege.comp3025_android_calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //instance variables
    private double total = 0;
    private String output = "";

    final Button clearButton = (Button) findViewById(R.id.clearButton);
    final Button posNegButton = (Button) findViewById(R.id.posNegButton);
    final Button percentButton = (Button) findViewById(R.id.percentButton);
    final Button divideButton = (Button) findViewById(R.id.divideButton);
    final Button sevenButton = (Button) findViewById(R.id.sevenButton);
    final Button eightButton = (Button) findViewById(R.id.eightButton);
    final Button nineButton = (Button) findViewById(R.id.nineButton);
    final Button multiplyButton = (Button) findViewById(R.id.multiplyButton);
    final Button fourButton = (Button) findViewById(R.id.fourButton);
    final Button fiveButton = (Button) findViewById(R.id.fiveButton);
    final Button sixButton = (Button) findViewById(R.id.sixButton);
    final Button addButton = (Button) findViewById(R.id.addButton);
    final Button oneButton = (Button) findViewById(R.id.oneButton);
    final Button twoButton = (Button) findViewById(R.id.twoButton);
    final Button threeButton = (Button) findViewById(R.id.threeButton);
    final Button subtractButton = (Button) findViewById(R.id.subtractButton);
    final Button zeroButton = (Button) findViewById(R.id.zeroButton);
    final Button decimalButton = (Button) findViewById(R.id.decimalButton);
    final Button calculateButton = (Button) findViewById(R.id.calculateButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


} //class MainActivity ends
