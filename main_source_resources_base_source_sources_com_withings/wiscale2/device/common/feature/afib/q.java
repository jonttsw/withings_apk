package com.withings.wiscale2.device.common.feature.afib;

import com.withings.comm.wpp.generated.object.LocalNotification;
import java.util.List;
import kotlin.jvm.internal.w;
/* compiled from: AfibSettingsActivity.kt */
/* loaded from: classes5.dex */
final class q extends w implements ym0.l<List<LocalNotification>, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final q f51033a = new w(1);

    @Override // ym0.l
    public final Boolean invoke(List<LocalNotification> list) {
        List<LocalNotification> notifications = list;
        kotlin.jvm.internal.u.j(notifications, "notifications");
        return Boolean.valueOf(androidx.health.connect.client.units.d.k(notifications, (short) 1));
    }
}
