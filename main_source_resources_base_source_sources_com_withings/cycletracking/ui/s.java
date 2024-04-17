package com.withings.cycletracking.ui;

import android.os.Bundle;
/* compiled from: CycleTrackingActivity.kt */
/* loaded from: classes3.dex */
final class s extends kotlin.jvm.internal.w implements ym0.r<r0.h, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingActivity f35743a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f35744b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f35745c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.p<Integer, String, nm0.y> f35746d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(CycleTrackingActivity cycleTrackingActivity, ym0.a<nm0.y> aVar, ym0.l<? super Integer, nm0.y> lVar, ym0.p<? super Integer, ? super String, nm0.y> pVar) {
        super(4);
        this.f35743a = cycleTrackingActivity;
        this.f35744b = aVar;
        this.f35745c = lVar;
        this.f35746d = pVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(r0.h hVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        Long l5;
        long userId;
        r0.h bottomSheet = hVar;
        androidx.navigation.d backStackEntry = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(bottomSheet, "$this$bottomSheet");
        kotlin.jvm.internal.u.j(backStackEntry, "backStackEntry");
        Bundle c11 = backStackEntry.c();
        if (c11 != null) {
            l5 = Long.valueOf(c11.getLong("FactorId"));
        } else {
            l5 = null;
        }
        if (l5 != null) {
            long longValue = l5.longValue();
            CycleTrackingActivity cycleTrackingActivity = this.f35743a;
            gn.b bVar = cycleTrackingActivity.f35472g;
            if (bVar != null) {
                userId = cycleTrackingActivity.getUserId();
                i1.a(this.f35744b, this.f35745c, this.f35746d, bVar.a(userId, longValue), aVar2, 4096, 0);
            } else {
                kotlin.jvm.internal.u.s("factorEditionViewModelFactory");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
