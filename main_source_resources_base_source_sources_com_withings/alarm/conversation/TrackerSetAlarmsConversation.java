package com.withings.alarm.conversation;

import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.ui.TrackerSetAlarmAbstractActivity;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.AlarmEnabled;
import com.withings.comm.wpp.h;
import com.withings.device.Device;
import com.withings.util.log.Fail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import pg.f;
/* compiled from: TrackerSetAlarmsConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/alarm/conversation/TrackerSetAlarmsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "alarm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TrackerSetAlarmsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private b f31038f;

    /* renamed from: g  reason: collision with root package name */
    private final rg.b f31039g;

    /* renamed from: h  reason: collision with root package name */
    private final kn.e f31040h;

    /* renamed from: i  reason: collision with root package name */
    private List<a> f31041i;

    /* compiled from: TrackerSetAlarmsConversation.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ym0.a<y> f31042a;

        public a(ym0.a<y> aVar) {
            this.f31042a = aVar;
        }

        public final void a() throws IOException {
            this.f31042a.invoke();
        }
    }

    /* compiled from: TrackerSetAlarmsConversation.kt */
    /* loaded from: classes3.dex */
    public interface b extends WppDeviceConversation.b {
        void B1(boolean z5);

        void U2(TrackerSetAlarmsConversation trackerSetAlarmsConversation);
    }

    /* compiled from: TrackerSetAlarmsConversation.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceAlarm f31044b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<DeviceAlarm> f31045c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(DeviceAlarm deviceAlarm, List<? extends DeviceAlarm> list) {
            super(0);
            this.f31044b = deviceAlarm;
            this.f31045c = list;
        }

        @Override // ym0.a
        public final y invoke() {
            TrackerSetAlarmsConversation trackerSetAlarmsConversation = TrackerSetAlarmsConversation.this;
            trackerSetAlarmsConversation.R().c(this.f31044b, this.f31045c);
            b bVar = trackerSetAlarmsConversation.f31038f;
            if (bVar != null) {
                bVar.U2(trackerSetAlarmsConversation);
            }
            return y.f85009a;
        }
    }

    /* compiled from: TrackerSetAlarmsConversation.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceAlarm f31047b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<DeviceAlarm> f31048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(DeviceAlarm deviceAlarm, List<? extends DeviceAlarm> list) {
            super(0);
            this.f31047b = deviceAlarm;
            this.f31048c = list;
        }

        @Override // ym0.a
        public final y invoke() {
            TrackerSetAlarmsConversation trackerSetAlarmsConversation = TrackerSetAlarmsConversation.this;
            trackerSetAlarmsConversation.R().a(this.f31047b, this.f31048c);
            b bVar = trackerSetAlarmsConversation.f31038f;
            if (bVar != null) {
                bVar.U2(trackerSetAlarmsConversation);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TrackerSetAlarmsConversation.kt */
    /* loaded from: classes3.dex */
    public static final class e extends w implements ym0.a<y> {
        e() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [nj.h, nj.a] */
        @Override // ym0.a
        public final y invoke() {
            TrackerSetAlarmsConversation trackerSetAlarmsConversation = TrackerSetAlarmsConversation.this;
            Device f11 = trackerSetAlarmsConversation.f31040h.f(trackerSetAlarmsConversation.x().g());
            ?? aVar = new nj.a(trackerSetAlarmsConversation.x());
            boolean z5 = false;
            aVar.c((short) 2330, new h[0]);
            if (((AlarmEnabled) aVar.y(AlarmEnabled.class)).state == 1) {
                z5 = true;
            }
            f11.setAlarmsEnabled(z5);
            trackerSetAlarmsConversation.f31040h.t(f11);
            b bVar = trackerSetAlarmsConversation.f31038f;
            if (bVar != null) {
                bVar.B1(z5);
            }
            return y.f85009a;
        }
    }

    public TrackerSetAlarmsConversation(b bVar, rg.b deviceAlarmManager, kn.e deviceManager) {
        u.j(deviceAlarmManager, "deviceAlarmManager");
        u.j(deviceManager, "deviceManager");
        this.f31038f = bVar;
        this.f31039g = deviceAlarmManager;
        this.f31040h = deviceManager;
        List<a> synchronizedList = Collections.synchronizedList(new ArrayList());
        u.i(synchronizedList, "synchronizedList(...)");
        this.f31041i = synchronizedList;
    }

    private final void P(a aVar) {
        List<a> list = this.f31041i;
        if (!list.contains(aVar)) {
            list.add(aVar);
        }
        G(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qg.d R() {
        Object e11 = x().e();
        boolean z5 = e11 instanceof f;
        kn.e eVar = this.f31040h;
        rg.b bVar = this.f31039g;
        if (z5 && ((f) e11).d() >= 2) {
            if (e11 instanceof pg.e) {
                pg.e eVar2 = (pg.e) e11;
                if (!u.e(eVar2.h(), Boolean.FALSE)) {
                    if (u.e(eVar2.h(), Boolean.TRUE)) {
                        return new qg.c(this, bVar, eVar);
                    }
                    Fail.j("Unsupported alarm version, the app will fallback on AlarmsV2Protocol");
                    return new qg.b(this, bVar, eVar);
                }
            }
            return new qg.b(this, bVar, eVar);
        }
        return new qg.a(this, bVar, eVar);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        B(120000L, false, false);
        E(new GetAlarmSettingsConversation());
        R().b();
        b bVar = this.f31038f;
        if (bVar != null) {
            ((TrackerSetAlarmAbstractActivity) bVar).G3(this);
        }
        while (true) {
            Object K = K();
            u.i(K, "waitForInput(...)");
            if (!((Boolean) K).booleanValue()) {
                break;
            }
            while (true) {
                List<a> list = this.f31041i;
                if (!list.isEmpty()) {
                    list.remove(0).a();
                }
            }
        }
        while (true) {
            List<a> list2 = this.f31041i;
            if (!list2.isEmpty()) {
                list2.remove(0).a();
            } else {
                return;
            }
        }
    }

    public final void O(DeviceAlarm deviceAlarm, List<? extends DeviceAlarm> deviceAlarms) {
        u.j(deviceAlarms, "deviceAlarms");
        P(new a(new c(deviceAlarm, deviceAlarms)));
    }

    public final void Q(DeviceAlarm deviceAlarm, List<? extends DeviceAlarm> deviceAlarms) {
        u.j(deviceAlarm, "deviceAlarm");
        u.j(deviceAlarms, "deviceAlarms");
        P(new a(new d(deviceAlarm, deviceAlarms)));
    }

    public final void S() {
        P(new a(new e()));
    }

    public final void T(b bVar) {
        this.f31038f = bVar;
    }

    public final void U() {
        P(new a(new com.withings.alarm.conversation.a(this)));
        S();
    }

    public final void V(DeviceAlarm deviceAlarm, ArrayList arrayList) {
        u.j(deviceAlarm, "deviceAlarm");
        P(new a(new com.withings.alarm.conversation.b(this, deviceAlarm, arrayList)));
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f31038f;
    }
}
