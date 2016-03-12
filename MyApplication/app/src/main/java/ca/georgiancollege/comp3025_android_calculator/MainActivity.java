package ca.georgiancollege.comp3025_android_calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //instance variables
    private double firstNum;
    private String firstNumString;
    private double secondNum;
    private String secondNumString;
    private boolean isFirstNum;

    private TextView outputTextView;
    private Button clearButton;
    private Button posNegButton;
    private Button percentButton;
    private Button divideButton;
    private Button sevenButton;
    private Button eightButton;
    private Button nineButton;
    private Button multiplyButton;
    private Button fourButton;
    private Button fiveButton;
    private Button sixButton;
    private Button addButton;
    private Button oneButton;
    private Button twoButton;
    private Button threeButton;
    private Button subtractButton;
    private Button zeroButton;
    private Button decimalButton;
    private Button calculateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //variable initialization
        this.firstNum = 0;
        this.secondNum = 0;
        this.isFirstNum = true;

        //widget initialization
        this.outputTextView = (TextView) findViewById(R.id.outputTextView);
        this.clearButton = (Button) findViewById(R.id.clearButton);
        this.posNegButton = (Button) findViewById(R.id.posNegButton);
        this.percentButton = (Button) findViewById(R.id.percentButton);
        this.divideButton = (Button) findViewById(R.id.divideButton);
        this.sevenButton = (Button) findViewById(R.id.sevenButton);
        this.eightButton = (Button) findViewById(R.id.eightButton);
        this.nineButton = (Button) findViewById(R.id.nineButton);
        this.multiplyButton = (Button) findViewById(R.id.multiplyButton);
        this.fourButton = (Button) findViewById(R.id.fourButton);
        this.fiveButton = (Button) findViewById(R.id.fiveButton);
        this.sixButton = (Button) findViewById(R.id.sixButton);
        this.addButton = (Button) findViewById(R.id.addButton);
        this.oneButton = (Button) findViewById(R.id.oneButton);
        this.twoButton = (Button) findViewById(R.id.twoButton);
        this.threeButton = (Button) findViewById(R.id.threeButton);
        this.subtractButton = (Button) findViewById(R.id.subtractButton);
        this.zeroButton = (Button) findViewById(R.id.zeroButton);
        this.decimalButton = (Button) findViewById(R.id.decimalButton);
        this.calculateButton = (Button) findViewById(R.id.calculateButton);

        //add methods to button clicks
        this.oneButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                oneButtonClick();
            } //method onClick ends
        });
    } //method onCreate ends

    //private methods//////////////////////////////////////////////////////////////////////////////
    private void oneButtonClick(){
        this.outputTextView.setText("Test");
    } //method oneButtonClick ends
} //class MainActivity ends
