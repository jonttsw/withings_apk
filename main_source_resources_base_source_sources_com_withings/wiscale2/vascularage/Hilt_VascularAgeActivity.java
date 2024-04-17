package com.withings.wiscale2.vascularage;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_VascularAgeActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f62183a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f62184b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f62185c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f62186d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_VascularAgeActivity() {
        addOnContextAvailableListener(new e(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f62184b == null) {
            synchronized (this.f62185c) {
                try {
                    if (this.f62184b == null) {
                        this.f62184b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f62184b;
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
        if (!this.f62186d) {
            this.f62186d = true;
            ((v) generatedComponent()).f1((VascularAgeActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f62183a = b10;
            if (b10.b()) {
                this.f62183a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f62183a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
