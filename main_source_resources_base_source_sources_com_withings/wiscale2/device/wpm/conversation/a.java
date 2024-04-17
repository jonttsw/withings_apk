package com.withings.wiscale2.device.wpm.conversation;

import android.content.Context;
import android.content.Intent;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.remote.exception.ConnectionClosedException;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.device.DeviceModel;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.conversation.WpmMeasureConversation;
import com.withings.wiscale2.device.wpm.ui.Wpm0203Activity;
import dj.u;
import ej.w;
import fl.p;
import jk0.c;
import kotlin.jvm.internal.u;
import u70.i;
import we0.l;
/* compiled from: WpmDelegate.java */
/* loaded from: classes5.dex */
public final class a implements WpmMeasureConversation.a {

    /* renamed from: a  reason: collision with root package name */
    private Context f55601a;

    public a(Context context) {
        this.f55601a = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(WpmMeasureConversation wpmMeasureConversation) {
        i macAddress = wpmMeasureConversation.v();
        p a11 = p.f67672b.a();
        cj.b wppDevice = wpmMeasureConversation.x();
        u.j(wppDevice, "wppDevice");
        DeviceModel deviceModel = new DeviceModel(a11.f(wppDevice).a(), null);
        Wpm0203Activity.f55615n.getClass();
        Context context = this.f55601a;
        u.j(context, "context");
        u.j(macAddress, "macAddress");
        Intent intent = new Intent(context, Wpm0203Activity.class);
        intent.putExtra("macAddress", macAddress);
        intent.putExtra("deviceModel", deviceModel);
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        if (u70.a.b().d(0L)) {
            com.withings.wiscale2.notification.i.k(context, context.getString(C1987R.string._BPM02_READY_NOTIFICATION_), context.getString(C1987R.string._BPM02_CONNECTED_NOTIFICATION_), intent);
        } else {
            context.startActivity(intent);
        }
    }

    public final void b() {
        Context context = this.f55601a;
        com.withings.wiscale2.notification.i.j(context, context.getString(C1987R.string._BPM02_READY_NOTIFICATION_));
        c.b().d(new Object());
    }

    public final void c(ProbeReply probeReply, l lVar) {
        c.b().d(new xe0.a(probeReply, lVar));
        Context context = this.f55601a;
        com.withings.wiscale2.notification.i.j(context, context.getString(C1987R.string._BPM02_READY_NOTIFICATION_));
        c.b().d(new Object());
    }

    public final void d() {
        Context context = this.f55601a;
        com.withings.wiscale2.notification.i.j(context, context.getString(C1987R.string._BPM02_MEASURING_NOTIFICATION_));
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation wppDeviceConversation, Exception exc) {
        if (exc instanceof ConnectionClosedException) {
            w.w().E(wppDeviceConversation.v()).onEvent(new u.a(wppDeviceConversation.x()));
        } else {
            a((WpmMeasureConversation) wppDeviceConversation);
        }
        com.withings.wiscale2.notification.i.a();
    }
}
