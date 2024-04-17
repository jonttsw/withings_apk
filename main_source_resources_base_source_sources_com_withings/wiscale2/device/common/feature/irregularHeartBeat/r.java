package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import com.withings.comm.wpp.generated.object.LocalNotification;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IrregularHeartBeatSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class r extends w implements ym0.l<List<LocalNotification>, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final r f52374a = new w(1);

    @Override // ym0.l
    public final Boolean invoke(List<LocalNotification> list) {
        List<LocalNotification> notifications = list;
        u.j(notifications, "notifications");
        return Boolean.valueOf(androidx.health.connect.client.units.d.k(notifications, (short) 1));
    }
}
