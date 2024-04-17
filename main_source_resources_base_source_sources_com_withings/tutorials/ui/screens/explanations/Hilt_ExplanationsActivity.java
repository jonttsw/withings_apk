package com.withings.tutorials.ui.screens.explanations;

import android.os.Bundle;
import androidx.lifecycle.k1;
import com.withings.android.activity.WithingsActivity;
/* loaded from: classes4.dex */
public abstract class Hilt_ExplanationsActivity extends WithingsActivity implements ik0.b {

    /* renamed from: a  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.g f45095a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f45096b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f45097c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f45098d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Hilt_ExplanationsActivity() {
        addOnContextAvailableListener(new z(this));
    }

    public final dagger.hilt.android.internal.managers.a componentManager() {
        if (this.f45096b == null) {
            synchronized (this.f45097c) {
                try {
                    if (this.f45096b == null) {
                        this.f45096b = new dagger.hilt.android.internal.managers.a(this);
                    }
                } finally {
                }
            }
        }
        return this.f45096b;
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
        if (!this.f45098d) {
            this.f45098d = true;
            ExplanationsActivity explanationsActivity = (ExplanationsActivity) this;
            ((x) generatedComponent()).getClass();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof ik0.b) {
            dagger.hilt.android.internal.managers.g b10 = componentManager().b();
            this.f45095a = b10;
            if (b10.b()) {
                this.f45095a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.g gVar = this.f45095a;
        if (gVar != null) {
            gVar.a();
        }
    }
}
