package com.withings.wiscale2.profile;

import android.app.Activity;
import android.os.Bundle;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.profile.q;
import kotlin.Metadata;
/* compiled from: ProfileActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/profile/ProfileActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProfileActivity extends Hilt_ProfileActivity {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f59264f = {androidx.camera.core.v.c(ProfileActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final a f59265e;

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class a implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f59266a = nm0.h.b(new n(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f59267b;

        public a(Activity activity) {
            this.f59267b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f59266a.getValue();
        }
    }

    public ProfileActivity() {
        super(0);
        this.f59265e = new a(this);
    }

    @Override // com.withings.wiscale2.profile.Hilt_ProfileActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        androidx.fragment.app.m0 m11 = getSupportFragmentManager().m();
        q.a aVar = q.R;
        User user = (User) this.f59265e.getValue(this, f59264f[0]);
        aVar.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        q qVar = new q();
        qVar.setArguments(androidx.core.os.e.a(new nm0.j("extra_user", user)));
        m11.l(C1987R.id.fragment_container, qVar, null);
        m11.f();
    }
}
