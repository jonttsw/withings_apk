package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.common.compose.component.v4;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleTutorialLogWatchScreen.kt */
/* loaded from: classes4.dex */
final class m4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f41112a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(int i11) {
        super(2);
        this.f41112a = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            if (this.f41112a == 95) {
                i11 = C1987R.string.cycle_tutorial_logWatch_title_hwa11;
            } else {
                i11 = C1987R.string.cycle_tutorial_logWatch_title_hwa10;
            }
            v4.b(null, ay.b.u(i11, aVar2), null, null, 0.0f, 0.0f, 0, 0, aVar2, 0, ConstantsWs.WS_STATUS_ACCOUNTSUSPENDED);
        }
        return nm0.y.f85009a;
    }
}
