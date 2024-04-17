package com.withings.notifications.ui;

import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: NotificationsActivity.kt */
/* loaded from: classes4.dex */
final class u extends kotlin.jvm.internal.w implements ym0.l<c10.c<?>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NotificationsActivity f43113a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(NotificationsActivity notificationsActivity) {
        super(1);
        this.f43113a = notificationsActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(c10.c<?> cVar) {
        c10.c<?> notification = cVar;
        kotlin.jvm.internal.u.j(notification, "notification");
        NotificationsActivity notificationsActivity = this.f43113a;
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(notificationsActivity), null, null, new t(notificationsActivity, notification, null), 3, null);
        return nm0.y.f85009a;
    }
}
