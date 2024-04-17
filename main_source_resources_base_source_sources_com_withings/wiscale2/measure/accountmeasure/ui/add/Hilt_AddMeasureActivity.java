package com.withings.wiscale2.measure.accountmeasure.ui.add;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes5.dex */
public abstract class Hilt_AddMeasureActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f58117a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f58118b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f58119c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f58120d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_AddMeasureActivity() {
        addOnContextAvailableListener(new i1(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f58118b == null) {
            synchronized (this.f58119c) {
                try {
                    if (this.f58118b == null) {
                        this.f58118b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f58118b;
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
        if (!this.f58120d) {
            this.f58120d = true;
            ((f0) generatedComponent()).v((AddMeasureActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f58117a = b10;
            if (b10.b()) {
                this.f58117a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f58117a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
