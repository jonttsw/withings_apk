package com.withings.core.device;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.fragment.app.m0;
import com.withings.android.activity.WithingsActivity;
import com.withings.core.device.FullscreenVideoFragment;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: FullScreenVideoActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/withings/core/device/FullScreenVideoActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/core/device/FullscreenVideoFragment$a;", "<init>", "()V", "CloseActivityBroadcastReceiver", "a", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FullScreenVideoActivity extends WithingsActivity implements FullscreenVideoFragment.a {

    /* renamed from: a  reason: collision with root package name */
    private fm.a f35314a;

    /* renamed from: b  reason: collision with root package name */
    private final b f35315b = new b(this);

    /* renamed from: c  reason: collision with root package name */
    private final c f35316c = new c(this);

    /* renamed from: d  reason: collision with root package name */
    private final d f35317d = new d(this);

    /* renamed from: e  reason: collision with root package name */
    private final e f35318e = new e(this);

    /* renamed from: f  reason: collision with root package name */
    private CloseActivityBroadcastReceiver f35319f = new CloseActivityBroadcastReceiver();

    /* renamed from: h  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f35313h = {v.c(FullScreenVideoActivity.class, "titleResId", "getTitleResId()I", 0), v.c(FullScreenVideoActivity.class, "urlResId", "getUrlResId()I", 0), v.c(FullScreenVideoActivity.class, "canSkip", "getCanSkip()Z", 0), v.c(FullScreenVideoActivity.class, "fallbackImgResId", "getFallbackImgResId()I", 0)};

    /* renamed from: g  reason: collision with root package name */
    public static final a f35312g = new Object();

    /* compiled from: FullScreenVideoActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/core/device/FullScreenVideoActivity$CloseActivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "core_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public final class CloseActivityBroadcastReceiver extends BroadcastReceiver {
        public CloseActivityBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            u.j(context, "context");
            u.j(intent, "intent");
            FullScreenVideoActivity fullScreenVideoActivity = FullScreenVideoActivity.this;
            fullScreenVideoActivity.setResult(-1);
            fullScreenVideoActivity.finish();
        }
    }

    /* compiled from: FullScreenVideoActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static Intent a(int i11, int i12, int i13, WithingsActivity context) {
            u.j(context, "context");
            Intent intent = new Intent(context, FullScreenVideoActivity.class);
            intent.putExtra("titleResId", i11);
            intent.putExtra("urlResId", i12);
            intent.putExtra(" canSkip", false);
            intent.putExtra(" fallbackImg", i13);
            return intent;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35321a = nm0.h.b(new com.withings.core.device.a(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f35322b;

        public b(Activity activity) {
            this.f35322b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f35321a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35323a = nm0.h.b(new com.withings.core.device.b(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f35324b;

        public c(Activity activity) {
            this.f35324b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f35323a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35325a = nm0.h.b(new com.withings.core.device.c(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f35326b;

        public d(Activity activity) {
            this.f35326b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f35325a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35327a = nm0.h.b(new com.withings.core.device.d(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f35328b;

        public e(Activity activity) {
            this.f35328b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f35327a.getValue();
        }
    }

    @Override // com.withings.core.device.FullscreenVideoFragment.a
    public final void E(FullscreenVideoFragment fragment) {
        u.j(fragment, "fragment");
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        fm.a b10 = fm.a.b(getLayoutInflater());
        this.f35314a = b10;
        setContentView(b10.a());
        fm.a aVar = this.f35314a;
        if (aVar != null) {
            setSupportActionBar(aVar.f67697b);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                fm.a aVar2 = this.f35314a;
                if (aVar2 != null) {
                    Toolbar toolbar = aVar2.f67697b;
                    u.i(toolbar, "toolbar");
                    toolbar.setVisibility(0);
                    supportActionBar.q(false);
                    supportActionBar.o(true);
                } else {
                    u.s("binding");
                    throw null;
                }
            }
            FullscreenVideoFragment.b bVar = FullscreenVideoFragment.f35329k;
            k<Object>[] kVarArr = f35313h;
            int intValue = ((Number) this.f35315b.getValue(this, kVarArr[0])).intValue();
            int intValue2 = ((Number) this.f35316c.getValue(this, kVarArr[1])).intValue();
            boolean booleanValue = ((Boolean) this.f35317d.getValue(this, kVarArr[2])).booleanValue();
            int intValue3 = ((Number) this.f35318e.getValue(this, kVarArr[3])).intValue();
            bVar.getClass();
            FullscreenVideoFragment fullscreenVideoFragment = new FullscreenVideoFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("titleResId", intValue);
            bundle2.putInt("urlResId", intValue2);
            bundle2.putBoolean("canSkip", booleanValue);
            bundle2.putInt("fallbackImg", intValue3);
            fullscreenVideoFragment.setArguments(bundle2);
            m0 m11 = getSupportFragmentManager().m();
            m11.l(C1987R.id.content, fullscreenVideoFragment, null);
            m11.e(null);
            m11.f();
            androidx.core.content.a.registerReceiver(this, this.f35319f, new IntentFilter("com.withings.core.FullScreenVideoActivity"), 4);
            return;
        }
        u.s("binding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ay.b.w(this, this.f35319f);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (16908332 == item.getItemId()) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
