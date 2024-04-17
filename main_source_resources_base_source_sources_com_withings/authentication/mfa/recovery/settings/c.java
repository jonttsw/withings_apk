package com.withings.authentication.mfa.recovery.settings;

import androidx.compose.foundation.h;
import com.withings.common.compose.component.n1;
import d2.f0;
import kotlin.jvm.internal.w;
import nm0.y;
import qk.xb;
import yk.f;
import ym0.p;
/* compiled from: SettingsRecoveryCode.kt */
/* loaded from: classes3.dex */
final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f31925a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ym0.a<y> aVar) {
        super(2);
        this.f31925a = aVar;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            n1.b(xb.f93202a, h.b(androidx.compose.ui.e.f8927a, false, this.f31925a, 7), ((f0) aVar2.D(f.b())).t(), 0, aVar2, 0, 8);
        }
        return y.f85009a;
    }
}
