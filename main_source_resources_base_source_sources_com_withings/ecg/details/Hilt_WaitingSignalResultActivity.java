package com.withings.ecg.details;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes3.dex */
public abstract class Hilt_WaitingSignalResultActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f38049a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f38050b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f38051c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f38052d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_WaitingSignalResultActivity() {
        addOnContextAvailableListener(new t2(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f38050b == null) {
            synchronized (this.f38051c) {
                try {
                    if (this.f38050b == null) {
                        this.f38050b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f38050b;
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
        if (!this.f38052d) {
            this.f38052d = true;
            ((y2) generatedComponent()).I0((WaitingSignalResultActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f38049a = b10;
            if (b10.b()) {
                this.f38049a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f38049a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
