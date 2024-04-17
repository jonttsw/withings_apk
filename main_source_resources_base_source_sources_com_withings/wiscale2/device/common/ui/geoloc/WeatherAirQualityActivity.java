package com.withings.wiscale2.device.common.ui.geoloc;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: WeatherAirQualityActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/geoloc/WeatherAirQualityActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WeatherAirQualityActivity extends Hilt_WeatherAirQualityActivity {
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public g0 f53823f;

    /* renamed from: h  reason: collision with root package name */
    private r8.n f53825h;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f53822e = nm0.h.b(new a());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f53824g = nm0.h.b(new c());

    /* compiled from: WeatherAirQualityActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<Device> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Device invoke() {
            Object obj;
            int deviceId;
            WeatherAirQualityActivity weatherAirQualityActivity = WeatherAirQualityActivity.this;
            Intent intent = weatherAirQualityActivity.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("extra_device", Device.class);
            } else {
                Object serializableExtra = intent.getSerializableExtra("extra_device");
                if (!(serializableExtra instanceof Device)) {
                    serializableExtra = null;
                }
                obj = (Device) serializableExtra;
            }
            Device device = (Device) obj;
            if (device == null) {
                kn.e c11 = kn.e.c();
                deviceId = weatherAirQualityActivity.getDeviceId();
                Device d11 = c11.d(deviceId);
                kotlin.jvm.internal.u.i(d11, "getById(...)");
                return d11;
            }
            return device;
        }
    }

    /* compiled from: WeatherAirQualityActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -934464134, new l(WeatherAirQualityActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: WeatherAirQualityActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<a0> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final a0 invoke() {
            WeatherAirQualityActivity weatherAirQualityActivity = WeatherAirQualityActivity.this;
            return (a0) new k1(weatherAirQualityActivity, new n(weatherAirQualityActivity)).a(a0.class);
        }
    }

    public static final void A3(WeatherAirQualityActivity weatherAirQualityActivity) {
        weatherAirQualityActivity.getClass();
        if (androidx.core.content.a.checkSelfPermission(weatherAirQualityActivity, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            ((a0) weatherAirQualityActivity.f53824g.getValue()).p0();
        } else {
            androidx.core.app.a.d(weatherAirQualityActivity, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1010101);
        }
    }

    public static final Device B3(WeatherAirQualityActivity weatherAirQualityActivity) {
        return (Device) weatherAirQualityActivity.f53822e.getValue();
    }

    public static final a0 D3(WeatherAirQualityActivity weatherAirQualityActivity) {
        return (a0) weatherAirQualityActivity.f53824g.getValue();
    }

    public static final void z3(WeatherAirQualityActivity weatherAirQualityActivity, androidx.compose.runtime.a aVar, int i11) {
        weatherAirQualityActivity.getClass();
        androidx.compose.runtime.b g11 = aVar.g(211502670);
        r8.n c11 = androidx.navigation.compose.r.c(new androidx.navigation.c0[0], g11);
        weatherAirQualityActivity.f53825h = c11;
        if (c11 != null) {
            androidx.navigation.compose.s.b(c11, "weatherAirQuality", null, null, null, null, null, null, null, new i(weatherAirQualityActivity), g11, 56, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
            androidx.compose.runtime.v o02 = g11.o0();
            if (o02 != null) {
                o02.G(new j(weatherAirQualityActivity, i11));
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("navHostController");
        throw null;
    }

    @Override // com.withings.wiscale2.device.common.ui.geoloc.Hilt_WeatherAirQualityActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(h1.a((a0) this.f53824g.getValue()), null, null, new m(this, null), 3, null);
        e.k.a(this, new s1.a(true, 1154250848, new b()));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        boolean z5;
        kotlin.jvm.internal.u.j(permissions, "permissions");
        kotlin.jvm.internal.u.j(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        if (i11 == 1010101) {
            if (grantResults.length == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((!z5) && grantResults[0] == 0) {
                if (androidx.core.content.a.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    ((a0) this.f53824g.getValue()).p0();
                    return;
                } else {
                    androidx.core.app.a.d(this, new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 1010101);
                    return;
                }
            }
            finish();
        }
    }
}
