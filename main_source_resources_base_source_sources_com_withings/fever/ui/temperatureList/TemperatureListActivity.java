package com.withings.fever.ui.temperatureList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.core.view.l1;
import androidx.lifecycle.k1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: TemperatureListActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/fever/ui/temperatureList/TemperatureListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "Lcom/withings/fever/ui/temperatureList/o;", "temperatureListState", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TemperatureListActivity extends Hilt_TemperatureListActivity {

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f39417h = {v.c(TemperatureListActivity.class, NavigationArguments.USER_ID, "getUserId()Ljava/lang/Long;", 0)};
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public r f39419f;

    /* renamed from: e  reason: collision with root package name */
    private final b f39418e = new b(this);

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f39420g = nm0.h.b(new c());

    /* compiled from: TemperatureListActivity.kt */
    /* loaded from: classes3.dex */
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
                yk.o.b(false, s1.b.b(aVar2, -1221614510, new k(TemperatureListActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f39422a = nm0.h.b(new l(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f39423b;

        public b(Activity activity) {
            this.f39423b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f39422a.getValue();
        }
    }

    /* compiled from: TemperatureListActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<q> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final q invoke() {
            TemperatureListActivity temperatureListActivity = TemperatureListActivity.this;
            return (q) new k1(temperatureListActivity, new m(temperatureListActivity)).a(q.class);
        }
    }

    public static final q A3(TemperatureListActivity temperatureListActivity) {
        return (q) temperatureListActivity.f39420g.getValue();
    }

    public static final Long z3(TemperatureListActivity temperatureListActivity) {
        return (Long) temperatureListActivity.f39418e.getValue(temperatureListActivity, f39417h[0]);
    }

    @Override // com.withings.fever.ui.temperatureList.Hilt_TemperatureListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -1585475528, new a()));
    }
}
