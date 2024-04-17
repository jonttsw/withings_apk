package com.withings.cycletracking.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes3.dex */
public abstract class Hilt_CycleTrackingActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f35482a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f35483b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f35484c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f35485d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_CycleTrackingActivity() {
        addOnContextAvailableListener(new g2(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f35483b == null) {
            synchronized (this.f35484c) {
                try {
                    if (this.f35483b == null) {
                        this.f35483b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f35483b;
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
        if (!this.f35485d) {
            this.f35485d = true;
            ((w0) generatedComponent()).p((CycleTrackingActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f35482a = b10;
            if (b10.b()) {
                this.f35482a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f35482a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
