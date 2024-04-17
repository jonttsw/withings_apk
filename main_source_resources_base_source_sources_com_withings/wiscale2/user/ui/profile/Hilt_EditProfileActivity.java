package com.withings.wiscale2.user.ui.profile;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_EditProfileActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f61915a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f61916b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f61917c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f61918d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_EditProfileActivity() {
        addOnContextAvailableListener(new z0(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f61916b == null) {
            synchronized (this.f61917c) {
                try {
                    if (this.f61916b == null) {
                        this.f61916b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f61916b;
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
        if (!this.f61918d) {
            this.f61918d = true;
            ((f0) generatedComponent()).b((EditProfileActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f61915a = b10;
            if (b10.b()) {
                this.f61915a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f61915a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
