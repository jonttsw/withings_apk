package com.withings.device.details.wsd.conversation;

import android.os.Handler;
import android.os.Looper;
import android.text.format.DateFormat;
import com.withings.alarm.conversation.GetAlarmSettingsConversation;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.Traces;
import com.withings.comm.wpp.generated.object.Alarm;
import com.withings.comm.wpp.generated.object.ProgramSetting;
import com.withings.comm.wpp.generated.object.SetClockMode;
import com.withings.device.Device;
import com.withings.device.details.wsd.conversation.WsdInitConversation;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import ej.w;
import gj.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vi.o;
import wi.c;
import xi.b;
import yi.d;
import zi.h;
/* compiled from: WsdInitConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/device/details/wsd/conversation/WsdInitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "<init>", "()V", "a", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdInitConversation extends WppDeviceConversation {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WsdInitConversation.kt */
    /* loaded from: classes3.dex */
    public static final class a implements i<o> {

        /* renamed from: a  reason: collision with root package name */
        private final Device f37054a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f37055b = new Handler(Looper.getMainLooper());

        public a(Device device) {
            this.f37054a = device;
        }

        @Override // gj.i
        public final void a(d scanningAbility, int i11) {
            u.j(scanningAbility, "scanningAbility");
        }

        @Override // gj.i
        public final Class<o> b() {
            return o.class;
        }

        public final void c() {
            if (!u.e("t", this.f37054a.getManualGeoloc())) {
                w.w().o(this);
                this.f37055b.postDelayed(new Runnable() { // from class: com.withings.device.details.wsd.conversation.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        WsdInitConversation.a this$0 = WsdInitConversation.a.this;
                        u.j(this$0, "this$0");
                        w.w().K(this$0);
                    }
                }, 10000L);
            }
        }

        @Override // gj.i
        public final void e(b bVar) {
            o remoteDevice = (o) bVar;
            u.j(remoteDevice, "remoteDevice");
            c cVar = new c(remoteDevice);
            Device device = this.f37054a;
            if (jl.a.d(cVar, device)) {
                device.setTimezone(TimeZone.getDefault());
                device.setManualGeoloc("t");
                e.c().t(device);
                w.w().K(this);
            }
        }

        @Override // gj.i
        public final boolean g() {
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        boolean z5 = false;
        if (!(x().j() instanceof h)) {
            com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
            u.i(a11, "get(...)");
            E(new SendTimeConversation(a11));
        }
        boolean is24HourFormat = DateFormat.is24HourFormat(r());
        nj.a aVar = new nj.a(x());
        SetClockMode setClockMode = new SetClockMode();
        setClockMode.type = (short) (!is24HourFormat ? 1 : 0);
        aVar.c((short) 2314, setClockMode);
        aVar.j();
        Device f11 = e.c().f(v());
        if (f11 != null) {
            new a(f11).c();
            ArrayList arrayList = new ArrayList();
            ?? aVar2 = new nj.a(x());
            aVar2.c((short) 293, new com.withings.comm.wpp.h[0]);
            aVar2.j();
            ArrayList arrayList2 = new ArrayList();
            for (com.withings.comm.wpp.h hVar : aVar2.D().d()) {
                if (hVar instanceof Alarm) {
                    qj.a aVar3 = new qj.a();
                    aVar3.d(new ArrayList());
                    aVar3.c((Alarm) hVar);
                    arrayList2.add(aVar3);
                } else if (hVar instanceof ProgramSetting) {
                    ((qj.a) androidx.appcompat.view.menu.d.d(arrayList2, 1)).b().add(hVar);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Alarm a12 = ((qj.a) it.next()).a();
                com.withings.comm.trace.e.a().d(x(), Traces.a.a(a12.hour, a12.minute, a12.wday, a12.mday, a12.month, a12.year, a12.span, false));
            }
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                i11++;
                arrayList.add(qg.e.d(f11, (qj.a) arrayList2.get(i11), (short) i11));
            }
            rg.b.b().h(r(), f11, arrayList);
            E(new GetAlarmSettingsConversation());
            cj.b x11 = x();
            u.i(x11, "getWppDevice(...)");
            if (new sn.a(x11).a().a().state == 1) {
                z5 = true;
            }
            f11.setAlarmsEnabled(z5);
            e.c().t(f11);
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }
}
