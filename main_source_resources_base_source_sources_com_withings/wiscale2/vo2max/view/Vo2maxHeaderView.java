package com.withings.wiscale2.vo2max.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.withings.views.view.HorizontalScaleView;
import com.withings.vo2max.core.Vo2MaxStatus;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import m80.a;
/* compiled from: Vo2maxHeader.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/vo2max/view/Vo2maxHeaderView;", "", "", "progress", "Lnm0/y;", "setAnimateVo2maxValue", "(I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Vo2maxHeaderView {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.d0 f62672a;

    /* renamed from: b  reason: collision with root package name */
    private final View f62673b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f62674c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f62675d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f62676e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f62677f;

    /* renamed from: g  reason: collision with root package name */
    private String f62678g;

    /* compiled from: Vo2maxHeader.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<a.d, nm0.y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(a.d dVar) {
            a.d it = dVar;
            kotlin.jvm.internal.u.j(it, "it");
            Vo2maxHeaderView vo2maxHeaderView = Vo2maxHeaderView.this;
            Context context = vo2maxHeaderView.f62673b.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            Vo2maxHeaderView.b(vo2maxHeaderView, context, it);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Vo2maxHeader.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            Vo2maxHeaderView.e(Vo2maxHeaderView.this, num.intValue());
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Vo2maxHeader.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Vo2MaxStatus, nm0.y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Vo2MaxStatus vo2MaxStatus) {
            Vo2MaxStatus it = vo2MaxStatus;
            kotlin.jvm.internal.u.j(it, "it");
            Vo2maxHeaderView vo2maxHeaderView = Vo2maxHeaderView.this;
            Context context = vo2maxHeaderView.f62673b.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            Vo2maxHeaderView.d(vo2maxHeaderView, context, it);
            return nm0.y.f85009a;
        }
    }

    public Vo2maxHeaderView(View view, androidx.lifecycle.d0 lifeCycleOwner) {
        kotlin.jvm.internal.u.j(lifeCycleOwner, "lifeCycleOwner");
        kotlin.jvm.internal.u.j(view, "view");
        this.f62672a = lifeCycleOwner;
        this.f62673b = view;
        this.f62674c = nm0.h.b(new t1(this));
        this.f62675d = nm0.h.b(new r1(this));
        this.f62676e = nm0.h.b(new u1(this));
        this.f62677f = nm0.h.b(new v1(this));
    }

    public static final void b(Vo2maxHeaderView vo2maxHeaderView, Context context, a.d dVar) {
        vo2maxHeaderView.getClass();
        HorizontalScaleView.e eVar = new HorizontalScaleView.e(dVar.h() * 10, kotlin.collections.x.q(new HorizontalScaleView.f("", (dVar.g() - dVar.h()) * 10, androidx.core.content.a.getColor(context, C1987R.color.datavizMonochromaticNeutral1)), new HorizontalScaleView.f("", (dVar.b() - dVar.g()) * 10, androidx.core.content.a.getColor(context, C1987R.color.datavizMonochromaticNeutral2)), new HorizontalScaleView.f("", (dVar.c() - dVar.b()) * 10, androidx.core.content.a.getColor(context, C1987R.color.datavizMonochromaticNeutral3)), new HorizontalScaleView.f("", (dVar.d() - dVar.c()) * 10, androidx.core.content.a.getColor(context, C1987R.color.statusGood))));
        Object value = vo2maxHeaderView.f62677f.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        HorizontalScaleView horizontalScaleView = (HorizontalScaleView) value;
        horizontalScaleView.setScale(eVar);
        horizontalScaleView.setSecondaryScale(eVar);
        horizontalScaleView.setDelegate(new a1.s(7));
        horizontalScaleView.setSecondaryDelegate(new a1.t(6));
        horizontalScaleView.n();
    }

    public static final void c(Vo2maxHeaderView vo2maxHeaderView) {
        Object value = vo2maxHeaderView.f62675d.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        TextView textView = (TextView) value;
        String str = vo2maxHeaderView.f62678g;
        if (str != null) {
            textView.setText(str);
        } else {
            kotlin.jvm.internal.u.s("statusLabel");
            throw null;
        }
    }

    public static final void d(Vo2maxHeaderView vo2maxHeaderView, Context context, Vo2MaxStatus vo2MaxStatus) {
        Object value = vo2maxHeaderView.f62676e.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((ImageView) value).setBackground(n80.a.a(context, vo2MaxStatus));
        int color = androidx.core.content.a.getColor(context, androidx.health.connect.client.units.d.b(n80.a.b(vo2MaxStatus)));
        Object value2 = vo2maxHeaderView.f62674c.getValue();
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        ((TextView) value2).setTextColor(color);
        Object value3 = vo2maxHeaderView.f62675d.getValue();
        kotlin.jvm.internal.u.i(value3, "getValue(...)");
        ((TextView) value3).setTextColor(color);
        String string = context.getString(n80.a.c(vo2MaxStatus));
        kotlin.jvm.internal.u.i(string, "getString(...)");
        vo2maxHeaderView.f62678g = string;
    }

    public static final void e(Vo2maxHeaderView vo2maxHeaderView, int i11) {
        Object value = vo2maxHeaderView.f62677f.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((HorizontalScaleView) value).a(1250L, i11 * 10);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(vo2maxHeaderView, "animateVo2maxValue", 0, i11);
        ofInt.setDuration(1250L);
        ofInt.addListener(new s1(vo2maxHeaderView));
        ofInt.start();
    }

    private final void setAnimateVo2maxValue(int i11) {
        Object value = this.f62674c.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((TextView) value).setText(String.valueOf(i11));
    }

    public final void f(w1 w1Var) {
        xw.m<a.d> f02 = w1Var.f0();
        a aVar = new a();
        androidx.lifecycle.d0 d0Var = this.f62672a;
        xw.d.c(d0Var, f02, aVar);
        xw.d.c(d0Var, w1Var.i0(), new b());
        xw.d.c(d0Var, w1Var.g0(), new c());
    }
}
