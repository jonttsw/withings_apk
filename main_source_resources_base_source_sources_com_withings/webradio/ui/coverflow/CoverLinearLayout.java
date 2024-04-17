package com.withings.webradio.ui.coverflow;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
/* loaded from: classes4.dex */
public class CoverLinearLayout extends LinearLayout {
    private float alpha;
    private float scale;

    public CoverLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.scale = 1.0f;
        this.alpha = 1.0f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        float f11 = this.scale;
        canvas.scale(f11, f11, width / 2, height / 2);
        setAlpha(this.alpha);
        super.onDraw(canvas);
    }

    public void setScaleBoth(float f11, float f12) {
        setWillNotDraw(false);
        this.scale = f11;
        this.alpha = f12;
        invalidate();
    }

    public CoverLinearLayout(Context context) {
        super(context);
        this.scale = 1.0f;
        this.alpha = 1.0f;
    }
}
