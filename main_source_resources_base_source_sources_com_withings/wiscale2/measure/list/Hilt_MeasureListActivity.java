package com.withings.wiscale2.measure.list;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_MeasureListActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f58488a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f58489b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f58490c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f58491d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_MeasureListActivity() {
        addOnContextAvailableListener(new c(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f58489b == null) {
            synchronized (this.f58490c) {
                try {
                    if (this.f58489b == null) {
                        this.f58489b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f58489b;
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
        if (!this.f58491d) {
            this.f58491d = true;
            ((u) generatedComponent()).Z((MeasureListActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f58488a = b10;
            if (b10.b()) {
                this.f58488a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f58488a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
