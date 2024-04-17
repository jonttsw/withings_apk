package com.withings.notifications.ui;

import com.withings.notifications.model.NotificationStyle;
/* compiled from: NotificationsSection.kt */
/* loaded from: classes4.dex */
final class y0 extends kotlin.jvm.internal.w implements ym0.l<c10.c<?>, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final y0 f43148a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final Boolean invoke(c10.c<?> cVar) {
        boolean z5;
        c10.c<?> it = cVar;
        kotlin.jvm.internal.u.j(it, "it");
        if (p.x(it) == NotificationStyle.f42819a) {
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
