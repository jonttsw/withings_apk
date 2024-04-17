package com.withings.device.setup.android.setup;

import android.content.Context;
import androidx.camera.camera2.internal.v1;
import androidx.compose.material.r7;
import androidx.compose.ui.platform.k2;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceSetupConversation;
import com.withings.comm.remote.exception.ConversationCanceledException;
import com.withings.comm.remote.exception.ConversationTimeoutException;
import com.withings.comm.remote.exception.FatalWebserviceException;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.BatteryStatus;
import com.withings.device.setup.android.setup.b;
import com.withings.device.setup.android.setup.handcalibration.HandsCalibrationConversation;
import com.withings.device.setup.android.setup.k;
import com.withings.device.setup.android.setup.setupok.SetupOkConversation;
import com.withings.devicesetup.DeviceSessionConversation;
import com.withings.devicesetup.bonding.SetupBleBondConversation;
import com.withings.user.core.models.User;
import com.withings.webservices.legacy.common.exception.AlreadyAssociatedException;
import com.withings.webservices.legacy.common.exception.InvalidParamsException;
import com.withings.webservices.legacy.common.exception.NotImplementedException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import com.withings.webservices.legacy.common.exception.TooManyRequestException;
import com.withings.webservices.legacy.common.exception.UnauthorizedException;
import com.withings.webservices.legacy.common.exception.UnspecifiedException;
import com.withings.webservices.legacy.common.exception.WrongPermException;
import com.withings.webservices.legacy.common.exception.WrongStatusException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import jo.x;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import ln.d0;
import ln.e0;
import ln.t;
import nm0.y;
import org.joda.time.Duration;
/* compiled from: SetupConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/SetupConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceSetupConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetupConversation extends WppDeviceSetupConversation {

    /* renamed from: f  reason: collision with root package name */
    private final r7 f37381f;

    /* renamed from: g  reason: collision with root package name */
    private final fl.p f37382g;

    /* renamed from: h  reason: collision with root package name */
    private final jo.a f37383h;

    /* renamed from: i  reason: collision with root package name */
    private final lo.b f37384i;

    /* renamed from: j  reason: collision with root package name */
    private final androidx.camera.core.impl.utils.k f37385j;

    /* renamed from: k  reason: collision with root package name */
    private final mo.a f37386k;

    /* renamed from: l  reason: collision with root package name */
    private final lp.a f37387l;

    /* renamed from: m  reason: collision with root package name */
    private final HandsCalibrationConversation.a f37388m;

    /* renamed from: n  reason: collision with root package name */
    private final po.a f37389n;

    /* renamed from: o  reason: collision with root package name */
    private final ko.a f37390o;

    /* renamed from: p  reason: collision with root package name */
    private final k2 f37391p;

    /* renamed from: q  reason: collision with root package name */
    private final kp.a f37392q;

    /* renamed from: r  reason: collision with root package name */
    private final df.d f37393r;

    /* renamed from: s  reason: collision with root package name */
    private final xp.c f37394s;

    /* renamed from: t  reason: collision with root package name */
    private xp.a f37395t;

    /* renamed from: u  reason: collision with root package name */
    private yp.a f37396u;

    /* renamed from: v  reason: collision with root package name */
    private User f37397v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SetupConversation.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements ym0.l<xp.a, y> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(xp.a aVar) {
            xp.a newDeviceSessionProvider = aVar;
            u.j(newDeviceSessionProvider, "newDeviceSessionProvider");
            SetupConversation.this.f37395t = newDeviceSessionProvider;
            return y.f85009a;
        }
    }

    public SetupConversation(r7 deviceFactory, fl.p pVar, jo.a mutableSetupStateRepository, lo.b bVar, androidx.camera.core.impl.utils.k kVar, mo.a aVar, lp.a aVar2, HandsCalibrationConversation.a aVar3, po.a initConversationFactory, xb0.d dVar, k2 k2Var, ie.a aVar4, User defaultUser, df.d dVar2, xp.c deviceSetupModule) {
        u.j(deviceFactory, "deviceFactory");
        u.j(mutableSetupStateRepository, "mutableSetupStateRepository");
        u.j(initConversationFactory, "initConversationFactory");
        u.j(defaultUser, "defaultUser");
        u.j(deviceSetupModule, "deviceSetupModule");
        this.f37381f = deviceFactory;
        this.f37382g = pVar;
        this.f37383h = mutableSetupStateRepository;
        this.f37384i = bVar;
        this.f37385j = kVar;
        this.f37386k = aVar;
        this.f37387l = aVar2;
        this.f37388m = aVar3;
        this.f37389n = initConversationFactory;
        this.f37390o = dVar;
        this.f37391p = k2Var;
        this.f37392q = aVar4;
        this.f37393r = dVar2;
        this.f37394s = deviceSetupModule;
        this.f37397v = defaultUser;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nj.h, nj.a] */
    public static final boolean O(SetupConversation setupConversation) {
        ?? aVar = new nj.a(setupConversation.x());
        aVar.c((short) 1284, new com.withings.comm.wpp.h[0]);
        return Arrays.asList(3, 1).contains(Short.valueOf(((BatteryStatus) aVar.y(BatteryStatus.class)).batteryState));
    }

    public static final void P(SetupConversation setupConversation, SetupConversation setupConversation2, jo.h hVar) {
        setupConversation.getClass();
        s.a(setupConversation2, setupConversation2.f37383h, hVar);
    }

    private final void R(yp.a aVar) throws FatalWebserviceException {
        df.d dVar = this.f37393r;
        try {
            Context r7 = r();
            u.i(r7, "getContext(...)");
            xp.a aVar2 = this.f37395t;
            String str = null;
            if (aVar2 != null) {
                Context r11 = r();
                u.i(r11, "getContext(...)");
                dVar.getClass();
                String e11 = df.d.e(r11);
                try {
                    str = Locale.getDefault().getCountry();
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                aVar.b(r7, aVar2, e11, str);
                return;
            }
            u.s("deviceSessionProvider");
            throw null;
        } catch (Exception e13) {
            throw new IOException("Unable to associate the device", e13);
        }
    }

    private final void S() {
        String secret = x().i().secret;
        u.i(secret, "secret");
        if (secret.length() == 0) {
            E(new DeviceSessionConversation(new a(), null, 14));
        } else {
            this.f37395t = new xp.b(x().i());
        }
    }

    private final void T(ln.a aVar, User user) {
        try {
            E(new SetupOkConversation());
            ((ie.a) this.f37392q).getClass();
            u.j(user, "user");
            if (aVar instanceof d0) {
                new id0.a(o70.a.e(user)).d();
            } else if (aVar instanceof e0) {
                throw new NotImplementedError();
            }
        } catch (UnsupportedCommandException unused) {
            x70.b.u(this, v(), "The device does not support command SETUP_OK", new Object[0]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        k kVar;
        d0 d0Var;
        vi.o oVar;
        jo.a aVar = this.f37383h;
        try {
            int a11 = this.f37382g.h(x().h()).a();
            r7 r7Var = this.f37381f;
            int i11 = (int) x().i().softVersion;
            r7Var.getClass();
            if (a11 != 10) {
                if (a11 != 93) {
                    d0Var = null;
                } else {
                    d0Var = new d0(i11);
                }
            } else {
                d0Var = new Object();
            }
            if (d0Var != null) {
                ((Boolean) s.b(this, aVar, b.g.f37406a, false)).getClass();
                S();
                boolean z5 = d0Var instanceof ln.h;
                mo.a aVar2 = this.f37386k;
                if (z5) {
                    d0 d0Var2 = d0Var;
                    s.a(this, aVar, jo.i.f74695a);
                    androidx.camera.core.impl.utils.k kVar2 = this.f37385j;
                    cj.b x11 = x();
                    u.i(x11, "getWppDevice(...)");
                    kVar2.getClass();
                    xi.b j5 = x11.j();
                    if (j5 instanceof vi.o) {
                        oVar = (vi.o) j5;
                    } else {
                        oVar = null;
                    }
                    if (oVar != null && oVar.d() != 12) {
                        if (((Boolean) s.b(this, aVar, b.c.f37402a, false)).booleanValue()) {
                            aVar2.getClass();
                            E(new SetupBleBondConversation());
                        }
                        s.b(this, aVar, b.C0489b.f37401a, false);
                    }
                    s.a(this, aVar, jo.j.f74697a);
                } else if (d0Var instanceof t) {
                    t tVar = (t) d0Var;
                    aVar2.getClass();
                    E(new SetupBleBondConversation());
                }
                if (d0Var instanceof ln.f) {
                    d0 d0Var3 = d0Var;
                    s.a(this, aVar, jo.f.f74689a);
                    BuildersKt__BuildersKt.runBlocking$default(null, new c(this, null), 1, null);
                    s.a(this, aVar, jo.g.f74691a);
                }
                if (v1.Q(d0Var) || v1.O(d0Var)) {
                    s.a(this, aVar, x.f74718a);
                    if (v1.Q(d0Var)) {
                        nm0.j jVar = (nm0.j) s.b(this, aVar, b.d.f37403a, true);
                        this.f37396u = (yp.a) jVar.c();
                        this.f37397v = (User) jVar.d();
                    } else if (v1.O(d0Var)) {
                        ((vb0.c) this.f37394s).c();
                    }
                    s.a(this, aVar, jo.y.f74719a);
                }
                E(this.f37387l.a(d0Var));
                if (d0Var instanceof ln.q) {
                    d0 d0Var4 = d0Var;
                    E(this.f37388m.a());
                }
                yp.a aVar3 = this.f37396u;
                if ((v1.Q(d0Var) || v1.O(d0Var)) && aVar3 != null) {
                    s.a(this, aVar, jo.c.f74683a);
                    R(aVar3);
                    try {
                        ko.a aVar4 = this.f37390o;
                        u70.i v11 = v();
                        u.i(v11, "getMacAddress(...)");
                        ((xb0.d) aVar4).a(d0Var, v11);
                        E(this.f37389n.a(d0Var, this.f37397v));
                        s.a(this, aVar, jo.e.f74687a);
                    } catch (Exception e11) {
                        Context r7 = r();
                        u.i(r7, "getContext(...)");
                        cj.b x12 = x();
                        u.i(x12, "getWppDevice(...)");
                        aVar3.a(r7, x12);
                        s.a(this, aVar, new jo.d(e11));
                    }
                }
                if (d0Var instanceof ln.l) {
                    d0 d0Var5 = d0Var;
                    this.f37391p.getClass();
                    com.withings.comm.trace.e a12 = com.withings.comm.trace.e.a();
                    u.i(a12, "get(...)");
                    kn.e c11 = kn.e.c();
                    u.i(c11, "get(...)");
                    E(new DebugDumpConversation(a12, new jl.b(c11), null, new jl.c(0L)));
                }
                T(d0Var, this.f37397v);
                s.a(this, aVar, k.a.f37461a);
                return;
            }
            throw new RuntimeException("Device model not implemented");
        } catch (Exception e12) {
            if (!(e12 instanceof AlreadyManagedException)) {
                if (!(e12 instanceof WrongPermException) && !(e12 instanceof UnauthorizedException) && !(e12 instanceof ObjectNotFoundException) && !(e12 instanceof InvalidParamsException) && !(e12 instanceof NotImplementedException)) {
                    if (!(e12 instanceof AlreadyAssociatedException) && !(e12 instanceof UnspecifiedException)) {
                        if (!(e12 instanceof TooManyRequestException)) {
                            if (!(e12 instanceof IOException)) {
                                if (!(e12 instanceof WrongStatusException.Runtime) && !(e12 instanceof WrongStatusException.Checked)) {
                                    if (!(e12 instanceof ConversationTimeoutException)) {
                                        if (!(e12 instanceof ConversationCanceledException)) {
                                            if (!(e12 instanceof ConversationException)) {
                                                if (!(e12 instanceof WaitForInput.CancelException)) {
                                                    if (e12 instanceof InterruptedException) {
                                                        kVar = jo.q.f74711a;
                                                    } else {
                                                        kVar = jo.t.f74714a;
                                                    }
                                                } else {
                                                    kVar = jo.u.f74715a;
                                                }
                                            } else {
                                                kVar = jo.m.f74703a;
                                            }
                                        } else {
                                            kVar = jo.l.f74701a;
                                        }
                                    } else {
                                        kVar = jo.n.f74705a;
                                    }
                                } else {
                                    kVar = jo.o.f74707a;
                                }
                            } else {
                                kVar = jo.p.f74709a;
                            }
                        } else {
                            kVar = new jo.s(Duration.standardSeconds(((TooManyRequestException) e12).getTimeToWaitSeconds().intValue()));
                        }
                    } else {
                        kVar = new jo.s(null);
                    }
                } else {
                    kVar = jo.o.f74707a;
                }
                s.a(this, aVar, kVar);
                throw e12;
            }
            AlreadyManagedException alreadyManagedException = (AlreadyManagedException) e12;
            throw null;
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceSetupConversation
    public final boolean L() {
        return ((vb0.c) this.f37394s).e().get();
    }
}
