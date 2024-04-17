package com.withings.design.view;

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
import androidx.core.view.u0;
import java.util.HashMap;
/* loaded from: classes3.dex */
public class SetValueView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private a f36376a;

    /* renamed from: b  reason: collision with root package name */
    protected SetValueBackground f36377b;

    /* renamed from: c  reason: collision with root package name */
    private float f36378c;

    /* renamed from: d  reason: collision with root package name */
    private View f36379d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f36380e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f36381f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f36382g;

    /* renamed from: h  reason: collision with root package name */
    private Scroller f36383h;

    /* renamed from: i  reason: collision with root package name */
    private float f36384i;

    /* renamed from: j  reason: collision with root package name */
    private float f36385j;

    /* renamed from: k  reason: collision with root package name */
    private float f36386k;

    /* renamed from: l  reason: collision with root package name */
    private float f36387l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f36388m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f36389n;

    /* renamed from: o  reason: collision with root package name */
    private VelocityTracker f36390o;

    /* renamed from: p  reason: collision with root package name */
    private GestureDetector f36391p;

    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a  reason: collision with root package name */
        boolean f36392a;

        /* renamed from: b  reason: collision with root package name */
        float f36393b;

        /* loaded from: classes3.dex */
        final class a implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, com.withings.design.view.SetValueView$SavedState] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                boolean z5;
                ?? baseSavedState = new View.BaseSavedState(parcel);
                if (parcel.readInt() != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                baseSavedState.f36392a = z5;
                baseSavedState.f36393b = parcel.readFloat();
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
            parcel.writeInt(this.f36392a ? 1 : 0);
            parcel.writeFloat(this.f36393b);
        }
    }

    /* loaded from: classes3.dex */
    public interface a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            SetValueView setValueView = SetValueView.this;
            setValueView.f36390o.computeCurrentVelocity(1000);
            SetValueView.c(setValueView, (int) (-setValueView.f36390o.getYVelocity()));
            return true;
        }
    }

    /* loaded from: classes3.dex */
    private static class c implements a {
    }

    /* loaded from: classes3.dex */
    private class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                SetValueView.this.f36382g = true;
                return false;
            }
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.design.view.SetValueView$a, java.lang.Object] */
    public SetValueView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36376a = new Object();
        this.f36380e = new HashMap();
        f();
    }

    static void c(SetValueView setValueView, int i11) {
        setValueView.f36389n = true;
        setValueView.f36383h.abortAnimation();
        if (setValueView.f36382g) {
            i11 = (int) (((-i11) * setValueView.f36377b.getScrollMax()) / ((setValueView.getHeight() - setValueView.getMarginTop()) - setValueView.getMarginBottom()));
        }
        setValueView.f36383h.fling(0, setValueView.f36377b.getScrollY(), 0, i11, 0, 0, 0, setValueView.f36377b.getScrollMax());
        u0.T(setValueView);
    }

    private void f() {
        SetValueBackground setValueBackground = new SetValueBackground(getContext());
        this.f36377b = setValueBackground;
        addView(setValueBackground);
        this.f36383h = new Scroller(getContext());
        this.f36387l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f36390o = VelocityTracker.obtain();
        this.f36391p = new GestureDetector(getContext(), new b());
    }

    private void setStartViewVisibility(int i11) {
        for (View view : this.f36380e.keySet()) {
            view.setVisibility(i11);
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        boolean computeScrollOffset = this.f36383h.computeScrollOffset();
        this.f36389n = computeScrollOffset;
        if (computeScrollOffset) {
            this.f36377b.scrollTo(0, this.f36383h.getCurrY());
            setValue(this.f36377b.getValueFromScroll());
            this.f36376a.getClass();
        }
    }

    public final int e(float f11) {
        int marginTop = getMarginTop();
        int marginBottom = getMarginBottom();
        float valueMax = getValueMax();
        return (int) ((((valueMax - f11) * ((getMeasuredHeight() - marginBottom) - marginTop)) / (valueMax - getValueMin())) + marginTop);
    }

    public int getMarginBottom() {
        return this.f36377b.getMarginBottom();
    }

    public int getMarginTop() {
        return this.f36377b.getMarginTop();
    }

    public float getValue() {
        return this.f36378c;
    }

    public float getValueMax() {
        return this.f36377b.getValueMax();
    }

    public float getValueMin() {
        return this.f36377b.getValueMin();
    }

    public View getValueView() {
        return this.f36379d;
    }

    public int getYForValue() {
        return e(this.f36378c);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float rawX = motionEvent.getRawX() - this.f36384i;
                float rawY = motionEvent.getRawY() - this.f36385j;
                if (Math.abs(rawX) < Math.abs(rawY) && Math.abs(rawY) > this.f36387l) {
                    this.f36384i = motionEvent.getRawX();
                    this.f36385j = motionEvent.getRawY();
                    this.f36388m = true;
                    this.f36376a.getClass();
                    if (!this.f36381f) {
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                        alphaAnimation.setDuration(200L);
                        alphaAnimation.setStartOffset(0L);
                        alphaAnimation.setAnimationListener(new h(this));
                        for (View view : this.f36380e.keySet()) {
                            if (view.getAnimation() != null) {
                                view.getAnimation().setAnimationListener(null);
                                view.getAnimation().cancel();
                            }
                            view.startAnimation(alphaAnimation);
                        }
                        this.f36377b.e();
                        this.f36377b.f();
                        this.f36381f = true;
                    }
                }
            }
        } else {
            this.f36384i = motionEvent.getRawX();
            this.f36385j = motionEvent.getRawY();
            this.f36382g = false;
            this.f36383h.forceFinished(true);
            u0.T(this);
        }
        if (this.f36388m) {
            motionEvent.setAction(1);
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                getChildAt(i11).onTouchEvent(motionEvent);
            }
        }
        return this.f36388m;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
        this.f36377b.layout(i11, i12, i13, i14);
        int measuredWidth = this.f36379d.getMeasuredWidth();
        int measuredHeight = this.f36379d.getMeasuredHeight();
        int measuredWidth2 = getMeasuredWidth() / 2;
        int yForValue = getYForValue();
        int i15 = measuredWidth / 2;
        int i16 = measuredHeight / 2;
        this.f36379d.layout(measuredWidth2 - i15, yForValue - i16, measuredWidth2 + i15, yForValue + i16);
        if (!this.f36381f) {
            HashMap hashMap = this.f36380e;
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
                    int e11 = e(floatValue);
                    int i26 = measuredWidth5 / 2;
                    int i27 = measuredWidth6 - i26;
                    int i28 = measuredWidth6 + i26;
                    int i29 = measuredHeight4 / 2;
                    int i31 = e11 - i29;
                    int i32 = e11 + i29;
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        int i33 = marginLayoutParams2.leftMargin;
                        if (i33 != 0) {
                            i28 = i33 + measuredWidth5;
                            i27 = i33;
                        } else if (marginLayoutParams2.rightMargin != 0) {
                            i28 = getMeasuredWidth() - marginLayoutParams2.rightMargin;
                            i27 = i28 - measuredWidth5;
                        }
                        int i34 = marginLayoutParams2.topMargin;
                        if (i34 != 0) {
                            i32 = i34 + measuredHeight4;
                            i31 = i34;
                        } else if (marginLayoutParams2.bottomMargin != 0) {
                            i32 = getMeasuredHeight() - marginLayoutParams2.bottomMargin;
                            i31 = i32 - measuredHeight4;
                        }
                    }
                    view.layout(i27, i31, i28, i32);
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
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
            this.f36381f = savedState.f36392a;
            this.f36378c = savedState.f36393b;
        } else {
            super.onRestoreInstanceState(parcelable);
        }
        int i13 = 0;
        if (this.f36381f) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        setStartViewVisibility(i11);
        SetValueBackground setValueBackground = this.f36377b;
        if (this.f36381f) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        setValueBackground.setPrimaryScaleViewsVisibility(i12);
        SetValueBackground setValueBackground2 = this.f36377b;
        if (!this.f36381f) {
            i13 = 8;
        }
        setValueBackground2.setSecondaryScaleViewsVisibility(i13);
        setValue(this.f36378c);
        this.f36376a.getClass();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, com.withings.design.view.SetValueView$SavedState] */
    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f36392a = this.f36381f;
        baseSavedState.f36393b = this.f36378c;
        return baseSavedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f36391p.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
                    this.f36390o.addMovement(motionEvent);
                    this.f36389n = false;
                    if (this.f36386k > 0.0f) {
                        int rawY = (int) (motionEvent.getRawY() - this.f36386k);
                        if (!this.f36389n) {
                            this.f36383h.abortAnimation();
                            if (this.f36382g) {
                                int marginTop = getMarginTop();
                                int marginBottom = getMarginBottom();
                                setValue(Math.max(getValueMin(), Math.min(this.f36378c + (((getValueMax() - getValueMin()) * (-rawY)) / ((getHeight() - marginBottom) - marginTop)), getValueMax())));
                                this.f36376a.getClass();
                            } else {
                                this.f36377b.scrollTo(0, this.f36377b.getRealScrollY() - rawY);
                                setValue(this.f36377b.getValueFromScroll());
                                this.f36376a.getClass();
                            }
                        }
                    }
                    this.f36386k = motionEvent.getRawY();
                }
            } else {
                this.f36388m = false;
                this.f36386k = 0.0f;
                this.f36376a.getClass();
            }
        } else {
            this.f36390o.clear();
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
    public void setListener(com.withings.design.view.SetValueView.a r1) {
        /*
            r0 = this;
            if (r1 == 0) goto L3
            goto L8
        L3:
            com.withings.design.view.SetValueView$c r1 = new com.withings.design.view.SetValueView$c
            r1.<init>()
        L8:
            r0.f36376a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.design.view.SetValueView.setListener(com.withings.design.view.SetValueView$a):void");
    }

    public void setScaleHeight(int i11) {
        this.f36377b.setScaleHeight(i11);
        requestLayout();
    }

    public void setValue(float f11) {
        this.f36378c = f11;
        this.f36377b.setValue(f11);
        requestLayout();
    }

    public void setValueView(View view) {
        View view2 = this.f36379d;
        if (view2 != null) {
            removeView(view2);
        }
        this.f36379d = view;
        view.setOnTouchListener(new d());
        addView(view);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.design.view.SetValueView$a, java.lang.Object] */
    public SetValueView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36376a = new Object();
        this.f36380e = new HashMap();
        f();
    }
}
