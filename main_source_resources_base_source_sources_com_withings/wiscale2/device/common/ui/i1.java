package com.withings.wiscale2.device.common.ui;

import android.app.Application;
import com.withings.comm.wpp.generated.object.ShortcutAction;
import com.withings.common.device.conversation.GetShortcutConversation;
import com.withings.common.device.conversation.SetShortcutConversation;
import com.withings.device.Device;
import com.withings.features.FeatureFlag;
import com.withings.features.platform.model.DeviceFeaturesLiveData;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: DeviceShortcutsFragment.kt */
/* loaded from: classes5.dex */
public final class i1 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final Device f53979a;

    /* renamed from: b  reason: collision with root package name */
    private final DeviceShortcutConversation f53980b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.j0 f53981c;

    /* renamed from: d  reason: collision with root package name */
    private final xw.f f53982d;

    /* renamed from: e  reason: collision with root package name */
    private final xw.f f53983e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.j0 f53984f;

    /* compiled from: DeviceShortcutsFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.DeviceShortcutsViewModel$1", f = "DeviceShortcutsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {
        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            DeviceShortcutConversation deviceShortcutConversation = i1.this.f53980b;
            deviceShortcutConversation.getClass();
            deviceShortcutConversation.E(new GetShortcutConversation(new x0(deviceShortcutConversation)));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceShortcutsFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<List<PlatformFeature>, List<k2>> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final List<k2> invoke(List<PlatformFeature> list) {
            List<PlatformFeature> list2 = list;
            kotlin.jvm.internal.u.g(list2);
            return i1.f0(i1.this, list2);
        }
    }

    /* compiled from: DeviceShortcutsFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<ShortcutAction, k2> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final k2 invoke(ShortcutAction shortcutAction) {
            List list;
            ShortcutAction shortcutAction2 = shortcutAction;
            Object obj = null;
            if (shortcutAction2 == null) {
                return null;
            }
            short s11 = shortcutAction2.value;
            i1.this.getClass();
            list = k2.f54011d;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((k2) next).d() == s11) {
                    obj = next;
                    break;
                }
            }
            k2 k2Var = (k2) obj;
            if (k2Var == null) {
                return new t2();
            }
            return k2Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceShortcutsFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.DeviceShortcutsViewModel$enableLongPressShortcut$1", f = "DeviceShortcutsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f53989b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z5, qm0.d<? super d> dVar) {
            super(2, dVar);
            this.f53989b = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f53989b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            short s11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            i1 i1Var = i1.this;
            k2 k2Var = (k2) i1Var.k0().getValue();
            if (k2Var != null) {
                short d11 = k2Var.d();
                DeviceShortcutConversation deviceShortcutConversation = i1Var.f53980b;
                if (this.f53989b) {
                    s11 = d11;
                } else {
                    s11 = 0;
                }
                deviceShortcutConversation.getClass();
                deviceShortcutConversation.E(new SetShortcutConversation(s11));
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceShortcutsFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<List<k2>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f53990a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(List<k2> list) {
            List<k2> it = list;
            kotlin.jvm.internal.u.j(it, "it");
            boolean z5 = true;
            if (it.size() <= 1) {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceShortcutsFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.DeviceShortcutsViewModel$selectShortcutIndex$1$1", f = "DeviceShortcutsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k2 f53992b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k2 k2Var, qm0.d<? super f> dVar) {
            super(2, dVar);
            this.f53992b = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new f(this.f53992b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            DeviceShortcutConversation deviceShortcutConversation = i1.this.f53980b;
            short d11 = this.f53992b.d();
            deviceShortcutConversation.getClass();
            deviceShortcutConversation.E(new SetShortcutConversation(d11));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceShortcutsFragment.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.l<ShortcutAction, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f53993a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(ShortcutAction shortcutAction) {
            ShortcutAction shortcutAction2 = shortcutAction;
            boolean z5 = false;
            if (shortcutAction2 != null && shortcutAction2.value != 0) {
                z5 = true;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Application application, Device device, ej.w wVar) {
        super(application);
        kotlin.jvm.internal.u.j(device, "device");
        this.f53979a = device;
        DeviceShortcutConversation deviceShortcutConversation = (DeviceShortcutConversation) wVar.y(device.getMacAddress(), DeviceShortcutConversation.class);
        this.f53980b = deviceShortcutConversation;
        DeviceFeaturesLiveData deviceFeaturesLiveData = new DeviceFeaturesLiveData(device.getId(), kotlin.collections.x.W(15, 3, 4), null, false, 12, null);
        androidx.lifecycle.k0<ShortcutAction> L = deviceShortcutConversation.L();
        androidx.lifecycle.j0 b10 = androidx.lifecycle.e1.b(deviceFeaturesLiveData, new b());
        this.f53981c = b10;
        this.f53982d = xw.d.f(androidx.lifecycle.e1.b(L, g.f53993a));
        this.f53983e = xw.d.f(androidx.lifecycle.e1.b(L, new c()));
        this.f53984f = androidx.lifecycle.e1.b(b10, e.f53990a);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new a(null), 2, null);
    }

    public static final ArrayList f0(i1 i1Var, List list) {
        Object obj;
        i1Var.getClass();
        ArrayList arrayList = new ArrayList();
        List list2 = list;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (kotlin.collections.x.W(4, 27).contains(Integer.valueOf(((PlatformFeature) obj2).getFeatureId()))) {
                arrayList2.add(obj2);
            }
        }
        boolean isEmpty = arrayList2.isEmpty();
        Device device = i1Var.f53979a;
        if (!isEmpty) {
            Iterator it = arrayList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (PlatformFeatureKt.isActivatedForDevice((PlatformFeature) it.next(), device.getId())) {
                        arrayList.add(new k1());
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                PlatformFeature platformFeature = (PlatformFeature) obj;
                if (platformFeature.getFeatureId() == 15 || platformFeature.getFeatureId() == 3) {
                    if (PlatformFeatureKt.isActivatedForDevice(platformFeature, device.getId())) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        if (((PlatformFeature) obj) != null) {
            arrayList.add(new m2());
        }
        arrayList.add(new t2());
        arrayList.add(new w());
        arrayList.add(new n2());
        arrayList.add(new o2());
        arrayList.add(new j1());
        arrayList.add(new c2());
        if (wr.b.c(FeatureFlag.G)) {
            arrayList.add(new l1());
        }
        return arrayList;
    }

    public final void i0(boolean z5) {
        this.f53982d.setValue(Boolean.valueOf(z5));
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new d(z5, null), 2, null);
    }

    public final androidx.lifecycle.j0 j0() {
        return this.f53981c;
    }

    public final xw.f k0() {
        return this.f53983e;
    }

    public final int m0() {
        short s11;
        Object obj;
        k2 k2Var = (k2) this.f53983e.getValue();
        if (k2Var != null) {
            s11 = k2Var.d();
        } else {
            s11 = 0;
        }
        List list = (List) this.f53981c.getValue();
        if (list == null) {
            list = kotlin.collections.i0.f76187a;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((k2) obj).d() == s11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return list.indexOf(obj);
    }

    public final xw.f p0() {
        return this.f53982d;
    }

    public final androidx.lifecycle.j0 q0() {
        return this.f53984f;
    }

    public final void r0(int i11) {
        k2 k2Var;
        List list = (List) this.f53981c.getValue();
        if (list != null) {
            k2Var = (k2) list.get(i11);
        } else {
            k2Var = null;
        }
        this.f53983e.setValue(k2Var);
        if (k2Var != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new f(k2Var, null), 2, null);
        }
    }
}
