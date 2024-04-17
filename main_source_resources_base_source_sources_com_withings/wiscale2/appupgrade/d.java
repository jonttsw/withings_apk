package com.withings.wiscale2.appupgrade;

import c10.d;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.Duration;
import org.joda.time.Period;
import ym0.l;
/* compiled from: OnUpgradeReceiver.kt */
/* loaded from: classes4.dex */
final class d extends w implements l<c10.c<?>, c10.c<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f50103a = new w(1);

    @Override // ym0.l
    public final c10.c<?> invoke(c10.c<?> cVar) {
        c10.c<?> notification = cVar;
        u.j(notification, "notification");
        if (notification.e() instanceof d.C0292d) {
            Duration standardDuration = Period.weeks(1).toStandardDuration();
            u.i(standardDuration, "toStandardDuration(...)");
            return c10.c.a(notification, false, null, null, standardDuration, 1023);
        }
        return null;
    }
}
