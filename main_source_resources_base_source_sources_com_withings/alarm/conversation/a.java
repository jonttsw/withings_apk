package com.withings.alarm.conversation;

import com.withings.comm.wpp.generated.object.AlarmEnabled;
import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TrackerSetAlarmsConversation.kt */
/* loaded from: classes3.dex */
public final class a extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f31050a = true;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TrackerSetAlarmsConversation f31051b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(TrackerSetAlarmsConversation trackerSetAlarmsConversation) {
        super(0);
        this.f31051b = trackerSetAlarmsConversation;
    }

    @Override // ym0.a
    public final y invoke() {
        AlarmEnabled alarmEnabled = new AlarmEnabled();
        alarmEnabled.state = this.f31050a ? (short) 1 : (short) 0;
        nj.a aVar = new nj.a(this.f31051b.x().k());
        aVar.c((short) 2331, alarmEnabled);
        aVar.j();
        return y.f85009a;
    }
}
