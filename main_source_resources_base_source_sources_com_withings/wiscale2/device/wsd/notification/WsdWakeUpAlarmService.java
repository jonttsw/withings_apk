package com.withings.wiscale2.device.wsd.notification;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import androidx.lifecycle.p0;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.device.Device;
import com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation;
import ej.k;
import ej.w;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTimeConstants;
import qj.m;
import u70.a;
import u70.d;
/* compiled from: WsdWakeUpAlarmService.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wsd/notification/WsdWakeUpAlarmService;", "Landroid/app/Service;", "Lcom/withings/wiscale2/device/wsd/conversation/WsdWakeUpConversation$a;", "Lu70/a$c;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WsdWakeUpAlarmService extends Service implements WsdWakeUpConversation.a, a.c {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f55980l = 0;

    /* renamed from: b  reason: collision with root package name */
    private long f55982b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f55983c;

    /* renamed from: d  reason: collision with root package name */
    private DeviceAlarm f55984d;

    /* renamed from: e  reason: collision with root package name */
    private Device f55985e;

    /* renamed from: g  reason: collision with root package name */
    private k<WsdWakeUpConversation> f55987g;

    /* renamed from: k  reason: collision with root package name */
    private WsdWakeUpConversation f55991k;

    /* renamed from: a  reason: collision with root package name */
    private int f55981a = 2;

    /* renamed from: f  reason: collision with root package name */
    private long f55986f = 60000;

    /* renamed from: h  reason: collision with root package name */
    private final Handler f55988h = new Handler(Looper.getMainLooper());

    /* renamed from: i  reason: collision with root package name */
    private final p0 f55989i = new p0(this, 7);

    /* renamed from: j  reason: collision with root package name */
    private final d f55990j = new d(new b(), 2000);

    /* compiled from: WsdWakeUpAlarmService.kt */
    /* loaded from: classes5.dex */
    public static final class a extends k.e<WsdWakeUpConversation> {
        a() {
        }

        @Override // ej.k.e, ej.k.f
        public final void d(k<WsdWakeUpConversation> conversationSubmitter) {
            u.j(conversationSubmitter, "conversationSubmitter");
            WsdWakeUpAlarmService wsdWakeUpAlarmService = WsdWakeUpAlarmService.this;
            wsdWakeUpAlarmService.f55988h.removeCallbacks(wsdWakeUpAlarmService.f55989i);
        }
    }

    /* compiled from: WsdWakeUpAlarmService.kt */
    /* loaded from: classes5.dex */
    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x70.b.r(this, "refreshStatusRunnable runs", new Object[0]);
            WsdWakeUpAlarmService wsdWakeUpAlarmService = WsdWakeUpAlarmService.this;
            if (wsdWakeUpAlarmService.f55991k != null) {
                x70.b.r(this, "asking wsdStatus", new Object[0]);
                WsdWakeUpConversation wsdWakeUpConversation = wsdWakeUpAlarmService.f55991k;
                u.g(wsdWakeUpConversation);
                wsdWakeUpConversation.O();
            } else {
                wsdWakeUpAlarmService.f55990j.f();
            }
            x70.b.r(this, "refreshStatusRunnable stops", new Object[0]);
        }
    }

    public static void a(WsdWakeUpAlarmService this$0) {
        u.j(this$0, "this$0");
        k<WsdWakeUpConversation> kVar = this$0.f55987g;
        if (kVar != null) {
            kVar.k();
        }
    }

    private final void f() {
        x70.b.r(this, "called stopThis", new Object[0]);
        if (this.f55985e == null) {
            x70.b.t(this, "Error : Device is null", new Object[0]);
            return;
        }
        this.f55990j.f();
        if (this.f55991k != null) {
            if (lf0.d.f79467b != null) {
                lf0.d dVar = lf0.d.f79467b;
                if (dVar != null) {
                    WsdWakeUpConversation wsdWakeUpConversation = this.f55991k;
                    u.g(wsdWakeUpConversation);
                    Context r7 = wsdWakeUpConversation.r();
                    u.i(r7, "getContext(...)");
                    Device device = this.f55985e;
                    u.g(device);
                    dVar.c(r7, device.getId());
                    WsdWakeUpConversation wsdWakeUpConversation2 = this.f55991k;
                    u.g(wsdWakeUpConversation2);
                    wsdWakeUpConversation2.G(Boolean.FALSE);
                } else {
                    u.s("instance");
                    throw null;
                }
            } else {
                u.s("instance");
                throw null;
            }
        }
        this.f55991k = null;
        stopSelf();
    }

    @Override // com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation.a
    public final void B2() {
        x70.b.r(this, "called onConversationStopped", new Object[0]);
        this.f55991k = null;
        f();
    }

    @Override // u70.a.c
    public final long H() {
        return 0L;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        u.j(conversation, "conversation");
        x70.b.r(this, "called onError", new Object[0]);
        this.f55991k = null;
        f();
    }

    @Override // u70.a.c
    public final void f2(long j5) {
        x70.b.r(this, "App is foreground, stop it !", new Object[0]);
        f();
    }

    @Override // com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation.a
    public final void i2(WsdWakeUpConversation wsdWakeUpConversation) {
        this.f55991k = wsdWakeUpConversation;
        x70.b.r(this, "called onConversationReady", new Object[0]);
        this.f55990j.e();
        this.f55982b = System.currentTimeMillis();
    }

    @Override // com.withings.wiscale2.device.wsd.conversation.WsdWakeUpConversation.a
    public final void k(WsdWakeUpConversation wsdWakeUpConversation, m mVar) {
        if (u70.a.b().e()) {
            x70.b.r(this, "App is foreground, stop it !", new Object[0]);
            f();
        }
        if (mVar.b().status == 0) {
            if (this.f55983c) {
                x70.b.r(this, "Aura is idle, and has Rung", new Object[0]);
                f();
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            long j5 = this.f55982b;
            long j11 = this.f55986f;
            if (currentTimeMillis > j5 + j11) {
                x70.b.r(this, ah.a.c("Stop waiting for WSD to ring, we waited ", j11 / 1000, " seconds"), new Object[0]);
                f();
                return;
            }
            x70.b.r(this, ah.a.c("Second ", (System.currentTimeMillis() - this.f55982b) / 1000, "; still waiting for the Aura to ring..."), new Object[0]);
            return;
        }
        int i11 = 2;
        if (mVar.b().status == 2) {
            this.f55983c = true;
            if (mVar.c().substatus == 1) {
                i11 = 0;
            } else if (mVar.c().substatus == 2) {
                i11 = 1;
            }
        }
        if (i11 != this.f55981a) {
            if (lf0.d.f79467b != null) {
                lf0.d dVar = lf0.d.f79467b;
                if (dVar != null) {
                    u.g(wsdWakeUpConversation);
                    Context r7 = wsdWakeUpConversation.r();
                    u.i(r7, "getContext(...)");
                    Device device = this.f55985e;
                    u.g(device);
                    dVar.c(r7, device.getId());
                    if (i11 != 0) {
                        if (i11 == 1) {
                            x70.b.r(this, "New status received : Aura is snoozed !", new Object[0]);
                            if (lf0.d.f79467b != null) {
                                lf0.d dVar2 = lf0.d.f79467b;
                                if (dVar2 != null) {
                                    Device device2 = this.f55985e;
                                    u.g(device2);
                                    DeviceAlarm deviceAlarm = this.f55984d;
                                    u.g(deviceAlarm);
                                    dVar2.e(this, device2, deviceAlarm, false);
                                } else {
                                    u.s("instance");
                                    throw null;
                                }
                            } else {
                                u.s("instance");
                                throw null;
                            }
                        }
                    } else {
                        x70.b.r(this, "New status received : Aura rings !", new Object[0]);
                        if (lf0.d.f79467b != null) {
                            lf0.d dVar3 = lf0.d.f79467b;
                            if (dVar3 != null) {
                                Device device3 = this.f55985e;
                                u.g(device3);
                                DeviceAlarm deviceAlarm2 = this.f55984d;
                                u.g(deviceAlarm2);
                                dVar3.e(this, device3, deviceAlarm2, true);
                            } else {
                                u.s("instance");
                                throw null;
                            }
                        } else {
                            u.s("instance");
                            throw null;
                        }
                    }
                } else {
                    u.s("instance");
                    throw null;
                }
            } else {
                u.s("instance");
                throw null;
            }
        } else {
            x70.b.r(this, "Status received... same as precedent status", new Object[0]);
        }
        this.f55981a = i11;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        u.j(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        try {
            if (this.f55985e != null) {
                if (lf0.d.f79467b != null) {
                    lf0.d dVar = lf0.d.f79467b;
                    if (dVar != null) {
                        Device device = this.f55985e;
                        u.g(device);
                        dVar.c(this, device.getId());
                    } else {
                        u.s("instance");
                        throw null;
                    }
                } else {
                    u.s("instance");
                    throw null;
                }
            }
        } catch (Exception e11) {
            x70.b.e("Crash when WsdWakeUpAlarmService is destroyed !", e11);
            e11.printStackTrace();
        }
        u70.a.b().h(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i11, int i12) {
        u.j(intent, "intent");
        u70.a.b().a(this);
        x70.b.r(this, "Alarm manager woke me up !", new Object[0]);
        Device d11 = e.c().d(intent.getLongExtra("EXTRA_DEVICE", -1L));
        this.f55985e = d11;
        if (d11 != null && d11.getModelId() == 60) {
            byte[] byteArrayExtra = intent.getByteArrayExtra("alarm");
            Parcel obtain = Parcel.obtain();
            u.i(obtain, "obtain(...)");
            u.g(byteArrayExtra);
            obtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
            obtain.setDataPosition(0);
            try {
                this.f55984d = DeviceAlarm.CREATOR.createFromParcel(obtain);
            } catch (Exception e11) {
                x70.b.p(e11);
            }
            if (this.f55984d == null) {
                x70.b.t(this, "Error : DeviceAlarm is null", new Object[0]);
            } else if (!u70.a.b().d(0L)) {
                x70.b.r(this, "We're in foreground, do nothing", new Object[0]);
                stopSelf();
                return 2;
            } else {
                this.f55991k = null;
                DeviceAlarm deviceAlarm = this.f55984d;
                u.g(deviceAlarm);
                if (deviceAlarm.q() >= 20) {
                    long j5 = this.f55986f;
                    DeviceAlarm deviceAlarm2 = this.f55984d;
                    u.g(deviceAlarm2);
                    this.f55986f = j5 + (deviceAlarm2.q() * DateTimeConstants.MILLIS_PER_MINUTE);
                }
                w w11 = w.w();
                cj.d b10 = jl.a.b(this.f55985e);
                WsdWakeUpConversation wsdWakeUpConversation = new WsdWakeUpConversation(this);
                w11.getClass();
                k<WsdWakeUpConversation> u11 = w11.u(b10, wsdWakeUpConversation, WsdWakeUpConversation.class);
                this.f55987g = u11;
                u11.n(new a());
                k<WsdWakeUpConversation> kVar = this.f55987g;
                if (kVar != null) {
                    kVar.r();
                }
                this.f55988h.postDelayed(this.f55989i, 10000L);
                return 2;
            }
        } else {
            x70.b.t(this, "Error : Device is null or not a WSD01", new Object[0]);
        }
        x70.b.t(this, "Incorrect extras", new Object[0]);
        stopSelf();
        return 2;
    }

    @Override // u70.a.c
    public final void Q2() {
    }
}
