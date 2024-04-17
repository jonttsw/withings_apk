package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.manualLogging.core.entity.cycle.ContraceptiveRegime;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class q1 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g3 f41182a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41183b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41184c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.l<ContraceptiveRegime, nm0.y> f41185d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ androidx.activity.z f41186e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q1(g3 g3Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.l<? super ContraceptiveRegime, nm0.y> lVar, androidx.activity.z zVar) {
        super(4);
        this.f41182a = g3Var;
        this.f41183b = aVar;
        this.f41184c = aVar2;
        this.f41185d = lVar;
        this.f41186e = zVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        ContraceptiveRegime a11 = this.f41182a.a();
        ym0.a<nm0.y> aVar2 = this.f41184c;
        ym0.l<ContraceptiveRegime, nm0.y> lVar = this.f41185d;
        rx.d.a(a11, this.f41183b, aVar2, lVar, this.f41186e, aVar, Utils.MAX_EVENT_SIZE);
        return nm0.y.f85009a;
    }
}
