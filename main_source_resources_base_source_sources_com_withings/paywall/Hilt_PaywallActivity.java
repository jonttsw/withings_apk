package com.withings.paywall;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes4.dex */
public abstract class Hilt_PaywallActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f43565a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f43566b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f43567c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f43568d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_PaywallActivity() {
        addOnContextAvailableListener(new f(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f43566b == null) {
            synchronized (this.f43567c) {
                try {
                    if (this.f43566b == null) {
                        this.f43566b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f43566b;
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
        if (!this.f43568d) {
            this.f43568d = true;
            PaywallActivity paywallActivity = (PaywallActivity) this;
            ((r) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f43565a = b10;
            if (b10.b()) {
                this.f43565a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f43565a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
