package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.measure.accountmeasure.ui.FatMassView;
import com.withings.wiscale2.measure.accountmeasure.ui.WeightView;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
import tb0.r1;
/* compiled from: AddWeightFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/add/o0;", "Lcom/withings/wiscale2/measure/accountmeasure/ui/add/j0;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class o0 extends k1 {
    @Inject
    public cy.a A;
    private final LifecycleViewBindingProperty B = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    private final c F = new c(this);
    private z0 G;
    @Inject

    /* renamed from: z  reason: collision with root package name */
    public fy.p f58257z;
    static final /* synthetic */ fn0.k<Object>[] P = {androidx.camera.core.v.c(o0.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentAddWeightBinding;", 0), androidx.camera.core.v.c(o0.class, "weightInputValue", "getWeightInputValue()D", 0)};
    public static final a M = new Object();

    /* compiled from: AddWeightFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AddWeightFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f58258a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(ym0.l function) {
            kotlin.jvm.internal.u.j(function, "function");
            this.f58258a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f58258a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f58258a;
        }

        public final int hashCode() {
            return this.f58258a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f58258a.invoke(obj);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Fragment, Double> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f58259a = nm0.h.b(new u0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f58260b;

        public c(Fragment fragment) {
            this.f58260b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Double, java.lang.Object] */
        @Override // bn0.d
        public final Double getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f58259a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<o0, r1> {
        @Override // ym0.l
        public final r1 invoke(o0 o0Var) {
            o0 fragment = o0Var;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return r1.a(fragment.requireView());
        }
    }

    public static final double H1(o0 o0Var) {
        return ((Number) o0Var.F.getValue(o0Var, P[1])).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r1 I1() {
        return (r1) this.B.getValue(this, P[0]);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j0, com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            z0 z0Var = (z0) new androidx.lifecycle.k1(this, new p0(this)).a(z0.class);
            z0Var.p0().observe(getViewLifecycleOwner(), new b(new q0(this)));
            z0Var.j0().observe(getViewLifecycleOwner(), new b(new r0(this)));
            z0Var.m0().observe(getViewLifecycleOwner(), new b(s0.f58275a));
            z0Var.k0().observe(getViewLifecycleOwner(), new b(t0.f58276a));
            this.G = z0Var;
        }
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final MeasuresGroup s1() {
        String str;
        MeasuresGroup measuresGroup = new MeasuresGroup(3);
        measuresGroup.setDate(u1().toDate());
        measuresGroup.setModifiedTime(System.currentTimeMillis());
        boolean z5 = true;
        measuresGroup.setDevtype(1);
        Measure value = I1().f99449b.getValue();
        value.setDate(measuresGroup.getDate());
        value.setGroup(measuresGroup);
        measuresGroup.addMeasure(value);
        FatMassView fatMassView = I1().f99448a;
        Measure measureForType = measuresGroup.getMeasureForType(1);
        kotlin.jvm.internal.u.i(measureForType, "getMeasureForType(...)");
        Measure j5 = fatMassView.j(measureForType);
        Measure measure = null;
        if (j5 != null) {
            if (j5.f95794y <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                j5 = null;
            }
            if (j5 != null) {
                j5.setType(8);
                j5.setDate(measuresGroup.getDate());
                j5.setGroup(measuresGroup);
                measure = j5;
            }
        }
        if (measure != null) {
            measuresGroup.addMeasure(measure);
            Measure measure2 = new Measure();
            measure2.setUnit(-3);
            measure2.setValue(Math.pow(10.0d, -measure2.getUnit()) * (measure.f95794y / value.f95794y) * 100);
            measure2.setType(6);
            measure2.setDate(value.getDate());
            measure2.setGroup(measuresGroup);
            measuresGroup.addMeasure(measure2);
        }
        if (v1()) {
            str = "detail_view";
        } else {
            str = ConstantsWs.SYNC_PROCESS_TIMELINE;
        }
        DateTime u12 = u1();
        if (measure == null) {
            z5 = false;
        }
        gh0.a.f(str, u12, z5);
        return measuresGroup;
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final boolean w1() {
        if (this.G != null) {
            WeightView weight = I1().f99449b;
            kotlin.jvm.internal.u.i(weight, "weight");
            FatMassView fatmass = I1().f99448a;
            kotlin.jvm.internal.u.i(fatmass, "fatmass");
            if (weight.f() && fatmass.k(weight.getValue())) {
                return true;
            }
            return false;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
