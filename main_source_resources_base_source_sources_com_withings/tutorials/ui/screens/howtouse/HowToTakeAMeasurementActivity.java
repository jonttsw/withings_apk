package com.withings.tutorials.ui.screens.howtouse;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.view.l1;
import com.withings.device.Device;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
/* compiled from: HowToTakeAMeasurementActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/tutorials/ui/screens/howtouse/HowToTakeAMeasurementActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HowToTakeAMeasurementActivity extends Hilt_HowToTakeAMeasurementActivity {

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f45350g = {androidx.camera.core.v.c(HowToTakeAMeasurementActivity.class, "device", "getDevice()Lcom/withings/device/Device;", 0), androidx.camera.core.v.c(HowToTakeAMeasurementActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final b f45351e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private final c f45352f = new c(this);

    /* compiled from: HowToTakeAMeasurementActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 906552142, new e(HowToTakeAMeasurementActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class b implements bn0.d<Activity, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f45354a = nm0.h.b(new f(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f45355b;

        public b(Activity activity) {
            this.f45355b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f45354a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f45356a = nm0.h.b(new g(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f45357b;

        public c(Activity activity) {
            this.f45357b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f45356a.getValue();
        }
    }

    public static final long A3(HowToTakeAMeasurementActivity howToTakeAMeasurementActivity) {
        return ((Number) howToTakeAMeasurementActivity.f45352f.getValue(howToTakeAMeasurementActivity, f45350g[1])).longValue();
    }

    public static final Device z3(HowToTakeAMeasurementActivity howToTakeAMeasurementActivity) {
        return (Device) howToTakeAMeasurementActivity.f45351e.getValue(howToTakeAMeasurementActivity, f45350g[0]);
    }

    @Override // com.withings.tutorials.ui.screens.howtouse.Hilt_HowToTakeAMeasurementActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -650280920, new a()));
    }
}
