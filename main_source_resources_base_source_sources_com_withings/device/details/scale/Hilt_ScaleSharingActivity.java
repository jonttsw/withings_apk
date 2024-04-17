package com.withings.device.details.scale;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes3.dex */
public abstract class Hilt_ScaleSharingActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f36889a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f36890b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f36891c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f36892d;

    Hilt_ScaleSharingActivity() {
        this.f36891c = new Object();
        this.f36892d = false;
        addOnContextAvailableListener(new d(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f36890b == null) {
            synchronized (this.f36891c) {
                try {
                    if (this.f36890b == null) {
                        this.f36890b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f36890b;
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
        if (!this.f36892d) {
            this.f36892d = true;
            ScaleSharingActivity scaleSharingActivity = (ScaleSharingActivity) this;
            ((b0) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f36889a = b10;
            if (b10.b()) {
                this.f36889a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f36889a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ScaleSharingActivity(int i11) {
        super(C1987R.layout.activity_setup);
        this.f36891c = new Object();
        this.f36892d = false;
        addOnContextAvailableListener(new d(this));
    }
}
