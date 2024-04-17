package com.withings.wiscale2.vo2max.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.transition.AutoTransition;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import kotlin.Metadata;
import m80.a;
import org.joda.time.DateTime;
import org.joda.time.Years;
/* compiled from: Vo2MaxComparison.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/withings/wiscale2/vo2max/view/Vo2MaxComparisonView;", "", "", "progress", "Lnm0/y;", "setAnimateSelfValue", "(I)V", "setAnimateOtherValue", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Vo2MaxComparisonView {

    /* renamed from: u  reason: collision with root package name */
    private static final ArrayList<Integer> f62629u = kotlin.collections.x.q(2131232809, 2131232811, 2131232813, 2131232815, 2131232817, 2131232808, 2131232806, 2131232807);

    /* renamed from: v  reason: collision with root package name */
    private static final ArrayList<Integer> f62630v = kotlin.collections.x.q(2131232810, 2131232812, 2131232814, 2131232816, 2131232818, 2131232808, 2131232806, 2131232807);

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.d0 f62631a;

    /* renamed from: b  reason: collision with root package name */
    private final View f62632b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f62633c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f62634d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f62635e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f62636f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f62637g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f62638h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f62639i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f62640j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f62641k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f62642l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f62643m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f62644n;

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f62645o;

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f62646p;

    /* renamed from: q  reason: collision with root package name */
    private final nm0.g f62647q;

    /* renamed from: r  reason: collision with root package name */
    private final nm0.g f62648r;

    /* renamed from: s  reason: collision with root package name */
    private i0 f62649s;

    /* renamed from: t  reason: collision with root package name */
    private androidx.constraintlayout.widget.b f62650t;

    public Vo2MaxComparisonView(View parentView, androidx.lifecycle.d0 lifeCycleOwner) {
        kotlin.jvm.internal.u.j(lifeCycleOwner, "lifeCycleOwner");
        kotlin.jvm.internal.u.j(parentView, "parentView");
        this.f62631a = lifeCycleOwner;
        this.f62632b = parentView;
        this.f62633c = nm0.h.b(new r(this));
        this.f62634d = nm0.h.b(new d0(this));
        this.f62635e = nm0.h.b(new q(this));
        this.f62636f = nm0.h.b(new z(this));
        this.f62637g = nm0.h.b(new c0(this));
        this.f62638h = nm0.h.b(new j(this));
        this.f62639i = nm0.h.b(new g(this));
        this.f62640j = nm0.h.b(new h0(this));
        nm0.h.b(new g0(this));
        this.f62641k = nm0.h.b(new f0(this));
        this.f62642l = nm0.h.b(new e0(this));
        this.f62643m = nm0.h.b(new h(this));
        this.f62644n = nm0.h.b(new i(this));
        this.f62645o = nm0.h.b(new k(this));
        this.f62646p = nm0.h.b(new a0(this));
        this.f62647q = nm0.h.b(new l(this));
        this.f62648r = nm0.h.b(new b0(this));
    }

    public static ImageView a(Vo2MaxComparisonView this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ImageView imageView = new ImageView(this$0.k());
        Context k11 = this$0.k();
        kotlin.jvm.internal.u.i(k11, "<get-context>(...)");
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, ah.g.k(180, k11)));
        return imageView;
    }

    public static void b(Vo2MaxComparisonView this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        i0 i0Var = this$0.f62649s;
        if (i0Var != null) {
            NestedScrollView nestedScrollView = (NestedScrollView) this$0.f62633c.getValue();
            kotlin.jvm.internal.u.i(nestedScrollView, "<get-nestedScrollView>(...)");
            TextView textView = (TextView) this$0.f62640j.getValue();
            kotlin.jvm.internal.u.i(textView, "<get-vo2MaxSelfValueView>(...)");
            Rect rect = new Rect();
            nestedScrollView.getHitRect(rect);
            i0Var.p0(textView.getLocalVisibleRect(rect));
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static final void c(Vo2MaxComparisonView vo2MaxComparisonView, int i11) {
        vo2MaxComparisonView.getClass();
        ObjectAnimator ofInt = ObjectAnimator.ofInt(vo2MaxComparisonView, "animateSelfValue", 0, i11);
        ofInt.setDuration(1250L);
        ofInt.start();
    }

    public static final void g(Vo2MaxComparisonView vo2MaxComparisonView, d dVar) {
        ArrayList<Integer> arrayList;
        ArrayList arrayList2;
        String string;
        ArrayList arrayList3;
        String b10;
        Animation animation;
        Animation animation2;
        int i11;
        vo2MaxComparisonView.getClass();
        if (dVar.g()) {
            int e11 = dVar.e();
            int a11 = dVar.a();
            androidx.constraintlayout.widget.b bVar = vo2MaxComparisonView.f62650t;
            if (bVar != null) {
                float f11 = 1;
                bVar.M(f11 - ((e11 * 0.9f) / 70.0f), C1987R.id.vo2max_comparison_view_guideline_self_bar);
                androidx.constraintlayout.widget.b bVar2 = vo2MaxComparisonView.f62650t;
                if (bVar2 != null) {
                    bVar2.M(f11 - ((a11 * 0.9f) / 70.0f), C1987R.id.vo2max_comparison_view_guideline_other_bar);
                    AutoTransition autoTransition = new AutoTransition();
                    autoTransition.E(1250L);
                    nm0.g gVar = vo2MaxComparisonView.f62634d;
                    androidx.transition.w.a((ConstraintLayout) gVar.getValue(), autoTransition);
                    androidx.constraintlayout.widget.b bVar3 = vo2MaxComparisonView.f62650t;
                    if (bVar3 != null) {
                        bVar3.e((ConstraintLayout) gVar.getValue());
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(vo2MaxComparisonView, "animateOtherValue", dVar.c(), dVar.a());
                        ofInt.setDuration(1250L);
                        ofInt.start();
                        ImageSwitcher j5 = vo2MaxComparisonView.j();
                        boolean f12 = dVar.f();
                        int b11 = dVar.b();
                        if (f12) {
                            arrayList = f62630v;
                        } else {
                            arrayList = f62629u;
                        }
                        Integer num = arrayList.get(b11);
                        kotlin.jvm.internal.u.i(num, "get(...)");
                        j5.setImageResource(num.intValue());
                        TextView textView = (TextView) vo2MaxComparisonView.f62636f.getValue();
                        int b12 = dVar.b();
                        int i12 = m80.a.f81744h;
                        String[] b13 = a.C1293a.b(dVar.f());
                        arrayList2 = m80.a.f81743g;
                        a.c[] cVarArr = (a.c[]) arrayList2.toArray(new a.c[0]);
                        if (b12 <= b13.length - 1) {
                            string = vo2MaxComparisonView.k().getString(C1987R.string.vo2MaxDetails_comparison_yearsOld_formatted, b13[b12]);
                            kotlin.jvm.internal.u.i(string, "getString(...)");
                        } else {
                            string = vo2MaxComparisonView.k().getString(C1987R.string.vo2MaxDetails_comparison_yearsOld_formatted, cVarArr[b12 - b13.length].a());
                            kotlin.jvm.internal.u.i(string, "getString(...)");
                        }
                        textView.setText(string);
                        TextView textView2 = (TextView) vo2MaxComparisonView.f62638h.getValue();
                        int b14 = dVar.b();
                        String[] c11 = a.C1293a.c(dVar.f());
                        boolean f13 = dVar.f();
                        arrayList3 = m80.a.f81743g;
                        a.c[] cVarArr2 = (a.c[]) arrayList3.toArray(new a.c[0]);
                        if (b14 <= c11.length - 1) {
                            Context k11 = vo2MaxComparisonView.k();
                            if (f13) {
                                i11 = C1987R.string._WTI_MALE_;
                            } else {
                                i11 = C1987R.string._WTI_FEMALE_;
                            }
                            b10 = k11.getString(i11);
                            kotlin.jvm.internal.u.i(b10, "getString(...)");
                        } else {
                            b10 = cVarArr2[b14 - c11.length].b();
                        }
                        textView2.setText(b10);
                        ImageSwitcher j11 = vo2MaxComparisonView.j();
                        if (dVar.d()) {
                            animation = (Animation) vo2MaxComparisonView.f62645o.getValue();
                        } else {
                            animation = (Animation) vo2MaxComparisonView.f62647q.getValue();
                        }
                        j11.setInAnimation(animation);
                        ImageSwitcher j12 = vo2MaxComparisonView.j();
                        if (dVar.d()) {
                            animation2 = (Animation) vo2MaxComparisonView.f62646p.getValue();
                        } else {
                            animation2 = (Animation) vo2MaxComparisonView.f62648r.getValue();
                        }
                        j12.setOutAnimation(animation2);
                        return;
                    }
                    kotlin.jvm.internal.u.s("barsConstraintSet");
                    throw null;
                }
                kotlin.jvm.internal.u.s("barsConstraintSet");
                throw null;
            }
            kotlin.jvm.internal.u.s("barsConstraintSet");
            throw null;
        }
    }

    public static final void h(Vo2MaxComparisonView vo2MaxComparisonView, a aVar) {
        int i11;
        TextView textView = (TextView) vo2MaxComparisonView.f62641k.getValue();
        Context k11 = vo2MaxComparisonView.k();
        if (aVar.b()) {
            i11 = C1987R.string.vo2MaxDetails_comparison_subtitle_formatted_men;
        } else {
            i11 = C1987R.string.vo2MaxDetails_comparison_subtitle_formatted_women;
        }
        textView.setText(k11.getString(i11, String.valueOf(aVar.a())));
    }

    public static final void i(Vo2MaxComparisonView vo2MaxComparisonView, User user) {
        boolean z5;
        int years;
        int i11;
        int i12;
        ArrayList arrayList;
        vo2MaxComparisonView.getClass();
        if (user.p() == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        DateTime f11 = user.f();
        kotlin.jvm.internal.u.i(f11, "getBirthDate(...)");
        i0 i0Var = vo2MaxComparisonView.f62649s;
        if (i0Var != null) {
            DateTime dateTime = new DateTime(i0Var.i0().getDate());
            if (f11.isAfter(dateTime)) {
                years = 0;
            } else {
                years = Years.yearsBetween(f11, dateTime).getYears();
            }
            ((TextView) vo2MaxComparisonView.f62635e.getValue()).setText(vo2MaxComparisonView.k().getString(C1987R.string.vo2MaxDetails_comparison_yearsOld_formatted, String.valueOf(years)));
            ImageView imageView = (ImageView) vo2MaxComparisonView.f62637g.getValue();
            Context k11 = vo2MaxComparisonView.k();
            if (z5) {
                i11 = 2131232820;
            } else {
                i11 = 2131232819;
            }
            imageView.setImageDrawable(k11.getDrawable(i11));
            if (z5) {
                i12 = C1987R.string._WTI_MALE_;
            } else {
                i12 = C1987R.string._WTI_FEMALE_;
            }
            int i13 = m80.a.f81744h;
            String[] b10 = a.C1293a.b(z5);
            ArrayList arrayList2 = new ArrayList(b10.length);
            for (String str : b10) {
                String string = vo2MaxComparisonView.k().getString(C1987R.string.vo2MaxDetails_comparison_yearsOld_formatted, str);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                arrayList2.add(vo2MaxComparisonView.k().getString(i12) + " - " + string);
            }
            arrayList = m80.a.f81743g;
            a.c[] cVarArr = (a.c[]) arrayList.toArray(new a.c[0]);
            ArrayList arrayList3 = new ArrayList(cVarArr.length);
            for (a.c cVar : cVarArr) {
                arrayList3.add(cVar.b());
            }
            ArrayList l02 = kotlin.collections.x.l0(arrayList3, arrayList2);
            int i14 = m80.a.f81744h;
            ((ComposeView) vo2MaxComparisonView.f62643m.getValue()).setContent(new s1.a(true, -1390787888, new y(Math.min(a.C1293a.a(years), l02.size()), l02, vo2MaxComparisonView)));
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    private final ImageSwitcher j() {
        return (ImageSwitcher) this.f62639i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context k() {
        return (Context) this.f62644n.getValue();
    }

    private final void setAnimateOtherValue(int i11) {
        ((TextView) this.f62642l.getValue()).setText(String.valueOf(i11));
    }

    private final void setAnimateSelfValue(int i11) {
        ((TextView) this.f62640j.getValue()).setText(String.valueOf(i11));
    }

    public final void l(i0 i0Var) {
        this.f62649s = i0Var;
        xw.m<User> j02 = i0Var.j0();
        m mVar = new m(this);
        androidx.lifecycle.d0 d0Var = this.f62631a;
        xw.d.c(d0Var, j02, mVar);
        i0 i0Var2 = this.f62649s;
        if (i0Var2 != null) {
            xw.d.c(d0Var, i0Var2.g0(), new n(this));
            i0 i0Var3 = this.f62649s;
            if (i0Var3 != null) {
                xw.d.c(d0Var, i0Var3.k0(), new o(this));
                i0 i0Var4 = this.f62649s;
                if (i0Var4 != null) {
                    xw.d.c(d0Var, i0Var4.f0(), new p(this));
                    androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                    this.f62650t = bVar;
                    bVar.k((ConstraintLayout) this.f62634d.getValue());
                    j().setFactory(new ViewSwitcher.ViewFactory() { // from class: com.withings.wiscale2.vo2max.view.e
                        @Override // android.widget.ViewSwitcher.ViewFactory
                        public final View makeView() {
                            return Vo2MaxComparisonView.a(Vo2MaxComparisonView.this);
                        }
                    });
                    j().setInAnimation((Animation) this.f62645o.getValue());
                    j().setOutAnimation((Animation) this.f62646p.getValue());
                    ((NestedScrollView) this.f62633c.getValue()).getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.withings.wiscale2.vo2max.view.f
                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            Vo2MaxComparisonView.b(Vo2MaxComparisonView.this);
                        }
                    });
                    return;
                }
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
