package com.withings.views.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Scroller;
import android.widget.TextView;
import androidx.core.view.u0;
import androidx.fragment.app.FragmentActivity;
import java.util.HashMap;
/* loaded from: classes4.dex */
public class SetValueView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private a f46694a;

    /* renamed from: b  reason: collision with root package name */
    protected SetValueBackground f46695b;

    /* renamed from: c  reason: collision with root package name */
    private float f46696c;

    /* renamed from: d  reason: collision with root package name */
    private View f46697d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f46698e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f46699f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f46700g;

    /* renamed from: h  reason: collision with root package name */
    private Scroller f46701h;

    /* renamed from: i  reason: collision with root package name */
    private float f46702i;

    /* renamed from: j  reason: collision with root package name */
    private float f46703j;

    /* renamed from: k  reason: collision with root package name */
    private float f46704k;

    /* renamed from: l  reason: collision with root package name */
    private float f46705l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f46706m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f46707n;

    /* renamed from: o  reason: collision with root package name */
    private VelocityTracker f46708o;

    /* renamed from: p  reason: collision with root package name */
    private GestureDetector f46709p;

    /* loaded from: classes4.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        boolean f46710a;

        /* renamed from: b  reason: collision with root package name */
        float f46711b;

        /* loaded from: classes4.dex */
        final class a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, com.withings.views.view.SetValueView$SavedState] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                boolean z5;
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                baseSavedState.f46710a = z5;
                baseSavedState.f46711b = parcel.readFloat();
                return baseSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f46710a ? 1 : 0);
            parcel.writeFloat(this.f46711b);
        }
    }

    /* loaded from: classes4.dex */
    public interface a {
        void E2(float f11);

        void u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            SetValueView setValueView = SetValueView.this;
            setValueView.f46708o.computeCurrentVelocity(1000);
            SetValueView.d(setValueView, (int) (-setValueView.f46708o.getYVelocity()));
            return true;
        }
    }

    /* loaded from: classes4.dex */
    private class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                SetValueView.this.f46700g = true;
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.withings.views.view.SetValueView$a] */
    public SetValueView(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.f46694a = new Object();
        this.f46698e = new HashMap();
        j();
    }

    static void d(SetValueView setValueView, int i11) {
        setValueView.f46707n = true;
        setValueView.f46701h.abortAnimation();
        if (setValueView.f46700g) {
            i11 = (int) (((-i11) * setValueView.f46695b.getScrollMax()) / ((setValueView.getHeight() - setValueView.getMarginTop()) - setValueView.getMarginBottom()));
        }
        setValueView.f46701h.fling(0, setValueView.f46695b.getScrollY(), 0, i11, 0, 0, 0, setValueView.f46695b.getScrollMax());
        u0.T(setValueView);
    }

    private void j() {
        SetValueBackground setValueBackground = new SetValueBackground(getContext());
        this.f46695b = setValueBackground;
        addView(setValueBackground);
        this.f46701h = new Scroller(getContext());
        this.f46705l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f46708o = VelocityTracker.obtain();
        this.f46709p = new GestureDetector(getContext(), new b());
    }

    private void setStartViewVisibility(int i11) {
        for (View view : this.f46698e.keySet()) {
            view.setVisibility(i11);
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        boolean computeScrollOffset = this.f46701h.computeScrollOffset();
        this.f46707n = computeScrollOffset;
        if (computeScrollOffset) {
            this.f46695b.scrollTo(0, this.f46701h.getCurrY());
            setValue(this.f46695b.getValueFromScroll());
            this.f46694a.E2(this.f46696c);
        }
    }

    public final void e(View view, float f11) {
        int i11;
        if (this.f46699f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        this.f46695b.d(view, f11);
    }

    public final void f(View view, float f11) {
        int i11;
        if (this.f46699f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        this.f46695b.e(view, f11);
    }

    public final void g(TextView textView) {
        int i11;
        this.f46698e.put(textView, null);
        if (this.f46699f) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView.setVisibility(i11);
        addView(textView);
    }

    public int getMarginBottom() {
        return this.f46695b.getMarginBottom();
    }

    public int getMarginTop() {
        return this.f46695b.getMarginTop();
    }

    public float getValue() {
        return this.f46696c;
    }

    public float getValueMax() {
        return this.f46695b.getValueMax();
    }

    public float getValueMin() {
        return this.f46695b.getValueMin();
    }

    public View getValueView() {
        return this.f46697d;
    }

    public int getYForValue() {
        return i(this.f46696c);
    }

    public final void h(View view, float f11) {
        int i11;
        this.f46698e.put(view, Float.valueOf(f11));
        if (this.f46699f) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        addView(view);
    }

    public final int i(float f11) {
        int marginTop = getMarginTop();
        int marginBottom = getMarginBottom();
        float valueMax = getValueMax();
        return (int) ((((valueMax - f11) * ((getMeasuredHeight() - marginBottom) - marginTop)) / (valueMax - getValueMin())) + marginTop);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void k() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setStartOffset(0L);
        alphaAnimation.setAnimationListener(new k(this));
        for (View view : this.f46698e.keySet()) {
            if (view.getAnimation() != null) {
                view.getAnimation().setAnimationListener(null);
                view.getAnimation().cancel();
            }
            view.startAnimation(alphaAnimation);
        }
        this.f46695b.k();
        this.f46695b.l();
    }

    public void l() {
        this.f46699f = true;
        setStartViewVisibility(8);
        this.f46695b.setPrimaryScaleViewsVisibility(0);
        this.f46695b.setSecondaryScaleViewsVisibility(0);
        requestLayout();
    }

    public final void m(float f11, float f12) {
        this.f46695b.h(f11, f12);
        requestLayout();
    }

    public final void n(int i11, int i12) {
        this.f46695b.i(i11, i12);
        requestLayout();
    }

    public final void o(View view, float f11) {
        HashMap hashMap = this.f46698e;
        if (hashMap.containsKey(view)) {
            hashMap.put(view, Float.valueOf(f11));
            requestLayout();
            return;
        }
        this.f46695b.j(view, f11);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float rawX = motionEvent.getRawX() - this.f46702i;
                float rawY = motionEvent.getRawY() - this.f46703j;
                if (Math.abs(rawX) < Math.abs(rawY) && Math.abs(rawY) > this.f46705l) {
                    this.f46702i = motionEvent.getRawX();
                    this.f46703j = motionEvent.getRawY();
                    this.f46706m = true;
                    this.f46694a.u();
                    if (!this.f46699f) {
                        k();
                        this.f46699f = true;
                    }
                }
            }
        } else {
            this.f46702i = motionEvent.getRawX();
            this.f46703j = motionEvent.getRawY();
            this.f46700g = false;
            this.f46701h.forceFinished(true);
            u0.T(this);
        }
        if (this.f46706m) {
            motionEvent.setAction(1);
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                getChildAt(i11).onTouchEvent(motionEvent);
            }
        }
        return this.f46706m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
        this.f46695b.layout(i11, i12, i13, i14);
        int measuredWidth = this.f46697d.getMeasuredWidth();
        int measuredHeight = this.f46697d.getMeasuredHeight();
        int measuredWidth2 = getMeasuredWidth() / 2;
        int yForValue = getYForValue();
        int i15 = measuredWidth / 2;
        int i16 = measuredHeight / 2;
        this.f46697d.layout(measuredWidth2 - i15, yForValue - i16, measuredWidth2 + i15, yForValue + i16);
        if (!this.f46699f) {
            HashMap hashMap = this.f46698e;
            for (View view : hashMap.keySet()) {
                Float f11 = (Float) hashMap.get(view);
                if (f11 == null) {
                    int measuredWidth3 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    int measuredWidth4 = getMeasuredWidth() / 2;
                    int measuredHeight3 = getMeasuredHeight() / 2;
                    int i17 = measuredWidth3 / 2;
                    int i18 = measuredWidth4 - i17;
                    int i19 = measuredWidth4 + i17;
                    int i21 = measuredHeight2 / 2;
                    int i22 = measuredHeight3 - i21;
                    int i23 = measuredHeight3 + i21;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int i24 = marginLayoutParams.leftMargin;
                        if (i24 != 0) {
                            i19 = i24 + measuredWidth3;
                            i18 = i24;
                        } else if (marginLayoutParams.rightMargin != 0) {
                            i19 = getMeasuredWidth() - marginLayoutParams.rightMargin;
                            i18 = i19 - measuredWidth3;
                        }
                        int i25 = marginLayoutParams.topMargin;
                        if (i25 != 0) {
                            i23 = i25 + measuredHeight2;
                            i22 = i25;
                        } else if (marginLayoutParams.bottomMargin != 0) {
                            i23 = getMeasuredHeight() - marginLayoutParams.bottomMargin;
                            i22 = i23 - measuredHeight2;
                        }
                    }
                    view.layout(i18, i22, i19, i23);
                } else {
                    float floatValue = f11.floatValue();
                    int measuredWidth5 = view.getMeasuredWidth();
                    int measuredHeight4 = view.getMeasuredHeight();
                    int measuredWidth6 = getMeasuredWidth() / 2;
                    int i26 = i(floatValue);
                    int i27 = measuredWidth5 / 2;
                    int i28 = measuredWidth6 - i27;
                    int i29 = measuredWidth6 + i27;
                    int i31 = measuredHeight4 / 2;
                    int i32 = i26 - i31;
                    int i33 = i26 + i31;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        int i34 = marginLayoutParams2.leftMargin;
                        if (i34 != 0) {
                            i29 = i34 + measuredWidth5;
                            i28 = i34;
                        } else if (marginLayoutParams2.rightMargin != 0) {
                            i29 = getMeasuredWidth() - marginLayoutParams2.rightMargin;
                            i28 = i29 - measuredWidth5;
                        }
                        int i35 = marginLayoutParams2.topMargin;
                        if (i35 != 0) {
                            i33 = i35 + measuredHeight4;
                            i32 = i35;
                        } else if (marginLayoutParams2.bottomMargin != 0) {
                            i33 = getMeasuredHeight() - marginLayoutParams2.bottomMargin;
                            i32 = i33 - measuredHeight4;
                        }
                    }
                    view.layout(i28, i32, i29, i33);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        measureChildren(i11, i12);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i11;
        int i12;
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f46699f = savedState.f46710a;
            this.f46696c = savedState.f46711b;
        } else {
            super.onRestoreInstanceState(parcelable);
        }
        int i13 = 0;
        if (this.f46699f) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        setStartViewVisibility(i11);
        SetValueBackground setValueBackground = this.f46695b;
        if (this.f46699f) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        setValueBackground.setPrimaryScaleViewsVisibility(i12);
        SetValueBackground setValueBackground2 = this.f46695b;
        if (!this.f46699f) {
            i13 = 8;
        }
        setValueBackground2.setSecondaryScaleViewsVisibility(i13);
        setValue(this.f46696c);
        this.f46694a.E2(this.f46696c);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.withings.views.view.SetValueView$SavedState] */
    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f46710a = this.f46699f;
        baseSavedState.f46711b = this.f46696c;
        return baseSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f46709p.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
                    this.f46708o.addMovement(motionEvent);
                    this.f46707n = false;
                    if (this.f46704k > 0.0f) {
                        int rawY = (int) (motionEvent.getRawY() - this.f46704k);
                        if (!this.f46707n) {
                            this.f46701h.abortAnimation();
                            if (this.f46700g) {
                                int marginTop = getMarginTop();
                                int marginBottom = getMarginBottom();
                                setValue(Math.max(getValueMin(), Math.min(this.f46696c + (((getValueMax() - getValueMin()) * (-rawY)) / ((getHeight() - marginBottom) - marginTop)), getValueMax())));
                                this.f46694a.E2(this.f46696c);
                            } else {
                                this.f46695b.scrollTo(0, this.f46695b.getRealScrollY() - rawY);
                                setValue(this.f46695b.getValueFromScroll());
                                this.f46694a.E2(this.f46696c);
                            }
                        }
                    }
                    this.f46704k = motionEvent.getRawY();
                }
            } else {
                this.f46706m = false;
                this.f46704k = 0.0f;
                this.f46694a.getClass();
            }
        } else {
            this.f46708o.clear();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setListener(com.withings.views.view.SetValueView.a r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L3
            goto L8
        L3:
            com.withings.views.view.SetValueView$c r1 = new com.withings.views.view.SetValueView$c
            r1.<init>()
        L8:
            r0.f46694a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.views.view.SetValueView.setListener(com.withings.views.view.SetValueView$a):void");
    }

    public void setScaleHeight(int i11) {
        this.f46695b.setScaleHeight(i11);
        requestLayout();
    }

    public void setValue(float f11) {
        this.f46696c = f11;
        this.f46695b.setValue(f11);
        requestLayout();
    }

    public void setValueView(View view) {
        View view2 = this.f46697d;
        if (view2 != null) {
            removeView(view2);
        }
        this.f46697d = view;
        view.setOnTouchListener(new d());
        addView(view);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.withings.views.view.SetValueView$a] */
    public SetValueView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46694a = new Object();
        this.f46698e = new HashMap();
        j();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, com.withings.views.view.SetValueView$a] */
    public SetValueView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f46694a = new Object();
        this.f46698e = new HashMap();
        j();
    }

    /* loaded from: classes4.dex */
    private static class c implements a {
        @Override // com.withings.views.view.SetValueView.a
        public final void u() {
        }

        @Override // com.withings.views.view.SetValueView.a
        public final void E2(float f11) {
        }
    }
}
