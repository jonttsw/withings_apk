package com.withings.wiscale2.dashboard;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
/* loaded from: classes4.dex */
public abstract class Hilt_DashboardActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f50512a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f50513b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f50514c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f50515d;

    Hilt_DashboardActivity() {
        this.f50514c = new Object();
        this.f50515d = false;
        addOnContextAvailableListener(new r(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f50513b == null) {
            synchronized (this.f50514c) {
                try {
                    if (this.f50513b == null) {
                        this.f50513b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f50513b;
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
        if (!this.f50515d) {
            this.f50515d = true;
            DashboardActivity dashboardActivity = (DashboardActivity) this;
            ((c) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f50512a = b10;
            if (b10.b()) {
                this.f50512a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f50512a;
        if (gVar != null) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_DashboardActivity(int i11) {
        super(C1987R.layout.activity_dashboard);
        this.f50514c = new Object();
        this.f50515d = false;
        addOnContextAvailableListener(new r(this));
    }
}
