package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_Wpa02CleansingModeActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f55218a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f55219b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f55220c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f55221d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_Wpa02CleansingModeActivity() {
        addOnContextAvailableListener(new t(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f55219b == null) {
            synchronized (this.f55220c) {
                try {
                    if (this.f55219b == null) {
                        this.f55219b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f55219b;
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
        if (!this.f55221d) {
            this.f55221d = true;
            Wpa02CleansingModeActivity wpa02CleansingModeActivity = (Wpa02CleansingModeActivity) this;
            ((n0) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f55218a = b10;
            if (b10.b()) {
                this.f55218a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f55218a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
