package com.withings.wiscale2.device.hwa06.conversation;

import android.content.Context;
import android.content.SharedPreferences;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.common.device.conversation.GetAndStoreBatteryConversation;
import com.withings.common.device.conversation.SafeCheckForUpgradeConversation;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.device.common.conversation.CheckDeviceLinkConversation;
import com.withings.wiscale2.device.common.conversation.SportVasistasSyncConversation;
import com.withings.wiscale2.device.common.conversation.VasistasSyncConversation;
import com.withings.wiscale2.device.common.conversation.k;
import com.withings.wiscale2.device.common.conversation.n;
import com.withings.wiscale2.device.common.conversation.t;
import dj.m;
import ej0.b;
import fl.o;
import fl.p;
import gl.o0;
import jl.c;
import jl.d;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.joda.time.DateTime;
import xb0.i;
/* compiled from: Hwa06SyncConversation.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/hwa06/conversation/Hwa06SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lcom/withings/wiscale2/device/common/conversation/t$a;", "Lxb0/i$a;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa06SyncConversation extends WppDeviceConversation implements t.a, i.a {

    /* renamed from: f  reason: collision with root package name */
    private final k f54301f;

    /* renamed from: g  reason: collision with root package name */
    private final e f54302g;

    /* renamed from: h  reason: collision with root package name */
    private final b f54303h;

    /* renamed from: i  reason: collision with root package name */
    private final oi0.b f54304i;

    /* renamed from: j  reason: collision with root package name */
    private final m70.i f54305j;

    /* renamed from: k  reason: collision with root package name */
    private final i f54306k;

    /* renamed from: l  reason: collision with root package name */
    private final g f54307l;

    public Hwa06SyncConversation(int i11, n nVar) {
        nVar = (i11 & 1) != 0 ? null : nVar;
        e c11 = e.c();
        u.i(c11, "get(...)");
        b e11 = b.e();
        u.i(e11, "get(...)");
        oi0.b h11 = oi0.b.h();
        u.i(h11, "get(...)");
        m70.i b10 = m70.i.b();
        u.i(b10, "get(...)");
        this.f54301f = nVar;
        this.f54302g = c11;
        this.f54303h = e11;
        this.f54304i = h11;
        this.f54305j = b10;
        this.f54306k = new i(new int[]{5, 1, 1}, this);
        this.f54307l = h.b(new a(this));
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        o0 o0Var;
        b bVar = this.f54303h;
        e eVar = this.f54302g;
        CheckDeviceLinkConversation checkDeviceLinkConversation = new CheckDeviceLinkConversation(bVar, eVar, this.f54305j);
        E(checkDeviceLinkConversation);
        User M = checkDeviceLinkConversation.M();
        Device L = checkDeviceLinkConversation.L();
        E(new GetAndStoreBatteryConversation(L, eVar));
        E(new Hwa06InitConversation(M, false));
        i iVar = this.f54306k;
        oi0.b bVar2 = this.f54304i;
        k kVar = this.f54301f;
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
        SharedPreferences sharedPreferences = r().getSharedPreferences("withings-library-temp", 0);
        u.i(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long q11 = M.q();
        edit.putLong("lastStepTrackerSync" + q11, new DateTime().getMillis());
        edit.apply();
        p a11 = p.f67672b.a();
        cj.b x11 = x();
        u.i(x11, "getWppDevice(...)");
        o f11 = a11.f(x11);
        if (f11 instanceof o0) {
            o0Var = (o0) f11;
        } else {
            o0Var = null;
        }
        if (o0Var != null && o0Var.s((int) x().i().softVersion)) {
            VasistasSyncConversation vasistasSyncConversation2 = new VasistasSyncConversation(M, Vasistas.Category.SWIM, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
            vasistasSyncConversation2.Z(new t(this));
            if (kVar != null) {
                for (VasistasSyncConversation.a aVar2 : kVar.h(this)) {
                    vasistasSyncConversation2.Z(aVar2);
                }
            }
            E(vasistasSyncConversation2);
        }
        iVar.c(iVar.a() + 1);
        SportVasistasSyncConversation sportVasistasSyncConversation = new SportVasistasSyncConversation(M);
        if (kVar != null) {
            for (SportVasistasSyncConversation.a aVar3 : kVar.a(this)) {
                sportVasistasSyncConversation.O(aVar3);
            }
        }
        E(sportVasistasSyncConversation);
        iVar.c(iVar.a() + 1);
        nj.a aVar4 = new nj.a(x());
        aVar4.c((short) 277, new com.withings.comm.wpp.h[0]);
        aVar4.j();
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
        com.withings.comm.trace.e a12 = com.withings.comm.trace.e.a();
        u.i(a12, "get(...)");
        q().B(new DebugDumpConversation(a12, new jl.b(eVar), dVar, new c(0L)), DebugDumpConversation.class, new Object());
    }

    @Override // xb0.i.a
    public final void m(float f11) {
        ((dj.t) this.f54307l.getValue()).onEvent(new m(x(), (int) (100 * f11)));
        k kVar = this.f54301f;
        if (kVar != null) {
            kVar.b(this, f11);
        }
    }

    @Override // com.withings.wiscale2.device.common.conversation.t.a
    public final void n(VasistasSyncConversation syncConversation, float f11) {
        u.j(syncConversation, "syncConversation");
        this.f54306k.b(f11);
    }
}
