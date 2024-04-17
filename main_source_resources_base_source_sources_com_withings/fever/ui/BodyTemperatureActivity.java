package com.withings.fever.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.k1;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: BodyTemperatureActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/fever/ui/BodyTemperatureActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class BodyTemperatureActivity extends Hilt_BodyTemperatureActivity {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f39201j = {androidx.camera.core.v.c(BodyTemperatureActivity.class, NavigationArguments.USER_ID, "getUserId()Ljava/lang/Long;", 0), androidx.camera.core.v.c(BodyTemperatureActivity.class, "date", "getDate()Lorg/joda/time/DateTime;", 0)};
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public p0 f39204g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public ch.d f39205h;

    /* renamed from: e  reason: collision with root package name */
    private final b f39202e = new b(this);

    /* renamed from: f  reason: collision with root package name */
    private final c f39203f = new c(this);

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f39206i = nm0.h.b(new d());

    /* compiled from: BodyTemperatureActivity.kt */
    /* loaded from: classes3.dex */
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
                yk.o.b(false, s1.b.b(aVar2, -1181418994, new h(BodyTemperatureActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f39208a = nm0.h.b(new i(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f39209b;

        public b(Activity activity) {
            this.f39209b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f39208a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements bn0.d<Activity, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f39210a = nm0.h.b(new j(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f39211b;

        public c(Activity activity) {
            this.f39211b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f39210a.getValue();
        }
    }

    /* compiled from: BodyTemperatureActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<o0> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final o0 invoke() {
            BodyTemperatureActivity bodyTemperatureActivity = BodyTemperatureActivity.this;
            return (o0) new k1(bodyTemperatureActivity, new k(bodyTemperatureActivity)).a(o0.class);
        }
    }

    public static final Long A3(BodyTemperatureActivity bodyTemperatureActivity) {
        bodyTemperatureActivity.getClass();
        return (Long) bodyTemperatureActivity.f39202e.getValue(bodyTemperatureActivity, f39201j[0]);
    }

    public static final o0 B3(BodyTemperatureActivity bodyTemperatureActivity) {
        return (o0) bodyTemperatureActivity.f39206i.getValue();
    }

    public static final void C3(BodyTemperatureActivity bodyTemperatureActivity) {
        bodyTemperatureActivity.getClass();
        Long l5 = (Long) bodyTemperatureActivity.f39202e.getValue(bodyTemperatureActivity, f39201j[0]);
        Intent intent = null;
        if (l5 != null) {
            long longValue = l5.longValue();
            ch.d dVar = bodyTemperatureActivity.f39205h;
            if (dVar != null) {
                ah.q i11 = dVar.i();
                Context applicationContext = bodyTemperatureActivity.getApplicationContext();
                kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
                intent = ah.q.d(i11, applicationContext, 71, longValue);
            } else {
                kotlin.jvm.internal.u.s("intentBuilder");
                throw null;
            }
        }
        bodyTemperatureActivity.startActivity(intent);
    }

    public static final void D3(BodyTemperatureActivity bodyTemperatureActivity) {
        bodyTemperatureActivity.getClass();
        Long l5 = (Long) bodyTemperatureActivity.f39202e.getValue(bodyTemperatureActivity, f39201j[0]);
        if (l5 != null) {
            long longValue = l5.longValue();
            ch.d dVar = bodyTemperatureActivity.f39205h;
            if (dVar != null) {
                ah.i j5 = dVar.j();
                Context applicationContext = bodyTemperatureActivity.getApplicationContext();
                kotlin.jvm.internal.u.i(applicationContext, "getApplicationContext(...)");
                j5.getClass();
                Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(applicationContext.getPackageName(), "com.withings.fever.ui.temperatureList.TemperatureListActivity").putExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, longValue);
                kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
                bodyTemperatureActivity.startActivity(putExtra);
                return;
            }
            kotlin.jvm.internal.u.s("intentBuilder");
            throw null;
        }
    }

    public static final DateTime z3(BodyTemperatureActivity bodyTemperatureActivity) {
        return (DateTime) bodyTemperatureActivity.f39203f.getValue(bodyTemperatureActivity, f39201j[1]);
    }

    @Override // com.withings.fever.ui.Hilt_BodyTemperatureActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"StateFlowValueCalledInComposition"})
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, 890597876, new a()));
    }
}
