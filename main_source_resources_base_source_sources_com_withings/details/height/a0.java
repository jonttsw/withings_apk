package com.withings.details.height;

import androidx.compose.material.c5;
/* compiled from: HeightListActivity.kt */
/* loaded from: classes3.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c5 f36575a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36576b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c5 c5Var, HeightListActivity heightListActivity) {
        super(3);
        this.f36575a = c5Var;
        this.f36576b = heightListActivity;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.w it = wVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            HeightListActivity heightListActivity = this.f36576b;
            wk.h.a(null, this.f36575a, null, s1.b.b(aVar2, 1606827713, new y(heightListActivity)), s1.b.b(aVar2, 1263943904, new z(heightListActivity)), aVar2, 27712, 5);
        }
        return nm0.y.f85009a;
    }
}
