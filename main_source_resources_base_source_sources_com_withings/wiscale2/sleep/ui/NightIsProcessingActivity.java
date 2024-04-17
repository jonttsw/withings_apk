package com.withings.wiscale2.sleep.ui;

import ah.u;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import sg.b;
import y70.a;
/* compiled from: NightIsProcessingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/NightIsProcessingActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NightIsProcessingActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f60415a = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_night_is_processing);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.q(false);
            supportActionBar.s(a.c(C1987R.drawable.icon_medium_navigation_close, this, u.w(C1987R.attr.colorOnPrimary, this, -65281)));
        }
        findViewById(C1987R.id.button).setOnClickListener(new b(this, 19));
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
