package com.withings.nervehealth.ui;

import androidx.compose.material.c5;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.common.compose.component.a3;
import com.withings.common.compose.component.l2;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.CoroutineScope;
import qk.nc;
/* compiled from: NerveHealthMeasureListActivity.kt */
/* loaded from: classes4.dex */
final class k0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthMeasureListActivity f42730a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f42731b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f42732c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(NerveHealthMeasureListActivity nerveHealthMeasureListActivity, CoroutineScope coroutineScope, c5 c5Var) {
        super(2);
        this.f42730a = nerveHealthMeasureListActivity;
        this.f42731b = coroutineScope;
        this.f42732c = c5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            NerveHealthMeasureListActivity nerveHealthMeasureListActivity = this.f42730a;
            int ordinal = NerveHealthMeasureListActivity.A3(nerveHealthMeasureListActivity).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i11 = C1987R.string.electrochemicalSkinConductanceScore_metric_title;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i11 = C1987R.string.electrodermalActivity_metric_title;
                }
            } else {
                i11 = C1987R.string.nerveHealthScore_metric_title;
            }
            String u11 = ay.b.u(i11, aVar2);
            List V = kotlin.collections.x.V(new a3.a(new l2.c(nc.f93053a), new i0(this.f42732c, this.f42731b)));
            parcelableSnapshotMutableState = nerveHealthMeasureListActivity.f42392k;
            hk.b.b(false, u11, V, (List) parcelableSnapshotMutableState.getValue(), null, new j0(nerveHealthMeasureListActivity), null, aVar2, 4096, 81);
        }
        return nm0.y.f85009a;
    }
}
