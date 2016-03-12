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

    //constants
    final int ADDITION = 0;
    final int SUBTRACTION = 1;
    final int MULTIPLICATION = 2;
    final int DIVISION = 3;

    //instance variables
    private double firstNum;
    private String firstNumString;
    private double secondNum;
    private String secondNumString;
    private boolean isFirstNum;
    private int arithType;
    private String arithTypeString;

    //widgets
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
        this.firstNumString = "0";
        this.secondNum = 0;
        this.secondNumString = "0";
        this.isFirstNum = true;
        this.arithType = -1;

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
                setNum("1");
            } //method onClick ends
        }); //setOnClickListener ends

        this.twoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setNum("2");
            } //method onClick ends
        }); //setOnClickListener ends

        this.threeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setNum("3");
            } //method onClick ends
        }); //setOnClickListener ends

        this.fourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setNum("4");
            } //method onClick ends
        }); //setOnClickListener ends

        this.fiveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setNum("5");
            } //method onClick ends
        }); //setOnClickListener ends

        this.sixButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setNum("6");
            } //method onClick ends
        }); //setOnClickListener ends

        this.sevenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setNum("7");
            } //method onClick ends
        }); //setOnClickListener ends

        this.eightButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setNum("8");
            } //method onClick ends
        }); //setOnClickListener ends

        this.nineButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setNum("9");
            } //method onClick ends
        }); //setOnClickListener ends

        this.zeroButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setNum("0");
            } //method onClick ends
        }); //setOnClickListener ends

        this.decimalButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setNum(".");
            } //method onClick ends
        }); //setOnClickListener ends

        this.addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setArithType(ADDITION);
            } //method onClick ends
        }); //setOnClickListener ends

        this.subtractButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setArithType(SUBTRACTION);
            } //method onClick ends
        }); //setOnClickListener ends

        this.multiplyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setArithType(MULTIPLICATION);
            } //method onClick ends
        }); //setOnClickListener ends

        this.divideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setArithType(DIVISION);
            } //method onClick ends
        }); //setOnClickListener ends

        this.calculateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                calculate();
            } //method onClick ends
        }); //setOnClickListener ends
    } //method onCreate ends

    //private methods//////////////////////////////////////////////////////////////////////////////
    private void setNum(String s){
        //check if it's the first or second number
        if(this.isFirstNum){
            //if the number is equal to 0 and the user hasn't input a decimal
            if(this.firstNumString == "0" && s != "."){
                //the number is equal to the input value
                this.firstNumString = s;
            } //if ends
            //if the user has input a decimal
            else if(s == "."){
                //if there isn't already a decimal
                if(firstNumString.indexOf(s) == -1){
                    //add the decimal to the end of the number
                    this.firstNumString += s;
                } //if ends
            } //else if ends
            else{
                //add the input to the end of the number
                this.firstNumString += s;
            } //else ends

            //update the output
            this.outputTextView.setText(this.firstNumString);
        } //if ends

        else
        {
            //if the number is equal to 0 and the user hasn't input a decimal
            if(this.secondNumString == "0" && s != "."){
                //the number is equal to the input value
                this.secondNumString = s;
            } //if ends
            //if the user has input a decimal
            else if(s == "."){
                //if there isn't already a decimal
                if(secondNumString.indexOf(s) == -1){
                    //add the decimal to the end of the number
                    this.secondNumString += s;
                } //if ends
            } //else if ends
            else{
                //add the input to the end of the number
                this.secondNumString += s;
            } //else ends

            //update the output
            this.outputTextView.setText(this.firstNumString + this.arithTypeString + this.secondNumString);
        }
    } //method setNum ends

    private void setArithType(int i){
        switch(i){
            case ADDITION: this.arithTypeString = " + ";
                break;
            case SUBTRACTION: this.arithTypeString = " - ";
                break;
            case MULTIPLICATION: this.arithTypeString = " x ";
                break;
            case DIVISION: this.arithTypeString = " / ";
        } //switch ends

        if(isFirstNum){
            isFirstNum = false;
        } //if ends
        else{
            calculate();
        } //else ends

        arithType = i;

        this.outputTextView.setText(this.firstNumString + this.arithTypeString);
    } //method setArithType ends

    private void calculate(){
        if(this.arithType != -1 && secondNumString != "") {
            firstNum = Double.parseDouble(firstNumString);
            secondNum = Double.parseDouble(secondNumString);

            switch(arithType){
                case ADDITION: firstNum += secondNum;
                    break;
                case SUBTRACTION: firstNum -= secondNum;
                    break;
                case MULTIPLICATION: firstNum *= secondNum;
                    break;
                case DIVISION: firstNum /= secondNum;
            } //switch ends

            firstNumString = String.valueOf(firstNum);

            secondNumString = "";

            this.outputTextView.setText(this.firstNumString);
        } //if ends
    } //method calculate ends
} //class MainActivity ends
