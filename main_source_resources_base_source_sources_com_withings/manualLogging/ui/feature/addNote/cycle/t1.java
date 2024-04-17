package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
import org.joda.time.LocalDate;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class t1 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f41221a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41222b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41223c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41224d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<LocalDate, nm0.y> f41225e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41226f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t1(boolean z5, g3 g3Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super LocalDate, nm0.y> lVar, ym0.a<nm0.y> aVar3) {
        super(4);
        this.f41221a = z5;
        this.f41222b = g3Var;
        this.f41223c = aVar;
        this.f41224d = aVar2;
        this.f41225e = lVar;
        this.f41226f = aVar3;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        a0 a0Var = a0.f40840a;
        ym0.l<LocalDate, nm0.y> lVar = this.f41225e;
        ym0.a<nm0.y> aVar2 = this.f41226f;
        a0Var.e(this.f41221a, this.f41222b, this.f41223c, this.f41224d, false, lVar, aVar2, aVar, 12582976, 16);
        return nm0.y.f85009a;
    }
}
