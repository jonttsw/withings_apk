package com.withings.design.view.swiperecycler;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes3.dex */
public class SwipeRecyclerView extends RecyclerView {

    /* renamed from: i1  reason: collision with root package name */
    private int f36466i1;

    /* renamed from: j1  reason: collision with root package name */
    private float f36467j1;

    /* renamed from: k1  reason: collision with root package name */
    private float f36468k1;

    /* renamed from: l1  reason: collision with root package name */
    private int f36469l1;

    /* renamed from: m1  reason: collision with root package name */
    int f36470m1;

    /* renamed from: n1  reason: collision with root package name */
    int f36471n1;

    /* renamed from: o1  reason: collision with root package name */
    private com.withings.design.view.swiperecycler.a f36472o1;

    /* loaded from: classes3.dex */
    final class a extends RecyclerView.f {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void a() {
            SwipeRecyclerView.this.f36472o1.g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void b() {
            SwipeRecyclerView.this.f36472o1.g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void d(int i11, int i12) {
            SwipeRecyclerView.this.f36472o1.g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void e(int i11, int i12) {
            SwipeRecyclerView.this.f36472o1.g();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.f
        public final void f(int i11, int i12) {
            SwipeRecyclerView.this.f36472o1.g();
        }
    }

    public SwipeRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36466i1 = 0;
        this.f36470m1 = 0;
        this.f36471n1 = 0;
        F0(attributeSet);
    }

    private void F0(AttributeSet attributeSet) {
        float f11;
        int i11 = 1;
        float f12 = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72613o);
            int i12 = obtainStyledAttributes.getInt(2, 1);
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
            this.f36470m1 = obtainStyledAttributes.getResourceId(1, 0);
            this.f36471n1 = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            f11 = dimension2;
            i11 = i12;
            f12 = dimension;
        } else {
            f11 = 0.0f;
        }
        if (this.f36470m1 == 0 || this.f36471n1 == 0) {
            this.f36470m1 = getContext().getResources().getIdentifier("swipelist_frontview", "id", getContext().getPackageName());
            int identifier = getContext().getResources().getIdentifier("swipelist_backview", "id", getContext().getPackageName());
            this.f36471n1 = identifier;
            if (this.f36470m1 == 0 || identifier == 0) {
                throw new RuntimeException("You forgot the attributes swipeFrontView or swipeBackView. You can add this attributes or use 'swipelist_frontview' and 'swipelist_backview' identifiers");
            }
        }
        this.f36469l1 = ViewConfiguration.get(getContext()).getScaledPagingTouchSlop();
        com.withings.design.view.swiperecycler.a aVar = new com.withings.design.view.swiperecycler.a(this, this.f36470m1, this.f36471n1);
        this.f36472o1 = aVar;
        aVar.j(f11);
        this.f36472o1.i(f12);
        this.f36472o1.k(i11);
        setOnTouchListener(this.f36472o1);
    }

    public final void G0() {
        this.f36466i1 = 0;
    }

    public com.withings.design.view.swiperecycler.a getTouchListener() {
        return this.f36472o1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        boolean z11;
        int actionMasked = motionEvent.getActionMasked();
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        if (isEnabled() && this.f36472o1.f()) {
            if (this.f36466i1 == 1) {
                return this.f36472o1.onTouch(this, motionEvent);
            }
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            this.f36466i1 = 0;
                        }
                    } else {
                        int abs = (int) Math.abs(x11 - this.f36467j1);
                        int abs2 = (int) Math.abs(y11 - this.f36468k1);
                        int i11 = this.f36469l1;
                        if (abs > i11) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (abs2 > i11) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z5) {
                            this.f36466i1 = 1;
                            this.f36467j1 = x11;
                            this.f36468k1 = y11;
                        }
                        if (z11) {
                            this.f36466i1 = 2;
                            this.f36467j1 = x11;
                            this.f36468k1 = y11;
                        }
                        if (this.f36466i1 == 2) {
                            return true;
                        }
                        return false;
                    }
                } else {
                    this.f36472o1.onTouch(this, motionEvent);
                    if (this.f36466i1 == 2) {
                        return true;
                    }
                    return false;
                }
            } else {
                super.onInterceptTouchEvent(motionEvent);
                this.f36472o1.onTouch(this, motionEvent);
                this.f36466i1 = 0;
                this.f36467j1 = x11;
                this.f36468k1 = y11;
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        super.setAdapter(adapter);
        this.f36472o1.g();
        adapter.registerAdapterDataObserver(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.l lVar) {
        super.setLayoutManager(lVar);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) lVar;
        com.withings.design.view.swiperecycler.a aVar = this.f36472o1;
        if (aVar != null) {
            aVar.h(linearLayoutManager);
        }
    }

    public void setOffsetLeft(float f11) {
        this.f36472o1.i(f11);
    }

    public void setOffsetRight(float f11) {
        this.f36472o1.j(f11);
    }

    public void setSwipeMode(int i11) {
        this.f36472o1.k(i11);
    }

    public SwipeRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f36466i1 = 0;
        this.f36470m1 = 0;
        this.f36471n1 = 0;
        F0(attributeSet);
    }
}
