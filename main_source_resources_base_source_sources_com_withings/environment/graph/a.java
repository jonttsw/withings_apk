package com.withings.environment.graph;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.withings.views.view.BlockableViewPager;
import uq.b;
import uq.c;
/* compiled from: TouchGraphListener.java */
/* loaded from: classes3.dex */
public abstract class a extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    protected final TouchGraphPopupView f38952a;

    /* renamed from: b  reason: collision with root package name */
    protected final c f38953b;

    /* renamed from: c  reason: collision with root package name */
    private final b f38954c;

    /* renamed from: d  reason: collision with root package name */
    private final BlockableViewPager.b f38955d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f38956e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38957f = false;

    public a(CO2GraphPopupView cO2GraphPopupView, c cVar, b bVar, BlockableViewPager.b bVar2) {
        this.f38952a = cO2GraphPopupView;
        this.f38954c = bVar;
        this.f38953b = cVar;
        this.f38955d = bVar2;
    }

    protected abstract String a(rw.a aVar);

    public final void b() {
        this.f38957f = true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        super.onShowPress(motionEvent);
        this.f38956e = true;
        TouchGraphPopupView touchGraphPopupView = this.f38952a;
        touchGraphPopupView.setVisibility(0);
        BlockableViewPager.b bVar = this.f38955d;
        if (bVar != null) {
            bVar.Q1(false);
        }
        b bVar2 = this.f38954c;
        c cVar = this.f38953b;
        rw.a a11 = bVar2.a(motionEvent, cVar);
        if (a11 != null) {
            String a12 = a(a11);
            touchGraphPopupView.f38939b = (int) bVar2.b(cVar, a11);
            touchGraphPopupView.f38941d = a12;
            touchGraphPopupView.invalidate();
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        TouchGraphPopupView touchGraphPopupView = this.f38952a;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.f38956e) {
                    return false;
                }
                b bVar = this.f38954c;
                c cVar = this.f38953b;
                rw.a a11 = bVar.a(motionEvent, cVar);
                if (a11 != null) {
                    String a12 = a(a11);
                    touchGraphPopupView.f38939b = (int) bVar.b(cVar, a11);
                    touchGraphPopupView.f38941d = a12;
                    touchGraphPopupView.invalidate();
                }
                return true;
            }
            return this.f38957f;
        }
        this.f38956e = false;
        touchGraphPopupView.setVisibility(8);
        BlockableViewPager.b bVar2 = this.f38955d;
        if (bVar2 != null) {
            bVar2.Q1(true);
        }
        return false;
    }
}
