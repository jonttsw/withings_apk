package com.withings.fever.ui.temperatureList;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes3.dex */
public abstract class Hilt_TemperatureListActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f39413a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f39414b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f39415c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f39416d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_TemperatureListActivity() {
        addOnContextAvailableListener(new a(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f39414b == null) {
            synchronized (this.f39415c) {
                try {
                    if (this.f39414b == null) {
                        this.f39414b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f39414b;
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
        if (!this.f39416d) {
            this.f39416d = true;
            ((n) generatedComponent()).f((TemperatureListActivity) this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f39413a = b10;
            if (b10.b()) {
                this.f39413a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f39413a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
