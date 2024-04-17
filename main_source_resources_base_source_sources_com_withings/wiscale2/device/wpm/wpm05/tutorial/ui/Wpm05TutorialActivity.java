package com.withings.wiscale2.device.wpm.wpm05.tutorial.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.core.v;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
/* compiled from: Wpm05TutorialActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wpm/wpm05/tutorial/ui/Wpm05TutorialActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/device/wpm/wpm05/tutorial/ui/e$b;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpm05TutorialActivity extends WithingsActivity implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private final b f55927a = new b(this);

    /* renamed from: b  reason: collision with root package name */
    private ef0.f f55928b;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f55926d = {v.c(Wpm05TutorialActivity.class, "isPostInstall", "isPostInstall()Z", 0)};

    /* renamed from: c  reason: collision with root package name */
    public static final a f55925c = new Object();

    /* compiled from: Wpm05TutorialActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, boolean z5) {
            Intent putExtra = new Intent(context, Wpm05TutorialActivity.class).putExtra("extra_post_install", z5);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final g f55929a = h.b(new d(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f55930b;

        public b(Activity activity) {
            this.f55930b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f55929a.getValue();
        }
    }

    public static final boolean z3(Wpm05TutorialActivity wpm05TutorialActivity) {
        return ((Boolean) wpm05TutorialActivity.f55927a.getValue(wpm05TutorialActivity, f55926d[0])).booleanValue();
    }

    @Override // com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.e.b
    public final void g() {
        ef0.f fVar = this.f55928b;
        if (fVar != null) {
            fVar.k0();
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ef0.f fVar = this.f55928b;
        if (fVar != null) {
            fVar.f0();
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_wpm05_tutorial);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ef0.f fVar = (ef0.f) new k1(this, new ef0.a(this)).a(ef0.f.class);
        xw.d.c(this, fVar.j0(), new com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.a(this));
        xw.d.d(this, fVar.g0(), new com.withings.wiscale2.device.wpm.wpm05.tutorial.ui.b(this));
        xw.d.d(this, fVar.i0(), new c(this));
        this.f55928b = fVar;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            ef0.f fVar = this.f55928b;
            if (fVar != null) {
                fVar.f0();
                return true;
            }
            u.s("viewModel");
            throw null;
        }
        return super.onOptionsItemSelected(item);
    }
}
