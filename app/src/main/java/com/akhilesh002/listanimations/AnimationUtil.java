package com.akhilesh002.listanimations;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v7.widget.RecyclerView;

public class AnimationUtil  {

    public static void animate(RecyclerView.ViewHolder holder, boolean goesDown){
        AnimatorSet animatorSet = new AnimatorSet();

        ObjectAnimator objectAnimatorY = ObjectAnimator.ofFloat(holder.itemView, "translationY", goesDown ? 100 : -100, 0);
        objectAnimatorY.setDuration(300);

//        ObjectAnimator objectAnimatorX = ObjectAnimator.ofFloat(holder.itemView, "translationX", 10, -10, 0);
//        objectAnimatorX.setDuration(800);

        animatorSet.playTogether(objectAnimatorY);
        animatorSet.start();
    }

}
