package com.withings.ecg.details;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes3.dex */
public abstract class Hilt_EcgResultActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f38045a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f38046b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f38047c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38048d;

    Hilt_EcgResultActivity() {
        this.f38047c = new Object();
        this.f38048d = false;
        addOnContextAvailableListener(new s2(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f38046b == null) {
            synchronized (this.f38047c) {
                try {
                    if (this.f38046b == null) {
                        this.f38046b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f38046b;
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
        if (!this.f38048d) {
            this.f38048d = true;
            ((m2) generatedComponent()).L((EcgResultActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f38045a = b10;
            if (b10.b()) {
                this.f38045a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f38045a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_EcgResultActivity(int i11) {
        super(C1987R.layout.activity_ecg_result);
        this.f38047c = new Object();
        this.f38048d = false;
        addOnContextAvailableListener(new s2(this));
    }
}
