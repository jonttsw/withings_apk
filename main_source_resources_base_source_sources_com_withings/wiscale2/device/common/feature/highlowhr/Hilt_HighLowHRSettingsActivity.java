package com.withings.wiscale2.device.common.feature.highlowhr;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public abstract class Hilt_HighLowHRSettingsActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f52220a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f52221b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f52222c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52223d;

    Hilt_HighLowHRSettingsActivity() {
        this.f52222c = new Object();
        this.f52223d = false;
        addOnContextAvailableListener(new l0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f52221b == null) {
            synchronized (this.f52222c) {
                try {
                    if (this.f52221b == null) {
                        this.f52221b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f52221b;
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
        if (!this.f52223d) {
            this.f52223d = true;
            ((h0) generatedComponent()).R((HighLowHRSettingsActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f52220a = b10;
            if (b10.b()) {
                this.f52220a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f52220a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_HighLowHRSettingsActivity(int i11) {
        super(C1987R.layout.activity_heartrate_thresholds_settings);
        this.f52222c = new Object();
        this.f52223d = false;
        addOnContextAvailableListener(new l0(this));
    }
}
