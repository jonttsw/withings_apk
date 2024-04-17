package com.withings.common.compose.component;

import androidx.compose.material3.ga;
import com.withings.common.compose.component.a3;
/* compiled from: TopAppBar.kt */
/* loaded from: classes3.dex */
final class d5 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a3.b f33715a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(a3.b bVar) {
        super(2);
        this.f33715a = bVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            ga.b(ay.b.u(this.f33715a.b(), aVar2), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 0, 0, 131070);
        }
        return nm0.y.f85009a;
    }
}
