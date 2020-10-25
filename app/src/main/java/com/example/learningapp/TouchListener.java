package com.example.learningapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.StrictMath.abs;

public class TouchListener implements View.OnTouchListener {
    private float xDelta;
    private float yDelta;
    public static int pieceno;
    public static int piecenoget=0;
    boolean p11state,p12state,p13state,p2state,p3state;
    public static boolean yesmatched=false;
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        float x = motionEvent.getRawX();
        float y = motionEvent.getRawY();
        final double tolerance = sqrt(pow(view.getWidth(), 2) + pow(view.getHeight(), 2))/10;

        PuzzlePiece piece = (PuzzlePiece) view;
        if (!piece.canMove) {
            return true;
        }

        Puzzle p11=new Puzzle();
        p11state=p11.currentstatel11;
        if(p11state) {
            pieceno = p11.piececount;
        }

        PuzzleLV1Part2 p12=new PuzzleLV1Part2();
        p12state=p12.currentstatel12;
        if(p12state) {
            pieceno = p12.piececount;
        }

        PuzzleLV1Part3 p13=new PuzzleLV1Part3();
        p13state=p13.currentstatel13;
        if(p13state) {
            pieceno = p13.piececount;
        }


        RelativeLayout.LayoutParams lParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                xDelta = x - lParams.leftMargin;
                yDelta = y - lParams.topMargin;
                piece.bringToFront();
                break;
            case MotionEvent.ACTION_MOVE:
                lParams.leftMargin = (int) (x - xDelta);
                lParams.topMargin = (int) (y - yDelta);
                view.setLayoutParams(lParams);
                break;
            case MotionEvent.ACTION_UP:
                int xDiff = abs(piece.xCoord - lParams.leftMargin);
                int yDiff = abs(piece.yCoord - lParams.topMargin);
                System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%"+pieceno);
                System.out.println("$$$$$$$$$$$$$$$$$111111111111"+p11state);
                System.out.println("$$$$$$$$$$$$$$$$$$22222222222"+p12state);
                System.out.println("$$$$$$$$$$$$$$$$$$33333333333"+p13state);
                System.out.println("tolerance====================="+tolerance);

                if (xDiff <= tolerance && yDiff <= tolerance) {
                    piecenoget++;
                    System.out.println("***********************"+piecenoget);
                    if(pieceno==piecenoget)
                    {
                        piecenoget=0;
                        pieceno=0;
                        yesmatched=true;
                        if(p11state) {
                            p11.dialogshow(yesmatched);
                        }
                        if(p12state)
                        {
                            p12.dialogshow(yesmatched);
                        }
                        if(p13state)
                        {
                            p13.dialogshow(yesmatched);
                        }
                        p11state=false;
                        p12state=false;
                        p13state=false;
                        System.out.println("..........^^^^^^^^^^^............"+yesmatched);
                    }
                    lParams.leftMargin = piece.xCoord;
                    lParams.topMargin = piece.yCoord;
                    piece.setLayoutParams(lParams);
                    piece.canMove = false;
                    sendViewToBack(piece);
                }


                break;
        }

        return true;
    }

    public void sendViewToBack(final View child) {
        final ViewGroup parent = (ViewGroup)child.getParent();
        if (null != parent) {
            parent.removeView(child);
            parent.addView(child, 0);
        }
    }
}