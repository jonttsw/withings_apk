package com.withings.wiscale2.device.hwa06.conversation;

import com.withings.alarm.conversation.GetAlarmSettingsConversation;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.user.User;
import com.withings.wiscale2.device.common.conversation.GetAndSaveAlarmsConversation;
import com.withings.wiscale2.device.common.conversation.SendStepGoalConversation;
import com.withings.wiscale2.device.common.conversation.SendTrackerUserAndSecretConversation;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import rg.b;
/* compiled from: Hwa06InitConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/hwa06/conversation/Hwa06InitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa06InitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final User f54297f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f54298g;

    /* renamed from: h  reason: collision with root package name */
    private final e f54299h;

    /* renamed from: i  reason: collision with root package name */
    private final b f54300i;

    public Hwa06InitConversation(User user, boolean z5) {
        e c11 = e.c();
        u.i(c11, "get(...)");
        b b10 = b.b();
        u.i(b10, "get(...)");
        this.f54297f = user;
        this.f54298g = z5;
        this.f54299h = c11;
        this.f54300i = b10;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
        boolean z5 = this.f54298g;
        User user = this.f54297f;
        e eVar = this.f54299h;
        E(new SendTrackerUserAndSecretConversation(user, eVar, z5));
        E(new SendStepGoalConversation(user));
        E(new GetAlarmSettingsConversation());
        E(new GetAndSaveAlarmsConversation(eVar, this.f54300i));
    }
}
