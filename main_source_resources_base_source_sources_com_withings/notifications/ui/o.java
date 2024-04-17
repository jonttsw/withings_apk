package com.withings.notifications.ui;
/* compiled from: NotificationUiMapper.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.q<r0.c, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f42982a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z5) {
        super(3);
        this.f42982a = z5;
    }

    @Override // ym0.q
    public final nm0.y invoke(r0.c cVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        r0.c CenteredInBox = cVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(CenteredInBox, "$this$CenteredInBox");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            if (this.f42982a) {
                i11 = 2131231135;
            } else {
                i11 = 2131231136;
            }
            n0.z.a(s2.d.a(i11, aVar2), null, null, null, null, 0.0f, null, aVar2, 56, 124);
        }
        return nm0.y.f85009a;
    }
}
