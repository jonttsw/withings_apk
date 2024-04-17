package com.withings.tutorials.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes4.dex */
public abstract class Hilt_DeviceIntroductionActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f44670a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f44671b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f44672c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f44673d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_DeviceIntroductionActivity() {
        addOnContextAvailableListener(new u(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f44671b == null) {
            synchronized (this.f44672c) {
                try {
                    if (this.f44671b == null) {
                        this.f44671b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f44671b;
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
        if (!this.f44673d) {
            this.f44673d = true;
            ((q) generatedComponent()).m1((DeviceIntroductionActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f44670a = b10;
            if (b10.b()) {
                this.f44670a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f44670a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
