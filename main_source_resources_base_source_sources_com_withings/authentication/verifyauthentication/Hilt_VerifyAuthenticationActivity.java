package com.withings.authentication.verifyauthentication;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes3.dex */
public abstract class Hilt_VerifyAuthenticationActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f32629a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f32630b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f32631c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f32632d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_VerifyAuthenticationActivity() {
        addOnContextAvailableListener(new p(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f32630b == null) {
            synchronized (this.f32631c) {
                try {
                    if (this.f32630b == null) {
                        this.f32630b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f32630b;
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
        if (!this.f32632d) {
            this.f32632d = true;
            ((c0) generatedComponent()).t((VerifyAuthenticationActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f32629a = b10;
            if (b10.b()) {
                this.f32629a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f32629a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
