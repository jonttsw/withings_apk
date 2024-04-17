package com.withings.device.details.scale;

import android.app.Application;
import android.content.Intent;
import androidx.lifecycle.e1;
import androidx.lifecycle.j0;
import com.withings.device.Device;
import com.withings.scalesmodes.core.ScalesModes;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import zg.c;
/* compiled from: ScaleDetailViewModel.kt */
/* loaded from: classes3.dex */
public final class w extends nn.f {

    /* renamed from: r  reason: collision with root package name */
    private final fl.p f37021r;

    /* renamed from: s  reason: collision with root package name */
    private final m70.i f37022s;

    /* renamed from: t  reason: collision with root package name */
    private final j0 f37023t;

    /* renamed from: u  reason: collision with root package name */
    private final j0 f37024u;

    /* renamed from: v  reason: collision with root package name */
    private final Flow<Intent> f37025v;

    /* renamed from: w  reason: collision with root package name */
    private final j0 f37026w;

    /* renamed from: x  reason: collision with root package name */
    private final j0 f37027x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f37028y;

    /* renamed from: z  reason: collision with root package name */
    private final Flow<Boolean> f37029z;

    /* compiled from: ScaleDetailViewModel.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<Device, f> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final f invoke(Device device) {
            boolean z5;
            gl.d0 d0Var;
            Device it = device;
            kotlin.jvm.internal.u.j(it, "it");
            fl.o d11 = w.this.f37021r.d(it.getModelId());
            boolean z11 = d11 instanceof gl.d0;
            boolean z12 = false;
            if (z11 && !((gl.d0) d11).f(it.getFirmware())) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean isImpedanceEnabled = it.isImpedanceEnabled();
            if (z11) {
                d0Var = (gl.d0) d11;
            } else {
                d0Var = null;
            }
            if (d0Var != null) {
                z12 = d0Var.o();
            }
            return new f(z5, isImpedanceEnabled, z12);
        }
    }

    /* compiled from: ScaleDetailViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.scale.ScaleDetailViewModel$scalesModesIntent$1", f = "ScaleDetailViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends ur.a>, Boolean, qm0.d<? super Intent>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f37031a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f37032b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ch.d f37033c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ w f37034d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Device f37035e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ch.d dVar, w wVar, Device device, qm0.d<? super b> dVar2) {
            super(3, dVar2);
            this.f37033c = dVar;
            this.f37034d = wVar;
            this.f37035e = device;
        }

        @Override // ym0.q
        public final Object invoke(List<? extends ur.a> list, Boolean bool, qm0.d<? super Intent> dVar) {
            boolean booleanValue = bool.booleanValue();
            b bVar = new b(this.f37033c, this.f37034d, this.f37035e, dVar);
            bVar.f37031a = list;
            bVar.f37032b = booleanValue;
            return bVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            boolean z5 = this.f37032b;
            List list = this.f37031a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ScalesModes h11 = df.d.h(((ur.a) it.next()).c());
                    if (h11 != null && com.withings.common.device.s.f(h11)) {
                        if (!z5) {
                            ch.e mode = this.f37033c.getMode();
                            w wVar = this.f37034d;
                            return ((ah.u) mode).I(wVar.f37022s.e().q(), wVar.getApplication(), this.f37035e);
                        }
                    }
                }
            }
            return null;
        }
    }

    /* compiled from: ScaleDetailViewModel.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Device, g0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f37036a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final g0 invoke(Device device) {
            boolean z5;
            Device it = device;
            kotlin.jvm.internal.u.j(it, "it");
            if (it.usesWifi() && it.getConsumer() != 100) {
                z5 = true;
            } else {
                z5 = false;
            }
            return new g0(it, z5);
        }
    }

    /* compiled from: ScaleDetailViewModel.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<Device, Intent> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ch.d f37037a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w f37038b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ch.d dVar, w wVar) {
            super(1);
            this.f37037a = dVar;
            this.f37038b = wVar;
        }

        @Override // ym0.l
        public final Intent invoke(Device device) {
            Device device2 = device;
            kotlin.jvm.internal.u.j(device2, "device");
            ch.m c11 = this.f37037a.c();
            Application context = this.f37038b.getApplication();
            ((ah.e0) c11).getClass();
            kotlin.jvm.internal.u.j(context, "context");
            int modelId = device2.getModelId();
            if (modelId != 10) {
                switch (modelId) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        return null;
                }
            }
            return c.a.a(context, device2.getId(), true);
        }
    }

    /* compiled from: ScaleDetailViewModel.kt */
    /* loaded from: classes3.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<Device, h0> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f37039a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final h0 invoke(Device device) {
            Device device2 = device;
            kotlin.jvm.internal.u.j(device2, "device");
            boolean m11 = kotlin.collections.l.m(new Integer[]{6, 5, 13, 7}, Integer.valueOf(device2.getModelId()));
            boolean contains = kotlin.collections.x.W(15, 17).contains(Integer.valueOf(device2.getModelId()));
            h0 h0Var = new h0(device2, m11);
            if (contains) {
                return null;
            }
            return h0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Application application, fl.p pVar, vr.d featureTagsRepository, kn.e deviceManager, m70.i userManager, ch.d intentBuilder, il.a isB2BDeviceUseCase, Device device) {
        super(application, pVar, deviceManager, device);
        gl.d0 d0Var;
        Flow<Intent> flowOf;
        kotlin.jvm.internal.u.j(featureTagsRepository, "featureTagsRepository");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        kotlin.jvm.internal.u.j(userManager, "userManager");
        kotlin.jvm.internal.u.j(intentBuilder, "intentBuilder");
        kotlin.jvm.internal.u.j(isB2BDeviceUseCase, "isB2BDeviceUseCase");
        kotlin.jvm.internal.u.j(device, "device");
        this.f37021r = pVar;
        this.f37022s = userManager;
        this.f37023t = e1.b(k0(), e.f37039a);
        this.f37024u = e1.b(k0(), new d(intentBuilder, this));
        fl.o q02 = q0();
        if (q02 instanceof gl.d0) {
            d0Var = (gl.d0) q02;
        } else {
            d0Var = null;
        }
        if (d0Var != null && d0Var.f(device.getFirmware())) {
            flowOf = FlowKt.combine(featureTagsRepository.get(device.getId()), isB2BDeviceUseCase.a(device.getId()), new b(intentBuilder, this, device, null));
        } else {
            flowOf = FlowKt.flowOf(null);
        }
        this.f37025v = flowOf;
        this.f37026w = e1.b(k0(), new a());
        this.f37027x = e1.b(k0(), c.f37036a);
        featureTagsRepository.get(device.getId());
        this.f37028y = pVar.d(device.getModelId()) instanceof fl.u;
        this.f37029z = isB2BDeviceUseCase.a(device.getId());
    }

    public final j0 U0() {
        return this.f37026w;
    }

    public final Flow<Intent> V0() {
        return this.f37025v;
    }

    public final j0 W0() {
        return this.f37027x;
    }

    public final j0 X0() {
        return this.f37024u;
    }

    public final j0 Y0() {
        return this.f37023t;
    }

    public final Flow<Boolean> Z0() {
        return this.f37029z;
    }

    public final boolean a1() {
        return this.f37028y;
    }
}
