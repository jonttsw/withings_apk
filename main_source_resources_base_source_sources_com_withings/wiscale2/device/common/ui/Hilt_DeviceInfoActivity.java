package com.withings.wiscale2.device.common.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public abstract class Hilt_DeviceInfoActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f53706a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f53707b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f53708c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f53709d;

    Hilt_DeviceInfoActivity() {
        this.f53708c = new Object();
        this.f53709d = false;
        addOnContextAvailableListener(new n1(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f53707b == null) {
            synchronized (this.f53708c) {
                try {
                    if (this.f53707b == null) {
                        this.f53707b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f53707b;
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
        if (!this.f53709d) {
            this.f53709d = true;
            ((f0) generatedComponent()).x0((DeviceInfoActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f53706a = b10;
            if (b10.b()) {
                this.f53706a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f53706a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_DeviceInfoActivity(int i11) {
        super(C1987R.layout.activity_device_info);
        this.f53708c = new Object();
        this.f53709d = false;
        addOnContextAvailableListener(new n1(this));
    }
}
