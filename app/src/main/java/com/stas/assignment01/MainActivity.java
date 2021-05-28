package com.stas.assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    Letter type buttons
    Button two, three, four, five, six, seven, eight, nine;

//    Function buttons
    Button commit;
    Button deleteLetter;
    Button clear;
    Button save;

//    Text-views for application
    TextView input, submittedText, messages;

//    Click counters
    int click2, click3, click4, click5, click6, click7, click8, click9 = 0;


    // Start of Main Method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Text-view definitions
        input = findViewById(R.id.input);
        submittedText = findViewById(R.id.submittedText);
        messages = findViewById(R.id.messages);
//        Enable message scrolling
        messages.setMovementMethod(new ScrollingMovementMethod());

//        Function buttons
        commit = findViewById(R.id.commit);
        deleteLetter = findViewById(R.id.backspace);
        clear = findViewById(R.id.one);
        save = findViewById(R.id.zero);

//        Type buttons
        two = findViewById(R.id.abc);
        three = findViewById(R.id.def);
        four = findViewById(R.id.ghi);
        five = findViewById(R.id.jkl);
        six = findViewById(R.id.mno);
        seven = findViewById(R.id.pqrs);
        eight = findViewById(R.id.tuv);
        nine = findViewById(R.id.wxyz);
        save = findViewById(R.id.zero);

//        Onclick method for saving messages
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (submittedText.length() > 0) {
                    messages.append(submittedText.getText() + " \n");
                    submittedText.setText("");
                }
            }
        });

//        Onclick method for clearing input
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (submittedText.length() > 0) {
                    submittedText.setText("");
                }
            }
        });

        //        Onclick method for committing letters
        commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (input.length() > 0) {
//                        System.out.println(input.getText());
                    submittedText.append(input.getText());
                }
            }
        });

        //        Onclick method for deleting letters
        deleteLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (submittedText.length() > 0) {
                    String textString = submittedText.getText().toString();
                    submittedText.setText(textString.substring(0, textString.length() - 1));
                }
            }
        });

//        Onclick methods for touch typing
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click2 == 0) {
                    click2++;
                    input.setText("a");
                } else if (click2 == 1) {
                    click2++;
                    input.setText("b");
                } else {
                    input.setText("c");
                    click2 = 0;
                }

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click3 == 0) {
                    click3++;
                    input.setText("d");
                } else if (click3 == 1) {
                    click3++;
                    input.setText("e");
                } else {
                    input.setText("f");
                    click3 = 0;
                }

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click4 == 0) {
                    click4++;
                    input.setText("g");
                } else if (click4 == 1) {
                    click4++;
                    input.setText("h");
                } else {
                    input.setText("i");
                    click4 = 0;
                }

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click5 == 0) {
                    click5++;
                    input.setText("j");
                } else if (click5 == 1) {
                    click5++;
                    input.setText("k");
                } else {
                    input.setText("l");
                    click5 = 0;
                }

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click6 == 0) {
                    click6++;
                    input.setText("m");
                } else if (click6 == 1) {
                    click6++;
                    input.setText("n");
                } else {
                    input.setText("o");
                    click6 = 0;
                }

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click7 == 0) {
                    click7++;
                    input.setText("p");
                } else if (click7 == 1) {
                    click7++;
                    input.setText("q");
                } else if (click7 == 2) {
                    input.setText("r");
                    click7++;
                } else {
                    input.setText("s");
                    click7 = 0;
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click8 == 0) {
                    click8++;
                    input.setText("t");
                } else if (click8 == 1) {
                    click8++;
                    input.setText("u");
                } else {
                    input.setText("v");
                    click8 = 0;
                }

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click9 == 0) {
                    click9++;
                    input.setText("w");
                } else if (click9 == 1) {
                    click9++;
                    input.setText("x");
                } else if (click9 == 2) {
                    input.setText("y");
                    click9++;
                } else {
                    input.setText("z");
                    click9 = 0;
                }
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);

        outState.putString("submitted_text", submittedText.getText().toString());
        outState.putString("input_text", input.getText().toString());
        outState.putString("messages_text", messages.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);

        submittedText.setText(savedInstanceState.getString("submitted_text"));
        input.setText(savedInstanceState.getString("input_text"));
        messages.setText(savedInstanceState.getString("messages_text"));
    }
}