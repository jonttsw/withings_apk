package com.withings.views.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
@Deprecated
/* loaded from: classes4.dex */
public class AutoFitTextView extends AppCompatTextView {

    /* renamed from: g  reason: collision with root package name */
    private int f46491g;

    /* renamed from: h  reason: collision with root package name */
    private int f46492h;

    /* renamed from: i  reason: collision with root package name */
    private Mode f46493i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f46494j;

    /* renamed from: k  reason: collision with root package name */
    private int f46495k;

    /* renamed from: l  reason: collision with root package name */
    private int f46496l;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Mode {

        /* renamed from: a  reason: collision with root package name */
        public static final Mode f46497a;

        /* renamed from: b  reason: collision with root package name */
        public static final Mode f46498b;

        /* renamed from: c  reason: collision with root package name */
        public static final Mode f46499c;

        /* renamed from: d  reason: collision with root package name */
        public static final Mode f46500d;

        /* renamed from: e  reason: collision with root package name */
        private static final /* synthetic */ Mode[] f46501e;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.views.view.AutoFitTextView$Mode, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.views.view.AutoFitTextView$Mode, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.views.view.AutoFitTextView$Mode, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.views.view.AutoFitTextView$Mode, java.lang.Enum] */
        static {
            ?? r02 = new Enum("Width", 0);
            f46497a = r02;
            ?? r12 = new Enum("Height", 1);
            f46498b = r12;
            ?? r22 = new Enum("Both", 2);
            f46499c = r22;
            ?? r32 = new Enum("None", 3);
            f46500d = r32;
            f46501e = new Mode[]{r02, r12, r22, r32};
        }

        private Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f46501e.clone();
        }
    }

    public AutoFitTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void s() {
        if (getWidth() <= 0 || getHeight() <= 0 || this.f46493i == Mode.f46500d) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.f46494j = true;
        float f11 = this.f46492h;
        float f12 = this.f46491g;
        getTextSize();
        while (f11 - f12 > 0.5f) {
            float f13 = (f11 + f12) / 2.0f;
            setTextSize(0, f13);
            measure(0, 0);
            Mode mode = this.f46493i;
            if (mode == Mode.f46499c) {
                if (getMeasuredWidth() < width && getMeasuredHeight() < height) {
                    f12 = f13;
                }
                f11 = f13;
            } else if (mode == Mode.f46497a) {
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
        measure(this.f46495k, this.f46496l);
        this.f46494j = false;
    }

    public int getMaxTextSize() {
        return this.f46492h;
    }

    public int getMinTextSize() {
        return this.f46491g;
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i11, int i12) {
        Mode mode;
        super.onMeasure(i11, i12);
        if (!this.f46494j) {
            this.f46495k = i11;
            this.f46496l = i12;
            int mode2 = View.MeasureSpec.getMode(i11);
            int mode3 = View.MeasureSpec.getMode(i12);
            if (mode2 == 1073741824 && mode3 == 1073741824) {
                mode = Mode.f46499c;
            } else if (mode2 == 1073741824) {
                mode = Mode.f46497a;
            } else if (mode3 == 1073741824) {
                mode = Mode.f46498b;
            } else {
                mode = Mode.f46500d;
            }
            this.f46493i = mode;
            s();
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        if (i11 != i13 || i12 != i14) {
            s();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    protected final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        s();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
    }

    public void setMaxTextSize(int i11) {
        this.f46492h = i11;
        s();
    }

    public void setMinTextSize(int i11) {
        this.f46491g = i11;
        s();
    }

    public AutoFitTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f46491g = 1;
        this.f46492h = 1000;
        this.f46493i = Mode.f46500d;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c80.a.f22406b, i11, 0);
        this.f46492h = obtainStyledAttributes.getDimensionPixelSize(0, this.f46492h);
        this.f46491g = obtainStyledAttributes.getDimensionPixelSize(1, this.f46491g);
        obtainStyledAttributes.recycle();
    }

    public AutoFitTextView(FragmentActivity fragmentActivity) {
        super(fragmentActivity, null);
        this.f46491g = 1;
        this.f46492h = 1000;
        this.f46493i = Mode.f46500d;
    }
}
