package com.withings.tutorials.ui.screens.appssync.healthconnect;

import com.withings.common.compose.component.ButtonSize;
import com.withings.wiscale2.C1987R;
/* compiled from: HealthConnectScreen.kt */
/* loaded from: classes4.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f44905a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ym0.a<nm0.y> aVar) {
        super(3);
        this.f44905a = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h ImageTutorialScreen = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(ImageTutorialScreen, "$this$ImageTutorialScreen");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            nk.a.d(null, ay.b.u(C1987R.string.healthConnect_instructionDescription, aVar2), 0L, null, 0, 0, null, aVar2, 0, 125);
            com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string._LEARN_MORE_, aVar2), null, false, null, ButtonSize.f33304f, false, this.f44905a, aVar2, 196608, 93);
        }
        return nm0.y.f85009a;
    }
}
