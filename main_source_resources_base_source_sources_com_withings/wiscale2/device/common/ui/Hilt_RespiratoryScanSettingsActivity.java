package com.withings.wiscale2.device.common.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_RespiratoryScanSettingsActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f53718a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f53719b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f53720c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f53721d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_RespiratoryScanSettingsActivity() {
        addOnContextAvailableListener(new q1(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f53719b == null) {
            synchronized (this.f53720c) {
                try {
                    if (this.f53719b == null) {
                        this.f53719b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f53719b;
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
        if (!this.f53721d) {
            this.f53721d = true;
            ((f2) generatedComponent()).o((RespiratoryScanSettingsActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f53718a = b10;
            if (b10.b()) {
                this.f53718a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f53718a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
