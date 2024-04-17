package com.withings.wiscale2.vascularage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: VascularAgeActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/vascularage/VascularAgeActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lpy/a;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class VascularAgeActivity extends Hilt_VascularAgeActivity implements py.a {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f62191j = {androidx.camera.core.v.c(VascularAgeActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public m1 f62192e;

    /* renamed from: f  reason: collision with root package name */
    private final c f62193f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f62194g = nm0.h.b(new b());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f62195h = nm0.h.b(new d());

    /* renamed from: i  reason: collision with root package name */
    private final String f62196i = "vascular_age";

    /* compiled from: VascularAgeActivity.kt */
    /* loaded from: classes5.dex */
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
                yk.o.b(false, s1.b.b(aVar2, 1789689464, new m(VascularAgeActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: VascularAgeActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(VascularAgeActivity.this.getIntent().getBooleanExtra("extra_should_scroll_pwv", false));
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class c implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f62199a = nm0.h.b(new n(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f62200b;

        public c(Activity activity) {
            this.f62200b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f62199a.getValue();
        }
    }

    /* compiled from: VascularAgeActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<r0> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final r0 invoke() {
            VascularAgeActivity vascularAgeActivity = VascularAgeActivity.this;
            return (r0) new androidx.lifecycle.k1(vascularAgeActivity, new o(vascularAgeActivity)).a(r0.class);
        }
    }

    public static final User A3(VascularAgeActivity vascularAgeActivity) {
        return (User) vascularAgeActivity.f62193f.getValue(vascularAgeActivity, f62191j[0]);
    }

    public static final r0 B3(VascularAgeActivity vascularAgeActivity) {
        return (r0) vascularAgeActivity.f62195h.getValue();
    }

    public static final boolean z3(VascularAgeActivity vascularAgeActivity) {
        return ((Boolean) vascularAgeActivity.f62194g.getValue()).booleanValue();
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f62196i;
    }

    @Override // com.withings.wiscale2.vascularage.Hilt_VascularAgeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"StateFlowValueCalledInComposition"})
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.k.a(this, new s1.a(true, -1077767330, new a()));
    }
}
