package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
import com.withings.manualLogging.core.entity.cycle.CycleRegularity;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class r1 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41193a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41194b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41195c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<CycleRegularity, nm0.y> f41196d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g3 f41197e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(g3 g3Var, ym0.a aVar, ym0.a aVar2, ym0.a aVar3, ym0.l lVar) {
        super(4);
        this.f41193a = aVar;
        this.f41194b = aVar2;
        this.f41195c = aVar3;
        this.f41196d = lVar;
        this.f41197e = g3Var;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        a0.f40840a.b(229376, 0, aVar, this.f41197e, this.f41193a, this.f41194b, this.f41195c, this.f41196d);
        return nm0.y.f85009a;
    }
}
