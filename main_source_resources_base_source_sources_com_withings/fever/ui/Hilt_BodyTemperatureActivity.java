package com.withings.fever.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes3.dex */
public abstract class Hilt_BodyTemperatureActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f39213a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f39214b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f39215c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f39216d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_BodyTemperatureActivity() {
        addOnContextAvailableListener(new s0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f39214b == null) {
            synchronized (this.f39215c) {
                try {
                    if (this.f39214b == null) {
                        this.f39214b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f39214b;
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
        if (!this.f39216d) {
            this.f39216d = true;
            ((l) generatedComponent()).g1((BodyTemperatureActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f39213a = b10;
            if (b10.b()) {
                this.f39213a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f39213a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
