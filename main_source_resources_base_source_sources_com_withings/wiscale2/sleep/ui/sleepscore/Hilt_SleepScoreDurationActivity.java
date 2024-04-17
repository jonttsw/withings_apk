package com.withings.wiscale2.sleep.ui.sleepscore;

import android.os.Bundle;
import androidx.lifecycle.k1;
/* loaded from: classes5.dex */
public abstract class Hilt_SleepScoreDurationActivity extends BaseSleepDetailActivity implements ik0.b {

    /* renamed from: c  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f60490c;

    /* renamed from: d  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f60491d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f60492e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f60493f = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_SleepScoreDurationActivity() {
        addOnContextAvailableListener(new g(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f60491d == null) {
            synchronized (this.f60492e) {
                try {
                    if (this.f60491d == null) {
                        this.f60491d = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f60491d;
    }

    @Override // ik0.b
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.u
    public final k1.b getDefaultViewModelProviderFactory() {
        return fk0.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void inject() {
        if (!this.f60493f) {
            this.f60493f = true;
            ((y2) generatedComponent()).D0((SleepScoreDurationActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f60490c = b10;
            if (b10.b()) {
                this.f60490c.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f60490c;
        if (gVar != null) {
            gVar.a();
        }
    }
}
