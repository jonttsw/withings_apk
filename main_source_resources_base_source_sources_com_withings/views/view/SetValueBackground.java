package com.withings.views.view;

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
/* loaded from: classes4.dex */
public class SetValueBackground extends ScrollView {

    /* renamed from: a  reason: collision with root package name */
    private b f46681a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList f46682b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList f46683c;

    /* renamed from: d  reason: collision with root package name */
    private float f46684d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f46685e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f46686f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            SetValueBackground.c(SetValueBackground.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ViewConstructor"})
    /* loaded from: classes4.dex */
    public static class b extends ViewGroup {

        /* renamed from: a  reason: collision with root package name */
        private int f46688a;

        /* renamed from: b  reason: collision with root package name */
        private int f46689b;

        /* renamed from: c  reason: collision with root package name */
        private int f46690c;

        /* renamed from: d  reason: collision with root package name */
        private float f46691d;

        /* renamed from: e  reason: collision with root package name */
        private float f46692e;

        /* renamed from: f  reason: collision with root package name */
        private HashMap f46693f;

        b(Context context) {
            super(context);
            this.f46693f = new HashMap();
        }

        static int a(b bVar, float f11) {
            float f12 = bVar.f46691d;
            return (int) ((((f12 - f11) * bVar.f46688a) / (f12 - bVar.f46692e)) + bVar.f46689b);
        }

        public final void b(View view, float f11) {
            this.f46693f.put(view, Float.valueOf(f11));
            addView(view);
        }

        public final int c() {
            return this.f46690c;
        }

        public final int d() {
            return this.f46689b;
        }

        public final int e() {
            return this.f46688a;
        }

        public final float f() {
            return this.f46691d;
        }

        public final float g() {
            return this.f46692e;
        }

        public final void h(float f11, float f12) {
            this.f46692e = f11;
            this.f46691d = f12;
            requestLayout();
        }

        public final void i(int i11, int i12) {
            this.f46689b = i11;
            this.f46690c = i12;
            requestLayout();
        }

        public final void j(int i11) {
            this.f46688a = i11;
            requestLayout();
        }

        public final void k(View view, float f11) {
            HashMap hashMap = this.f46693f;
            if (hashMap.containsKey(view)) {
                hashMap.put(view, Float.valueOf(f11));
                requestLayout();
            }
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
                Float f11 = (Float) this.f46693f.get(childAt);
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
                float floatValue = f11.floatValue();
                float f12 = this.f46691d;
                int i26 = ((int) ((((f12 - floatValue) * this.f46688a) / (f12 - this.f46692e)) + this.f46689b)) + i12;
                int i27 = marginLayoutParams.topMargin;
                if (i27 != 0) {
                    i21 = i26 + i27;
                    i19 = measuredHeight + i21;
                } else {
                    int i28 = marginLayoutParams.bottomMargin;
                    if (i28 != 0) {
                        int i29 = i26 - i28;
                        i18 = i29 - measuredHeight;
                        i19 = i29;
                    } else {
                        int i31 = measuredHeight / 2;
                        i18 = i26 - i31;
                        i19 = i31 + i26;
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
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(this.f46688a + this.f46689b + this.f46690c, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH));
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
        this.f46682b = new ArrayList();
        this.f46683c = new ArrayList();
        g();
    }

    static void c(SetValueBackground setValueBackground) {
        setValueBackground.scrollTo(0, setValueBackground.getRealScrollY());
    }

    private void g() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        b bVar = new b(getContext());
        this.f46681a = bVar;
        addView(bVar, new ViewGroup.LayoutParams(-1, -2));
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    public final void d(View view, float f11) {
        this.f46682b.add(view);
        this.f46681a.b(view, f11);
    }

    public final void e(View view, float f11) {
        this.f46683c.add(view);
        this.f46681a.b(view, f11);
    }

    public final int f(float f11) {
        return b.a(this.f46681a, f11);
    }

    public int getMarginBottom() {
        return this.f46681a.c();
    }

    public int getMarginTop() {
        return this.f46681a.d();
    }

    public int getRealScrollY() {
        return (int) ((1.0f - ((this.f46684d - getValueMin()) / (getValueMax() - getValueMin()))) * getScrollMax());
    }

    public int getScaleHeight() {
        return this.f46681a.e();
    }

    public int getScrollMax() {
        return (getMarginBottom() + (getMarginBottom() + this.f46681a.e())) - getMeasuredHeight();
    }

    public float getValue() {
        return this.f46684d;
    }

    public float getValueFromScroll() {
        int scrollMax = getScrollMax();
        return (((getValueMax() - getValueMin()) * (scrollMax - getScrollY())) / scrollMax) + getValueMin();
    }

    public float getValueMax() {
        return this.f46681a.f();
    }

    public float getValueMin() {
        return this.f46681a.g();
    }

    public final void h(float f11, float f12) {
        this.f46681a.h(f11, f12);
    }

    public final void i(int i11, int i12) {
        this.f46681a.i(i11, i12);
    }

    public final void j(View view, float f11) {
        this.f46681a.k(view, f11);
    }

    public final void k() {
        if (this.f46685e) {
            return;
        }
        this.f46685e = true;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setStartOffset(500L);
        alphaAnimation.setAnimationListener(new i(this));
        Iterator it = this.f46682b.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.getAnimation() != null) {
                view.getAnimation().setAnimationListener(null);
                view.getAnimation().cancel();
            }
            view.startAnimation(alphaAnimation);
        }
    }

    public final void l() {
        if (this.f46686f) {
            return;
        }
        this.f46686f = true;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setStartOffset(1000L);
        alphaAnimation.setAnimationListener(new j(this));
        Iterator it = this.f46683c.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view.getAnimation() != null) {
                view.getAnimation().setAnimationListener(null);
                view.getAnimation().cancel();
            }
            view.startAnimation(alphaAnimation);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected final void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        scrollTo(0, getRealScrollY());
    }

    public void setPrimaryScaleViewsVisibility(int i11) {
        Iterator it = this.f46682b.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i11);
        }
    }

    public void setScaleHeight(int i11) {
        this.f46681a.j(i11);
    }

    public void setSecondaryScaleViewsVisibility(int i11) {
        Iterator it = this.f46683c.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i11);
        }
    }

    public void setValue(float f11) {
        this.f46684d = f11;
        scrollTo(0, getRealScrollY());
    }

    public SetValueBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46682b = new ArrayList();
        this.f46683c = new ArrayList();
        g();
    }

    public SetValueBackground(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f46682b = new ArrayList();
        this.f46683c = new ArrayList();
        g();
    }
}
