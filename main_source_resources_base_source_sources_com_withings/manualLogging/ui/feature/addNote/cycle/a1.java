package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
import com.withings.common.compose.picker.SurveyDateValidator;
import org.joda.time.LocalDate;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class a1 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f40901a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u0 f40902b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f40903c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<g3, nm0.y> f40904d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(u0 u0Var, g3 g3Var, ym0.a aVar, ym0.l lVar) {
        super(4);
        this.f40901a = g3Var;
        this.f40902b = u0Var;
        this.f40903c = aVar;
        this.f40904d = lVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        g3 g3Var = this.f40901a;
        LocalDate l5 = g3Var.l();
        ym0.a<nm0.y> l6 = this.f40902b.l();
        SurveyDateValidator e11 = g3Var.e();
        z0 z0Var = new z0(g3Var, this.f40904d);
        rx.x.a(l5, e11, this.f40903c, l6, z0Var, aVar, 8);
        return nm0.y.f85009a;
    }
}
