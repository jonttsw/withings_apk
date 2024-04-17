package com.withings.wiscale2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.k1;
import com.withings.core.utils.WithingsFileProvider;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.widget.LineCellView;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: ShareWithMyDoctor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/ShareWithMyDoctorActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ShareWithMyDoctorActivity extends Hilt_ShareWithMyDoctorActivity {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f47972i = {androidx.camera.core.v.c(ShareWithMyDoctorActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f47973j = 0;

    /* renamed from: e  reason: collision with root package name */
    private t2 f47974e;

    /* renamed from: f  reason: collision with root package name */
    private final c f47975f = new c(this);

    /* renamed from: g  reason: collision with root package name */
    private DateTime f47976g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public fy.l f47977h;

    /* compiled from: Extensions.kt */
    /* loaded from: classes4.dex */
    public static final class a implements k1.b {
        public a() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
            kotlin.jvm.internal.u.j(modelClass, "modelClass");
            ShareWithMyDoctorActivity shareWithMyDoctorActivity = ShareWithMyDoctorActivity.this;
            Application application = shareWithMyDoctorActivity.getApplication();
            kotlin.jvm.internal.u.i(application, "getApplication(...)");
            User B3 = ShareWithMyDoctorActivity.B3(shareWithMyDoctorActivity);
            fy.l lVar = shareWithMyDoctorActivity.f47977h;
            if (lVar != null) {
                return new t2(application, B3, lVar);
            }
            kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypesBetween");
            throw null;
        }
    }

    /* compiled from: ShareWithMyDoctor.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<p2, nm0.y> {
        b() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(p2 p2Var) {
            p2 it = p2Var;
            kotlin.jvm.internal.u.j(it, "it");
            int i11 = ShareWithMyDoctorActivity.f47973j;
            ShareWithMyDoctorActivity shareWithMyDoctorActivity = ShareWithMyDoctorActivity.this;
            shareWithMyDoctorActivity.getClass();
            androidx.core.app.f0 f0Var = new androidx.core.app.f0(shareWithMyDoctorActivity);
            f0Var.h(shareWithMyDoctorActivity.getString(C1987R.string._BPMAIL_SUBJECT_));
            f0Var.j("message/rfc822");
            f0Var.f(new String[]{((EditText) shareWithMyDoctorActivity.findViewById(C1987R.id.email)).getText().toString()});
            f0Var.i(it.a());
            int i12 = WithingsFileProvider.f35394f;
            f0Var.a(WithingsFileProvider.a.a(shareWithMyDoctorActivity, it.b()));
            f0Var.d(C1987R.string._SHARING_BLOOD_PRESSURE_TITLE_);
            f0Var.k();
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47980a = nm0.h.b(new q2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f47981b;

        public c(Activity activity) {
            this.f47981b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47980a.getValue();
        }
    }

    public ShareWithMyDoctorActivity() {
        DateTime minusWeeks = DateTime.now().minusWeeks(1);
        kotlin.jvm.internal.u.i(minusWeeks, "minusWeeks(...)");
        this.f47976g = minusWeeks;
    }

    public static void A3(ShareWithMyDoctorActivity this$0, LineCellView lineCellView, MenuItem menuItem) {
        DateTime h11;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        int itemId = menuItem.getItemId();
        if (itemId == C1987R.id.last_week) {
            h11 = DateTime.now().minusWeeks(1);
            kotlin.jvm.internal.u.i(h11, "minusWeeks(...)");
        } else if (itemId == C1987R.id.last_trimestre) {
            h11 = DateTime.now().minusMonths(3);
            kotlin.jvm.internal.u.i(h11, "minusMonths(...)");
        } else {
            h11 = ((User) this$0.f47975f.getValue(this$0, f47972i[0])).h();
            kotlin.jvm.internal.u.i(h11, "getCreationDate(...)");
        }
        this$0.f47976g = h11;
        lineCellView.setValue(menuItem.getTitle());
    }

    public static final User B3(ShareWithMyDoctorActivity shareWithMyDoctorActivity) {
        shareWithMyDoctorActivity.getClass();
        return (User) shareWithMyDoctorActivity.f47975f.getValue(shareWithMyDoctorActivity, f47972i[0]);
    }

    public static void z3(ShareWithMyDoctorActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        t2 t2Var = this$0.f47974e;
        if (t2Var != null) {
            t2Var.i0().postValue(this$0.f47976g);
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.Hilt_ShareWithMyDoctorActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_share_with_doctor);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.q(true);
        }
        t2 t2Var = (t2) new androidx.lifecycle.k1(this, new a()).a(t2.class);
        xw.d.c(this, t2Var.f0(), new b());
        this.f47974e = t2Var;
        findViewById(C1987R.id.share).setOnClickListener(new gi.f(this, 6));
        LineCellView lineCellView = (LineCellView) findViewById(C1987R.id.extended);
        lineCellView.setOnClickListener(new xn.b(this, lineCellView, 1));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        finish();
        return true;
    }
}
