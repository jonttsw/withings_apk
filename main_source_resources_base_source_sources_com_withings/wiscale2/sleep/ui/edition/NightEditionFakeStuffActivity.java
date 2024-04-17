package com.withings.wiscale2.sleep.ui.edition;

import android.os.Bundle;
import android.view.View;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NightEditionActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/edition/NightEditionFakeStuffActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NightEditionFakeStuffActivity extends WithingsActivity {

    /* compiled from: View.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NightEditionFakeStuffActivity nightEditionFakeStuffActivity = NightEditionFakeStuffActivity.this;
            nightEditionFakeStuffActivity.setResult(-1);
            nightEditionFakeStuffActivity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_night_edition_fake_stuff);
        View findViewById = findViewById(C1987R.id.loading);
        u.i(findViewById, "findViewById(...)");
        findViewById.postDelayed(new a(), 3000L);
    }
}
