package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: BaseSleepDetailActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/BaseSleepDetailActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseSleepDetailActivity extends WithingsActivity {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60480b = {androidx.camera.core.v.c(BaseSleepDetailActivity.class, "layout", "getLayout()Lcom/withings/wiscale2/databinding/ActivitySleepDetailBinding;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f60481a;

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.p0> {
        @Override // ym0.l
        public final tb0.p0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.motionLayout);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.p0.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public BaseSleepDetailActivity() {
        super(C1987R.layout.activity_sleep_detail);
        this.f60481a = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final tb0.p0 A3() {
        Object value = ((LifecycleViewBindingProperty) this.f60481a).getValue(this, f60480b[0]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.p0) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B3(String str, String str2) {
        A3().f99416g.setText(str);
        A3().f99415f.setText(str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C3(int i11, int i12, int i13) {
        tb0.p0 A3 = A3();
        A3.f99412c.setImageDrawable(y70.a.a(i11, this, i12));
        tb0.p0 A32 = A3();
        A32.f99411b.setBackground(y70.a.a(C1987R.drawable.white_circle, this, i13));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MotionLayout b10 = A3().b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        ay.b.t(b10);
        MotionLayout b11 = A3().b();
        kotlin.jvm.internal.u.i(b11, "getRoot(...)");
        ay.b.n(b11, true, false, 29);
        NestedScrollView scrollView = A3().f99413d;
        kotlin.jvm.internal.u.i(scrollView, "scrollView");
        ay.b.n(scrollView, false, true, 23);
        setSupportActionBar(A3().f99414e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.q(false);
        }
        tb0.p0 A3 = A3();
        A3.f99413d.addView(getLayoutInflater().inflate(z3(), (ViewGroup) null));
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

    public abstract int z3();
}
