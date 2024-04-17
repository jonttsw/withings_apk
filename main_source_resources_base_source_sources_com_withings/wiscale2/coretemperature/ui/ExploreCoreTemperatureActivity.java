package com.withings.wiscale2.coretemperature.ui;

import android.app.Activity;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.lifecycle.k1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: ExploreCoreTemperatureActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/coretemperature/ui/ExploreCoreTemperatureActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ExploreCoreTemperatureActivity extends Hilt_ExploreCoreTemperatureActivity {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f50411h = {v.c(ExploreCoreTemperatureActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0)};
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public p f50412e;

    /* renamed from: f  reason: collision with root package name */
    private final b f50413f = new b(this);

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f50414g = nm0.h.b(new c());

    /* compiled from: ExploreCoreTemperatureActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -361764111, new com.withings.wiscale2.coretemperature.ui.b(ExploreCoreTemperatureActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class b implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f50416a = nm0.h.b(new com.withings.wiscale2.coretemperature.ui.c(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f50417b;

        public b(Activity activity) {
            this.f50417b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f50416a.getValue();
        }
    }

    /* compiled from: ExploreCoreTemperatureActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<n> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final n invoke() {
            ExploreCoreTemperatureActivity exploreCoreTemperatureActivity = ExploreCoreTemperatureActivity.this;
            return (n) new k1(exploreCoreTemperatureActivity, new d(exploreCoreTemperatureActivity)).a(n.class);
        }
    }

    public static final n A3(ExploreCoreTemperatureActivity exploreCoreTemperatureActivity) {
        return (n) exploreCoreTemperatureActivity.f50414g.getValue();
    }

    public static final long z3(ExploreCoreTemperatureActivity exploreCoreTemperatureActivity) {
        return ((Number) exploreCoreTemperatureActivity.f50413f.getValue(exploreCoreTemperatureActivity, f50411h[0])).longValue();
    }

    @Override // com.withings.wiscale2.coretemperature.ui.Hilt_ExploreCoreTemperatureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, -1918597173, new a()));
    }
}
