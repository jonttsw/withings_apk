package com.withings.wiscale2.insight;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.g;
import androidx.core.os.e;
import androidx.fragment.app.m0;
import com.withings.android.activity.WithingsActivity;
import com.withings.library.timeline.data.TimelineItem;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.j;
import nm0.y;
/* compiled from: InsightActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/insight/InsightActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class InsightActivity extends WithingsActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object parcelableExtra;
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_insight);
        setSupportActionBar((Toolbar) findViewById(C1987R.id.toolbar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        Drawable c11 = y70.a.c(C1987R.drawable.icon_medium_navigation_close, this, -1);
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.s(c11);
        }
        if (bundle == null) {
            Intent intent = getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("com.withings.wiscale2.extra.insight_event", TimelineItem.class);
            } else {
                parcelableExtra = intent.getParcelableExtra("com.withings.wiscale2.extra.insight_event");
            }
            TimelineItem timelineItem = (TimelineItem) parcelableExtra;
            y yVar = null;
            if (timelineItem != null) {
                a.f57864d.getClass();
                a aVar = new a();
                aVar.setArguments(e.a(new j("com.withings.wiscale2.extra.insight_event", timelineItem)));
                m0 m11 = getSupportFragmentManager().m();
                m11.l(C1987R.id.content, aVar, null);
                m11.f();
                yVar = y.f85009a;
            }
            if (yVar == null) {
                finish();
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            g.d(this);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
