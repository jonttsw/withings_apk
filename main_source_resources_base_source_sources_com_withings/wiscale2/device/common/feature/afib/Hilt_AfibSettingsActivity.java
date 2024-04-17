package com.withings.wiscale2.device.common.feature.afib;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_AfibSettingsActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f51008a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f51009b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f51010c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f51011d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_AfibSettingsActivity() {
        addOnContextAvailableListener(new v(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f51009b == null) {
            synchronized (this.f51010c) {
                try {
                    if (this.f51009b == null) {
                        this.f51009b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f51009b;
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
        if (!this.f51011d) {
            this.f51011d = true;
            ((p) generatedComponent()).V((AfibSettingsActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f51008a = b10;
            if (b10.b()) {
                this.f51008a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f51008a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
