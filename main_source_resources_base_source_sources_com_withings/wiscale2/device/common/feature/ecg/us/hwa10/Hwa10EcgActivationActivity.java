package com.withings.wiscale2.device.common.feature.ecg.us.hwa10;

import ac0.x;
import android.app.Activity;
import android.os.Bundle;
import androidx.camera.core.v;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import gc0.p0;
import hc0.q;
import ic0.c0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: Hwa10EcgActivationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/ecg/us/hwa10/Hwa10EcgActivationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Hwa10EcgActivationActivity extends Hilt_Hwa10EcgActivationActivity {

    /* renamed from: q  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f51782q = {v.c(Hwa10EcgActivationActivity.class, "deviceId", "getDeviceId()J", 0), v.c(Hwa10EcgActivationActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), v.c(Hwa10EcgActivationActivity.class, "isSwEcg1", "isSwEcg1()Z", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final b f51783e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private final c f51784f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final d f51785g = new d(this);
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public p0 f51786h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public q f51787i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public c0 f51788j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public ic0.q f51789k;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public x f51790l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public ac0.e f51791m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public jc0.v f51792n;
    @Inject

    /* renamed from: o  reason: collision with root package name */
    public ch.l f51793o;
    @Inject

    /* renamed from: p  reason: collision with root package name */
    public ch.d f51794p;

    /* compiled from: Hwa10EcgActivationActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements p<androidx.compose.runtime.a, Integer, y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -212869419, new k(Hwa10EcgActivationActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f51796a = nm0.h.b(new l(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f51797b;

        public b(Activity activity) {
            this.f51797b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f51796a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f51798a = nm0.h.b(new m(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f51799b;

        public c(Activity activity) {
            this.f51799b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f51798a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f51800a = nm0.h.b(new n(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f51801b;

        public d(Activity activity) {
            this.f51801b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f51800a.getValue();
        }
    }

    public static final long A3(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        return ((Number) hwa10EcgActivationActivity.f51784f.getValue(hwa10EcgActivationActivity, f51782q[1])).longValue();
    }

    public static final boolean B3(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        return ((Boolean) hwa10EcgActivationActivity.f51785g.getValue(hwa10EcgActivationActivity, f51782q[2])).booleanValue();
    }

    public static final long z3(Hwa10EcgActivationActivity hwa10EcgActivationActivity) {
        return ((Number) hwa10EcgActivationActivity.f51783e.getValue(hwa10EcgActivationActivity, f51782q[0])).longValue();
    }

    @Override // com.withings.wiscale2.device.common.feature.ecg.us.hwa10.Hilt_Hwa10EcgActivationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 409928111, new a()));
    }
}
