package com.withings.wiscale2.device.common.notifications.ui;

import androidx.compose.material3.a9;
import java.util.List;
import k1.o1;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
final class r0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f53005a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f53006b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o1<l1> f53007c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ o1<List<Short>> f53008d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ o1<List<String>> f53009e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(m mVar, f1 f1Var, k1.r0 r0Var, k1.r0 r0Var2, k1.r0 r0Var3) {
        super(2);
        this.f53005a = mVar;
        this.f53006b = f1Var;
        this.f53007c = r0Var;
        this.f53008d = r0Var2;
        this.f53009e = r0Var3;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            a9.a(androidx.compose.foundation.layout.e1.d(androidx.compose.ui.e.f8927a), null, 0L, 0L, 0.0f, 0.0f, null, s1.b.b(aVar2, 1747970770, new q0(this.f53005a, this.f53006b, this.f53007c, this.f53008d, this.f53009e)), aVar2, 12582918, 126);
        }
        return nm0.y.f85009a;
    }
}
