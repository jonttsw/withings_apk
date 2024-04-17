package com.withings.alarm.ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.SeekBar;
/* loaded from: classes3.dex */
public class VolumeSeekBar extends SeekBar {
    public VolumeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(int i11) {
        if (getProgress() == i11) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofInt(this, "progress", getProgress(), i11).setDuration(300L);
        duration.setInterpolator(new DecelerateInterpolator());
        duration.start();
    }

    public final int b() {
        int progress = getProgress() - 5;
        if (progress <= 0) {
            progress = 0;
        }
        a(progress);
        return progress;
    }

    public final int c() {
        int progress = getProgress() + 5;
        if (progress >= getMax()) {
            progress = 100;
        }
        a(progress);
        return progress;
    }

    public VolumeSeekBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
