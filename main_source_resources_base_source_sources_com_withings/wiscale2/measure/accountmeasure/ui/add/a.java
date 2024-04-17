package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.os.Bundle;
import android.view.View;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
import tb0.o1;
/* compiled from: AddBloodPressureFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/add/a;", "Lcom/withings/wiscale2/measure/accountmeasure/ui/add/j0;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class a extends d1 {
    @Inject
    public fy.p A;

    /* renamed from: z  reason: collision with root package name */
    private final LifecycleViewBindingProperty f58121z = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    static final /* synthetic */ fn0.k<Object>[] F = {androidx.camera.core.v.c(a.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentAddBloodPressureBinding;", 0)};
    public static final C0753a B = new Object();

    /* compiled from: AddBloodPressureFragment.kt */
    /* renamed from: com.withings.wiscale2.measure.accountmeasure.ui.add.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0753a {
    }

    /* compiled from: AddBloodPressureFragment.kt */
    /* loaded from: classes5.dex */
    static final class b implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f58122a;

        b(ym0.l lVar) {
            this.f58122a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f58122a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f58122a;
        }

        public final int hashCode() {
            return this.f58122a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f58122a.invoke(obj);
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<a, o1> {
        @Override // ym0.l
        public final o1 invoke(a aVar) {
            a fragment = aVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return o1.a(fragment.requireView());
        }
    }

    public static final void G1(a aVar, Measure measure) {
        Measure measure2;
        aVar.getClass();
        nm0.y yVar = null;
        if (measure != null) {
            if (measure.f95794y > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                measure2 = measure;
            } else {
                measure2 = null;
            }
            if (measure2 != null) {
                aVar.J1().f99389a.setValue(measure);
                yVar = nm0.y.f85009a;
            }
        }
        if (yVar == null) {
            aVar.J1().f99389a.setValue(80.0d);
        }
    }

    public static final void H1(a aVar, Measure measure) {
        Measure measure2;
        aVar.getClass();
        nm0.y yVar = null;
        if (measure != null) {
            if (measure.f95794y > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                measure2 = measure;
            } else {
                measure2 = null;
            }
            if (measure2 != null) {
                aVar.J1().f99390b.setValue(measure);
                yVar = nm0.y.f85009a;
            }
        }
        if (yVar == null) {
            aVar.J1().f99390b.setValue(65.0d);
        }
    }

    public static final void I1(a aVar, Measure measure) {
        Measure measure2;
        nm0.y yVar = null;
        if (measure != null) {
            aVar.getClass();
            if (measure.f95794y > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                measure2 = measure;
            } else {
                measure2 = null;
            }
            if (measure2 != null) {
                aVar.J1().f99391c.setValue(measure);
                yVar = nm0.y.f85009a;
            }
        }
        if (yVar == null) {
            aVar.J1().f99391c.setValue(120.0d);
        }
        aVar.J1().f99391c.d();
    }

    private final o1 J1() {
        return (o1) this.f58121z.getValue(this, F[0]);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j0
    public final void F1() {
        String str;
        double value = J1().f99391c.getValue().getValue();
        double value2 = J1().f99389a.getValue().getValue();
        double value3 = J1().f99390b.getValue().getValue();
        if (value <= value2) {
            qc.b bVar = new qc.b(requireContext());
            bVar.g(C1987R.string._SYS_DIA_INCOHERENCE_NO_SAVE_);
            bVar.z(C1987R.string._OK_, null).s();
        } else if (value3 < 30.0d) {
            qc.b bVar2 = new qc.b(requireContext());
            bVar2.g(C1987R.string.manualLog_hr_value_too_low);
            bVar2.z(C1987R.string._OK_, null).s();
        } else if (value3 > 220.0d) {
            qc.b bVar3 = new qc.b(requireContext());
            bVar3.g(C1987R.string.manualLog_hr_value_too_high);
            bVar3.z(C1987R.string._OK_, null).s();
        } else {
            super.F1();
            DateTime u12 = u1();
            if (v1()) {
                str = "detail_view";
            } else {
                str = ConstantsWs.SYNC_PROCESS_TIMELINE;
            }
            gh0.a.a(str, u12);
        }
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j0, com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        J1().f99390b.setType(11);
        J1().f99391c.setType(10);
        J1().f99389a.setType(9);
        b1 b1Var = (b1) new androidx.lifecycle.k1(this, new com.withings.wiscale2.measure.accountmeasure.ui.add.b(this)).a(b1.class);
        b1Var.i0().observe(getViewLifecycleOwner(), new b(new com.withings.wiscale2.measure.accountmeasure.ui.add.c(this)));
        b1Var.f0().observe(getViewLifecycleOwner(), new b(new d(this)));
        b1Var.g0().observe(getViewLifecycleOwner(), new b(new e(this)));
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final MeasuresGroup s1() {
        MeasuresGroup measuresGroup = new MeasuresGroup(1);
        measuresGroup.setDate(u1().toDate());
        measuresGroup.setDevtype(4);
        Measure value = J1().f99390b.getValue();
        value.setDate(measuresGroup.getDate());
        value.setGroup(measuresGroup);
        measuresGroup.addMeasure(value);
        Measure value2 = J1().f99391c.getValue();
        value2.setDate(measuresGroup.getDate());
        value2.setGroup(measuresGroup);
        measuresGroup.addMeasure(value2);
        Measure value3 = J1().f99389a.getValue();
        value3.setDate(measuresGroup.getDate());
        value3.setGroup(measuresGroup);
        measuresGroup.addMeasure(value3);
        return measuresGroup;
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final boolean w1() {
        if (J1().f99391c.f() && J1().f99389a.f() && J1().f99390b.f()) {
            return true;
        }
        return false;
    }
}
