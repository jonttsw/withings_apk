package com.withings.wiscale2.settings;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_SettingsActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f59730a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f59731b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f59732c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f59733d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_SettingsActivity() {
        addOnContextAvailableListener(new g0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f59731b == null) {
            synchronized (this.f59732c) {
                try {
                    if (this.f59731b == null) {
                        this.f59731b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f59731b;
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
        if (!this.f59733d) {
            this.f59733d = true;
            ((c5) generatedComponent()).T0((SettingsActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f59730a = b10;
            if (b10.b()) {
                this.f59730a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f59730a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
