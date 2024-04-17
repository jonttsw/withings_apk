package com.withings.alarm.conversation;

import com.withings.alarm.conversation.TrackerSetAlarmsConversation;
import com.withings.alarm.model.DeviceAlarm;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TrackerSetAlarmsConversation.kt */
/* loaded from: classes3.dex */
public final class b extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TrackerSetAlarmsConversation f31052a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DeviceAlarm f31053b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<DeviceAlarm> f31054c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TrackerSetAlarmsConversation trackerSetAlarmsConversation, DeviceAlarm deviceAlarm, ArrayList arrayList) {
        super(0);
        this.f31052a = trackerSetAlarmsConversation;
        this.f31053b = deviceAlarm;
        this.f31054c = arrayList;
    }

    @Override // ym0.a
    public final y invoke() {
        TrackerSetAlarmsConversation trackerSetAlarmsConversation = this.f31052a;
        trackerSetAlarmsConversation.R().d(this.f31053b, this.f31054c);
        TrackerSetAlarmsConversation.b bVar = trackerSetAlarmsConversation.f31038f;
        if (bVar != null) {
            bVar.U2(trackerSetAlarmsConversation);
        }
        return y.f85009a;
    }
}
