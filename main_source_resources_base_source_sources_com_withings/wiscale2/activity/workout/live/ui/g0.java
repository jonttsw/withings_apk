package com.withings.wiscale2.activity.workout.live.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.k1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import jm.a;
import kotlin.Metadata;
import tb0.i3;
/* compiled from: LiveWorkoutHrFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/activity/workout/live/ui/g0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class g0 extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private jm.a f48890c;

    /* renamed from: d  reason: collision with root package name */
    private final LifecycleViewBindingProperty f48891d;

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f48889f = {androidx.camera.core.v.c(g0.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentWorkoutLiveHrBinding;", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final a f48888e = new Object();

    /* compiled from: LiveWorkoutHrFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<g0, i3> {
        @Override // ym0.l
        public final i3 invoke(g0 g0Var) {
            g0 fragment = g0Var;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return i3.a(fragment.requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public g0() {
        super(C1987R.layout.fragment_workout_live_hr);
        this.f48891d = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r2 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s1(com.withings.wiscale2.activity.workout.live.ui.g0 r6, java.lang.Integer r7) {
        /*
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto L59
            tb0.i3 r1 = r6.v1()
            android.widget.TextView r1 = r1.f99197a
            if (r7 == 0) goto L37
            int r2 = r7.intValue()
            if (r2 <= 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            r3 = 0
            if (r2 == 0) goto L1c
            r2 = r7
            goto L1d
        L1c:
            r2 = r3
        L1d:
            if (r2 == 0) goto L37
            jm.a r2 = r6.f48890c
            if (r2 == 0) goto L31
            int r3 = r7.intValue()
            double r3 = (double) r3
            r5 = 11
            java.lang.String r2 = r2.b(r3, r5)
            if (r2 == 0) goto L37
            goto L3e
        L31:
            java.lang.String r6 = "measureFormatter"
            kotlin.jvm.internal.u.s(r6)
            throw r3
        L37:
            r2 = 2132026914(0x7f142622, float:1.9692374E38)
            java.lang.String r2 = r0.getString(r2)
        L3e:
            r1.setText(r2)
            tb0.i3 r6 = r6.v1()
            com.withings.views.view.HorizontalScaleView r6 = r6.f99199c
            if (r7 == 0) goto L4f
            int r7 = r7.intValue()
            double r0 = (double) r7
            goto L51
        L4f:
            r0 = 0
        L51:
            r2 = 1000(0x3e8, double:4.94E-321)
            r6.a(r2, r0)
            r6.invalidate()
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.live.ui.g0.s1(com.withings.wiscale2.activity.workout.live.ui.g0, java.lang.Integer):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.withings.views.view.HorizontalScaleView$d] */
    public static final void t1(g0 g0Var, HorizontalScaleView.e eVar) {
        if (g0Var.getContext() != null) {
            g0Var.v1().f99199c.setScale(eVar);
            g0Var.v1().f99199c.setDelegate(new Object());
            g0Var.v1().f99199c.n();
        }
    }

    public static final void u1(g0 g0Var, int i11) {
        Context context = g0Var.getContext();
        if (context != null) {
            g0Var.v1().f99198b.setText(context.getString(i11));
        }
    }

    private final i3 v1() {
        return (i3) this.f48891d.getValue(this, f48889f[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this.f48890c = a.d.a(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            z0 z0Var = (z0) new k1(activity).a(z0.class);
            xw.d.c(this, z0Var.X0(), new h0(this));
            xw.d.c(this, z0Var.Y0(), new i0(this));
            xw.d.c(this, z0Var.a1(), new j0(this));
        }
    }
}
