package com.withings.wiscale2.notification;

import android.content.Context;
import android.content.Intent;
import com.withings.leaderboard.utils.LeaderboardMessageType;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt;
import nm0.y;
/* compiled from: LeaderboardNotificationManager.kt */
/* loaded from: classes5.dex */
final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LeaderboardNotificationActionReceiver f58742a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LeaderboardMessageType f58743b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f58744c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Intent f58745d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f58746e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LeaderboardNotificationActionReceiver leaderboardNotificationActionReceiver, LeaderboardMessageType leaderboardMessageType, Context context, Intent intent, long j5) {
        super(0);
        this.f58742a = leaderboardNotificationActionReceiver;
        this.f58743b = leaderboardMessageType;
        this.f58744c = context;
        this.f58745d = intent;
        this.f58746e = j5;
    }

    @Override // ym0.a
    public final y invoke() {
        BuildersKt.runBlocking$default(null, new a(this.f58742a, this.f58743b, this.f58744c, this.f58745d, this.f58746e, null), 1, null);
        return y.f85009a;
    }
}
