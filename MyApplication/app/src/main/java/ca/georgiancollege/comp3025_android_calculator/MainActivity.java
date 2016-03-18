/*
 * COMP3025-Android-Calculator
 * Blaine Parr
 *
 * Date: March 12, 2016
 * Purpose: This is a simple calculator app which can add, subtract, multiply and divide. It has
 * options to make the numbers negative and to convert the second number to a percentage of the
 * first.
 */

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

import java.text.DecimalFormat;

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
    private boolean resetRequested;
    private boolean resetRequired;

    DecimalFormat decFormat;

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
        this.secondNumString = "";
        this.isFirstNum = true;
        this.arithType = -1;
        this.resetRequested = false;
        this.resetRequired = false;

        decFormat = new DecimalFormat("0.##########");

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
                if(!resetRequired) {

                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum("1");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.twoButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum("2");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.threeButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum("3");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.fourButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum("4");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.fiveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum("5");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.sixButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum("6");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.sevenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum("7");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.eightButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum("8");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.nineButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum("9");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.zeroButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum("0");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.decimalButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    setNum(".");
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    setArithType(ADDITION);
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.subtractButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    setArithType(SUBTRACTION);
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.multiplyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    setArithType(MULTIPLICATION);
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.divideButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    setArithType(DIVISION);
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.calculateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    calculate();
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.posNegButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    posNeg();
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.percentButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(!resetRequired) {
                    //reset if one is requested before running setNum
                    if(resetRequested) {
                        clear();
                    } //if ends

                    percent();
                } //if ends
            } //method onClick ends
        }); //setOnClickListener ends

        this.clearButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                clear();
            } //method onClick ends
        }); //setOnClickListener ends
    } //method onCreate ends

    //private methods//////////////////////////////////////////////////////////////////////////////
    /*
     * This function sets the number value of the two numbers.
     */
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

    /*
     * This function changes the arithmetic type. The options are addition, subtraction,
     * multiplication and division.
     */
    private void setArithType(int i){
        //check what the user input and change the arith type and displayed string accordingly

        switch(i){
            case ADDITION: this.arithTypeString = " + ";
                break;
            case SUBTRACTION: this.arithTypeString = " - ";
                break;
            case MULTIPLICATION: this.arithTypeString = " x ";
                break;
            case DIVISION: this.arithTypeString = " / ";
        } //switch ends

        //if it was the firstNum, it's no longer the firstNum
        if(this.isFirstNum){
            this.isFirstNum = false;
        } //if ends
        else{
            this.calculate(); //calculate the expression, this allows for continuous calculations
            this.resetRequested = false; //set resetRequested to false for continuous calculations
        } //else ends

        this.arithType = i; //set the arithType

        //output the firstNumString and the arithType
        this.outputTextView.setText(this.firstNumString + this.arithTypeString);
    } //method setArithType ends

    /*
     * This function performs the mathematical operation between the two input numbers.
     */
    private void calculate(){
        this.resetRequested = true; //request a reset for the next button press

        //local variables
        boolean error = false;

        //if an arithType was input and the secondNumString isn't blank
        if(this.arithType != -1 && this.secondNumString != "") {

            //get the numbers from the strings
            this.firstNum = Double.parseDouble(firstNumString);
            this.secondNum = Double.parseDouble(secondNumString);

            //calculate the two numbers based on the arithType
            switch(this.arithType){
                case ADDITION: this.firstNum += this.secondNum;
                    break;
                case SUBTRACTION: this.firstNum -= this.secondNum;
                    break;
                case MULTIPLICATION: this.firstNum *= this.secondNum;
                    break;
                //don't allow the user to divide by zero
                case DIVISION: if(this.secondNum == 0){
                        error = true;
                    }
                    else{
                        this.firstNum /= this.secondNum;
                    } //else ends
            } //switch ends

            //if no errors occured
            if(!error) {
                //display the calculated number, only put decimal places if necessary
                firstNumString = decFormat.format(firstNum);

                //set the secondNumString to blank
                secondNumString = "";
            } //if ends

            //if an error occured, force a reset
            else{
                firstNumString = "Undefined";
                resetRequired = true;
            } //else ends


            //output the calculated number
            this.outputTextView.setText(this.firstNumString);
        } //if ends
    } //method calculate ends

    /*
     * This function converts the numbers between positive and negative.
     */
    private void posNeg(){
        //if it's the first number
        if(this.isFirstNum){
            //parse the string's value to make sure it isn't 0
            if(Double.parseDouble(this.firstNumString) != 0){
                //if there's no negative symbol, add one
                //if there is a negative symbol, remove it
                if(this.firstNumString.indexOf("-") == -1){
                    this.firstNumString = "-" + this.firstNumString;
                } //if ends
                else{
                    this.firstNumString = this.firstNumString.substring(1);
                } //else ends

                this.outputTextView.setText(this.firstNumString); //update the output
            } //if ends
        } //if ends

        //else if it's the second number and it isn't blank
        else if(secondNumString != ""){
            //parse the string's value to make sure it isn't 0
            if(Double.parseDouble(this.secondNumString) != 0) {
                //if there's no negative symbol, add one
                //if there is a negative symbol, remove it
                if (this.secondNumString.indexOf("-") == -1) {
                    this.secondNumString = "-" + this.secondNumString;
                } //if ends
                else {
                    this.secondNumString = this.secondNumString.substring(1);
                } //else ends

                this.outputTextView.setText(this.firstNumString + this.arithTypeString + this.secondNumString); //update the output
            } //if ends
        } //else ends
    } //method posNeg ends

    /*
     * This function converts the second number to a percentage of the first.
     */
    private void percent(){
        //make sure we're on the second number and it's not blank
        if(!isFirstNum && secondNumString != ""){

            //get the value of the numbers
            firstNum = Double.parseDouble(firstNumString);
            secondNum = Double.parseDouble(secondNumString);

            //to get the percentage, divide the first number by 100 and multiply it by the second number
            secondNum = ((firstNum / 100) * secondNum);

            secondNumString = String.valueOf(secondNum); //convert secondNum back to a string

            this.outputTextView.setText(this.firstNumString + this.arithTypeString + this.secondNumString); //update the output
        } //if ends
    } //method percent ends

    /*
     * This function resets the calculator to its original state.
     */
    private void clear(){
        //reset all values
        this.firstNum = 0;
        this.firstNumString = "0";
        this.secondNum = 0;
        this.secondNumString = "";
        this.isFirstNum = true;
        this.arithType = -1;
        this.resetRequested = false;
        this.resetRequired = false;

        this.outputTextView.setText(this.firstNumString); //update the display
    } //method clear ends
} //class MainActivity ends
