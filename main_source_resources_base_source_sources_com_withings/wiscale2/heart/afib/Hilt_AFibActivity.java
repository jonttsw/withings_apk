package com.withings.wiscale2.heart.afib;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.measure.detail.paged.DatePagedActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_AFibActivity extends DatePagedActivity implements ik0.b {

    /* renamed from: f  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f57114f;

    /* renamed from: g  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f57115g;

    /* renamed from: h  reason: collision with root package name */
    private final Object f57116h = new Object();

    /* renamed from: i  reason: collision with root package name */
    private boolean f57117i = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_AFibActivity() {
        addOnContextAvailableListener(new o0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f57115g == null) {
            synchronized (this.f57116h) {
                try {
                    if (this.f57115g == null) {
                        this.f57115g = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f57115g;
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
        if (!this.f57117i) {
            this.f57117i = true;
            ((b) generatedComponent()).F0((AFibActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.withings.measure.detail.paged.DatePagedActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f57114f = b10;
            if (b10.b()) {
                this.f57114f.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f57114f;
        if (gVar != null) {
            gVar.a();
        }
    }
}
