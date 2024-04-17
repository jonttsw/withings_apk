package com.withings.wiscale2.device.common.conversation;

import androidx.camera.camera2.internal.s2;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.Alarm;
import com.withings.comm.wpp.generated.object.AlarmEnabled;
import com.withings.comm.wpp.generated.object.ProgramSetting;
import com.withings.device.Device;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.x;
/* compiled from: GetAndSaveAlarmsConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/GetAndSaveAlarmsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GetAndSaveAlarmsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f50713f;

    /* renamed from: g  reason: collision with root package name */
    private final rg.b f50714g;

    public GetAndSaveAlarmsConversation(kn.e deviceManager, rg.b deviceAlarmManager) {
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(deviceAlarmManager, "deviceAlarmManager");
        this.f50713f = deviceManager;
        this.f50714g = deviceAlarmManager;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [nj.h, nj.a] */
    /* JADX WARN: Type inference failed for: r2v5, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        u70.i v11 = v();
        kn.e eVar = this.f50713f;
        Device f11 = eVar.f(v11);
        ?? aVar = new nj.a(x());
        boolean z5 = false;
        aVar.c((short) 293, new com.withings.comm.wpp.h[0]);
        aVar.j();
        ArrayList arrayList = new ArrayList();
        for (com.withings.comm.wpp.h hVar : aVar.D().d()) {
            if (hVar instanceof Alarm) {
                qj.a aVar2 = new qj.a();
                aVar2.d(new ArrayList());
                aVar2.c((Alarm) hVar);
                arrayList.add(aVar2);
            } else if (hVar instanceof ProgramSetting) {
                ((qj.a) androidx.appcompat.view.menu.d.d(arrayList, 1)).b().add(hVar);
            }
        }
        long id2 = f11.getId();
        rg.b bVar = this.f50714g;
        bVar.a(id2);
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 >= 0) {
                arrayList2.add(qg.e.d(f11, (qj.a) next, (short) i12));
                i11 = i12;
            } else {
                x.K0();
                throw null;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            DeviceAlarm deviceAlarm = (DeviceAlarm) next2;
            kotlin.jvm.internal.u.g(deviceAlarm);
            if (s2.p(deviceAlarm)) {
                arrayList3.add(next2);
            }
        }
        bVar.h(r(), f11, arrayList3);
        try {
            ?? aVar3 = new nj.a(x());
            aVar3.c((short) 2330, new com.withings.comm.wpp.h[0]);
            if (((AlarmEnabled) aVar3.y(AlarmEnabled.class)).state == 1) {
                z5 = true;
            }
            f11.setAlarmsEnabled(z5);
            eVar.t(f11);
        } catch (UnsupportedCommandException unused) {
        }
    }
}
