package com.withings.notifications.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes4.dex */
public abstract class Hilt_NotificationsActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f42834a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f42835b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f42836c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f42837d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_NotificationsActivity() {
        addOnContextAvailableListener(new d(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f42835b == null) {
            synchronized (this.f42836c) {
                try {
                    if (this.f42835b == null) {
                        this.f42835b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f42835b;
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
        if (!this.f42837d) {
            this.f42837d = true;
            ((q0) generatedComponent()).A0((NotificationsActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f42834a = b10;
            if (b10.b()) {
                this.f42834a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f42834a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
