package com.withings.wiscale2.device.common.ui;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.device.Device;
import com.withings.features.platform.model.DeviceOwner;
import com.withings.features.platform.model.Owner;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.features.platform.model.PlatformFeatureKt;
import com.withings.features.platform.model.PlatformFeatureRepository;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: RespiratoryScanSettingsActivity.kt */
/* loaded from: classes5.dex */
public final class h2 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Device f53955a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f53956b;

    /* renamed from: c  reason: collision with root package name */
    private final PlatformFeatureRepository f53957c;

    /* renamed from: d  reason: collision with root package name */
    private final com.withings.wiscale2.device.common.feature.u f53958d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.k0<Boolean> f53959e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.j0 f53960f;

    /* renamed from: g  reason: collision with root package name */
    private final androidx.lifecycle.j0 f53961g;

    /* renamed from: h  reason: collision with root package name */
    private final xw.p<a2, Boolean, nm0.j<a2, Boolean>> f53962h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.j0 f53963i;

    /* renamed from: j  reason: collision with root package name */
    private final xw.p<List<PlatformFeature>, Boolean, nm0.j<List<PlatformFeature>, Boolean>> f53964j;

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<List<PlatformFeature>>> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<PlatformFeature>> invoke(Boolean bool) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new g2(h2.this, null), 2);
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.RespiratoryScanViewModel$hasEnoughBattery$1", f = "RespiratoryScanSettingsActivity.kt", l = {219}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f53966a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f53967b;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f53967b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f53966a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                fl.p a11 = fl.p.f67672b.a();
                h2 h2Var = h2.this;
                fl.o g11 = a11.g(h2Var.f53955a);
                kotlin.jvm.internal.u.h(g11, "null cannot be cast to non-null type com.withings.common.device.model.capabilities.DeviceWithBatteryState");
                int batteryState = h2Var.f53955a.getBatteryState();
                int batteryLevel = h2Var.f53955a.getBatteryLevel();
                h2Var.f53955a.getFirmware();
                Boolean valueOf = Boolean.valueOf(!((gl.p) g11).g0(batteryState, batteryLevel));
                this.f53966a = 1;
                if (((androidx.lifecycle.h0) this.f53967b).emit(valueOf, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.q<xw.p<List<? extends PlatformFeature>, Boolean, nm0.j<? extends List<? extends PlatformFeature>, ? extends Boolean>>, List<? extends PlatformFeature>, Boolean, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f53969a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(xw.p<List<? extends PlatformFeature>, Boolean, nm0.j<? extends List<? extends PlatformFeature>, ? extends Boolean>> pVar, List<? extends PlatformFeature> list, Boolean bool) {
            xw.p<List<? extends PlatformFeature>, Boolean, nm0.j<? extends List<? extends PlatformFeature>, ? extends Boolean>> livedata = pVar;
            Boolean bool2 = bool;
            bool2.booleanValue();
            kotlin.jvm.internal.u.j(livedata, "livedata");
            livedata.setValue(new nm0.j(list, bool2));
            return nm0.y.f85009a;
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<List<PlatformFeature>, Boolean> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final Boolean invoke(List<PlatformFeature> list) {
            boolean z5;
            Object obj;
            List<PlatformFeature> list2 = list;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((PlatformFeature) obj).getFeatureId() == 11) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                PlatformFeature platformFeature = (PlatformFeature) obj;
                if (platformFeature != null) {
                    z5 = PlatformFeatureKt.isDeviceEligible(platformFeature, h2.this.f53955a.getId());
                    return Boolean.valueOf(z5);
                }
            }
            z5 = false;
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<List<PlatformFeature>, a2> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final a2 invoke(List<PlatformFeature> list) {
            List<PlatformFeature> list2 = list;
            if (list2 != null) {
                return h2.g0(h2.this, list2);
            }
            return null;
        }
    }

    /* compiled from: RespiratoryScanSettingsActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.q<xw.p<a2, Boolean, nm0.j<? extends a2, ? extends Boolean>>, a2, Boolean, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f53972a = new kotlin.jvm.internal.w(3);

        @Override // ym0.q
        public final nm0.y invoke(xw.p<a2, Boolean, nm0.j<? extends a2, ? extends Boolean>> pVar, a2 a2Var, Boolean bool) {
            xw.p<a2, Boolean, nm0.j<? extends a2, ? extends Boolean>> livedata = pVar;
            Boolean bool2 = bool;
            bool2.booleanValue();
            kotlin.jvm.internal.u.j(livedata, "livedata");
            livedata.setValue(new nm0.j(a2Var, bool2));
            return nm0.y.f85009a;
        }
    }

    public h2(Device device, Context context, PlatformFeatureRepository platformFeatureRepository, com.withings.wiscale2.device.common.feature.u platformFeatureActivationFactory) {
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(platformFeatureRepository, "platformFeatureRepository");
        kotlin.jvm.internal.u.j(platformFeatureActivationFactory, "platformFeatureActivationFactory");
        this.f53955a = device;
        this.f53956b = context;
        this.f53957c = platformFeatureRepository;
        this.f53958d = platformFeatureActivationFactory;
        androidx.lifecycle.k0<Boolean> b10 = xw.d.b(Boolean.TRUE);
        this.f53959e = b10;
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(b10, new a());
        this.f53960f = c11;
        androidx.lifecycle.j0 b11 = androidx.lifecycle.e1.b(c11, new e());
        this.f53961g = b11;
        this.f53962h = new xw.p<>(b11, androidx.lifecycle.h.a(null, new b(null), 3), f.f53972a);
        androidx.lifecycle.j0 b12 = androidx.lifecycle.e1.b(c11, new d());
        this.f53963i = b12;
        this.f53964j = new xw.p<>(c11, b12, c.f53969a);
    }

    public static final a2 g0(h2 h2Var, List list) {
        Object obj;
        DateTime dateTime;
        DateTime dateTime2;
        String abstractDateTime;
        h2Var.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((PlatformFeature) obj2).getFeatureId() != 10) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(PlatformFeatureKt.getActiveOwners((PlatformFeature) it.next()));
        }
        Iterator it2 = kotlin.collections.x.L(arrayList2).iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                Owner owner = (Owner) obj;
                if (owner instanceof DeviceOwner) {
                    Long deviceId = ((DeviceOwner) owner).getDeviceId();
                    long id2 = h2Var.f53955a.getId();
                    if (deviceId != null && deviceId.longValue() == id2) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        Owner owner2 = (Owner) obj;
        if (owner2 == null || (dateTime = PlatformFeatureKt.getStartDateTime(owner2)) == null) {
            dateTime = new DateTime(0L);
        }
        if (owner2 == null || (dateTime2 = PlatformFeatureKt.getEndDateTime(owner2)) == null) {
            dateTime2 = new DateTime(0L);
        }
        Context context = h2Var.f53956b;
        if (owner2 == null) {
            NextScanStatus nextScanStatus = NextScanStatus.f53736a;
            String string = context.getString(C1987R.string._DEACTIVATED_);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            return new a2(nextScanStatus, string, C1987R.string.activate_feature_below);
        } else if (dateTime.isAfterNow()) {
            DateTime plusDays = DateTime.now().plusDays(1);
            kotlin.jvm.internal.u.i(plusDays, "plusDays(...)");
            if (hn.a.e(plusDays, dateTime)) {
                abstractDateTime = context.getString(C1987R.string._TOMORROW_EVENING_);
            } else {
                abstractDateTime = dateTime.toString(context.getApplicationContext().getString(C1987R.string._DATE_MMM_D_YYYY_));
            }
            NextScanStatus nextScanStatus2 = NextScanStatus.f53738c;
            kotlin.jvm.internal.u.g(abstractDateTime);
            return new a2(nextScanStatus2, abstractDateTime, C1987R.string.tap_to_activate_tonight);
        } else if ((dateTime.getMillis() == 0 && dateTime2.getMillis() == 0) || (dateTime.isBeforeNow() && (dateTime2.getMillis() == 0 || dateTime2.isAfterNow()))) {
            NextScanStatus nextScanStatus3 = NextScanStatus.f53737b;
            String string2 = context.getString(C1987R.string.tonight);
            kotlin.jvm.internal.u.i(string2, "getString(...)");
            return new a2(nextScanStatus3, string2, C1987R.string.tap_to_skip_tonight);
        } else if (dateTime2.isAfterNow()) {
            NextScanStatus nextScanStatus4 = NextScanStatus.f53738c;
            String string3 = context.getString(C1987R.string.in_next_3_months);
            kotlin.jvm.internal.u.i(string3, "getString(...)");
            return new a2(nextScanStatus4, string3, C1987R.string.tap_to_activate_tonight);
        } else {
            NextScanStatus nextScanStatus5 = NextScanStatus.f53736a;
            String string4 = context.getString(C1987R.string._DEACTIVATED_);
            kotlin.jvm.internal.u.i(string4, "getString(...)");
            return new a2(nextScanStatus5, string4, C1987R.string.activate_feature_below);
        }
    }

    public final xw.p<List<PlatformFeature>, Boolean, nm0.j<List<PlatformFeature>, Boolean>> p0() {
        return this.f53964j;
    }

    public final xw.p<a2, Boolean, nm0.j<a2, Boolean>> q0() {
        return this.f53962h;
    }

    public final void r0(int i11) {
        a2 a2Var = (a2) this.f53961g.getValue();
        if (a2Var != null) {
            if (a2Var.b() == NextScanStatus.f53737b) {
                t0(DateTime.now().plusDays(1).withTimeAtStartOfDay().plusHours(12), i11);
            } else if (a2Var.b() == NextScanStatus.f53738c) {
                t0(DateTime.now(), i11);
            }
            this.f53959e.setValue(Boolean.TRUE);
        }
    }

    public final void t0(DateTime dateTime, int i11) {
        List list = (List) this.f53960f.getValue();
        if (list != null) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new i2(this, list, i11, dateTime, null), 2, null);
        }
    }
}
