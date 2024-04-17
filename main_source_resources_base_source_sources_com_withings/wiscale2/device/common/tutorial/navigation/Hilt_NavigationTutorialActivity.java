package com.withings.wiscale2.device.common.tutorial.navigation;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import dagger.hilt.android.internal.managers.g;
/* loaded from: classes5.dex */
public abstract class Hilt_NavigationTutorialActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private g f53624a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f53625b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f53626c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f53627d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_NavigationTutorialActivity() {
        addOnContextAvailableListener(new a(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f53625b == null) {
            synchronized (this.f53626c) {
                try {
                    if (this.f53625b == null) {
                        this.f53625b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f53625b;
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
        if (!this.f53627d) {
            this.f53627d = true;
            ((e) generatedComponent()).l1((NavigationTutorialActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            g b10 = componentManager().b();
            this.f53624a = b10;
            if (b10.b()) {
                this.f53624a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        g gVar = this.f53624a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
