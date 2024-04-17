package com.withings.device.details.elabel;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.core.view.l1;
import bn0.d;
import com.withings.android.activity.WithingsActivity;
import com.withings.device.Device;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: ElabelDeviceActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/device/details/elabel/ElabelDeviceActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "device-details-common_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ElabelDeviceActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final c f36795a = new c(this);

    /* renamed from: c  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f36794c = {v.c(ElabelDeviceActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: b  reason: collision with root package name */
    public static final a f36793b = new Object();

    /* compiled from: ElabelDeviceActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(Context context, Device device) {
            u.j(device, "device");
            Intent putExtra = new Intent(context, ElabelDeviceActivity.class).putExtra("device", device);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: ElabelDeviceActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                o.b(false, s1.b.b(aVar2, 2113415679, new com.withings.device.details.elabel.b(ElabelDeviceActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final g f36797a = h.b(new com.withings.device.details.elabel.c(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f36798b;

        public c(Activity activity) {
            this.f36798b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f36797a.getValue();
        }
    }

    public static final Device z3(ElabelDeviceActivity elabelDeviceActivity) {
        return (Device) elabelDeviceActivity.f36795a.getValue(elabelDeviceActivity, f36794c[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 312615769, new b()));
    }
}
