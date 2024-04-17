package com.withings.wiscale2.spo2;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes5.dex */
public abstract class Hilt_Spo2Activity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f61591a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f61592b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f61593c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f61594d;

    Hilt_Spo2Activity() {
        this.f61593c = new Object();
        this.f61594d = false;
        addOnContextAvailableListener(new d(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f61592b == null) {
            synchronized (this.f61593c) {
                try {
                    if (this.f61592b == null) {
                        this.f61592b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f61592b;
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
        if (!this.f61594d) {
            this.f61594d = true;
            ((u) generatedComponent()).J0((Spo2Activity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f61591a = b10;
            if (b10.b()) {
                this.f61591a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f61591a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_Spo2Activity(int i11) {
        super(C1987R.layout.activity_spo2);
        this.f61593c = new Object();
        this.f61594d = false;
        addOnContextAvailableListener(new d(this));
    }
}
