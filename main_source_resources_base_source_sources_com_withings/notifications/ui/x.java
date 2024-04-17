package com.withings.notifications.ui;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class x extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NotificationsActivity f43142a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(NotificationsActivity notificationsActivity) {
        super(2);
        this.f43142a = notificationsActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.core.ui.b.a(s1.b.b(aVar2, -1852603316, new w(this.f43142a)), aVar2, 6);
        }
        return nm0.y.f85009a;
    }
}
