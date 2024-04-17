package com.withings.nervehealth.ui;

import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.common.compose.component.d3;
import com.withings.features.InternalSetting;
import com.withings.wiscale2.C1987R;
import d2.h1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthMeasureListActivity.kt */
/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthMeasureListActivity f42489a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(NerveHealthMeasureListActivity nerveHealthMeasureListActivity) {
        super(2);
        this.f42489a = nerveHealthMeasureListActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.ui.e b10;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) != 2 || !aVar2.h()) {
            b10 = androidx.compose.foundation.c.b(androidx.compose.ui.e.f8927a, ((i1) aVar2.D(j1.e())).a(), h1.a());
            NerveHealthMeasureListActivity nerveHealthMeasureListActivity = this.f42489a;
            parcelableSnapshotMutableState = nerveHealthMeasureListActivity.f42393l;
            int intValue = ((Number) parcelableSnapshotMutableState.getValue()).intValue();
            com.withings.common.compose.component.e0[] e0VarArr = new com.withings.common.compose.component.e0[3];
            e0VarArr[0] = new com.withings.common.compose.component.e0(ay.b.u(C1987R.string.measurementList_options_nerveHealth_option1, aVar2), null, 0, null, null, 26);
            e0VarArr[1] = new com.withings.common.compose.component.e0(ay.b.u(C1987R.string.measurementList_options_nerveHealth_option2, aVar2), null, 1, null, null, 26);
            com.withings.common.compose.component.e0 e0Var = new com.withings.common.compose.component.e0("All measures (Inhouse only)", null, 2, null, null, 26);
            if (!wr.b.c(InternalSetting.f39155n) && !NerveHealthMeasureListActivity.F3(nerveHealthMeasureListActivity)) {
                e0Var = null;
            }
            e0VarArr[2] = e0Var;
            d3.a(b10, kotlin.collections.l.z(e0VarArr), Integer.valueOf(intValue), false, 0L, null, new a0(nerveHealthMeasureListActivity), aVar2, 0, 56);
        } else {
            aVar2.C();
        }
        return nm0.y.f85009a;
    }
}
