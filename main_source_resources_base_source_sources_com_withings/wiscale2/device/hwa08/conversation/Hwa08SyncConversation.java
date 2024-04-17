package com.withings.wiscale2.device.hwa08.conversation;

import android.content.Context;
import android.content.SharedPreferences;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.comm.wpp.h;
import com.withings.common.device.conversation.GetAndStoreBatteryConversation;
import com.withings.common.device.conversation.SafeCheckForUpgradeConversation;
import com.withings.device.Device;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.note.model.NoteRepository;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.data.WiscaleDBH;
import com.withings.wiscale2.device.common.conversation.CheckDeviceLinkConversation;
import com.withings.wiscale2.device.common.conversation.DeviceWithSignalSyncConversation;
import com.withings.wiscale2.device.common.conversation.SportVasistasSyncConversation;
import com.withings.wiscale2.device.common.conversation.VasistasSyncConversation;
import com.withings.wiscale2.device.common.conversation.k;
import com.withings.wiscale2.device.common.conversation.n;
import com.withings.wiscale2.device.common.conversation.t;
import dj.m;
import fl.o;
import fl.p;
import fy.v;
import gl.o0;
import jl.d;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import org.joda.time.DateTime;
import vf.c;
import xb0.i;
import zx.j;
/* compiled from: Hwa08SyncConversation.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/hwa08/conversation/Hwa08SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lcom/withings/wiscale2/device/common/conversation/t$a;", "Lxb0/i$a;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa08SyncConversation extends WppDeviceConversation implements t.a, i.a {

    /* renamed from: f  reason: collision with root package name */
    private final k f54387f;

    /* renamed from: g  reason: collision with root package name */
    private final e f54388g;

    /* renamed from: h  reason: collision with root package name */
    private final ej0.b f54389h;

    /* renamed from: i  reason: collision with root package name */
    private final oi0.b f54390i;

    /* renamed from: j  reason: collision with root package name */
    private final m70.i f54391j;

    /* renamed from: k  reason: collision with root package name */
    private final c f54392k;

    /* renamed from: l  reason: collision with root package name */
    private final NoteRepository f54393l;

    /* renamed from: m  reason: collision with root package name */
    private final v f54394m;

    /* renamed from: n  reason: collision with root package name */
    private final HeartSignalRepository f54395n;

    /* renamed from: o  reason: collision with root package name */
    private final jq.k f54396o;

    /* renamed from: p  reason: collision with root package name */
    private final g f54397p;

    /* renamed from: q  reason: collision with root package name */
    private final i f54398q;

    public Hwa08SyncConversation() {
        this(null, null, null, 1023);
    }

    public static final void L(Hwa08SyncConversation hwa08SyncConversation, double d11) {
        hwa08SyncConversation.f54398q.b((float) d11);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        o0 o0Var;
        ej0.b bVar = this.f54389h;
        e eVar = this.f54388g;
        CheckDeviceLinkConversation checkDeviceLinkConversation = new CheckDeviceLinkConversation(bVar, eVar, this.f54391j);
        E(checkDeviceLinkConversation);
        User M = checkDeviceLinkConversation.M();
        Device L = checkDeviceLinkConversation.L();
        E(new GetAndStoreBatteryConversation(L, eVar));
        E(new Hwa08InitConversation(M, false));
        i iVar = this.f54398q;
        oi0.b bVar2 = this.f54390i;
        k kVar = this.f54387f;
        if (kVar != null) {
            try {
                kVar.g(this, L, M);
            } catch (Throwable th2) {
                if (kVar != null) {
                    kVar.j(this);
                }
                bVar2.n(M, ConstantsWs.CALLCTX_TRACKER_DEVICE_SYNC);
                throw th2;
            }
        }
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(M, Vasistas.Category.MOTION, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        vasistasSyncConversation.Z(new t(this));
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.h(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        E(vasistasSyncConversation);
        iVar.c(iVar.a() + 1);
        p.a aVar2 = p.f67672b;
        p a11 = aVar2.a();
        cj.b x11 = x();
        u.i(x11, "getWppDevice(...)");
        o f11 = a11.f(x11);
        jq.c cVar = null;
        if (f11 instanceof o0) {
            o0Var = (o0) f11;
        } else {
            o0Var = null;
        }
        if (o0Var != null && o0Var.s((int) x().i().softVersion)) {
            VasistasSyncConversation vasistasSyncConversation2 = new VasistasSyncConversation(M, Vasistas.Category.SWIM, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
            vasistasSyncConversation2.Z(new t(this));
            if (kVar != null) {
                for (VasistasSyncConversation.a aVar3 : kVar.h(this)) {
                    vasistasSyncConversation2.Z(aVar3);
                }
            }
            E(vasistasSyncConversation2);
        }
        iVar.c(iVar.a() + 1);
        SportVasistasSyncConversation sportVasistasSyncConversation = new SportVasistasSyncConversation(M);
        if (kVar != null) {
            for (SportVasistasSyncConversation.a aVar4 : kVar.a(this)) {
                sportVasistasSyncConversation.O(aVar4);
            }
        }
        E(sportVasistasSyncConversation);
        iVar.c(iVar.a() + 1);
        SharedPreferences sharedPreferences = r().getSharedPreferences("withings-library-temp", 0);
        u.i(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putLong("lastStepTrackerSync" + M.q(), new DateTime().getMillis());
        edit.apply();
        nj.a aVar5 = new nj.a(x());
        aVar5.c((short) 277, new h[0]);
        aVar5.j();
        p a12 = aVar2.a();
        cj.b x12 = x();
        u.i(x12, "getWppDevice(...)");
        o f12 = a12.f(x12);
        if (f12 instanceof jq.c) {
            cVar = (jq.c) f12;
        }
        jq.c cVar2 = cVar;
        if (cVar2 != null) {
            E(new DeviceWithSignalSyncConversation(cVar2, this.f54391j, this.f54392k, this.f54394m, this.f54395n, this.f54396o, this.f54388g, this.f54393l, new a(this)));
        }
        iVar.c(iVar.a() + 1);
        if (kVar != null) {
            kVar.c(this);
        }
        if (kVar != null) {
            kVar.j(this);
        }
        bVar2.n(M, ConstantsWs.CALLCTX_TRACKER_DEVICE_SYNC);
        E(new SafeCheckForUpgradeConversation());
        Context r7 = r();
        u.i(r7, "getContext(...)");
        d dVar = new d(r7);
        com.withings.comm.trace.e a13 = com.withings.comm.trace.e.a();
        u.i(a13, "get(...)");
        q().B(new DebugDumpConversation(a13, new jl.b(eVar), dVar, new jl.c(0L)), DebugDumpConversation.class, new Object());
    }

    @Override // xb0.i.a
    public final void m(float f11) {
        ((dj.t) this.f54397p.getValue()).onEvent(new m(x(), (int) (100 * f11)));
        k kVar = this.f54387f;
        if (kVar != null) {
            kVar.b(this, f11);
        }
    }

    @Override // com.withings.wiscale2.device.common.conversation.t.a
    public final void n(VasistasSyncConversation syncConversation, float f11) {
        u.j(syncConversation, "syncConversation");
        this.f54398q.b(f11);
    }

    public Hwa08SyncConversation(n nVar, HeartSignalRepository heartSignalRepository, jq.k ecgSignalNotifier, int i11) {
        c cVar;
        nVar = (i11 & 1) != 0 ? null : nVar;
        e c11 = e.c();
        u.i(c11, "get(...)");
        ej0.b e11 = ej0.b.e();
        u.i(e11, "get(...)");
        oi0.b h11 = oi0.b.h();
        u.i(h11, "get(...)");
        m70.i b10 = m70.i.b();
        u.i(b10, "get(...)");
        cVar = c.f103617d;
        if (cVar != null) {
            NoteRepository noteRepository = ah.i.f781a;
            if (noteRepository != null) {
                WiscaleDBH f11 = WiscaleDBH.f();
                u.i(f11, "get(...)");
                sw.a z5 = sw.a.z();
                u.i(z5, "get(...)");
                v vVar = new v(new zx.v(z5), f11, j.f111082d.a());
                if ((i11 & 256) != 0 && (heartSignalRepository = androidx.compose.foundation.lazy.layout.d.f4443b) == null) {
                    u.s("heartSignalRepository");
                    throw null;
                } else if ((i11 & 512) != 0 && (ecgSignalNotifier = androidx.compose.foundation.lazy.layout.d.f4445d) == null) {
                    u.s("signalSyncNotifier");
                    throw null;
                } else {
                    u.j(heartSignalRepository, "heartSignalRepository");
                    u.j(ecgSignalNotifier, "ecgSignalNotifier");
                    this.f54387f = nVar;
                    this.f54388g = c11;
                    this.f54389h = e11;
                    this.f54390i = h11;
                    this.f54391j = b10;
                    this.f54392k = cVar;
                    this.f54393l = noteRepository;
                    this.f54394m = vVar;
                    this.f54395n = heartSignalRepository;
                    this.f54396o = ecgSignalNotifier;
                    this.f54397p = nm0.h.b(new b(this));
                    this.f54398q = new i(new int[]{5, 1, 1, 3}, this);
                    return;
                }
            }
            u.s("noteRepository");
            throw null;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }
}
