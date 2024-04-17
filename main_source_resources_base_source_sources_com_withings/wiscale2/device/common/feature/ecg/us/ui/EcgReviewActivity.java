package com.withings.wiscale2.device.common.feature.ecg.us.ui;

import android.app.Activity;
import android.os.Bundle;
import androidx.camera.core.v;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: EcgReviewActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/ecg/us/ui/EcgReviewActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EcgReviewActivity extends Hilt_EcgReviewActivity {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f51985j = {v.c(EcgReviewActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), v.c(EcgReviewActivity.class, "deviceId", "getDeviceId()J", 0)};
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public q f51986e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public ch.d f51987f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public kn.e f51988g;

    /* renamed from: h  reason: collision with root package name */
    private final b f51989h = new b(this);

    /* renamed from: i  reason: collision with root package name */
    private final c f51990i = new c(this);

    /* compiled from: EcgReviewActivity.kt */
    /* loaded from: classes5.dex */
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
                yk.o.b(false, s1.b.b(aVar2, -1201035688, new e(EcgReviewActivity.this)), aVar2, 48, 1);
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f51992a = nm0.h.b(new f(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f51993b;

        public b(Activity activity) {
            this.f51993b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f51992a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f51994a = nm0.h.b(new g(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f51995b;

        public c(Activity activity) {
            this.f51995b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f51994a.getValue();
        }
    }

    public static final long A3(EcgReviewActivity ecgReviewActivity) {
        return ((Number) ecgReviewActivity.f51989h.getValue(ecgReviewActivity, f51985j[0])).longValue();
    }

    public static final long z3(EcgReviewActivity ecgReviewActivity) {
        return ((Number) ecgReviewActivity.f51990i.getValue(ecgReviewActivity, f51985j[1])).longValue();
    }

    @Override // com.withings.wiscale2.device.common.feature.ecg.us.ui.Hilt_EcgReviewActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, -545968322, new a()));
    }
}
