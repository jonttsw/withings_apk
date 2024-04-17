package com.withings.wiscale2.appupgrade;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.collections.c1;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import org.joda.time.Instant;
import ym0.l;
/* compiled from: OnUpgradeReceiver.kt */
/* loaded from: classes4.dex */
final class e extends w implements l<c10.c<?>, c10.c<?>> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f50104a = new w(1);

    @Override // ym0.l
    public final c10.c<?> invoke(c10.c<?> cVar) {
        c10.c<?> notification = cVar;
        u.j(notification, "notification");
        if (u.e(notification.i(), "unknown_measure")) {
            return c10.c.a(notification, false, null, c1.b(x.U0(notification.f()), ConstantsWs.APP_SECTION_WARNINGS), null, 1535);
        }
        if (u.e(notification.b(), "start_tracking_steps")) {
            return c10.c.a(notification, false, Instant.now(), null, null, 1791);
        }
        return null;
    }
}
