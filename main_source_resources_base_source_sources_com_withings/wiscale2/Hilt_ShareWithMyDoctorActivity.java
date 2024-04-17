package com.withings.wiscale2;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes4.dex */
public abstract class Hilt_ShareWithMyDoctorActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f47946a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f47947b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f47948c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f47949d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ShareWithMyDoctorActivity() {
        addOnContextAvailableListener(new w1(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f47947b == null) {
            synchronized (this.f47948c) {
                try {
                    if (this.f47947b == null) {
                        this.f47947b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f47947b;
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
        if (!this.f47949d) {
            this.f47949d = true;
            ((r2) generatedComponent()).E((ShareWithMyDoctorActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f47946a = b10;
            if (b10.b()) {
                this.f47946a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f47946a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
