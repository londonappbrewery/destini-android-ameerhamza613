package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView stv;
    Button tbtn;
    Button bbtn;
    int index = 1;
    int storybook;

    //  //Array
//    private  StoryModel[] storybank = new StoryModel[] {
//
//          new StoryModel(R.string.T1_Story),
//          new StoryModel(R.string.T1_Ans1),
//          new StoryModel(R.string.T1_Ans2),
//          new StoryModel(R.string.T2_Story),
//          new StoryModel(R.string.T2_Ans1),
//          new StoryModel(R.string.T2_Ans2),
//          new StoryModel(R.string.T3_Story),
//          new StoryModel(R.string.T3_Ans1),
//          new StoryModel(R.string.T3_Ans2),
//          new StoryModel(R.string.T4_End),
//          new StoryModel(R.string.T5_End),
//          new StoryModel(R.string.T6_End),
//
//  };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        stv = (TextView) findViewById(R.id.storyTextView);
        tbtn = (Button) findViewById(R.id.buttonTop);
        bbtn = (Button) findViewById(R.id.buttonBottom);

        //  storybook = storybank[index].getStoryRid();
        //   stv.setText(storybook);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //   chekAnswer();

                if (index == 1) {
                    stv.setText(R.string.T3_Story);
                    tbtn.setText(R.string.T3_Ans1);
                    bbtn.setText(R.string.T3_Ans2);
                  index++;
                }
               else if (index == 2) {
                    stv.setText(R.string.T6_End);
                    tbtn.setVisibility(View.GONE);
                    bbtn.setVisibility(View.GONE);

                }

                bbtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(index==2){
                            stv.setText(R.string.T5_End);
                            tbtn.setVisibility(View.GONE);
                            bbtn.setVisibility(View.GONE);
                        }
                    }
                });

            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        bbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (index == 1) {
                    stv.setText(R.string.T2_Story);
                    tbtn.setText(R.string.T2_Ans1);
                    bbtn.setText(R.string.T2_Ans2);
                    index++;
                }
              else   if (index == 2) {
                    stv.setText(R.string.T5_End);
                    tbtn.setVisibility(View.GONE);
                    bbtn.setVisibility(View.GONE);
               }


            }
        });

    }

}
