package com.withings.design.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.ScrollView;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes3.dex */
public class SetValueBackground extends ScrollView {

    /* renamed from: a  reason: collision with root package name */
    private b f36367a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList f36368b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList f36369c;

    /* renamed from: d  reason: collision with root package name */
    private float f36370d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36371e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36372f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            SetValueBackground.a(SetValueBackground.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ViewConstructor"})
    /* loaded from: classes3.dex */
    public static class b extends ViewGroup {

        /* renamed from: a  reason: collision with root package name */
        private int f36374a;

        /* renamed from: b  reason: collision with root package name */
        private HashMap f36375b;

        b(Context context) {
            super(context);
            this.f36375b = new HashMap();
        }

        public final int a() {
            return this.f36374a;
        }

        public final void b(int i11) {
            this.f36374a = i11;
            requestLayout();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            int i15;
            int i16;
            int i17;
            int i18;
            int i19;
            int i21;
            for (int i22 = 0; i22 < getChildCount(); i22++) {
                View childAt = getChildAt(i22);
                Float f11 = (Float) this.f36375b.get(childAt);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
                }
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (marginLayoutParams.width == -1) {
                    i17 = marginLayoutParams.leftMargin + i11;
                    i16 = i13 - marginLayoutParams.rightMargin;
                } else {
                    int i23 = marginLayoutParams.leftMargin;
                    if (i23 != 0) {
                        i15 = i23 + i11;
                    } else {
                        int i24 = marginLayoutParams.rightMargin;
                        if (i24 != 0) {
                            i16 = i13 - i24;
                            i17 = i16 - measuredWidth;
                        } else {
                            i15 = (((i13 - i11) / 2) + i11) - (measuredWidth / 2);
                        }
                    }
                    int i25 = i15;
                    i16 = measuredWidth + i15;
                    i17 = i25;
                }
                int floatValue = ((int) ((((0.0f - f11.floatValue()) * this.f36374a) / 0.0f) + 0)) + i12;
                int i26 = marginLayoutParams.topMargin;
                if (i26 != 0) {
                    i21 = floatValue + i26;
                    i19 = measuredHeight + i21;
                } else {
                    int i27 = marginLayoutParams.bottomMargin;
                    if (i27 != 0) {
                        int i28 = floatValue - i27;
                        i18 = i28 - measuredHeight;
                        i19 = i28;
                    } else {
                        int i29 = measuredHeight / 2;
                        i18 = floatValue - i29;
                        i19 = i29 + floatValue;
                    }
                    i21 = i18;
                }
                childAt.layout(i17, i21, i16, i19);
            }
        }

        @Override // android.view.View
        protected final void onMeasure(int i11, int i12) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            int makeMeasureSpec;
            int makeMeasureSpec2;
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(this.f36374a, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH));
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                View childAt = getChildAt(i13);
                int size = View.MeasureSpec.getSize(i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
                }
                int i14 = marginLayoutParams.width;
                if (i14 == -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH);
                } else if (i14 == -2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH);
                }
                int i15 = marginLayoutParams.height;
                if (i15 != -1 && i15 != -2) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i15, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH);
                } else {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                }
                childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            }
        }
    }

    public SetValueBackground(Context context) {
        super(context);
        this.f36368b = new ArrayList();
        this.f36369c = new ArrayList();
        d();
    }

    static void a(SetValueBackground setValueBackground) {
        setValueBackground.scrollTo(0, setValueBackground.getRealScrollY());
    }

    private void d() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        b bVar = new b(getContext());
        this.f36367a = bVar;
        addView(bVar, new ViewGroup.LayoutParams(-1, -2));
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    public final void e() {
        if (this.f36371e) {
            return;
        }
        this.f36371e = true;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setStartOffset(500L);
        alphaAnimation.setAnimationListener(new f(this));
        Iterator it = this.f36368b.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.getAnimation() != null) {
                view.getAnimation().setAnimationListener(null);
                view.getAnimation().cancel();
            }
            view.startAnimation(alphaAnimation);
        }
    }

    public final void f() {
        if (this.f36372f) {
            return;
        }
        this.f36372f = true;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setStartOffset(1000L);
        alphaAnimation.setAnimationListener(new g(this));
        Iterator it = this.f36369c.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.getAnimation() != null) {
                view.getAnimation().setAnimationListener(null);
                view.getAnimation().cancel();
            }
            view.startAnimation(alphaAnimation);
        }
    }

    public int getMarginBottom() {
        this.f36367a.getClass();
        return 0;
    }

    public int getMarginTop() {
        this.f36367a.getClass();
        return 0;
    }

    public int getRealScrollY() {
        return (int) ((1.0f - ((this.f36370d - getValueMin()) / (getValueMax() - getValueMin()))) * getScrollMax());
    }

    public int getScaleHeight() {
        return this.f36367a.a();
    }

    public int getScrollMax() {
        return (getMarginBottom() + (getMarginBottom() + this.f36367a.a())) - getMeasuredHeight();
    }

    public float getValue() {
        return this.f36370d;
    }

    public float getValueFromScroll() {
        int scrollMax = getScrollMax();
        return (((getValueMax() - getValueMin()) * (scrollMax - getScrollY())) / scrollMax) + getValueMin();
    }

    public float getValueMax() {
        this.f36367a.getClass();
        return 0.0f;
    }

    public float getValueMin() {
        this.f36367a.getClass();
        return 0.0f;
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        scrollTo(0, getRealScrollY());
    }

    public void setPrimaryScaleViewsVisibility(int i11) {
        Iterator it = this.f36368b.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i11);
        }
    }

    public void setScaleHeight(int i11) {
        this.f36367a.b(i11);
    }

    public void setSecondaryScaleViewsVisibility(int i11) {
        Iterator it = this.f36369c.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i11);
        }
    }

    public void setValue(float f11) {
        this.f36370d = f11;
        scrollTo(0, getRealScrollY());
    }

    public SetValueBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36368b = new ArrayList();
        this.f36369c = new ArrayList();
        d();
    }

    public SetValueBackground(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36368b = new ArrayList();
        this.f36369c = new ArrayList();
        d();
    }
}
