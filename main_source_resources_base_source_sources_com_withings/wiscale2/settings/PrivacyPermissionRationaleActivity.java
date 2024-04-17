package com.withings.wiscale2.settings;

import android.os.Bundle;
import com.withings.android.activity.WithingsActivity;
import com.withings.appnavigation.api.builder.SettingsDestinations;
import com.withings.wiscale2.settings.SettingsActivity;
import kotlin.Metadata;
/* compiled from: PrivacyPermissionRationaleActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/settings/PrivacyPermissionRationaleActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PrivacyPermissionRationaleActivity extends WithingsActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(SettingsActivity.b.a(SettingsActivity.f59742k, this, false, SettingsDestinations.f31278b, 6));
        finish();
    }
}
