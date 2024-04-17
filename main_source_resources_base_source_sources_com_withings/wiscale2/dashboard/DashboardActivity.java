package com.withings.wiscale2.dashboard;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.m0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.dashboard.i;
import kotlin.Metadata;
/* compiled from: DashboardActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/dashboard/DashboardActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DashboardActivity extends Hilt_DashboardActivity {

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f50488f = {androidx.camera.core.v.c(DashboardActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: e  reason: collision with root package name */
    private final a f50489e;

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class a implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f50490a = nm0.h.b(new b(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f50491b;

        public a(Activity activity) {
            this.f50491b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f50490a.getValue();
        }
    }

    public DashboardActivity() {
        super(0);
        this.f50489e = new a(this);
    }

    @Override // com.withings.wiscale2.dashboard.Hilt_DashboardActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        m0 m11 = getSupportFragmentManager().m();
        i.a aVar = i.f50527l;
        User user = (User) this.f50489e.getValue(this, f50488f[0]);
        aVar.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        i iVar = new i();
        iVar.setArguments(androidx.core.os.e.a(new nm0.j(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user)));
        m11.l(C1987R.id.fragment_container, iVar, null);
        m11.f();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return super.onOptionsItemSelected(item);
    }
}
