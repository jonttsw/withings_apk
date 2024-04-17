package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
import com.withings.common.compose.picker.SurveyDateValidator;
import org.joda.time.LocalDate;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class c1 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f40947a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f40948b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ u0 f40949c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<g3, nm0.y> f40950d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(u0 u0Var, g3 g3Var, ym0.a aVar, ym0.l lVar) {
        super(4);
        this.f40947a = g3Var;
        this.f40948b = aVar;
        this.f40949c = u0Var;
        this.f40950d = lVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        g3 g3Var = this.f40947a;
        LocalDate i11 = g3Var.i();
        SurveyDateValidator e11 = g3Var.e();
        ym0.a<nm0.y> i12 = this.f40949c.i();
        b1 b1Var = new b1(g3Var, this.f40950d);
        rx.w.a(i11, e11, this.f40948b, i12, b1Var, aVar, 8);
        return nm0.y.f85009a;
    }
}
