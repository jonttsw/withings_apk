package com.withings.android.activity;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.lokalise.sdk.LokaliseContextWrapper;
import com.withings.features.FeatureFlag;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import wr.b;
/* compiled from: WithingsActivity.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/withings/android/activity/WithingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/content/Context;", "newBase", "Lnm0/y;", "attachBaseContext", "(Landroid/content/Context;)V", "<init>", "()V", "", "contentLayoutId", "(I)V", "activity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class WithingsActivity extends AppCompatActivity {
    public WithingsActivity() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        u.j(newBase, "newBase");
        if (b.c(FeatureFlag.f39117m)) {
            super.attachBaseContext(LokaliseContextWrapper.Companion.wrap(newBase));
        } else {
            super.attachBaseContext(newBase);
        }
    }

    public WithingsActivity(int i11) {
        super(i11);
    }
}
