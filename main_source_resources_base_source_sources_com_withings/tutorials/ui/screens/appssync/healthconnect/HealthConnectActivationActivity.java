package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.app.Activity;
import android.os.Bundle;
import androidx.core.view.l1;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: HealthConnectActivationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/tutorials/ui/screens/appssync/healthconnect/HealthConnectActivationActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HealthConnectActivationActivity extends Hilt_HealthConnectActivationActivity {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f44872i = {androidx.camera.core.v.c(HealthConnectActivationActivity.class, "isActivated", "isActivated()Z", 0), androidx.camera.core.v.c(HealthConnectActivationActivity.class, "isInstalled", "isInstalled()Z", 0)};
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public q60.a f44873e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public ch.d f44874f;

    /* renamed from: g  reason: collision with root package name */
    private final b f44875g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    private final c f44876h = new c(this);

    /* compiled from: HealthConnectActivationActivity.kt */
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
                yk.o.b(false, s1.b.b(aVar2, -1317465231, new j(HealthConnectActivationActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class b implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f44878a = nm0.h.b(new k(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f44879b;

        public b(Activity activity) {
            this.f44879b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f44878a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f44880a = nm0.h.b(new l(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f44881b;

        public c(Activity activity) {
            this.f44881b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f44880a.getValue();
        }
    }

    public static final boolean A3(HealthConnectActivationActivity healthConnectActivationActivity) {
        return ((Boolean) healthConnectActivationActivity.f44876h.getValue(healthConnectActivationActivity, f44872i[1])).booleanValue();
    }

    public static final boolean z3(HealthConnectActivationActivity healthConnectActivationActivity) {
        return ((Boolean) healthConnectActivationActivity.f44875g.getValue(healthConnectActivationActivity, f44872i[0])).booleanValue();
    }

    @Override // com.withings.tutorials.ui.screens.appssync.healthconnect.Hilt_HealthConnectActivationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, 1716907467, new a()));
    }
}
