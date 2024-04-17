package com.withings.wiscale2.device.common.ui.geoloc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.model.LatLng;
import com.withings.device.Device;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: WeatherAirQualityViewModel.kt */
/* loaded from: classes5.dex */
public final class a0 extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f53830a;

    /* renamed from: b  reason: collision with root package name */
    private final Device f53831b;

    /* renamed from: c  reason: collision with root package name */
    private final MutableStateFlow<a> f53832c;

    /* renamed from: d  reason: collision with root package name */
    private final StateFlow<a> f53833d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableStateFlow<Integer> f53834e;

    /* renamed from: f  reason: collision with root package name */
    private final StateFlow<Integer> f53835f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableStateFlow<String> f53836g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<String> f53837h;

    /* renamed from: i  reason: collision with root package name */
    private final MutableStateFlow<List<a>> f53838i;

    /* renamed from: j  reason: collision with root package name */
    private final StateFlow<List<a>> f53839j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableStateFlow<Boolean> f53840k;

    /* compiled from: WeatherAirQualityViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final LatLng f53841a;

        /* renamed from: b  reason: collision with root package name */
        private String f53842b;

        public a(LatLng latLng, String place) {
            kotlin.jvm.internal.u.j(place, "place");
            this.f53841a = latLng;
            this.f53842b = place;
        }

        public final LatLng a() {
            return this.f53841a;
        }

        public final String b() {
            return this.f53842b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (kotlin.jvm.internal.u.e(this.f53841a, aVar.f53841a) && kotlin.jvm.internal.u.e(this.f53842b, aVar.f53842b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f53842b.hashCode() + (this.f53841a.hashCode() * 31);
        }

        public final String toString() {
            return "AddressToDisplay(latLng=" + this.f53841a + ", place=" + this.f53842b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityViewModel.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<Location, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Geocoder f53843a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a0 f53844b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Geocoder geocoder, a0 a0Var) {
            super(1);
            this.f53843a = geocoder;
            this.f53844b = a0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(Location location) {
            Job launch$default;
            Location location2 = location;
            List<Address> fromLocation = this.f53843a.getFromLocation(location2.getLatitude(), location2.getLongitude(), 10);
            if (fromLocation != null) {
                List<Address> list = fromLocation;
                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
                for (Address address : list) {
                    a0 a0Var = this.f53844b;
                    launch$default = BuildersKt__Builders_commonKt.launch$default(h1.a(a0Var), null, null, new b0(a0Var, address, null), 3, null);
                    arrayList.add(launch$default);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes5.dex */
    public static final class c implements Flow<List<? extends a>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow f53845a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a0 f53846b;

        /* compiled from: Emitters.kt */
        /* loaded from: classes5.dex */
        public static final class a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ FlowCollector f53847a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a0 f53848b;

            /* compiled from: Emitters.kt */
            @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.geoloc.WeatherAirQualityViewModel$special$$inlined$map$1$2", f = "WeatherAirQualityViewModel.kt", l = {223}, m = "emit")
            /* renamed from: com.withings.wiscale2.device.common.ui.geoloc.a0$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0719a extends kotlin.coroutines.jvm.internal.c {

                /* renamed from: a  reason: collision with root package name */
                /* synthetic */ Object f53849a;

                /* renamed from: b  reason: collision with root package name */
                int f53850b;

                public C0719a(qm0.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f53849a = obj;
                    this.f53850b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, a0 a0Var) {
                this.f53847a = flowCollector;
                this.f53848b = a0Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.withings.wiscale2.device.common.ui.geoloc.a0.c.a.C0719a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.withings.wiscale2.device.common.ui.geoloc.a0$c$a$a r0 = (com.withings.wiscale2.device.common.ui.geoloc.a0.c.a.C0719a) r0
                    int r1 = r0.f53850b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f53850b = r1
                    goto L18
                L13:
                    com.withings.wiscale2.device.common.ui.geoloc.a0$c$a$a r0 = new com.withings.wiscale2.device.common.ui.geoloc.a0$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f53849a
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                    int r2 = r0.f53850b
                    r3 = 1
                    if (r2 == 0) goto L2f
                    if (r2 != r3) goto L27
                    nm0.l.b(r6)
                    goto L45
                L27:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L2f:
                    nm0.l.b(r6)
                    java.lang.String r5 = (java.lang.String) r5
                    com.withings.wiscale2.device.common.ui.geoloc.a0 r6 = r4.f53848b
                    java.util.List r5 = com.withings.wiscale2.device.common.ui.geoloc.a0.m0(r6, r5)
                    r0.f53850b = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f53847a
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    nm0.y r5 = nm0.y.f85009a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.ui.geoloc.a0.c.a.emit(java.lang.Object, qm0.d):java.lang.Object");
            }
        }

        public c(StateFlow stateFlow, a0 a0Var) {
            this.f53845a = stateFlow;
            this.f53846b = a0Var;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public final Object collect(FlowCollector<? super List<? extends a>> flowCollector, qm0.d dVar) {
            Object collect = this.f53845a.collect(new a(flowCollector, this.f53846b), dVar);
            if (collect == CoroutineSingletons.f76214a) {
                return collect;
            }
            return nm0.y.f85009a;
        }
    }

    public a0(Context context, Device device, kn.e deviceManager) {
        Address address;
        kotlin.jvm.internal.u.j(device, "device");
        kotlin.jvm.internal.u.j(deviceManager, "deviceManager");
        this.f53830a = context;
        this.f53831b = device;
        List<Address> fromLocation = new Geocoder(context, Locale.getDefault()).getFromLocation(device.getLatitude(), device.getLongitude(), 1);
        MutableStateFlow<a> MutableStateFlow = StateFlowKt.MutableStateFlow(new a(new LatLng(device.getLatitude(), device.getLongitude()), (fromLocation == null || (address = fromLocation.get(0)) == null || (r9 = B0(address)) == null) ? "" : ""));
        this.f53832c = MutableStateFlow;
        this.f53833d = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.f53834e = MutableStateFlow2;
        this.f53835f = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this.f53836g = MutableStateFlow3;
        StateFlow<String> asStateFlow = FlowKt.asStateFlow(MutableStateFlow3);
        this.f53837h = asStateFlow;
        i0 i0Var = i0.f76187a;
        MutableStateFlow<List<a>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(i0Var);
        this.f53838i = MutableStateFlow4;
        this.f53839j = FlowKt.stateIn(FlowKt.merge(MutableStateFlow4, new c(asStateFlow, this)), h1.a(this), SharingStarted.Companion.getEagerly(), i0Var);
        this.f53840k = StateFlowKt.MutableStateFlow(null);
    }

    private static String B0(Address address) {
        String postalCode = address.getPostalCode();
        String str = "";
        if (postalCode == null) {
            postalCode = "";
        }
        String locality = address.getLocality();
        if (locality == null) {
            locality = "";
        }
        String countryName = address.getCountryName();
        if (countryName != null) {
            str = countryName;
        }
        return dp0.j.i0(postalCode + " " + locality + " " + str).toString();
    }

    public static final /* synthetic */ String f0(a0 a0Var, Address address) {
        a0Var.getClass();
        return B0(address);
    }

    public static final List m0(a0 a0Var, String str) {
        a0Var.getClass();
        i0 i0Var = i0.f76187a;
        try {
            List<Address> fromLocationName = new Geocoder(a0Var.f53830a, Locale.getDefault()).getFromLocationName(str, 10);
            if (fromLocationName != null) {
                List<Address> list = fromLocationName;
                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
                for (Address address : list) {
                    arrayList.add(new a(new LatLng(address.getLatitude(), address.getLongitude()), B0(address)));
                }
                return arrayList;
            }
            return i0Var;
        } catch (IOException e11) {
            x70.b.e(a0Var, e11);
            return i0Var;
        }
    }

    public final StateFlow<List<a>> A0() {
        return this.f53839j;
    }

    public final void F0() {
        a value = this.f53833d.getValue();
        Device device = this.f53831b;
        device.setManualGeoloc("t");
        device.setLongitude(value.a().longitude);
        device.setLatitude(value.a().latitude);
        device.setTimezone((String) null);
        this.f53840k.setValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new f0(this, null), 2, null);
    }

    @SuppressLint({"MissingPermission"})
    public final void p0() {
        Locale locale = Locale.getDefault();
        Context context = this.f53830a;
        Geocoder geocoder = new Geocoder(context, locale);
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        kotlin.jvm.internal.u.i(fusedLocationProviderClient, "getFusedLocationProviderClient(...)");
        fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new com.withings.device.details.wsd.programs.webradio.c(2, new b(geocoder, this)));
    }

    public final StateFlow<a> q0() {
        return this.f53833d;
    }

    public final Device r0() {
        return this.f53831b;
    }

    public final StateFlow<String> t0() {
        return this.f53837h;
    }

    public final MutableStateFlow<Boolean> y0() {
        return this.f53840k;
    }

    public final StateFlow<Integer> z0() {
        return this.f53835f;
    }
}
