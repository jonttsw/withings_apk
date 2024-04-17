package com.withings.wiscale2.settings;
/* compiled from: PrivacyAndLegals.kt */
/* loaded from: classes5.dex */
final class i1 extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f60042a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(String str) {
        super(3);
        this.f60042a = str;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h Card = hVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(Card, "$this$Card");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.o.g(androidx.compose.foundation.layout.x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), null, null, this.f60042a, null, false, false, false, null, null, null, aVar2, 0, 0, 2038);
        }
        return nm0.y.f85009a;
    }
}
