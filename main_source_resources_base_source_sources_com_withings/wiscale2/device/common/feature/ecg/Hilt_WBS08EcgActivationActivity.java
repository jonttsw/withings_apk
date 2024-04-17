package com.withings.wiscale2.device.common.feature.ecg;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_WBS08EcgActivationActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f51100a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f51101b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f51102c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f51103d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_WBS08EcgActivationActivity() {
        addOnContextAvailableListener(new w5(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f51101b == null) {
            synchronized (this.f51102c) {
                try {
                    if (this.f51101b == null) {
                        this.f51101b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f51101b;
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
        if (!this.f51103d) {
            this.f51103d = true;
            WBS08EcgActivationActivity wBS08EcgActivationActivity = (WBS08EcgActivationActivity) this;
            ((mb) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f51100a = b10;
            if (b10.b()) {
                this.f51100a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f51100a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
