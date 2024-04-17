package com.withings.wiscale2.notification;

import com.withings.leaderboard.repositories.webservice.LeaderboardRemoteRepository;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: LeaderboardNotificationManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/notification/LeaderboardNotificationActionReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LeaderboardNotificationActionReceiver extends Hilt_LeaderboardNotificationActionReceiver {
    @Inject

    /* renamed from: c  reason: collision with root package name */
    public LeaderboardRemoteRepository f58727c;
    @Inject

    /* renamed from: d  reason: collision with root package name */
    public r70.c f58728d;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // com.withings.wiscale2.notification.Hilt_LeaderboardNotificationActionReceiver, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onReceive(android.content.Context r11, android.content.Intent r12) {
        /*
            r10 = this;
            super.onReceive(r11, r12)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.u.j(r11, r0)
            java.lang.String r0 = "intent"
            kotlin.jvm.internal.u.j(r12, r0)
            java.lang.String r0 = "KEY_SENDER_ID"
            r1 = 0
            long r8 = r12.getLongExtra(r0, r1)
            java.lang.String r0 = "KEY_NOTIFICATION_ID"
            r1 = 0
            int r0 = r12.getIntExtra(r0, r1)
            java.lang.String r2 = r12.getAction()
            if (r2 == 0) goto L60
            java.lang.String r3 = "LeaderboardNotificationManager.ACTION_CHEER"
            boolean r3 = dp0.j.r(r2, r3, r1)
            r4 = 0
            if (r3 == 0) goto L2f
            com.withings.leaderboard.utils.LeaderboardMessageType r1 = com.withings.leaderboard.utils.LeaderboardMessageType.CHEER
        L2d:
            r5 = r1
            goto L46
        L2f:
            java.lang.String r3 = "LeaderboardNotificationManager.ACTION_TAUNT"
            boolean r3 = dp0.j.r(r2, r3, r1)
            if (r3 == 0) goto L3a
            com.withings.leaderboard.utils.LeaderboardMessageType r1 = com.withings.leaderboard.utils.LeaderboardMessageType.TAUNT
            goto L2d
        L3a:
            java.lang.String r3 = "LeaderboardNotificationManager.ACTION_MESSAGE"
            boolean r1 = dp0.j.r(r2, r3, r1)
            if (r1 == 0) goto L45
            com.withings.leaderboard.utils.LeaderboardMessageType r1 = com.withings.leaderboard.utils.LeaderboardMessageType.MESSAGE
            goto L2d
        L45:
            r5 = r4
        L46:
            if (r5 != 0) goto L49
            goto L60
        L49:
            androidx.core.app.y r1 = androidx.core.app.y.c(r11)
            r1.b(r0, r4)
            vh.j r0 = vh.h.l()
            com.withings.wiscale2.notification.b r1 = new com.withings.wiscale2.notification.b
            r3 = r1
            r4 = r10
            r6 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r0.b(r1)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.notification.LeaderboardNotificationActionReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
