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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.joda.time.DateTime;
import tb0.p1;
/* compiled from: AddHeartRateFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/measure/accountmeasure/ui/add/u;", "Lcom/withings/wiscale2/measure/accountmeasure/ui/add/j0;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class u extends g1 {
    private Measure B;
    @Inject
    public fy.p F;
    static final /* synthetic */ fn0.k<Object>[] M = {androidx.camera.core.v.c(u.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentAddHeartRateBinding;", 0)};
    public static final a G = new Object();

    /* renamed from: z  reason: collision with root package name */
    private final LifecycleViewBindingProperty f58277z = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    private final nm0.g A = nm0.h.b(new b());

    /* compiled from: AddHeartRateFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: AddHeartRateFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(u.this.K1().f99417a.f());
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<u, p1> {
        @Override // ym0.l
        public final p1 invoke(u uVar) {
            u fragment = uVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return p1.a(fragment.requireView());
        }
    }

    public static final void I1(u uVar, Measure measure) {
        Measure measure2;
        nm0.y yVar = null;
        if (measure != null) {
            uVar.getClass();
            if (measure.f95794y > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                measure2 = measure;
            } else {
                measure2 = null;
            }
            if (measure2 != null) {
                uVar.K1().f99417a.setValue(measure);
                yVar = nm0.y.f85009a;
            }
        }
        if (yVar == null) {
            uVar.K1().f99417a.setValue(65.0d);
        }
        uVar.K1().f99417a.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p1 K1() {
        return (p1) this.f58277z.getValue(this, M[0]);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j0
    public final void F1() {
        String str;
        double value = K1().f99417a.getValue().getValue();
        if (value > 220.0d) {
            qc.b bVar = new qc.b(requireContext());
            bVar.g(C1987R.string.manualLog_hr_value_too_high);
            bVar.z(C1987R.string._OK_, null).s();
        } else if (value < 30.0d) {
            qc.b bVar2 = new qc.b(requireContext());
            bVar2.g(C1987R.string.manualLog_hr_value_too_low);
            bVar2.z(C1987R.string._OK_, null).s();
        } else {
            super.F1();
            DateTime u12 = u1();
            if (v1()) {
                str = "detail_view";
            } else {
                str = ConstantsWs.SYNC_PROCESS_TIMELINE;
            }
            gh0.a.c(str, u12, false);
        }
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.j0, com.withings.wiscale2.measure.accountmeasure.ui.add.h0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        K1().f99417a.setUnit(new l70.a());
        K1().f99417a.setType(11);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new v(this, null), 3, null);
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final MeasuresGroup s1() {
        MeasuresGroup measuresGroup = new MeasuresGroup(1);
        measuresGroup.setDate(u1().toDate());
        measuresGroup.setDevtype(4);
        Measure value = K1().f99417a.getValue();
        value.setDate(measuresGroup.getDate());
        value.setGroup(measuresGroup);
        measuresGroup.addMeasure(value);
        return measuresGroup;
    }

    @Override // com.withings.wiscale2.measure.accountmeasure.ui.add.h0
    public final boolean w1() {
        return ((Boolean) this.A.getValue()).booleanValue();
    }
}
