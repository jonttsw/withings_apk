package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes3.dex */
public class AutoFitTextView extends TextView {

    /* renamed from: a  reason: collision with root package name */
    private int f36162a;

    /* renamed from: b  reason: collision with root package name */
    private int f36163b;

    /* renamed from: c  reason: collision with root package name */
    private Mode f36164c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36165d;

    /* renamed from: e  reason: collision with root package name */
    private int f36166e;

    /* renamed from: f  reason: collision with root package name */
    private int f36167f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class Mode {

        /* renamed from: a  reason: collision with root package name */
        public static final Mode f36168a;

        /* renamed from: b  reason: collision with root package name */
        public static final Mode f36169b;

        /* renamed from: c  reason: collision with root package name */
        public static final Mode f36170c;

        /* renamed from: d  reason: collision with root package name */
        public static final Mode f36171d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ Mode[] f36172e;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.design.view.AutoFitTextView$Mode] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.design.view.AutoFitTextView$Mode] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.design.view.AutoFitTextView$Mode] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.design.view.AutoFitTextView$Mode] */
        static {
            ?? r02 = new Enum("Width", 0);
            f36168a = r02;
            ?? r12 = new Enum("Height", 1);
            f36169b = r12;
            ?? r22 = new Enum("Both", 2);
            f36170c = r22;
            ?? r32 = new Enum("None", 3);
            f36171d = r32;
            f36172e = new Mode[]{r02, r12, r22, r32};
        }

        private Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f36172e.clone();
        }
    }

    public AutoFitTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        if (getWidth() <= 0 || getHeight() <= 0 || this.f36164c == Mode.f36171d) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.f36165d = true;
        float f11 = this.f36163b;
        float f12 = this.f36162a;
        getTextSize();
        while (f11 - f12 > 0.5f) {
            float f13 = (f11 + f12) / 2.0f;
            setTextSize(0, f13);
            measure(0, 0);
            Mode mode = this.f36164c;
            if (mode == Mode.f36170c) {
                if (getMeasuredWidth() < width && getMeasuredHeight() < height) {
                    f12 = f13;
                }
                f11 = f13;
            } else if (mode == Mode.f36168a) {
                if (getMeasuredWidth() >= width) {
                    f11 = f13;
                } else {
                    f12 = f13;
                }
            } else if (getMeasuredHeight() >= height) {
                f11 = f13;
            } else {
                f12 = f13;
            }
        }
        setTextSize(0, f12);
        measure(this.f36166e, this.f36167f);
        this.f36165d = false;
    }

    public int getMaxTextSize() {
        return this.f36163b;
    }

    public int getMinTextSize() {
        return this.f36162a;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        Drawable background = getBackground();
        setBackground(null);
        int suggestedMinimumHeight = super.getSuggestedMinimumHeight();
        setBackground(background);
        return suggestedMinimumHeight;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        Drawable background = getBackground();
        setBackground(null);
        int suggestedMinimumWidth = super.getSuggestedMinimumWidth();
        setBackground(background);
        return suggestedMinimumWidth;
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i11, int i12) {
        Mode mode;
        super.onMeasure(i11, i12);
        if (!this.f36165d) {
            this.f36166e = i11;
            this.f36167f = i12;
            int mode2 = View.MeasureSpec.getMode(i11);
            int mode3 = View.MeasureSpec.getMode(i12);
            if (mode2 == 1073741824 && mode3 == 1073741824) {
                mode = Mode.f36170c;
            } else if (mode2 == 1073741824) {
                mode = Mode.f36168a;
            } else if (mode3 == 1073741824) {
                mode = Mode.f36169b;
            } else {
                mode = Mode.f36171d;
            }
            this.f36164c = mode;
            a();
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (i11 != i13 || i12 != i14) {
            a();
        }
    }

    @Override // android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        a();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    public void setMaxTextSize(int i11) {
        this.f36163b = i11;
        a();
    }

    public void setMinTextSize(int i11) {
        this.f36162a = i11;
        a();
    }

    public AutoFitTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36162a = 1;
        this.f36163b = 1000;
        this.f36164c = Mode.f36171d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, in.a.f72600b, i11, 0);
        this.f36163b = obtainStyledAttributes.getDimensionPixelSize(0, this.f36163b);
        this.f36162a = obtainStyledAttributes.getDimensionPixelSize(1, this.f36162a);
        obtainStyledAttributes.recycle();
    }
}
