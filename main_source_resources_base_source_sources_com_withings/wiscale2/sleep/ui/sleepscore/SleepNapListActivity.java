package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.android.activity.WithingsActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import pm.e;
/* compiled from: SleepNapListActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepNapListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepNapListActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final e f60631a = new e(this);

    /* renamed from: b  reason: collision with root package name */
    private final f f60632b = new f(this);

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f60633c = nm0.h.b(new b());

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f60634d = nm0.h.b(new g());

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f60635e = nm0.h.b(new c());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f60636f = nm0.h.b(new d());

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60630h = {androidx.camera.core.v.c(SleepNapListActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0), androidx.camera.core.v.c(SleepNapListActivity.class, FoodDayFragment.ARG_DAY, "getDay()J", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f60629g = new Object();

    /* compiled from: SleepNapListActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepNapListActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<pm.e> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final pm.e invoke() {
            Context context = SleepNapListActivity.C3(SleepNapListActivity.this).getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            e.a aVar = new e.a(context, 0);
            aVar.t(true);
            return new pm.e(aVar);
        }
    }

    /* compiled from: SleepNapListActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<ProgressBar> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final ProgressBar invoke() {
            return (ProgressBar) SleepNapListActivity.this.findViewById(C1987R.id.progress);
        }
    }

    /* compiled from: SleepNapListActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<RecyclerView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final RecyclerView invoke() {
            return (RecyclerView) SleepNapListActivity.this.findViewById(C1987R.id.naps_list);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60640a = nm0.h.b(new s2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60641b;

        public e(Activity activity) {
            this.f60641b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60640a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60642a = nm0.h.b(new t2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60643b;

        public f(Activity activity) {
            this.f60643b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60642a.getValue();
        }
    }

    /* compiled from: SleepNapListActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) SleepNapListActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    public static final pm.e A3(SleepNapListActivity sleepNapListActivity) {
        return (pm.e) sleepNapListActivity.f60633c.getValue();
    }

    public static final ProgressBar B3(SleepNapListActivity sleepNapListActivity) {
        return (ProgressBar) sleepNapListActivity.f60635e.getValue();
    }

    public static final RecyclerView C3(SleepNapListActivity sleepNapListActivity) {
        return (RecyclerView) sleepNapListActivity.f60636f.getValue();
    }

    public static final User D3(SleepNapListActivity sleepNapListActivity) {
        return (User) sleepNapListActivity.f60631a.getValue(sleepNapListActivity, f60630h[0]);
    }

    public static final long z3(SleepNapListActivity sleepNapListActivity) {
        return ((Number) sleepNapListActivity.f60632b.getValue(sleepNapListActivity, f60630h[1])).longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_sleep_naps);
        Object value = this.f60634d.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        setSupportActionBar((Toolbar) value);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.v(C1987R.string.sleepScore_naps);
            supportActionBar.o(true);
        }
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new r2(this, null), 3, null);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
