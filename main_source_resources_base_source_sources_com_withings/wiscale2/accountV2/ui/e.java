package com.withings.wiscale2.accountV2.ui;

import androidx.compose.runtime.a;
import com.withings.common.compose.component.l;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoggedOutActivity.kt */
/* loaded from: classes4.dex */
public final class e extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f48210a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f48211b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ym0.a aVar, boolean z5) {
        super(2);
        this.f48210a = z5;
        this.f48211b = aVar;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            String u11 = ay.b.u(C1987R.string.login_revokeProviderToken_button_disconnect, aVar2);
            aVar2.s(-253589445);
            ym0.a<y> aVar3 = this.f48211b;
            boolean K = aVar2.K(aVar3);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new d(aVar3);
                aVar2.n(t11);
            }
            aVar2.J();
            l.a(null, u11, null, false, null, null, this.f48210a, (ym0.a) t11, aVar2, 0, 61);
        }
        return y.f85009a;
    }
}
