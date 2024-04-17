package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.wiscale2.C1987R;
/* compiled from: CycleTutorialLogWatchScreen.kt */
/* loaded from: classes4.dex */
final class o4 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f41152a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(int i11) {
        super(3);
        this.f41152a = i11;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        r0.h GuidedPresentation = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(GuidedPresentation, "$this$GuidedPresentation");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            if (this.f41152a == 95) {
                i11 = C1987R.string.cycle_tutorial_logWatch_description_hwa11;
            } else {
                i11 = C1987R.string.cycle_tutorial_logWatch_description_hwa10;
            }
            nk.a.d(null, ay.b.u(i11, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
        }
        return nm0.y.f85009a;
    }
}
