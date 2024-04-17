package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
import org.joda.time.LocalDate;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class o1 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f41147a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41148b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41149c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<LocalDate, nm0.y> f41150d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o1(g3 g3Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super LocalDate, nm0.y> lVar) {
        super(4);
        this.f41147a = g3Var;
        this.f41148b = aVar;
        this.f41149c = aVar2;
        this.f41150d = lVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        g3 g3Var = this.f41147a;
        rx.j.a(g3Var.g(), h3.d(g3Var), this.f41148b, this.f41149c, this.f41150d, aVar, 8);
        return nm0.y.f85009a;
    }
}
