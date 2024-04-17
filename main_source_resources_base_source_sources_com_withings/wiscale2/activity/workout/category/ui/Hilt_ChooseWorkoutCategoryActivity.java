package com.withings.wiscale2.activity.workout.category.ui;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes4.dex */
public abstract class Hilt_ChooseWorkoutCategoryActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f48667a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f48668b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f48669c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f48670d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ChooseWorkoutCategoryActivity() {
        addOnContextAvailableListener(new q(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f48668b == null) {
            synchronized (this.f48669c) {
                try {
                    if (this.f48668b == null) {
                        this.f48668b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f48668b;
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
        if (!this.f48670d) {
            this.f48670d = true;
            ((p) generatedComponent()).Y((ChooseWorkoutCategoryActivity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f48667a = b10;
            if (b10.b()) {
                this.f48667a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f48667a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
