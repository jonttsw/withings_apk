package com.withings.authentication;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes3.dex */
public abstract class Hilt_AuthenticationActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f31336a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f31337b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f31338c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f31339d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_AuthenticationActivity() {
        addOnContextAvailableListener(new y0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f31337b == null) {
            synchronized (this.f31338c) {
                try {
                    if (this.f31337b == null) {
                        this.f31337b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f31337b;
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
        if (!this.f31339d) {
            this.f31339d = true;
            ((x0) generatedComponent()).L0((AuthenticationActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f31336a = b10;
            if (b10.b()) {
                this.f31336a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f31336a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
