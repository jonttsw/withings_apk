package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.os.Bundle;
import android.view.View;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.user.User;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
import tb0.q1;
/* compiled from: AddHeightFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/add/x;", "Lcom/withings/wiscale2/measure/accountmeasure/ui/add/j0;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class x extends h1 {
    @Inject
    public fy.p B;
    static final /* synthetic */ fn0.k<Object>[] G = {androidx.camera.core.v.c(x.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentAddHeightBinding;", 0)};
    public static final a F = new Object();

    /* renamed from: z  reason: collision with root package name */
    private final LifecycleViewBindingProperty f58287z = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    private final nm0.g A = nm0.h.b(new d());

    /* compiled from: AddHeightFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: AddHeightFragment.kt */
    /* loaded from: classes5.dex */
    static final class b implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f58288a;

        b(ym0.l lVar) {
            this.f58288a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f58288a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f58288a;
        }

        public final int hashCode() {
            return this.f58288a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f58288a.invoke(obj);
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<x, q1> {
        @Override // ym0.l
        public final q1 invoke(x xVar) {
            x fragment = xVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return q1.a(fragment.requireView());
        }
    }

    /* compiled from: AddHeightFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<c1> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final c1 invoke() {
            x xVar = x.this;
            User user = xVar.getUser();
            fy.p pVar = xVar.B;
            if (pVar != null) {
                return new c1(user, pVar);
            }
            kotlin.jvm.internal.u.s("getMostRecentMeasuresGroup");
            throw null;
        }
    }

    public static final void G1(x xVar, Measure measure) {
        xVar.getClass();
        nm0.y yVar = null;
        if (measure != null) {
            if (measure.f95794y < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                measure = null;
            }
            if (measure != null) {
                xVar.H1().f99437a.setValue(measure);
                yVar = nm0.y.f85009a;
            }
        }
        if (yVar == null) {
            xVar.H1().f99437a.setValue(1.6d);
        }
    }

    private final q1 H1() {
        return (q1) this.f58287z.getValue(this, G[0]);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j0
    public final void F1() {
        String str;
        super.F1();
        DateTime u12 = u1();
        if (v1()) {
            str = "detail_view";
        } else {
            str = ConstantsWs.SYNC_PROCESS_TIMELINE;
        }
        gh0.a.d(str, u12);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j0, com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        ((c1) this.A.getValue()).f0().observe(getViewLifecycleOwner(), new b(new y(this)));
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final MeasuresGroup s1() {
        MeasuresGroup measuresGroup = new MeasuresGroup(1);
        measuresGroup.setDate(u1().toDate());
        Measure value = H1().f99437a.getValue();
        value.setDate(measuresGroup.getDate());
        value.setGroup(measuresGroup);
        measuresGroup.addMeasure(value);
        return measuresGroup;
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final boolean w1() {
        return H1().f99437a.f();
    }
}
