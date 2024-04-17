package com.withings.common.device;

import com.withings.devicesetup.ui.SetupActivity;
import com.withings.liveworkout.model.LiveWorkout;
import ej.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.SupervisorKt;
import nm0.y;
/* compiled from: BleOrBluetoothSetupDiscoverer.kt */
/* loaded from: classes3.dex */
public final class b implements xp.g, CoroutineScope {

    /* renamed from: l  reason: collision with root package name */
    private static final u70.i f35045l = u70.i.c(LiveWorkout.PHONE_MAC_ADDRESS);

    /* renamed from: m  reason: collision with root package name */
    private static final u70.i f35046m = u70.i.c("03:FF:00:00:00:00");

    /* renamed from: n  reason: collision with root package name */
    private static final u70.i f35047n = u70.i.c("FF:03:00:00:00:00");

    /* renamed from: a  reason: collision with root package name */
    private final w f35048a;

    /* renamed from: b  reason: collision with root package name */
    private final SetupActivity f35049b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Integer> f35050c;

    /* renamed from: d  reason: collision with root package name */
    private final qm0.f f35051d;

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList f35052e;

    /* renamed from: f  reason: collision with root package name */
    private int f35053f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f35054g;

    /* renamed from: h  reason: collision with root package name */
    private String f35055h;

    /* renamed from: i  reason: collision with root package name */
    private final g f35056i;

    /* renamed from: j  reason: collision with root package name */
    private final e f35057j;

    /* renamed from: k  reason: collision with root package name */
    private Job f35058k;

    /* compiled from: BleOrBluetoothSetupDiscoverer.kt */
    /* loaded from: classes3.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.s implements ym0.l<vi.o, y> {
        a(Object obj) {
            super(1, obj, b.class, "onBleDeviceFound", "onBleDeviceFound(Lcom/withings/comm/network/ble/BleRemoteDevice;)V", 0);
        }

        @Override // ym0.l
        public final y invoke(vi.o oVar) {
            vi.o p02 = oVar;
            u.j(p02, "p0");
            b.e((b) this.receiver, p02);
            return y.f85009a;
        }
    }

    /* compiled from: BleOrBluetoothSetupDiscoverer.kt */
    /* renamed from: com.withings.common.device.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    /* synthetic */ class C0456b extends kotlin.jvm.internal.s implements ym0.l<wi.c, y> {
        C0456b(Object obj) {
            super(1, obj, b.class, "onBluetoothDeviceFound", "onBluetoothDeviceFound(Lcom/withings/comm/network/bluetooth/BluetoothRemoteDevice;)V", 0);
        }

        @Override // ym0.l
        public final y invoke(wi.c cVar) {
            wi.c p02 = cVar;
            u.j(p02, "p0");
            b.g((b) this.receiver, p02);
            return y.f85009a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(w wVar, SetupActivity setupActivity, int i11) {
        this(wVar, setupActivity, x.V(Integer.valueOf(i11)));
        u.j(setupActivity, "setupActivity");
    }

    public static final void e(b bVar, vi.o oVar) {
        Object a11;
        List<Integer> list = bVar.f35050c;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Number number : list) {
                if (jl.a.e(oVar, number.intValue())) {
                    if (!bVar.f35054g) {
                        if (oVar.g() <= (bVar.f35053f * (-8)) - 80) {
                            return;
                        }
                    }
                    ArrayList arrayList = bVar.f35052e;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (new mj.b(oVar).d((cj.d) it.next())) {
                                Job job = bVar.f35058k;
                                if (job != null) {
                                    if (!job.isActive()) {
                                        job = null;
                                    }
                                    if (job != null) {
                                        Job.DefaultImpls.cancel$default(job, null, 1, null);
                                    }
                                    e eVar = bVar.f35057j;
                                    w wVar = bVar.f35048a;
                                    wVar.K(eVar);
                                    if (!oVar.k() && oVar.h() == null) {
                                        bVar.f35055h = oVar.getName();
                                        wVar.o(bVar.f35056i);
                                        return;
                                    }
                                    int d11 = oVar.d();
                                    SetupActivity setupActivity = bVar.f35049b;
                                    if (d11 == 12) {
                                        try {
                                            a11 = Boolean.valueOf(new ui.a(setupActivity, oVar.c()).h());
                                        } catch (Throwable th2) {
                                            a11 = nm0.l.a(th2);
                                        }
                                        Throwable b10 = nm0.k.b(a11);
                                        if (b10 != null) {
                                            x70.b.f(bVar, b10, "Unable to remove bonding", new Object[0]);
                                        }
                                    }
                                    setupActivity.Z1(oVar);
                                    return;
                                }
                                u.s("scanTimeout");
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static final void g(b bVar, wi.c cVar) {
        bVar.getClass();
        if (gj.e.a(cVar)) {
            List<Integer> list = bVar.f35050c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Number number : list) {
                    if (jl.a.e(cVar, number.intValue())) {
                        if (!bVar.f35054g) {
                            if (cVar.d() <= (bVar.f35053f * (-8)) - 80) {
                                return;
                            }
                        }
                        if (bVar.f35055h == null || u.e(cVar.getName(), bVar.f35055h)) {
                            Job job = bVar.f35058k;
                            if (job != null) {
                                if (!job.isActive()) {
                                    job = null;
                                }
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, null, 1, null);
                                }
                                bVar.f35048a.K(bVar.f35056i);
                                bVar.f35049b.Z1(cVar);
                                return;
                            }
                            u.s("scanTimeout");
                            throw null;
                        }
                        return;
                    }
                }
            }
        }
    }

    @Override // xp.g
    public final void d() {
        stop();
        start();
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final qm0.f getCoroutineContext() {
        return this.f35051d;
    }

    @Override // xp.g
    public final void start() {
        Job launch$default;
        this.f35055h = null;
        this.f35048a.o(this.f35057j);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(this, null), 3, null);
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(this, null), 3, null);
        this.f35058k = launch$default;
    }

    @Override // xp.g
    public final void stop() {
        e eVar = this.f35057j;
        w wVar = this.f35048a;
        wVar.K(eVar);
        wVar.K(this.f35056i);
        JobKt__JobKt.cancelChildren$default(this.f35051d, null, 1, null);
    }

    public b(w wppDeviceManager, SetupActivity setupActivity, List<Integer> modelIds) {
        u.j(wppDeviceManager, "wppDeviceManager");
        u.j(setupActivity, "setupActivity");
        u.j(modelIds, "modelIds");
        this.f35048a = wppDeviceManager;
        this.f35049b = setupActivity;
        this.f35050c = modelIds;
        this.f35051d = SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getIO());
        List<Integer> list = modelIds;
        ArrayList<aj.b> arrayList = new ArrayList(x.y(list, 10));
        for (Number number : list) {
            arrayList.add(fl.p.f67672b.a().d(number.intValue()).w());
        }
        ArrayList arrayList2 = new ArrayList();
        for (aj.b bVar : arrayList) {
            u70.i iVar = f35045l;
            x.n(x.W(new cj.d(bVar, iVar, null), new cj.d(bVar, iVar), new cj.d(bVar, f35046m, null), new cj.d(bVar, f35047n, null)), arrayList2);
        }
        this.f35052e = arrayList2;
        this.f35056i = new g(new C0456b(this));
        this.f35057j = new e(new a(this));
    }
}
