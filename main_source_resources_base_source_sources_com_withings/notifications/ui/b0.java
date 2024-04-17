package com.withings.notifications.ui;

import androidx.compose.material3.z4;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42855a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ym0.a<nm0.y> aVar) {
        super(2);
        this.f42855a = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            z4.b(this.f42855a, null, false, null, null, b.f42852a, aVar2, 196608, 30);
        }
        return nm0.y.f85009a;
    }
}
