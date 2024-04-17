package com.withings.details.height;

import androidx.compose.material.c5;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import com.withings.wiscale2.C1987R;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
public final class u extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36637a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f36638b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c5 f36639c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(HeightListActivity heightListActivity, CoroutineScope coroutineScope, c5 c5Var) {
        super(2);
        this.f36637a = heightListActivity;
        this.f36638b = coroutineScope;
        this.f36639c = c5Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        t tVar;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            HeightListActivity heightListActivity = this.f36637a;
            if (HeightListActivity.I3(heightListActivity).D()) {
                tVar = null;
            } else {
                tVar = new t(this.f36639c, this.f36638b);
            }
            com.withings.common.compose.component.c5.a(((i1) aVar2.D(j1.e())).O(), 0L, ay.b.u(C1987R.string._HEIGHT_MEASUREMENTS_, aVar2), false, null, null, null, tVar, false, new r(heightListActivity), aVar2, 0, 378);
        }
        return nm0.y.f85009a;
    }
}
