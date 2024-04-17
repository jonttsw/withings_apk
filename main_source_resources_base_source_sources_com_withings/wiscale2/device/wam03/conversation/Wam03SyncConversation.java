package com.withings.wiscale2.device.wam03.conversation;

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
import com.withings.wiscale2.device.common.conversation.t;
import dj.m;
import ej0.b;
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
/* compiled from: Wam03SyncConversation.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/wam03/conversation/Wam03SyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lxb0/i$a;", "Lcom/withings/wiscale2/device/common/conversation/t$a;", "Lzh0/j$a;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wam03SyncConversation extends WppDeviceConversation implements i.a, t.a, j.a {

    /* renamed from: f  reason: collision with root package name */
    private final k f54953f;

    /* renamed from: g  reason: collision with root package name */
    private final e f54954g;

    /* renamed from: h  reason: collision with root package name */
    private final b f54955h;

    /* renamed from: i  reason: collision with root package name */
    private final m70.i f54956i;

    /* renamed from: j  reason: collision with root package name */
    private final oi0.b f54957j;

    /* renamed from: k  reason: collision with root package name */
    private final i f54958k;

    /* renamed from: l  reason: collision with root package name */
    private final g f54959l;

    /* renamed from: m  reason: collision with root package name */
    private VasistasSyncConversation f54960m;

    /* renamed from: n  reason: collision with root package name */
    private VasistasSyncConversation f54961n;

    public Wam03SyncConversation() {
        this(0);
    }

    private final VasistasSyncConversation L(User user) {
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(user, Vasistas.Category.BODY, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        vasistasSyncConversation.Z(new t(this));
        k kVar = this.f54953f;
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.i(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        this.f54961n = vasistasSyncConversation;
        return vasistasSyncConversation;
    }

    private final VasistasSyncConversation M(User user) {
        VasistasSyncConversation vasistasSyncConversation = new VasistasSyncConversation(user, Vasistas.Category.MOTION, null, false, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        vasistasSyncConversation.Z(new t(this));
        k kVar = this.f54953f;
        if (kVar != null) {
            for (VasistasSyncConversation.a aVar : kVar.h(this)) {
                vasistasSyncConversation.Z(aVar);
            }
        }
        this.f54960m = vasistasSyncConversation;
        return vasistasSyncConversation;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        o0 o0Var;
        b bVar = this.f54955h;
        e eVar = this.f54954g;
        CheckDeviceLinkConversation checkDeviceLinkConversation = new CheckDeviceLinkConversation(bVar, eVar, this.f54956i);
        E(checkDeviceLinkConversation);
        User M = checkDeviceLinkConversation.M();
        Device L = checkDeviceLinkConversation.L();
        E(new ThrowIfOngoingWorkoutConversation());
        i iVar = this.f54958k;
        oi0.b bVar2 = this.f54957j;
        k kVar = this.f54953f;
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
        E(new Wam03InitConversation(M));
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
        VasistasSyncConversation vasistasSyncConversation = this.f54960m;
        if (vasistasSyncConversation != null) {
            return vasistasSyncConversation.X();
        }
        return false;
    }

    @Override // zh0.j.a
    public final boolean l() {
        VasistasSyncConversation vasistasSyncConversation = this.f54961n;
        if (vasistasSyncConversation != null) {
            return vasistasSyncConversation.X();
        }
        return false;
    }

    @Override // xb0.i.a
    public final void m(float f11) {
        ((dj.t) this.f54959l.getValue()).onEvent(new m(x(), (int) (100 * f11)));
        k kVar = this.f54953f;
        if (kVar != null) {
            kVar.b(this, f11);
        }
    }

    @Override // com.withings.wiscale2.device.common.conversation.t.a
    public final void n(VasistasSyncConversation syncConversation, float f11) {
        u.j(syncConversation, "syncConversation");
        this.f54958k.b(f11);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return null;
    }

    public Wam03SyncConversation(e deviceManager, m70.i userManager, k kVar, oi0.b wsSyncManager, b incorrectUserManager) {
        u.j(deviceManager, "deviceManager");
        u.j(incorrectUserManager, "incorrectUserManager");
        u.j(userManager, "userManager");
        u.j(wsSyncManager, "wsSyncManager");
        this.f54953f = kVar;
        this.f54954g = deviceManager;
        this.f54955h = incorrectUserManager;
        this.f54956i = userManager;
        this.f54957j = wsSyncManager;
        this.f54958k = new i(new int[]{1, 10, 10, 50, 5, 50, 5}, this);
        this.f54959l = nm0.h.b(new a(this));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Wam03SyncConversation(int r7) {
        /*
            r6 = this;
            kn.e r1 = kn.e.c()
            java.lang.String r7 = "get(...)"
            kotlin.jvm.internal.u.i(r1, r7)
            ej0.b r5 = ej0.b.e()
            kotlin.jvm.internal.u.i(r5, r7)
            m70.i r2 = m70.i.b()
            kotlin.jvm.internal.u.i(r2, r7)
            oi0.b r4 = oi0.b.h()
            kotlin.jvm.internal.u.i(r4, r7)
            r3 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.wam03.conversation.Wam03SyncConversation.<init>(int):void");
    }
}
