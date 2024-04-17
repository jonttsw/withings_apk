package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.common.compose.component.ColorStyle;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleManualLogging.kt */
/* loaded from: classes4.dex */
final class o0 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f41145a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41146b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ym0.a aVar, boolean z5) {
        super(3);
        this.f41145a = z5;
        this.f41146b = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string._PREVIOUS_, aVar2), null, this.f41145a, ColorStyle.f33322a, null, false, this.f41146b, aVar2, 24576, 101);
        return nm0.y.f85009a;
    }
}
