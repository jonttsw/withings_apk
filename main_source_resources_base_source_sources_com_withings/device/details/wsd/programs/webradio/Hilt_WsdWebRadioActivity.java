package com.withings.device.details.wsd.programs.webradio;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import dagger.hilt.android.internal.managers.g;
/* loaded from: classes3.dex */
public abstract class Hilt_WsdWebRadioActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private g f37275a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f37276b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f37277c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f37278d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_WsdWebRadioActivity() {
        addOnContextAvailableListener(new a(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f37276b == null) {
            synchronized (this.f37277c) {
                try {
                    if (this.f37276b == null) {
                        this.f37276b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f37276b;
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
        if (!this.f37278d) {
            this.f37278d = true;
            ((f) generatedComponent()).d1((WsdWebRadioActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            g b10 = componentManager().b();
            this.f37275a = b10;
            if (b10.b()) {
                this.f37275a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g gVar = this.f37275a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
