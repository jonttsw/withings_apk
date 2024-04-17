package com.withings.manualLogging.ui.feature.addNote;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.ui.common.LogType;
import i6.a;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class u0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41593a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LogType f41594b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(AddManualLogActivity addManualLogActivity, LogType logType) {
        super(2);
        this.f41593a = addManualLogActivity;
        this.f41594b = logType;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        i6.a aVar2;
        androidx.compose.runtime.a aVar3 = aVar;
        if ((num.intValue() & 11) == 2 && aVar3.h()) {
            aVar3.C();
        } else {
            AddManualLogActivity addManualLogActivity = this.f41593a;
            t0 t0Var = new t0(addManualLogActivity);
            aVar3.s(1729797275);
            androidx.lifecycle.n1 a11 = j6.a.a(aVar3);
            if (a11 != null) {
                if (a11 instanceof androidx.lifecycle.u) {
                    aVar2 = ((androidx.lifecycle.u) a11).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = a.C1058a.f71431b;
                }
                androidx.lifecycle.g1 a12 = j6.b.a(k1.class, a11, null, t0Var, aVar2, aVar3);
                aVar3.J();
                AddManualLogActivity.A3(addManualLogActivity, (k1) a12, this.f41594b, aVar3, ConstantsWs.WS_STATUS_ALREADY_EXIST);
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        return nm0.y.f85009a;
    }
}
