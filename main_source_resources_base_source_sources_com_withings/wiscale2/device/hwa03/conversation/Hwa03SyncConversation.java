package com.withings.wiscale2.device.hwa03.conversation;

import android.content.Context;
import android.content.SharedPreferences;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.comm.wpp.h;
import com.withings.common.device.conversation.GetAndStoreBatteryConversation;
import com.withings.common.device.conversation.SafeCheckForUpgradeConversation;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.device.common.conversation.CheckDeviceLinkConversation;
import com.withings.wiscale2.device.common.conversation.SportVasistasSyncConversation;
import com.withings.wiscale2.device.common.conversation.ThrowIfOngoingWorkoutConversation;
import com.withings.wiscale2.device.common.conversation.VasistasSyncConversation;
import com.withings.wiscale2.device.common.conversation.k;
import com.withings.wiscale2.device.common.conversation.n;
import com.withings.wiscale2.device.common.conversation.t;
import dj.m;
import fl.o;
import fl.p;
import gl.o0;
import java.io.IOException;
import jl.c;
import jl.d;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import org.joda.time.DateTime;
import xb0.i;
import zh0.j;
/* compiled from: Hwa03SyncConversation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/hwa03/conversation/Hwa03SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lxb0/i$a;", "Lcom/withings/wiscale2/device/common/conversation/t$a;", "Lzh0/j$a;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa03SyncConversation extends WppDeviceConversation implements i.a, t.a, j.a {

    /* renamed from: f  reason: collision with root package name */
    private final k f54220f;

    /* renamed from: g  reason: collision with root package name */
    private final e f54221g;

    /* renamed from: h  reason: collision with root package name */
    private final ej0.b f54222h;

    /* renamed from: i  reason: collision with root package name */
    private final m70.i f54223i;

    /* renamed from: j  reason: collision with root package name */
    private final oi0.b f54224j;

    /* renamed from: k  reason: collision with root package name */
    private final i f54225k;

    /* renamed from: l  reason: collision with root package name */
    private final g f54226l;

    /* renamed from: m  reason: collision with root package name */
    private VasistasSyncConversation f54227m;

    /* renamed from: n  reason: collision with root package name */
    private VasistasSyncConversation f54228n;

    public Hwa03SyncConversation() {
        this(31, null);
    }

    private final VasistasSyncConversation L(User user) {
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(user, Vasistas.Category.BODY, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        vasistasSyncConversation.Z(new t(this));
        k kVar = this.f54220f;
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.i(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        this.f54228n = vasistasSyncConversation;
        return vasistasSyncConversation;
    }

    private final VasistasSyncConversation M(User user) {
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(user, Vasistas.Category.MOTION, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        vasistasSyncConversation.Z(new t(this));
        k kVar = this.f54220f;
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.h(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        this.f54227m = vasistasSyncConversation;
        return vasistasSyncConversation;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        o0 o0Var;
        ej0.b bVar = this.f54222h;
        e eVar = this.f54221g;
        CheckDeviceLinkConversation checkDeviceLinkConversation = new CheckDeviceLinkConversation(bVar, eVar, this.f54223i);
        E(checkDeviceLinkConversation);
        User M = checkDeviceLinkConversation.M();
        Device L = checkDeviceLinkConversation.L();
        E(new ThrowIfOngoingWorkoutConversation());
        i iVar = this.f54225k;
        oi0.b bVar2 = this.f54224j;
        k kVar = this.f54220f;
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
        E(new GetAndStoreBatteryConversation(L, eVar));
        iVar.c(iVar.a() + 1);
        E(new Hwa03InitConversation(M, 0));
        iVar.c(iVar.a() + 1);
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(M, Vasistas.Category.PAUSE, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        vasistasSyncConversation.Z(new t(this));
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.f(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        E(vasistasSyncConversation);
        iVar.c(iVar.a() + 1);
        E(M(M));
        iVar.c(iVar.a() + 1);
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
        E(L(M));
        iVar.c(iVar.a() + 1);
        SharedPreferences sharedPreferences = r().getSharedPreferences("withings-library-temp", 0);
        u.i(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences.Editor edit = sharedPreferences.edit();
        long q11 = M.q();
        edit.putLong("lastStepTrackerSync" + q11, new DateTime().getMillis());
        edit.apply();
        SportVasistasSyncConversation sportVasistasSyncConversation = new SportVasistasSyncConversation(M);
        if (kVar != null) {
            for (SportVasistasSyncConversation.a aVar3 : kVar.a(this)) {
                sportVasistasSyncConversation.O(aVar3);
            }
        }
        E(sportVasistasSyncConversation);
        iVar.c(iVar.a() + 1);
        nj.a aVar4 = new nj.a(x());
        aVar4.c((short) 277, new h[0]);
        aVar4.j();
        if (kVar != null) {
            kVar.c(this);
        }
        if (kVar != null) {
            kVar.j(this);
        }
        bVar2.n(M, ConstantsWs.CALLCTX_TRACKER_DEVICE_SYNC);
        x70.b.c(this, x().g(), "Synchronisation ended, without error", new Object[0]);
        E(new SafeCheckForUpgradeConversation());
        Context r7 = r();
        u.i(r7, "getContext(...)");
        d dVar = new d(r7);
        com.withings.comm.trace.e a12 = com.withings.comm.trace.e.a();
        u.i(a12, "get(...)");
        q().B(new DebugDumpConversation(a12, new jl.b(eVar), dVar, new c(0L)), DebugDumpConversation.class, new Object());
    }

    @Override // zh0.j.a
    public final boolean b() {
        VasistasSyncConversation vasistasSyncConversation = this.f54227m;
        if (vasistasSyncConversation != null) {
            return vasistasSyncConversation.X();
        }
        return false;
    }

    @Override // zh0.j.a
    public final boolean l() {
        VasistasSyncConversation vasistasSyncConversation = this.f54228n;
        if (vasistasSyncConversation != null) {
            return vasistasSyncConversation.X();
        }
        return false;
    }

    @Override // xb0.i.a
    public final void m(float f11) {
        ((dj.t) this.f54226l.getValue()).onEvent(new m(x(), (int) (100 * f11)));
        k kVar = this.f54220f;
        if (kVar != null) {
            kVar.b(this, f11);
        }
    }

    @Override // com.withings.wiscale2.device.common.conversation.t.a
    public final void n(VasistasSyncConversation syncConversation, float f11) {
        u.j(syncConversation, "syncConversation");
        this.f54225k.b(f11);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }

    public Hwa03SyncConversation(int i11, n nVar) {
        nVar = (i11 & 1) != 0 ? null : nVar;
        e c11 = e.c();
        u.i(c11, "get(...)");
        ej0.b e11 = ej0.b.e();
        u.i(e11, "get(...)");
        m70.i b10 = m70.i.b();
        u.i(b10, "get(...)");
        oi0.b h11 = oi0.b.h();
        u.i(h11, "get(...)");
        this.f54220f = nVar;
        this.f54221g = c11;
        this.f54222h = e11;
        this.f54223i = b10;
        this.f54224j = h11;
        this.f54225k = new i(new int[]{1, 10, 10, 50, 5, 50, 5}, this);
        this.f54226l = nm0.h.b(new b(this));
    }
}
