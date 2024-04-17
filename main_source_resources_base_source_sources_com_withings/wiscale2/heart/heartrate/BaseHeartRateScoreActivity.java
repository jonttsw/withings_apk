package com.withings.wiscale2.heart.heartrate;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.core.widget.NestedScrollView;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: BaseHeartRateScoreActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/heart/heartrate/BaseHeartRateScoreActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseHeartRateScoreActivity extends WithingsActivity {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57466b = {androidx.camera.core.v.c(BaseHeartRateScoreActivity.class, "activityBinding", "getActivityBinding()Lcom/withings/wiscale2/databinding/ActivityHeartRateScoreBinding;", 0)};

    /* renamed from: a  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f57467a;

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.w> {
        @Override // ym0.l
        public final tb0.w invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.motionLayout);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.w.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public BaseHeartRateScoreActivity() {
        super(C1987R.layout.activity_heart_rate_score);
        this.f57467a = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A3(int i11, int i12) {
        ImageView imageIcon = z3().f99568c;
        kotlin.jvm.internal.u.i(imageIcon, "imageIcon");
        imageIcon.setVisibility(0);
        FrameLayout imageBackground = z3().f99567b;
        kotlin.jvm.internal.u.i(imageBackground, "imageBackground");
        imageBackground.setVisibility(0);
        tb0.w z32 = z3();
        z32.f99568c.setImageDrawable(y70.a.a(i11, this, C1987R.color.color_text_primary_inverse));
        tb0.w z33 = z3();
        z33.f99567b.setBackground(y70.a.a(C1987R.drawable.white_circle, this, i12));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B3(String title, String subtitle) {
        kotlin.jvm.internal.u.j(title, "title");
        kotlin.jvm.internal.u.j(subtitle, "subtitle");
        z3().f99572g.setText(title);
        z3().f99571f.setText(subtitle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tb0.w z32 = z3();
        MotionLayout b10 = z32.b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        ay.b.t(b10);
        MotionLayout b11 = z32.b();
        kotlin.jvm.internal.u.i(b11, "getRoot(...)");
        ay.b.n(b11, true, false, 29);
        NestedScrollView scrollView = z32.f99569d;
        kotlin.jvm.internal.u.i(scrollView, "scrollView");
        ay.b.n(scrollView, false, true, 23);
        setSupportActionBar(z3().f99570e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.q(false);
        }
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final tb0.w z3() {
        Object value = ((LifecycleViewBindingProperty) this.f57467a).getValue(this, f57466b[0]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.w) value;
    }
}
