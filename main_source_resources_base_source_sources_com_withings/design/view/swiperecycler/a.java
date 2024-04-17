package com.withings.design.view.swiperecycler;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.i1;
import androidx.core.view.u0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: SwipeRecyclerTouchListener.java */
@TargetApi(11)
/* loaded from: classes3.dex */
public final class a implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    private int f36475b;

    /* renamed from: c  reason: collision with root package name */
    private int f36476c;

    /* renamed from: e  reason: collision with root package name */
    private int f36478e;

    /* renamed from: f  reason: collision with root package name */
    private int f36479f;

    /* renamed from: g  reason: collision with root package name */
    private int f36480g;

    /* renamed from: h  reason: collision with root package name */
    private long f36481h;

    /* renamed from: k  reason: collision with root package name */
    private LinearLayoutManager f36484k;

    /* renamed from: l  reason: collision with root package name */
    private SwipeRecyclerView f36485l;

    /* renamed from: n  reason: collision with root package name */
    private float f36487n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f36488o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f36489p;

    /* renamed from: q  reason: collision with root package name */
    private VelocityTracker f36490q;

    /* renamed from: r  reason: collision with root package name */
    public int f36491r;

    /* renamed from: s  reason: collision with root package name */
    private View f36492s;

    /* renamed from: t  reason: collision with root package name */
    private View f36493t;

    /* renamed from: u  reason: collision with root package name */
    private int f36494u;

    /* renamed from: v  reason: collision with root package name */
    private ArrayList f36495v;

    /* renamed from: w  reason: collision with root package name */
    private ArrayList f36496w;

    /* renamed from: x  reason: collision with root package name */
    private ArrayList f36497x;

    /* renamed from: a  reason: collision with root package name */
    private int f36474a = 1;

    /* renamed from: d  reason: collision with root package name */
    private Rect f36477d = new Rect();

    /* renamed from: i  reason: collision with root package name */
    private float f36482i = 0.0f;

    /* renamed from: j  reason: collision with root package name */
    private float f36483j = 0.0f;

    /* renamed from: m  reason: collision with root package name */
    private int f36486m = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SwipeRecyclerTouchListener.java */
    /* renamed from: com.withings.design.view.swiperecycler.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class RunnableC0479a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f36498a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f36499b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f36500c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f36501d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f36502e;

        RunnableC0479a(View view, boolean z5, boolean z11, int i11, boolean z12) {
            this.f36498a = view;
            this.f36499b = z5;
            this.f36500c = z11;
            this.f36501d = i11;
            this.f36502e = z12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            View findViewById = ((ViewGroup) this.f36498a.getParent()).findViewById(aVar.f36476c);
            boolean z5 = this.f36499b;
            if (findViewById != null && !z5) {
                findViewById.setVisibility(8);
            }
            aVar.f36485l.G0();
            if (this.f36500c) {
                ArrayList arrayList = aVar.f36495v;
                Boolean valueOf = Boolean.valueOf(z5);
                int i11 = this.f36501d;
                arrayList.set(i11, valueOf);
                if (z5) {
                    aVar.f36496w.set(i11, Boolean.valueOf(this.f36502e));
                }
            }
        }
    }

    /* compiled from: SwipeRecyclerTouchListener.java */
    /* loaded from: classes3.dex */
    public interface b {
        boolean a();
    }

    public a(SwipeRecyclerView swipeRecyclerView, int i11, int i12) {
        this.f36475b = 0;
        this.f36476c = 0;
        new ArrayList();
        this.f36494u = -1;
        this.f36495v = new ArrayList();
        this.f36496w = new ArrayList();
        this.f36497x = new ArrayList();
        this.f36475b = i11;
        this.f36476c = i12;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(swipeRecyclerView.getContext());
        this.f36478e = viewConfiguration.getScaledTouchSlop();
        this.f36479f = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f36480g = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f36481h = swipeRecyclerView.getContext().getResources().getInteger(17694720);
        this.f36485l = swipeRecyclerView;
    }

    private void e(View view, boolean z5, boolean z11, int i11) {
        float f11;
        float f12;
        float f13;
        float f14;
        int i12;
        float f15;
        ArrayList arrayList = this.f36495v;
        boolean booleanValue = ((Boolean) arrayList.get(i11)).booleanValue();
        ArrayList arrayList2 = this.f36496w;
        if (booleanValue) {
            if (!z5) {
                if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                    f13 = this.f36486m;
                    f14 = this.f36483j;
                    f15 = f13 - f14;
                    i12 = (int) f15;
                } else {
                    f11 = -this.f36486m;
                    f12 = this.f36482i;
                    f15 = f11 + f12;
                    i12 = (int) f15;
                }
            }
            i12 = 0;
        } else {
            if (z5) {
                int i13 = this.f36486m;
                if (z11) {
                    f13 = i13;
                    f14 = this.f36483j;
                    f15 = f13 - f14;
                    i12 = (int) f15;
                } else {
                    f11 = -i13;
                    f12 = this.f36482i;
                    f15 = f11 + f12;
                    i12 = (int) f15;
                }
            }
            i12 = 0;
        }
        boolean z12 = !((Boolean) arrayList.get(i11)).booleanValue();
        if (z5) {
            arrayList.set(i11, Boolean.valueOf(z12));
            arrayList2.set(i11, Boolean.valueOf(z11));
        }
        i1 b10 = u0.b(view);
        b10.l(i12);
        b10.f(this.f36481h);
        b10.g(new DecelerateInterpolator());
        b10.n(new RunnableC0479a(view, z12, z5, i11, z11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean f() {
        if (this.f36474a != 0) {
            return true;
        }
        return false;
    }

    public final void g() {
        SwipeRecyclerView swipeRecyclerView = this.f36485l;
        if (swipeRecyclerView.getAdapter() != null) {
            int itemCount = swipeRecyclerView.getAdapter().getItemCount();
            ArrayList arrayList = this.f36495v;
            for (int size = arrayList.size(); size <= itemCount; size++) {
                Boolean bool = Boolean.FALSE;
                arrayList.add(bool);
                this.f36496w.add(bool);
                this.f36497x.add(bool);
            }
        }
    }

    public final void h(LinearLayoutManager linearLayoutManager) {
        this.f36484k = linearLayoutManager;
    }

    public final void i(float f11) {
        this.f36482i = f11;
    }

    public final void j(float f11) {
        this.f36483j = f11;
    }

    public final void k(int i11) {
        this.f36474a = i11;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z5;
        boolean z11;
        boolean z12;
        View childAt;
        VelocityTracker velocityTracker;
        int i11;
        int i12;
        boolean z13;
        boolean z14;
        float f11;
        float f12;
        boolean z15;
        if (!f()) {
            return false;
        }
        int i13 = this.f36486m;
        SwipeRecyclerView swipeRecyclerView = this.f36485l;
        if (i13 < 2) {
            this.f36486m = swipeRecyclerView.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        int i14 = this.f36475b;
        ArrayList arrayList = this.f36495v;
        if (actionMasked != 0) {
            ArrayList arrayList2 = this.f36496w;
            if (actionMasked != 1) {
                if (actionMasked == 2 && (velocityTracker = this.f36490q) != null && this.f36491r != -1) {
                    velocityTracker.addMovement(motionEvent);
                    this.f36490q.computeCurrentVelocity(1000);
                    float abs = Math.abs(this.f36490q.getXVelocity());
                    float abs2 = Math.abs(this.f36490q.getYVelocity());
                    float rawX = motionEvent.getRawX() - this.f36487n;
                    float abs3 = Math.abs(rawX);
                    int i15 = this.f36474a;
                    if (i15 == 0 || (i15 != 1 && (!((Boolean) arrayList.get(this.f36491r)).booleanValue() ? !((i15 != 3 || rawX <= 0.0f) && (i15 != 2 || rawX >= 0.0f)) : !((i15 != 3 || rawX >= 0.0f) && (i15 != 2 || rawX <= 0.0f))))) {
                        abs3 = 0.0f;
                    }
                    if (abs3 > this.f36478e && this.f36494u == -1 && abs2 < abs) {
                        this.f36488o = true;
                        if (rawX > 0.0f) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        this.f36489p = z15;
                        this.f36494u = 0;
                        swipeRecyclerView.requestDisallowInterceptTouchEvent(true);
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        obtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        swipeRecyclerView.onTouchEvent(obtain);
                    }
                    if (this.f36488o && (i11 = this.f36491r) != -1) {
                        if (((Boolean) arrayList.get(i11)).booleanValue()) {
                            if (((Boolean) arrayList2.get(this.f36491r)).booleanValue()) {
                                f12 = this.f36486m - this.f36483j;
                            } else {
                                f12 = (-this.f36486m) + this.f36482i;
                            }
                            rawX += f12;
                        }
                        View view2 = this.f36492s;
                        int i16 = u0.f12689g;
                        float x11 = view2.getX();
                        if (((Boolean) arrayList.get(this.f36491r)).booleanValue()) {
                            if (((Boolean) arrayList2.get(this.f36491r)).booleanValue()) {
                                f11 = (-this.f36486m) + this.f36483j;
                            } else {
                                f11 = this.f36486m - this.f36482i;
                            }
                            x11 += f11;
                        }
                        if (x11 > 0.0f && !(z14 = this.f36489p)) {
                            this.f36489p = !z14;
                            i12 = 0;
                            this.f36494u = 0;
                            this.f36493t.setVisibility(0);
                        } else {
                            i12 = 0;
                        }
                        if (x11 < 0.0f && (z13 = this.f36489p)) {
                            this.f36489p = !z13;
                            this.f36494u = i12;
                            this.f36493t.setVisibility(i12);
                        }
                        this.f36492s.setTranslationX(rawX);
                        return true;
                    }
                }
            } else if (this.f36490q != null && this.f36488o && this.f36491r != -1) {
                float rawX2 = motionEvent.getRawX() - this.f36487n;
                this.f36490q.addMovement(motionEvent);
                this.f36490q.computeCurrentVelocity(1000);
                float abs4 = Math.abs(this.f36490q.getXVelocity());
                if (!((Boolean) arrayList.get(this.f36491r)).booleanValue()) {
                    if (this.f36474a == 3 && this.f36490q.getXVelocity() > 0.0f) {
                        abs4 = 0.0f;
                    }
                    if (this.f36474a == 2 && this.f36490q.getXVelocity() < 0.0f) {
                        abs4 = 0.0f;
                    }
                }
                float abs5 = Math.abs(this.f36490q.getYVelocity());
                if (this.f36479f <= abs4 && abs4 <= this.f36480g && abs5 * 2.0f < abs4) {
                    if (this.f36490q.getXVelocity() > 0.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((((Boolean) arrayList.get(this.f36491r)).booleanValue() && ((Boolean) arrayList2.get(this.f36491r)).booleanValue() && z12) || (((Boolean) arrayList.get(this.f36491r)).booleanValue() && !((Boolean) arrayList2.get(this.f36491r)).booleanValue() && !z12)) {
                        z11 = z12;
                        z5 = false;
                        e(this.f36492s, z5, z11, this.f36491r);
                        this.f36490q.recycle();
                        this.f36490q = null;
                        this.f36487n = 0.0f;
                        this.f36488o = false;
                    }
                    z11 = z12;
                    z5 = true;
                    e(this.f36492s, z5, z11, this.f36491r);
                    this.f36490q.recycle();
                    this.f36490q = null;
                    this.f36487n = 0.0f;
                    this.f36488o = false;
                } else if (Math.abs(rawX2) > this.f36486m / 2) {
                    if (rawX2 > 0.0f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z11 = z12;
                    z5 = true;
                    e(this.f36492s, z5, z11, this.f36491r);
                    this.f36490q.recycle();
                    this.f36490q = null;
                    this.f36487n = 0.0f;
                    this.f36488o = false;
                } else {
                    z5 = false;
                    z11 = false;
                    e(this.f36492s, z5, z11, this.f36491r);
                    this.f36490q.recycle();
                    this.f36490q = null;
                    this.f36487n = 0.0f;
                    this.f36488o = false;
                }
            }
            if (arrayList != null && this.f36491r != -1) {
                int j12 = this.f36484k.j1() - 2;
                int k12 = this.f36484k.k1() + 2;
                if (j12 < 0) {
                    j12 = 0;
                }
                if (k12 > swipeRecyclerView.getAdapter().getItemCount()) {
                    k12 = swipeRecyclerView.getAdapter().getItemCount() - 2;
                }
                for (int i17 = j12; i17 < k12; i17++) {
                    if (((Boolean) arrayList.get(i17)).booleanValue() && i17 != this.f36491r && (childAt = swipeRecyclerView.getChildAt(i17 - j12)) != null) {
                        View findViewById = childAt.findViewById(i14);
                        if (((Boolean) arrayList.get(i17)).booleanValue()) {
                            e(findViewById, true, false, i17);
                        }
                    }
                }
            }
            view.onTouchEvent(motionEvent);
            return true;
        }
        this.f36494u = -1;
        int childCount = swipeRecyclerView.getChildCount();
        int[] iArr = new int[2];
        swipeRecyclerView.getLocationOnScreen(iArr);
        int i18 = 0;
        int rawX3 = ((int) motionEvent.getRawX()) - iArr[0];
        int rawY = ((int) motionEvent.getRawY()) - iArr[1];
        while (true) {
            if (i18 >= childCount) {
                break;
            }
            View childAt2 = swipeRecyclerView.getChildAt(i18);
            Rect rect = this.f36477d;
            childAt2.getHitRect(rect);
            int S = RecyclerView.S(childAt2);
            RecyclerView.Adapter adapter = swipeRecyclerView.getAdapter();
            if ((adapter instanceof b) && S >= 0 && ((b) adapter).a() && rect.contains(rawX3, rawY)) {
                this.f36492s = childAt2.findViewById(i14);
                this.f36487n = motionEvent.getRawX();
                this.f36491r = S;
                this.f36492s.setClickable(!((Boolean) arrayList.get(S)).booleanValue());
                this.f36492s.setLongClickable(!((Boolean) arrayList.get(this.f36491r)).booleanValue());
                VelocityTracker obtain2 = VelocityTracker.obtain();
                this.f36490q = obtain2;
                obtain2.addMovement(motionEvent);
                int i19 = this.f36476c;
                if (i19 > 0) {
                    this.f36493t = childAt2.findViewById(i19);
                }
            } else {
                i18++;
            }
        }
        view.onTouchEvent(motionEvent);
        return true;
    }
}
