package com.withings.notifications.ui;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class w extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NotificationsActivity f43138a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(NotificationsActivity notificationsActivity) {
        super(2);
        this.f43138a = notificationsActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            NotificationsActivity notificationsActivity = this.f43138a;
            z.c(null, new u(notificationsActivity), new v(notificationsActivity), new s(notificationsActivity), aVar2, 0, 1);
        }
        return nm0.y.f85009a;
    }
}
