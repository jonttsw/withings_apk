package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_Wpa02CartridgeActivationActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f55105a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f55106b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f55107c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f55108d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_Wpa02CartridgeActivationActivity() {
        addOnContextAvailableListener(new n(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f55106b == null) {
            synchronized (this.f55107c) {
                try {
                    if (this.f55106b == null) {
                        this.f55106b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f55106b;
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
        if (!this.f55108d) {
            this.f55108d = true;
            ((a0) generatedComponent()).N((Wpa02CartridgeActivationActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f55105a = b10;
            if (b10.b()) {
                this.f55105a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f55105a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
