package com.withings.views.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import androidx.core.view.u0;
/* loaded from: classes4.dex */
public class CustomScrollViewGroup extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private b f46538a;

    /* renamed from: b  reason: collision with root package name */
    private Scroller f46539b;

    /* renamed from: c  reason: collision with root package name */
    private float f46540c;

    /* renamed from: d  reason: collision with root package name */
    private float f46541d;

    /* renamed from: e  reason: collision with root package name */
    private float f46542e;

    /* renamed from: f  reason: collision with root package name */
    private float f46543f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f46544g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f46545h;

    /* renamed from: i  reason: collision with root package name */
    private VelocityTracker f46546i;

    /* renamed from: j  reason: collision with root package name */
    private GestureDetector f46547j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            CustomScrollViewGroup.b(CustomScrollViewGroup.this);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
            CustomScrollViewGroup customScrollViewGroup = CustomScrollViewGroup.this;
            customScrollViewGroup.f46546i.computeCurrentVelocity(1000);
            CustomScrollViewGroup.c(customScrollViewGroup, (int) (-customScrollViewGroup.f46546i.getYVelocity()));
            return true;
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        int getMaxScrollY();

        int getScrollY();

        void scrollTo(int i11);
    }

    public CustomScrollViewGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    static void b(CustomScrollViewGroup customScrollViewGroup) {
        customScrollViewGroup.f46539b.forceFinished(true);
        u0.T(customScrollViewGroup);
    }

    static void c(CustomScrollViewGroup customScrollViewGroup, int i11) {
        customScrollViewGroup.f46545h = true;
        customScrollViewGroup.f46539b.abortAnimation();
        customScrollViewGroup.f46539b.fling(0, customScrollViewGroup.f46538a.getScrollY(), 0, i11, 0, 0, 0, customScrollViewGroup.f46538a.getMaxScrollY());
        u0.T(customScrollViewGroup);
    }

    private void d() {
        this.f46539b = new Scroller(getContext());
        this.f46543f = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f46546i = VelocityTracker.obtain();
        this.f46547j = new GestureDetector(getContext(), new a());
    }

    @Override // android.view.View
    public final void computeScroll() {
        boolean computeScrollOffset = this.f46539b.computeScrollOffset();
        this.f46545h = computeScrollOffset;
        if (computeScrollOffset) {
            this.f46538a.scrollTo(this.f46539b.getCurrY());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                float abs = Math.abs(motionEvent.getRawX() - this.f46540c);
                float abs2 = Math.abs(motionEvent.getRawY() - this.f46541d);
                if (abs > abs2) {
                    this.f46544g = false;
                    return false;
                } else if (abs2 > this.f46543f) {
                    this.f46540c = motionEvent.getRawX();
                    this.f46541d = motionEvent.getRawY();
                    this.f46544g = true;
                }
            }
        } else {
            this.f46540c = motionEvent.getRawX();
            this.f46541d = motionEvent.getRawY();
        }
        if (this.f46544g) {
            motionEvent.setAction(1);
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                getChildAt(i11).onTouchEvent(motionEvent);
            }
        }
        return this.f46544g;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f46547j.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    motionEvent.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
                    this.f46546i.addMovement(motionEvent);
                    this.f46545h = false;
                    if (this.f46542e > 0.0f) {
                        int rawY = (int) (motionEvent.getRawY() - this.f46542e);
                        if (!this.f46545h) {
                            this.f46539b.abortAnimation();
                            b bVar = this.f46538a;
                            bVar.scrollTo(bVar.getScrollY() - rawY);
                        }
                    }
                    this.f46542e = motionEvent.getRawY();
                }
            } else {
                this.f46544g = false;
                this.f46542e = 0.0f;
            }
        } else {
            this.f46546i.clear();
        }
        return true;
    }

    public void setDelegate(b bVar) {
        this.f46538a = bVar;
    }

    public CustomScrollViewGroup(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        d();
    }
}
