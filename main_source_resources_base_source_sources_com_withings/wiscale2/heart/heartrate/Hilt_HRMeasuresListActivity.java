package com.withings.wiscale2.heart.heartrate;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_HRMeasuresListActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f57516a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f57517b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f57518c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f57519d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_HRMeasuresListActivity() {
        addOnContextAvailableListener(new f1(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f57517b == null) {
            synchronized (this.f57518c) {
                try {
                    if (this.f57517b == null) {
                        this.f57517b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f57517b;
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
        if (!this.f57519d) {
            this.f57519d = true;
            ((g) generatedComponent()).S0((HRMeasuresListActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f57516a = b10;
            if (b10.b()) {
                this.f57516a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f57516a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
