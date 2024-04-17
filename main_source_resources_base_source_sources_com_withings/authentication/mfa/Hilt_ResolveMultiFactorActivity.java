package com.withings.authentication.mfa;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes3.dex */
public abstract class Hilt_ResolveMultiFactorActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f31557a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f31558b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f31559c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f31560d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ResolveMultiFactorActivity() {
        addOnContextAvailableListener(new c(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f31558b == null) {
            synchronized (this.f31559c) {
                try {
                    if (this.f31558b == null) {
                        this.f31558b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f31558b;
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
        if (!this.f31560d) {
            this.f31560d = true;
            ((r) generatedComponent()).H0((ResolveMultiFactorActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f31557a = b10;
            if (b10.b()) {
                this.f31557a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f31557a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
