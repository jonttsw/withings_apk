package com.withings.fever.ui;

import android.content.Context;
import androidx.compose.foundation.layout.x0;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f39218a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Context context) {
        super(2);
        this.f39218a = context;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.o.g(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, null, ay.b.u(C1987R.string.wbs08_arriane_howToTakeMeas_title, aVar2), null, false, false, true, null, null, new z(this.f39218a), aVar2, 12582912, 0, 886);
        }
        return nm0.y.f85009a;
    }
}
